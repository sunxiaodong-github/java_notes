package com.java.base.learn.netty.demo4;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-4-20 上午5:43
 **/
public class ByteBuffTest1 {

    public static void main(String[] args) {
        ByteBuf buffer = Unpooled.buffer(10);
        for (int i = 0; i <10; i++) {
            buffer.writeByte(i);
        }

        for (int i = 0; i < buffer.capacity(); i++) {
            // 不会改变readIndex
            System.out.println(buffer.getByte(i));
        }

        for (int i = 0; i < buffer.capacity(); i++) {
            // 会改变readIndex
            System.out.println(buffer.readByte());
        }
    }
}
