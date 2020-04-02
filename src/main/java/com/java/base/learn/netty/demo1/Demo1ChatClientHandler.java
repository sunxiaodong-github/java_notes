package com.java.base.learn.netty.demo1;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 02/04/20 上午 09:27
 */
public class Demo1ChatClientHandler extends SimpleChannelInboundHandler<String> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
        System.out.println(msg);
    }
}
