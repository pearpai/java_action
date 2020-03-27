package com.action.netty.client.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;

/**
 * Summary:
 *
 * @author wuyunfeng
 * @date 27. 8月 2019 14:28
 */
@Slf4j
public class SyncClientHandler extends ChannelInboundHandlerAdapter {

    private Object message;

    private CountDownLatch latch;

    public SyncClientHandler(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {


        System.out.println("SyncClientHandler channelRead------》" + msg);

        this.message = msg;
        latch.countDown();
//        notifyAll();
    }


    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        super.channelReadComplete(ctx);
        ctx.flush();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        // 出现异常时关闭连接。
        cause.printStackTrace();
        ctx.close();
    }

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        super.handlerAdded(ctx);
    }

    public void resetLatch(CountDownLatch initLathc) {
        this.latch = initLathc;
    }


    public Object getResult() {
        return message;
    }

}
