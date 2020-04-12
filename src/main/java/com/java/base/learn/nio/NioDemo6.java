package com.java.base.learn.nio;

import java.nio.ByteBuffer;

/**
 * <p>
 *     Slice Buffer与原有Buffer共享相同的底层数组
 * </p>
 *
 * @author sunxiaodong
 * @date 2020/4/11 8:45 PM
 */
public class NioDemo6 {

    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put((byte)i);
        }

        buffer.position(2);
        buffer.limit(6);

        ByteBuffer sliceBuffer = buffer.slice();

        for (int i = 0; i < sliceBuffer.capacity(); i++) {
            byte b = sliceBuffer.get();
            b *= 2;
            sliceBuffer.put(i, b);
        }

        buffer.position(0);
        buffer.limit(buffer.capacity());

        while (buffer.hasRemaining()){
            System.out.println(buffer.get());
        }

    }
}
