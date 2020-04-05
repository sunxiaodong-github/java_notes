package com.java.base.learn.protobuf.demo;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.Random;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 2020/4/5 8:08 PM
 */
public class TestClientHandler extends SimpleChannelInboundHandler<MyDataInfo.MyMessage> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MyDataInfo.MyMessage msg) throws Exception {
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        int randomInt = new Random().nextInt(3);
        MyDataInfo.MyMessage message = null;
        if (0 == randomInt) {
            message = MyDataInfo.MyMessage.newBuilder()
                    .setDataType(MyDataInfo.MyMessage.DataType.PersonType)
                    .setPerson(
                            MyDataInfo.Person.newBuilder().setName("person").setAge(21).setAddress("shanghai").build()
                    ).build();
        } else if (1 == randomInt) {
            message = MyDataInfo.MyMessage.newBuilder()
                    .setDataType(MyDataInfo.MyMessage.DataType.DogType)
                    .setDog(
                            MyDataInfo.Dog.newBuilder().setName("dog").setAge(21).build()
                    ).build();
        } else {
            message = MyDataInfo.MyMessage.newBuilder()
                    .setDataType(MyDataInfo.MyMessage.DataType.CatType)
                    .setCat(
                            MyDataInfo.Cat.newBuilder().setName("cat").setCity("shanghai").build()
                    ).build();
        }
        ctx.channel().writeAndFlush(message);
    }
}
