package com.action.netty.client;

import com.action.netty.client.codec.PacketEncoder;
import com.action.netty.client.codec.StringDecoderExtend;
import com.action.netty.client.handler.SyncClientHandler;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.LineBasedFrameDecoder;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.UnsupportedEncodingException;
import java.util.concurrent.CountDownLatch;

/**
 * Summary:
 * Created by wuyunfeng on 27. 3月 2020 1:36 下午.
 */
public class SyncClient {

    private String ip;

    private int port;

    public ChannelFuture cf;

    public SyncClient(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }


    // 请求端主题
    private void action() throws InterruptedException, UnsupportedEncodingException {

        CountDownLatch latch = new CountDownLatch(1);


        StringBuffer message = new StringBuffer();

        EventLoopGroup bossGroup = new NioEventLoopGroup();

        Bootstrap bs = new Bootstrap();


        SyncClientHandler handler = new SyncClientHandler(latch);

        bs.group(bossGroup)
                .channel(NioSocketChannel.class)
                .option(ChannelOption.SO_KEEPALIVE, true)
                .handler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel ch) throws Exception {

                        ch.pipeline().addLast("Encoder", new PacketEncoder());
                        ch.pipeline().addLast("LineBasedFrameDecoder", new LineBasedFrameDecoder(100000));
                        ch.pipeline().addLast("StringDecoderExtend", new StringDecoderExtend());

                        // 处理来自服务端的响应信息
                        ch.pipeline().addLast(handler);
                    }
                });

        // 客户端开启
        cf = bs.connect(ip, port).sync();
        System.out.println("============== " + cf.channel().isActive());
//        Thread.sleep(4000);
        System.out.println("============== " + cf.channel().isActive());


        Channel channel = cf.channel();

        if (cf.channel().isActive()) {
            String reqStr = "{\"record\":\"thirteen.connect\",\"mark\":\"8289\",\"client_uid\":\"undefined\",\"co_equipment_uid\":\"y-3-1-000221\",\"local_ip_address\":\"undefined\",\"remote_ip_address\":\"undefined\",\"datetime\":\"2020-01-09 17:51:50\",\"data1\":\"undefined\",\"data2\":\"undefined\",\"data3\":\"undefined\",\"data4\":\"undefined\",\"check_sum\":\"undefined\"}";
            System.out.println("============== " + cf.channel().isActive());

            channel.write(reqStr);

//            cf.awaitUninterruptibly();

            channel.flush();

            latch.await();
            System.out.println("服务器返回 1:" + handler.getResult());


//            cf.channel().writeAndFlush(reqStr);


            cf.channel().close();

        }


    }

    @Nullable
    @Contract(pure = true)
    public static String a(@NotNull  Object obj){
        synchronized (obj){

        }
        return null;
    }


    public static void main(String[] args) throws UnsupportedEncodingException, InterruptedException {
//        new SyncClient("127.0.0.1", 1803).action();

        a(null);
    }

}
