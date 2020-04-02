package com.java.base.learn.netty.demo1;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 02/04/20 上午 09:19
 */
public class Demo1ChatClient {

    public static void main(String[] args) throws Exception {
        EventLoopGroup workerGroup = new NioEventLoopGroup();

        try {
            Bootstrap bootstrap = new Bootstrap();
            bootstrap
                    .group(workerGroup)
                    .channel(NioSocketChannel.class)
                    .handler(new Demo1ChatClientInitializer());
            Channel channel = bootstrap.connect("localhost", 8888).sync().channel();
            // 读取用户控制台输入内容
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            for (; ; ) {
                // 向服务端发送数据
                channel.writeAndFlush(reader.readLine()+"\r\n");
            }
        } finally {
            workerGroup.shutdownGracefully();
        }
    }
}
