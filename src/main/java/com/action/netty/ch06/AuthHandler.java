package com.action.netty.ch06;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * Summary:
 * Created by wuyunfeng on 04. 12月 2019 10:18 上午.
 */
public class AuthHandler extends SimpleChannelInboundHandler<ByteBuf> {
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        //
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf password) throws Exception {
        if (paas(password)) {
            ctx.pipeline().remove(this);
        } else {
            ctx.close();
        }
    }

    private boolean paas(ByteBuf password) {
        return false;
    }
}