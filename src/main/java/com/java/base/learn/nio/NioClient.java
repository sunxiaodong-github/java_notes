package com.java.base.learn.nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-4-13 上午2:26
 **/
public class NioClient {

    public static void main(String[] args) throws Exception {
        try {
            SocketChannel socketChannel = SocketChannel.open();
            socketChannel.configureBlocking(false);
            Selector selector = Selector.open();
            socketChannel.register(selector, SelectionKey.OP_CONNECT);
            socketChannel.connect(new InetSocketAddress("localhost", 8888));
            while (true) {
                selector.select();
                Set<SelectionKey> selectionKeys = selector.selectedKeys();
                selectionKeys.forEach(selectionKey -> {
                    if (selectionKey.isConnectable()) {
                        //是否已经建立好连接
                        SocketChannel client = (SocketChannel) selectionKey.channel();
                        if (client.isConnectionPending()) {
                            try {
                                client.finishConnect();
                                ByteBuffer writeBuffer = ByteBuffer.allocate(1024);
                                writeBuffer.put((LocalDateTime.now() + "连接成功").getBytes());
                                writeBuffer.flip();
                                client.write(writeBuffer);
                                ExecutorService executorService = Executors.newSingleThreadExecutor(Executors.defaultThreadFactory());
                                executorService.submit(() -> {
                                    while (true) {
                                        try {
                                            writeBuffer.clear();
                                            InputStreamReader input = new InputStreamReader(System.in);
                                            BufferedReader br = new BufferedReader(input);
                                            String sendMessage = br.readLine();
                                            writeBuffer.put(sendMessage.getBytes());
                                            writeBuffer.flip();
                                            client.write(writeBuffer);
                                        } catch (Exception ex) {
                                            ex.printStackTrace();
                                        }
                                    }
                                });
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        try {
                            client.register(selector, SelectionKey.OP_READ);
                        } catch (ClosedChannelException e) {
                            e.printStackTrace();
                        }
                    }else if (selectionKey.isReadable()){
                        SocketChannel client = (SocketChannel) selectionKey.channel();
                        ByteBuffer readBuffer = ByteBuffer.allocate(1024);
                        try {
                            int count = client.read(readBuffer);
                            if (count > 0){
                                String receivedMessage = new String(readBuffer.array(), 0, count);
                                System.out.println(receivedMessage);
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                });
                selectionKeys.clear();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
