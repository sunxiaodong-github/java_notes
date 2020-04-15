package com.java.base.learn.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-4-14 下午9:55
 **/
public class NewIOServer {

    public static void main(String[] args) throws IOException {
        InetSocketAddress address = new InetSocketAddress(8888);
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        ServerSocket serverSocket = serverSocketChannel.socket();
        serverSocket.setReuseAddress(true);
        serverSocket.bind(address);

        ByteBuffer byteBuffer = ByteBuffer.allocate(4096);

        while (true){
            SocketChannel socketChannel = serverSocketChannel.accept();
            socketChannel.configureBlocking(true);
            int count = 0;
            while ( -1 != count){
                try {
                    count = socketChannel.read(byteBuffer);
                }catch (Exception ex){
                    ex.printStackTrace();
                }
                byteBuffer.rewind();
            }
        }
    }
}
