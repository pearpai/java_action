package com.action.netty.client.handler;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import lombok.extern.slf4j.Slf4j;

import java.nio.charset.Charset;

/**
 * Summary:
 *
 * @author wuyunfeng
 * @date 27. 8月 2019 14:28
 */
@Slf4j
public class ClientHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {

//        Packet packet = (Packet) msg;

//        ByteBuf in = (ByteBuf) msg;
//        System.out.println("Server received: " + in.toString(CharsetUtil.UTF_8));
//        System.out.println("Server received: " + msg);
//        log.info("============");
//        byte[] currentTime = "11111asdfasdfasdfasdfas11222\r\n".getBytes();
//        ByteBuf resp = Unpooled.copiedBuffer(currentTime);
//        ChannelFuture future = ctx.channel().writeAndFlush(resp);
//        log.info("name--->{}", ctx.name());

//        Packet packet = new Packet();
//        packet.setA("abc");
//        ctx.channel().writeAndFlush(packet);
//        ctx.channel().id();
//        if (ctx.channel().isActive()) {
//            WorkerManager.getInstance().pushDataToWorker(ctx, packet);
//        }

//        String str = ((ByteBuf) msg).toString(Charset.defaultCharset());
        System.out.println(msg);
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

}
