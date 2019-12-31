package com.action.netty.client;

import com.action.netty.client.codec.PacketEncoder;
import com.action.netty.client.codec.StringDecoderExtend;
import com.action.netty.client.handler.ClientHandler;
import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.LineBasedFrameDecoder;
import io.netty.util.Constant;
import lombok.extern.slf4j.Slf4j;

import java.io.UnsupportedEncodingException;

/**
 * Summary:
 *
 * @author wuyunfeng
 * @date 05. 12月 2019 3:58 下午
 */
@Slf4j
public class ClientDemo {

    private String ip;

    private int port;

    public ChannelFuture cf;

    public ClientDemo(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }


    // 请求端主题
    private void action() throws InterruptedException, UnsupportedEncodingException {

        EventLoopGroup bossGroup = new NioEventLoopGroup();

        Bootstrap bs = new Bootstrap();

        bs.group(bossGroup)
                .channel(NioSocketChannel.class)
                .option(ChannelOption.SO_KEEPALIVE, true)
                .handler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel ch) throws Exception {
                        // marshalling 序列化对象的解码
//                  socketChannel.pipeline().addLast(MarshallingCodefactory.buildDecoder());
                        // marshalling 序列化对象的编码
//                  socketChannel.pipeline().addLast(MarshallingCodefactory.buildEncoder());


                        ch.pipeline().addLast("Encoder", new PacketEncoder());
                        ch.pipeline().addLast("LineBasedFrameDecoder", new LineBasedFrameDecoder(100000));
                        ch.pipeline().addLast("StringDecoderExtend", new StringDecoderExtend());


                        // 处理来自服务端的响应信息
                        ch.pipeline().addLast(new ClientHandler());
                    }
                });

        // 客户端开启
        cf = bs.connect(ip, port).sync();
        System.out.println("============== " + cf.channel().isActive());
//        Thread.sleep(4000);
        System.out.println("============== " + cf.channel().isActive());
        if (cf.channel().isActive()) {
            String reqStr = "{\"header\":{\"cmd\":\"login\", \"token\":\"ea3b702cf92ab309392de0214c77b03f\"}, " +
                    "\"body\":{\"a\":\"1\", \"b\":\"22\"}}";
            System.out.println("============== " + cf.channel().isActive());

//            cf.channel().writeAndFlush(Unpooled.copiedBuffer(reqStr.getBytes()));
            cf.channel().writeAndFlush(reqStr);


            // 发送客户端的请求
//            cf.channel().writeAndFlush(reqStr);
        }


//      Thread.sleep(300);
//      cf.channel().writeAndFlush(Unpooled.copiedBuffer("我是客户端请求2$_---".getBytes(Constant.charset)));
//      Thread.sleep(300);
//      cf.channel().writeAndFlush(Unpooled.copiedBuffer("我是客户端请求3$_".getBytes(Constant.charset)));

//      Student student = new Student();
//      student.setId(3);
//      student.setName("张三");
//      cf.channel().writeAndFlush(student);

        // 等待直到连接中断
//        cf.channel().closeFuture().sync();
    }


    public static void main(String[] args) throws UnsupportedEncodingException, InterruptedException {
        new ClientDemo("127.0.0.1", 1803).action();

    }


}
