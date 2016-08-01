package net.minecraft.server;

import com.google.common.base.Charsets;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import java.net.InetSocketAddress;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LegacyPingHandler extends ChannelInboundHandlerAdapter {

    private static final Logger a;

    private final ServerConnection b;

    public LegacyPingHandler(ServerConnection serverconnection) {
    }

    public void channelRead(ChannelHandlerContext channelhandlercontext, Object object) throws Exception {
    }

    private void a(ChannelHandlerContext channelhandlercontext, ByteBuf bytebuf) {
    }

    private ByteBuf a(String s) {
        return null;
    }
}
