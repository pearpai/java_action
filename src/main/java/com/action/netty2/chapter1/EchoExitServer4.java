package com.action.netty2.chapter1;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import lombok.extern.slf4j.Slf4j;


/**
 * Summary:
 *
 * @author wuyunfeng
 * @date 12. 5月 2020 4:37 下午
 */
@Slf4j
public class EchoExitServer4 {

    public static void main(String[] args) throws InterruptedException {
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();

        try {
            ServerBootstrap b = new ServerBootstrap();
            b.group(bossGroup, workerGroup)
                    .channel(NioServerSocketChannel.class)
                    .option(ChannelOption.SO_BACKLOG, 100)
                    .handler(new LoggingHandler(LogLevel.INFO))
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {
                            ChannelPipeline p = ch.pipeline();
                            p.addLast(new LoggingHandler(LogLevel.INFO));
                        }
                    });
            ChannelFuture f = b.bind(18080).sync();
            f.channel().closeFuture().addListener(new ChannelFutureListener() {
                @Override
                public void operationComplete(ChannelFuture future) throws Exception {
                    //  业务逻辑处理代码，此处省略
                    bossGroup.shutdownGracefully();
                    workerGroup.shutdownGracefully();
                    log.info(future.channel().toString() + " 链路关闭");
                }
            });
        } finally {
            //异步情况 会进入finally 从而将group关闭，没有了非守护进程，程序将关闭
//            boosGroup.shutdownGracefully();
//            workerGroup.shutdownGracefully();
        }

    }

}
