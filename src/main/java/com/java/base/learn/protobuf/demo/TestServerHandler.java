package com.java.base.learn.protobuf.demo;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 2020/4/5 7:53 PM
 */
public class TestServerHandler extends SimpleChannelInboundHandler<MyDataInfo.MyMessage> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MyDataInfo.MyMessage message) throws Exception {
        MyDataInfo.MyMessage.DataType dataType = message.getDataType();
        if (dataType == MyDataInfo.MyMessage.DataType.PersonType) {
            System.out.println(message.getPerson().getName());
        } else if (dataType == MyDataInfo.MyMessage.DataType.DogType) {
            System.out.println(message.getDog().getName());
        } else {
            System.out.println(message.getCat().getName());
        }
    }
}
