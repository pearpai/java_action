package com.action.netty.client;

import com.action.netty.client.codec.PacketEncoder;
import com.action.netty.client.codec.StringDecoderExtend;
import com.action.netty.client.handler.ClientHandler;
import com.action.netty.zip.test.ZipTest;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.LineBasedFrameDecoder;
import lombok.extern.slf4j.Slf4j;

import java.io.UnsupportedEncodingException;

/**
 * Summary:
 *
 * @author wuyunfeng
 * @date 05. 12月 2019 3:58 下午
 */
@Slf4j
public class ClientZip {

    private String ip;

    private int port;

    public ChannelFuture cf;

    public ClientZip(String ip, int port) {
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
            String reqStr = "{\"record\":\"thirteen.connect\",\"mark\":\"8289\",\"client_uid\":\"undefined\",\"co_equipment_uid\":\"y-3-1-000221\",\"local_ip_address\":\"undefined\",\"remote_ip_address\":\"undefined\",\"datetime\":\"2020-01-09 17:51:50\",\"data1\":\"undefined\",\"data2\":\"undefined\",\"data3\":\"undefined\",\"data4\":\"undefined\",\"check_sum\":\"undefined\"}";
            System.out.println("============== " + cf.channel().isActive());


            cf.channel().writeAndFlush(reqStr);

        }
        Thread.sleep(1000);

        ZipTest.sendData(cf);
//        ZipTest.sendDataStr(cf, "2020-01-23 00:00:13.456",
//                "034401012104C4800B00F604CCC00B00F504D4C00B00F6050001165E000600005A17000034DC04D90121012201FF03FF0307D00039004402AC003B004C007C07D007D00000E8");
//        ZipTest.sendDataStr(cf, "2020-01-10 00:00:13.456", "F20103");
//        ZipTest.sendDataStr(cf, "2020-01-10 00:00:13.456", "F30403010001");
//        ZipTest.sendDataStr(cf, "2020-01-10 00:00:13.456", "F30403020002");


//        ZipTest.sendDataStr(cf, "2020-01-10 00:00:13.456", "F403011030");
//        ZipTest.sendDataStr(cf, "2020-01-10 00:00:13.456", "F504011F0001");
//        ZipTest.sendDataStr(cf, "2020-01-10 00:00:13.456",
//                "F61B00010008323031392D31322D31392D31353A35303A31342E353831");

    }


    public static void main(String[] args) throws UnsupportedEncodingException, InterruptedException {
        new ClientZip("127.0.0.1", 1803).action();

    }


}
