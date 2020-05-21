package com.action.netty3.action.chapter1;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * Summary: 代码清单 1-2 被回调触发的 ChannelHandler
 *
 * @author wuyunfeng
 * @date 14. 5月 2020 1:42 下午
 */
public class ConnectHandler extends ChannelInboundHandlerAdapter {

    /**
     * 当一个新的连接已经被建立时，channelActive(ChannelHandlerContext) 将被调用
     *
     * @param ctx ctx
     * @throws Exception exception
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        super.channelActive(ctx);
    }
}
