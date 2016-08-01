package net.minecraft.server;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;
import javax.crypto.Cipher;

public class PacketDecrypter extends MessageToMessageDecoder<ByteBuf> {

    private final PacketEncryptionHandler a = null;

    public PacketDecrypter(Cipher cipher) {
    }

    protected void a(ChannelHandlerContext channelhandlercontext, ByteBuf bytebuf, List<Object> list) throws Exception {
    }

    protected void decode(ChannelHandlerContext channelhandlercontext, Object object, List list) throws Exception {
    }
}
