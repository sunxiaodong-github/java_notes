package com.java.base.learn.netty.demo5;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 2020/4/24 12:08 AM
 */
public class Demo5ByteToLongDecoder extends ByteToMessageDecoder {

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        System.out.println("decode invoke");
        System.out.println(in.readableBytes());
        if (in.readableBytes() >= 8){
            out.add(in.readLong());
        }
    }
}
