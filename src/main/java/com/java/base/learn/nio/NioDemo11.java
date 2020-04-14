package com.java.base.learn.nio;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Arrays;

/**
 * <p>
 *     关于Buffer的Scattering与Gathering
 * </p>
 *
 * @author sunxiaodong
 * @date 2020/4/12 7:42 PM
 */
public class NioDemo11 {

    public static void main(String[] args) throws Exception {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.socket().bind(new InetSocketAddress(8888));

        int messageLength = 2 + 3 + 4;

        ByteBuffer[] buffers = new ByteBuffer[3];
        buffers[0] = ByteBuffer.allocate(2);
        buffers[1] = ByteBuffer.allocate(3);
        buffers[2] = ByteBuffer.allocate(4);

        SocketChannel socketChannel = serverSocketChannel.accept();

        while (true) {
            int byteRead = 0;
            while (byteRead < messageLength) {
                long read = socketChannel.read(buffers);
                byteRead += read;
                System.out.println("byteRead: " + byteRead);
                Arrays.asList(buffers).stream()
                        .map(
                                buffer -> "position: " + buffer.position() + ", limit: " + buffer.limit())
                        .forEach(System.out::println);
            }

            Arrays.asList(buffers).forEach(
                    buffer -> buffer.flip());
            long byteWritten = 0;
            while (byteWritten < messageLength) {
                long write = socketChannel.write(buffers);
                byteWritten += write;
            }
            Arrays.asList(buffers).forEach(
                    buffer -> buffer.clear());
            System.out.println("byteRead: " + byteRead + ", byteWritten: " + byteWritten + ", messageLength" + messageLength);
        }
    }
}
