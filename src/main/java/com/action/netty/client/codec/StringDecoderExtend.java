package com.action.netty.client.codec;

import com.alibaba.fastjson.JSONObject;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.string.StringDecoder;

import java.nio.charset.Charset;
import java.util.List;

/**
 * Summary: 对StringDecoder数据实例化
 *
 * @author wuyunfeng
 * @date 28. 8月 2019 09:33
 */
public class StringDecoderExtend extends StringDecoder {

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf msg, List<Object> out) throws Exception {

//        Packet packet;
//        String str = msg.toString(Charset.defaultCharset());
//        if (!StringUtils.isEmpty(str)) {
//            try {
//                packet = JSONObject.parseObject(str, Packet.class);
//                out.add(packet);
//            } catch (Exception e) {
//                ctx.channel().writeAndFlush("parse error");
//            }
//
//        } else {
//
//            ctx.channel().writeAndFlush("empty cmd");
//        }
        super.decode(ctx, msg, out);


    }
}
