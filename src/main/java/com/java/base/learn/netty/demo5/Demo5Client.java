package com.java.base.learn.netty.demo5;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-4-23 上午5:48
 **/
public class Demo5Client {

    public static void main(String[] args) throws Exception {
        EventLoopGroup children = new NioEventLoopGroup();

        try {
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(children).channel(NioSocketChannel.class).handler(new Demo5ClientInitializer());
            ChannelFuture channelFuture = bootstrap.connect("localhost", 8888).sync();
            channelFuture.channel().closeFuture().sync();
        }finally {
            children.shutdownGracefully();
        }
    }
}
