package com.java.base.learn.nio;

import java.nio.ByteBuffer;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-4-10 上午12:02
 **/
public class NioDemo5 {

    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(64);
        buffer.putInt(12);
        buffer.putLong(5000000000L);
        buffer.putChar('他');
        buffer.putShort((short) 2);
        buffer.putChar('你');

        buffer.flip();

        System.out.println(buffer.getInt());
        System.out.println(buffer.getLong());
        System.out.println(buffer.getChar());
        System.out.println(buffer.getShort());
        System.out.println(buffer.getChar());
    }
}
