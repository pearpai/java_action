package com.action.netty3.action.chapter5;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.ByteProcessor;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
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
     * 代码清单 5-6 访问数据
     */
    public static void byteBufRelativeAccess() {

        ByteBuf buffer = BYTE_BUF_FROM_SOMEWHERE;
        for (int i = 0; i < buffer.capacity(); i++) {
            byte b = buffer.getByte(i);
            System.out.println((char) b);
        }

    }

    /**
     * 代码清单 5-7 读取所有数据
     */
    public static void readAllData() {
        ByteBuf buffer = BYTE_BUF_FROM_SOMEWHERE;
        while (buffer.isReadable()) {
            System.out.println(buffer.readByte());
        }
    }

    /**
     * 代码清单 5-8 写数据
     */
    public static void write() {
        ByteBuf buffer = BYTE_BUF_FROM_SOMEWHERE;
        while (buffer.writableBytes() >= 4) {
            buffer.writeInt(random.nextInt());
        }
    }


    /**
     * 代码清单 5-9 使用byteBufProcessor 来寻找\r
     * use {@link io.netty.buffer.ByteBufProcessor}
     */
    public static void byteProcessor() {
        ByteBuf buffer = BYTE_BUF_FROM_SOMEWHERE;
        int index = buffer.forEachByte(ByteProcessor.FIND_CR);
    }


    /**
     * 代码清单 5-10 对ByteBuf进行切片
     */
    public static void byteBufSlice() {
        Charset utf8 = StandardCharsets.UTF_8;
        // 创建一个用于保存给定字符串的字节的ByteBuf
        ByteBuf buf = Unpooled.copiedBuffer("Netty in Action rocks!", utf8);
        // 创建该ByteBuf 从索引0 开始到索引15结束的一个新切片
        ByteBuf sliced = buf.slice(0, 15);
        // 打印 “Netty in Action”
        System.out.println(sliced.toString(utf8));
        // 更新索引0处的字节
        buf.setByte(0, (byte) 'J');
        //将会成功，因为数据是共享的，对其中一个所做的更改对另外一个也是可见的
        assert buf.getByte(0) == sliced.getByte(0);
        System.out.println(buf.getByte(0));
        System.out.println(sliced.getByte(0));
    }

    /**
     * 代码清单 5-11 复制一个ByteBuf
     */
    public static void byteBufCopy() {
        Charset utf8 = StandardCharsets.UTF_8;
        // 创建一个用于保存给定字符串的字节的ByteBuf
        ByteBuf buf = Unpooled.copiedBuffer("Netty in Action rocks!", utf8);
        //创建该 ByteBuf 从索引 0 开始到索引 15 结束的分段的副本
        ByteBuf copy = buf.copy(0, 15);
        System.out.println(copy.toString(utf8));
        //更新索引 0 处的字节
        buf.setByte(0, (byte) 'J');
        //将会成功，因为数据不是共享的
        assert buf.getByte(0) != copy.getByte(0);
        System.out.println(copy.toString(utf8));


    }

    /**
     * 代码清单 5-12 get() 和 set() 方法的用法
     */
    public static void byteBufSetGet() {
        Charset utf8 = StandardCharsets.UTF_8;
        // 创建一个用于保存给定字符串的字节的ByteBuf
        ByteBuf buf = Unpooled.copiedBuffer("Netty in Action rocks!", utf8);
        // 打印第一个字符’N‘
        System.out.println((char) buf.getByte(0));
        // 存储当前的 readerIndex 和 writerIndex
        int readerIndex = buf.readerIndex();
        int writerIndex = buf.writerIndex();
        //将索引0处的字节更新为B
        buf.setByte(0, (byte) 'B');
        //打印第一个字符’B‘
        System.out.println((char) buf.getByte(0));
        //将会成功，因为这些操作并不会修改相应的索引
        assert readerIndex == buf.readerIndex();
        assert writerIndex == buf.writerIndex();

    }

    /**
     * 代码清单 5-13 ByteBuf 上的 read()和 write()操作
     */
    public static void byteBufWriteRead() {
        Charset utf8 = StandardCharsets.UTF_8;
        // 创建一个用于保存给定字符串的字节的ByteBuf
        ByteBuf buf = Unpooled.copiedBuffer("Netty in Action rocks!", utf8);
        // 打印第一个字符’N‘
        System.out.println((char) buf.getByte(0));
        // 存储当前的 readerIndex 和 writerIndex
        int readerIndex = buf.readerIndex();
        int writerIndex = buf.writerIndex();
        //将索引0处的字节更新为B
        buf.writeByte((byte) '?');

        //将会成功，因为 writeByte()方法移动了 writerIndex
        assert readerIndex == buf.readerIndex();
        assert writerIndex != buf.writerIndex();

    }

    /**
     * 代码清单 5-14 获取一个到ByteBufAllocator的引用
     */
    public static void obtainingByteBufAllocatorReference() {
        Channel channel = CHANNEL_FROM_SOMEWHERE; //get reference form somewhere
        //从 Channel 获取一个到ByteBufAllocator 的引用
        ByteBufAllocator allocator = channel.alloc();
        //...
//        ChannelHandlerContext ctx = CHANNEL_HANDLER_CONTEXT_FROM_SOMEWHERE; //get reference form somewhere
//        //从 ChannelHandlerContext 获取一个到 ByteBufAllocator 的引用
//        ByteBufAllocator allocator2 = ctx.alloc();
//        //...
    }


    /**
     * 代码清单 5-15 引用计数
     */
    public static void referenceCounting() {
        Channel channel = CHANNEL_FROM_SOMEWHERE;
        // 从Channel 获取ByteBufAllocator
        ByteBufAllocator allocator = channel.alloc();
        // ...
        // 从ByteBufAllocator分配一个ByteBuf
        ByteBuf buffer = allocator.directBuffer();
        // 检查引用计数是否为预期的 1
        assert buffer.refCnt() == 1;
    }

    /**
     * 代码清单5-16 释放引用计算器对象
     */
    public static void releaseReferenceCountedObject() {
        ByteBuf buffer = BYTE_BUF_FROM_SOMEWHERE;
        // 建设该对象的引用。 当减到0时，该对象被释放，并且该方法返回true
        boolean release = buffer.release();
        // ...
    }


    /**
     * @param args
     */
    public static void main(String[] args) {
        referenceCounting();
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
