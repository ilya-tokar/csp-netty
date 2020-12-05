package io.netty.example.calculator;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.example.time.UnixTime;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

public class CalculatorDecoder extends ByteToMessageDecoder {

    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        if (byteBuf.readableBytes() < 9) {
            return;
        }

        Task t = new Task(byteBuf.toString());

        list.add(t);
    }
}
