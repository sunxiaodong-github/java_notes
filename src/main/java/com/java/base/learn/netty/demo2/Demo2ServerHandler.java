package com.java.base.learn.netty.demo2;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.timeout.IdleStateEvent;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 02/04/20 上午 11:49
 */
public class Demo2ServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof IdleStateEvent){
            IdleStateEvent event = (IdleStateEvent) evt;

            String eventType = null;

            switch (event.state()) {
                case READER_IDLE:
                    eventType = "读空闲";
                    break;
                case WRITER_IDLE:
                    eventType = "写空闲";
                    break;
                case ALL_IDLE:
                    eventType = "读写空闲";
                    break;
                    default:
            }
            System.out.println(ctx.channel().remoteAddress() + " 超时事件：" + eventType);
            ctx.channel().close();
        }
    }
}
