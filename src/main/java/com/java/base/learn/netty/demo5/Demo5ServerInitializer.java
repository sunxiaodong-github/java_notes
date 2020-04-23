package com.java.base.learn.netty.demo5;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-4-23 上午5:40
 **/
public class Demo5ServerInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();
        // 自定义入站解码器
        pipeline.addLast(new Demo5ByteToLongDecoder());
        pipeline.addLast(new Demo5LongToByteEncoder());
        pipeline.addLast(new Demo5ServerHandler());
    }
}
