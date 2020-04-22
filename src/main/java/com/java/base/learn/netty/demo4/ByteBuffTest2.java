package com.java.base.learn.netty.demo4;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.nio.charset.Charset;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-4-22 上午1:19
 **/
public class ByteBuffTest2 {

    public static void main(String[] args) {
        ByteBuf byteBuf = Unpooled.copiedBuffer("中hello world", Charset.forName("utf-8"));
        if (byteBuf.hasArray()){
            byte[] content = byteBuf.array();
            System.out.println(new String(content, Charset.forName("utf-8")));
            System.out.println(byteBuf);

            System.out.println(byteBuf.arrayOffset());
            System.out.println(byteBuf.readerIndex());
            System.out.println(byteBuf.writerIndex());
            System.out.println(byteBuf.capacity());

            int length = byteBuf.readableBytes();
            System.out.println(length);

            for (int i = 0; i < byteBuf.readableBytes(); i++) {
                System.out.println((char) byteBuf.getByte(i));
            }

            System.out.println(byteBuf.getCharSequence(0, byteBuf.readableBytes(), Charset.forName("utf-8")));
        }
    }
}
