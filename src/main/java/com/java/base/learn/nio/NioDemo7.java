package com.java.base.learn.nio;

import java.nio.ByteBuffer;

/**
 * <p>
 *     DirectByteBufferR
 * </p>
 *
 * @author sunxiaodong
 * @date 2020/4/11 9:06 PM
 */
public class NioDemo7 {

    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);

        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put((byte)i);
        }

        ByteBuffer readOnlyBuffer = buffer.asReadOnlyBuffer();
        System.out.println(readOnlyBuffer.getClass());
        readOnlyBuffer.position(0);
        readOnlyBuffer.put((byte)2);
    }
}
