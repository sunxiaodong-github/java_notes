package com.java.base.learn.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * <p>
 *     DirectByteBuffer 堆外内存与零拷贝
 * </p>
 *
 * @author sunxiaodong
 * @date 2020/4/12 10:01 AM
 */
public class NioDemo8 {

    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream("input.txt");
        FileOutputStream outputStream = new FileOutputStream("output.txt");

        FileChannel inputChannel = inputStream.getChannel();
        FileChannel outputChannel = outputStream.getChannel();

        ByteBuffer buffer = ByteBuffer.allocateDirect(512);

        while (true){
            buffer.clear();
            int read = inputChannel.read(buffer);
            System.out.println("read: " + read);
            if (-1 == read){
                break;
            }
            buffer.flip();
            outputChannel.write(buffer);
        }
        inputStream.close();
        outputStream.close();
    }
}
