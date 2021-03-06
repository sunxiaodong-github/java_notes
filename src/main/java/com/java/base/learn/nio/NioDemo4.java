package com.java.base.learn.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * <p>
 *     关于Nio Buffer中的3个重要状态属性的含义：position、capacity、limit
 * </p>
 *
 * @author sunxiaodong
 * @date 20-4-9 下午11:37
 **/
public class NioDemo4 {

    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream("input.txt");
        FileOutputStream outputStream = new FileOutputStream("output.txt");

        FileChannel inputChanel = inputStream.getChannel();
        FileChannel outputChannel = outputStream.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(512);

        while (true){
            buffer.clear();

            int read = inputChanel.read(buffer);
            System.out.println(read);

            if (-1 == read){
                break;
            }
            buffer.flip();
            outputChannel.write(buffer);
        }
        inputChanel.close();
        outputChannel.close();
    }
}
