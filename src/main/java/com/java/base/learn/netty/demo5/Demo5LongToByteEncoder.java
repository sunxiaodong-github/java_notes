package com.java.base.learn.netty.demo5;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 2020/4/24 12:22 AM
 */
public class Demo5LongToByteEncoder extends MessageToByteEncoder<Long> {

    @Override
    protected void encode(ChannelHandlerContext ctx, Long msg, ByteBuf out) throws Exception {
        System.out.println("encode invoke");
        System.out.println(msg);
        out.writeLong(msg);
    }
}
