package com.java.base.learn.netty.demo2;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.timeout.IdleStateHandler;

import java.util.concurrent.TimeUnit;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 02/04/20 上午 11:40
 */
public class Demo2ServerInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();
        // 空闲状态检测处理器  【handler执行模式：责任链模式】
        pipeline.addLast(new IdleStateHandler(5, 7, 3, TimeUnit.SECONDS));
        pipeline.addLast(new Demo2ServerHandler());
    }
}
