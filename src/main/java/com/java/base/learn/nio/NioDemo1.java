package com.java.base.learn.nio;

import java.nio.IntBuffer;
import java.security.SecureRandom;

/**
 * <p>
 *     java io：最为核心的一个概念是流(stream)，面向流的编程。java中一个流要么是输入流，要么是输出流，不可能同时是输入流又是输出流。
 *
 *     java nio：3个核心概念：Selector、Channel和Buffer。在java.nio中我们是面向块(block)或是缓冲区(buffer)编程的。
 *     底层实际上，它实际是个数组。数据的读、写都是通过Buffer来获取的。
 *     除了数组之外，Buffer还提供了对于数据结构化访问方式，并且可以追踪到系统的读写过程。
 *     java中的7中原生数据类型都有各自对应的Buffer类型，如IntBuffer、LongBuffer、ByteBuffer及CharBuffer等，并没有BooleanBuffer类型。
 *     Channel指的是可以向其写入数据或是从中读取数据的对象，它类似于java.io中的Stream。
 *     所有数据的读写都是通过Buffer来进行的，永远不会出现直接向Channel写入数据的情况，或是直接从Channel读取数据的情况。
 *
 *     与Stream不同的是，Channel是双向的，一个流只可能是InputStream或OutputStream，Channel打开后则可以进行读取，写入或是读写。
 *
 *     由于Channel是双向的，因此它能更好的反映出底层操作系统的真实情况：在Linux系统中，底层操作系统的通道就是双向的。
 * </P>
 *
 * @author sunxiaodong
 * @date 20-4-9 上午4:52
 **/
public class NioDemo1 {

    public static void main(String[] args) {
        IntBuffer intBuffer = IntBuffer.allocate(10);
        System.out.println("intBuffer capacity: " + intBuffer.capacity());

        for (int i = 0; i <intBuffer.capacity(); i++) {
            int randomNumber = new SecureRandom().nextInt(20);
            intBuffer.put(randomNumber);
        }
        System.out.println("before flip limit: " + intBuffer.limit());
        // 读写转换
        intBuffer.flip();
        System.out.println("after flip limit: " + intBuffer.limit());
        while (intBuffer.hasRemaining()){
            System.out.println(intBuffer.get());
        }
    }
}
