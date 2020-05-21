package com.action.netty3.action.chapter4;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.CharsetUtil;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Summary:
 *
 * @author wuyunfeng
 * @date 15. 5月 2020 11:16 上午
 */
public class ChannelOperationExamples {

    private static final Channel CHANNEL_FROM_SOMEWHERE = new NioSocketChannel();

    public static void writeToChannel() {

        Channel channel = CHANNEL_FROM_SOMEWHERE;
        // 创建持有数据的ByteBuf
        ByteBuf buf = Unpooled.copiedBuffer("your data", CharsetUtil.UTF_8);
        ChannelFuture cf = channel.writeAndFlush(buf);
        // 添加 ChannelFutureListener 以便在写操作完成后接收通知
        cf.addListener((ChannelFutureListener) future -> {
            // 写操作完成，并且没有错误发生
            if (future.isSuccess()) {
                System.out.println("Write successful");
            } else {
                System.err.println("Write error");
                future.cause().printStackTrace();
            }
        });

    }

    public static void writingToChannelFromManyThreads() {
        final Channel channel = CHANNEL_FROM_SOMEWHERE;
        // 创建持有要写数据的ByteBuf
        final ByteBuf buf = Unpooled.copiedBuffer("your data", CharsetUtil.UTF_8);
        // 创建将数据写到Channel的Runnable
        Runnable writer = () -> channel.write(buf.duplicate());
        // 获取到线程池Executor 的引用
        Executor executor = Executors.newCachedThreadPool();
        // 递交写任务给线程池以便在某个线程中执行
        // write in one thread
        executor.execute(writer);

        //递交另一个写任务以便在另一个线程中执行
        // write in another thread
        executor.execute(writer);


    }

    public static void main(String[] args) {

    }


}
