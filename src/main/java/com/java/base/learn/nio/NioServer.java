package com.java.base.learn.nio;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-4-13 上午1:39
 **/
public class NioServer {

    private static Map<String, SocketChannel> clientMap = new HashMap<>();

    public static void main(String[] args) throws Exception {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        ServerSocket serverSocket = serverSocketChannel.socket();
        serverSocket.bind(new InetSocketAddress(8888));

        Selector selector = Selector.open();
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        while (true) {
            try {
                //阻塞在这里等待有监听事件
                selector.select();
                Set<SelectionKey> selectionKeys = selector.selectedKeys();
                selectionKeys.forEach(selectionKey -> {
                    final SocketChannel client;
                    try {
                        // 客户端发起连接
                        if (selectionKey.isAcceptable()) {
                            ServerSocketChannel server = (ServerSocketChannel) selectionKey.channel();
                            client = server.accept();
                            client.configureBlocking(false);
                            client.register(selector, SelectionKey.OP_READ);
                            String key = "【" + UUID.randomUUID().toString() + "】";
                            clientMap.put(key, client);
                        } else if (selectionKey.isReadable()) {
                            //有数据可读
                            client = (SocketChannel) selectionKey.channel();
                            ByteBuffer readBuffer = ByteBuffer.allocate(1024);
                            int count = client.read(readBuffer);
                            if (count > 0) {
                                readBuffer.flip();
                                Charset charset = Charset.forName("utf-8");
                                String receivedMessage = String.valueOf(charset.decode(readBuffer).array());
                                System.out.println(client + ": " + receivedMessage);
                                String sendKey = "";
                                for (Map.Entry<String, SocketChannel> entry : clientMap.entrySet()) {
                                    if (client == entry.getValue()) {
                                        sendKey = entry.getKey();
                                        break;
                                    }
                                }
                                for (Map.Entry<String, SocketChannel> entry : clientMap.entrySet()) {
                                    SocketChannel value = entry.getValue();
                                    ByteBuffer writeBuffer = ByteBuffer.allocate(1024);
                                    writeBuffer.put((sendKey + ": " + receivedMessage).getBytes());
                                    writeBuffer.flip();
                                    value.write(writeBuffer);
                                }
                            }
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                });
                selectionKeys.clear();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
