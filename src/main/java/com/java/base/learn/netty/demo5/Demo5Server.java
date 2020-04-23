package com.java.base.learn.netty.demo5;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-4-23 上午5:32
 **/
public class Demo5Server {

    public static void main(String[] args) throws Exception {
        EventLoopGroup parent = new NioEventLoopGroup(1);
        EventLoopGroup children = new NioEventLoopGroup();

        try {
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            serverBootstrap.group(parent, children).channel(NioServerSocketChannel.class).childHandler(new Demo5ServerInitializer());
            ChannelFuture channelFuture = serverBootstrap.bind(8888).sync();
            channelFuture.channel().closeFuture().sync();
        } finally {
            children.shutdownGracefully();
            parent.shutdownGracefully();
        }
    }
}
