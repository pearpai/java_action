package com.action.netty3.action.chapter5;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.nio.ByteBuffer;
import java.util.Random;


/**
 * @Description ByteBufExamples
 * @Author wuyunfeng
 * @Date 2020-05-21 11:27
 * @Version 1.0
 */
public class ByteBufExamples {

    private final static Random random = new Random();
    private static final ByteBuf BYTE_BUF_FROM_SOMEWHERE = Unpooled.buffer(1024);
    private static final Channel CHANNEL_FROM_SOMEWHERE = new NioSocketChannel();
//    private static final ChannelHandlerContext CHANNEL_HANDLER_CONTEXT_FROM_SOMEWHERE = DummyCh


    /**
     * 代码清单 5-1 支撑数组
     */
    public static void heapBuffer() {
        ByteBuf heapBuff = BYTE_BUF_FROM_SOMEWHERE; // get reference from somewhere
        // 检查 ByteBuf 是否有一个支撑数组
        if (heapBuff.hasArray()) {
            // 如果有，则获取对该数组的引用
            byte[] array = heapBuff.array();
            // 计算第一个字节的偏移量
            int offset = heapBuff.arrayOffset() + heapBuff.readerIndex();
            // 获得刻度字节数
            int length = heapBuff.readableBytes();
            // 使用数组、偏移量和长度作为参数调用你的方法
            handleArray(array, offset, length);
        }
    }

    /**
     * 代码清单5-2 访问直接缓冲区数据
     */
    public static void directBuffer() {
        ByteBuf directBuf = BYTE_BUF_FROM_SOMEWHERE;
        // 检查 ByteBuf 是否由数组支撑。如果不是，则这是一个直接缓冲区
        if (!directBuf.hasArray()) {
            // 获取可读取的字节数
            int length = directBuf.readableBytes();
            // 分配一个新的素质来保存具有该长度的字节数据
            byte[] array = new byte[length];
            // 将字节复制到该数组
            directBuf.getBytes(directBuf.readerIndex(), array);
            // 使用数组， 偏移量鹤长度作为参赛调用你的方法
            handleArray(array, 0, length);
        }
    }

    /**
     * 代码清单 5-3 使用 ByteBuffer 的复合缓冲区模式
     */
    public static void byteBufferComposite(ByteBuffer header, ByteBuffer body) {
        // Use an array to hold the message parts
        ByteBuffer[] message = new ByteBuffer[]{header, body};

        // Create a new ByteBuffer and use copy to merge the header and body
        ByteBuffer message2 = ByteBuffer.allocate(header.remaining() + body.remaining());
        message2.put(header);
        message2.put(body);
        // 调换这个buffer的当前位置，并且设置当前位置是0
        message2.flip();
    }

    /**
     * 代码清单 5-4 使用 CompositeByteBuf 的复合缓冲区模式
     */
    public static void byteBufComposite() {
        CompositeByteBuf messageBuf = Unpooled.compositeBuffer();
        ByteBuf headerBuf = BYTE_BUF_FROM_SOMEWHERE;
        ByteBuf bodyBuf = BYTE_BUF_FROM_SOMEWHERE;
        // 将 ByteBuf 实例追加到 CompositeByteBuf
        messageBuf.addComponents(headerBuf, bodyBuf);
        // ...
        // 删除位于所以位置为0（第一个组件）的ByteBuf
        messageBuf.removeComponent(0);
        // 循环遍历所有的ByteBuf 实例
        for (ByteBuf buf : messageBuf) {
            System.out.println(buf.toString());
        }
    }

    /**
     * 代码清单 5-5 访问 CompositeByteBuf 中的数据
     */
    public static void byteBufCompositeArray() {
        CompositeByteBuf compBuf = Unpooled.compositeBuffer();
        // 获得可读字节数
        int length = compBuf.readableBytes();
        // 分配一个具有可读字节数长度的新数组
        byte[] array = new byte[length];
        // 将字节读到该数组中
        compBuf.getBytes(compBuf.readerIndex(), array);
        // 使用偏移量和长度作为参数使用该数组
        handleArray(array, 0, array.length);

    }


    /**
     * 处理
     *
     * @param array
     * @param offset
     * @param len
     */
    private static void handleArray(byte[] array, int offset, int len) {
    }

}
