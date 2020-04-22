package com.java.base.learn.netty.demo4;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;

/**
 * <p>
 *     复合缓冲区：CompositeByteBuf
 * </p>
 *
 * @author sunxiaodong
 * @date 20-4-22 上午4:38
 **/
public class ByteBuffTest3 {

    public static void main(String[] args) {
        CompositeByteBuf compositeByteBuf = Unpooled.compositeBuffer();

        ByteBuf heapBuf = Unpooled.buffer(10);
        ByteBuf directBuf = Unpooled.directBuffer(8);

        compositeByteBuf.addComponents(heapBuf, directBuf);
        //compositeByteBuf.removeComponent(0);

        /*Iterator<ByteBuf> iterator = compositeByteBuf.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

        compositeByteBuf.forEach(System.out::println);
    }
}
