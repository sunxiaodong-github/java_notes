package com.java.base.learn.nio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-4-9 上午6:03
 **/
public class NioDemo3 {

    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("NioDemo3.txt");
        FileChannel channel = fileOutputStream.getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocate(512);

        byte[] message = "hello, world welcome, 中文测试".getBytes();

        for (int i = 0; i < message.length; i++) {
            byteBuffer.put(message[i]);
        }

        byteBuffer.flip();

        channel.write(byteBuffer);
        channel.close();
    }
}
