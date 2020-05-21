package com.action.netty3.action.chapter2.echoserver;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

import java.net.InetSocketAddress;

/**
 * Summary:
 *
 * @author wuyunfeng
 * @date 14. 5月 2020 2:53 下午
 */
public class EchoServer {

    private final int port;

    public EchoServer(int port) {
        this.port = port;
    }

    public void start() throws Exception {
        final EchoServerHandler serverHandler = new EchoServerHandler();
        // 1、创建EventLoopGroup
        EventLoopGroup group = new NioEventLoopGroup();
        try {
            // 2、创建ServerBootstrap
            ServerBootstrap b = new ServerBootstrap();
            b.group(group)
                    // 3、指定使用的 NIO 传输 Channel
                    .channel(NioServerSocketChannel.class)
                    // 4、 只用指定的端口设置地址
                    .localAddress(new InetSocketAddress(port))
                    // 5、添加EchoServerHandler到于Channel的 ChannelPipeline
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {
                            // EchoServerHandler 被注释为@Shareable，所有我们可以总数使用同样的实例
                            // 这里对于所有的客户连接来说，都会使用同一个EchoServerHandler，因为其其被标注为@Shareable
                            // 这将在后面讲到
                            ch.pipeline().addLast(serverHandler);
                        }
                    });
            // 6、异步地绑定服务器：调用sync()方法阻塞等待直到绑定完成
            ChannelFuture f = b.bind().sync();
            System.out.println(EchoServer.class.getName() +
                    " started and listening for connections on " + f.channel().localAddress());
            // 7、获取Channel的CloseFuture，并且阻塞当前现场直到他完成
            f.channel().closeFuture().sync();
        } finally {
            // 8、 关闭 EventLoopGroup，释放所有的资源
            group.shutdownGracefully().sync();

        }
    }

    public static void main(String[] args) throws Exception {
        new EchoServer(10086).start();
    }

}
