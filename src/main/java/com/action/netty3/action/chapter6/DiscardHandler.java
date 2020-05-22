package com.action.netty3.action.chapter6;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-22 11:28
 * @Version 1.0
 */
@ChannelHandler.Sharable
//扩展了 ChannelInboundHandlerAdapter
public class DiscardHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        // 丢弃已接收的消息
        ReferenceCountUtil.release(msg);
    }
}
