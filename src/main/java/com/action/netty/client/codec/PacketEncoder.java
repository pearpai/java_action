package com.action.netty.client.codec;

import com.alibaba.fastjson.JSONObject;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * Summary: 数据编码处理
 * 如果需要对包的部分进行压缩等 可以在此处理
 *
 * @author wuyunfeng
 * @date 26. 8月 2019 14:43
 */
public class PacketEncoder extends MessageToByteEncoder<Object> {


    @Override
    protected void encode(ChannelHandlerContext ctx, Object msg, ByteBuf out) {

//        String builder = JSONObject.toJSONString(msg) + "\n";
//        out.writeBytes(builder.getBytes());


        String builder = (String) msg + "\n";
        out.writeBytes(Unpooled.copiedBuffer(builder.getBytes()));


//        cf.channel().writeAndFlush(Unpooled.copiedBuffer(reqStr.getBytes()));

    }
}
