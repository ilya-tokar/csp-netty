package io.netty.example.calculator;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class CalculatorEncoder extends MessageToByteEncoder<Task> {
    protected void encode(ChannelHandlerContext channelHandlerContext, Task task, ByteBuf byteBuf) throws Exception {
        byteBuf.writeBytes(task.getResult());
    }
}
