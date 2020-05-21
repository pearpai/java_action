package com.action.netty3.action.chapter1;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.net.InetSocketAddress;
import java.nio.charset.Charset;

/**
 * Summary:
 * 代码清单 1-3 异步地建立连接
 * <p>
 * 代码清单 1-4 回调实战
 *
 * @author wuyunfeng
 * @date 14. 5月 2020 2:08 下午
 */
public class ConnectExample {


    private static final Channel CHANNEL_FROM_SOMEWHERE = new NioSocketChannel();

    public static void connect() {

        // reference from somewhere
        Channel channel = CHANNEL_FROM_SOMEWHERE;
        // Does not block
        // 异步地连接到远程节点
        ChannelFuture future = channel.connect(new InetSocketAddress("192.168.54.109", 14001));
        // 注册一个ChannelFutureListener，以便在操作完成是获得通知
        future.addListener(new ChannelFutureListener() {
            @Override
            public void operationComplete(ChannelFuture future) throws Exception {
                // 检查操作状态
                if (future.isSuccess()) {
                    // 如果操作是成功的，则创建一个 ByteBuf 以持有数据
                    ByteBuf buf = Unpooled.copiedBuffer("Hello", Charset.defaultCharset());
                    // 将数据异步发送到远程节点，返回一个ChannelFuture
                    ChannelFuture wf = future.channel().writeAndFlush(buf);
                } else {
                    //如果发生错误，则访问描述原因的 Throwable
                    Throwable cause = future.cause();
                    cause.printStackTrace();
                }
            }
        });
    }

}
