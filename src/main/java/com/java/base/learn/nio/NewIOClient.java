package com.java.base.learn.nio;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.FileChannel;
import java.nio.channels.SocketChannel;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-4-14 下午10:25
 **/
public class NewIOClient {

    public static void main(String[] args) throws IOException {
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.connect(new InetSocketAddress("localhost", 8888));
        socketChannel.configureBlocking(true);
        String fileName = "/home/sunxiaodong/Documents/开发总结/升职加薪课/阶段一/1-20 容器化进阶K8S.rar";

        FileChannel fileChannel = new FileInputStream(fileName).getChannel();
        long startTime = System.currentTimeMillis();
        long total = fileChannel.transferTo(0, fileChannel.size(), socketChannel);
        System.out.println("发送总字节数： " + total + "， 耗时： " + (System.currentTimeMillis() - startTime));
        fileChannel.close();
    }
}
