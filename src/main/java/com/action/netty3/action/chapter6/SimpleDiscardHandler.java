package com.action.netty3.action.chapter6;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-22 11:31
 * @Version 1.0
 */
@ChannelHandler.Sharable
//扩展了SimpleChannelInboundHandler
public class SimpleDiscardHandler extends SimpleChannelInboundHandler<Object> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
        // 不需要任何显示的资源释放
        // no need to do anything special
    }
}
