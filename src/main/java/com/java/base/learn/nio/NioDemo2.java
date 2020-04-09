package com.java.base.learn.nio;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * <p>
 *     读取数据的逻辑为：
 *
 *     open a stream
 *     while more information
 *     read information
 *     close the stream
 * </p>
 *
 * @author sunxiaodong
 * @date 20-4-9 上午5:51
 **/
public class NioDemo2 {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("NioDemo2.txt");
        FileChannel fileChannel = fileInputStream.getChannel();
        ByteBuffer byteBuf = ByteBuffer.allocate(512);
        fileChannel.read(byteBuf);

        byteBuf.flip();

        while (byteBuf.remaining() > 0){
            byte b = byteBuf.get();
            System.out.println("Character: " + (char) b);

        }
        fileChannel.close();
    }
}
