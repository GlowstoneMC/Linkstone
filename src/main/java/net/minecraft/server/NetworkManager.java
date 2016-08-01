package net.minecraft.server;

import com.google.common.collect.Queues;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.local.LocalChannel;
import io.netty.channel.local.LocalEventLoopGroup;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.handler.timeout.TimeoutException;
import io.netty.util.AttributeKey;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.net.SocketAddress;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.annotation.Nullable;
import javax.crypto.SecretKey;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class NetworkManager extends SimpleChannelInboundHandler<Packet<?>> {

    private static final Logger g = null;

    public static final Marker a = null;

    public static final Marker b = null;

    public static final AttributeKey<EnumProtocol> c = null;

    public static final LazyInitVar<NioEventLoopGroup> d = null;

    public static final LazyInitVar<EpollEventLoopGroup> e = null;

    public static final LazyInitVar<LocalEventLoopGroup> f = null;

    private final EnumProtocolDirection h = null;

    private final Queue<NetworkManager.QueuedPacket> i = null;

    private final ReentrantReadWriteLock j = null;

    public Channel channel = null;

    private SocketAddress l = null;

    private PacketListener m = null;

    private IChatBaseComponent n = null;

    private boolean o = false;

    private boolean p = false;

    public NetworkManager(EnumProtocolDirection enumprotocoldirection) {
    }

    public void channelActive(ChannelHandlerContext channelhandlercontext) throws Exception {
    }

    public void setProtocol(EnumProtocol enumprotocol) {
    }

    public void channelInactive(ChannelHandlerContext channelhandlercontext) throws Exception {
    }

    public void exceptionCaught(ChannelHandlerContext channelhandlercontext, Throwable throwable) throws Exception {
    }

    protected void a(ChannelHandlerContext channelhandlercontext, Packet<?> packet) throws Exception {
    }

    public void setPacketListener(PacketListener packetlistener) {
    }

    public void sendPacket(Packet<?> packet) {
    }

    public void sendPacket(Packet<?> packet, GenericFutureListener<? extends Future<? super Void>> genericfuturelistener, GenericFutureListener<? extends Future<? super Void>>... agenericfuturelistener) {
    }

    private void a(final Packet<?> packet, @Nullable final GenericFutureListener<? extends Future<? super Void>>[] agenericfuturelistener) {
    }

    private void m() {
    }

    public void a() {
    }

    public SocketAddress getSocketAddress() {
        return null;
    }

    public void close(IChatBaseComponent ichatbasecomponent) {
    }

    public boolean isLocal() {
        return false;
    }

    public void a(SecretKey secretkey) {
    }

    public boolean isConnected() {
        return false;
    }

    public boolean h() {
        return false;
    }

    public PacketListener i() {
        return null;
    }

    public IChatBaseComponent j() {
        return null;
    }

    public void stopReading() {
    }

    public void setCompressionLevel(int i) {
    }

    public void handleDisconnection() {
    }

    protected void channelRead0(ChannelHandlerContext channelhandlercontext, Packet object) throws Exception {
    }

    static class QueuedPacket {

        private final Packet<?> a = null;

        private final GenericFutureListener<? extends Future<? super Void>>[] b = null;

        public QueuedPacket(Packet<?> packet, GenericFutureListener<? extends Future<? super Void>>... agenericfuturelistener) {
        }
    }
}
