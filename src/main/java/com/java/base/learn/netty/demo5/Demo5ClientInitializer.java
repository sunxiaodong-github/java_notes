package com.java.base.learn.netty.demo5;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;


/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-4-23 上午5:51
 **/
public class Demo5ClientInitializer extends ChannelInitializer<io.netty.channel.socket.SocketChannel> {

    @Override
    protected void initChannel(io.netty.channel.socket.SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();
        pipeline.addLast(new Demo5ClientHandler());
    }
}
