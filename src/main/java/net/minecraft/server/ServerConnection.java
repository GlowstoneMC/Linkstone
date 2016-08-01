package net.minecraft.server;

import com.google.common.collect.Lists;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollServerSocketChannel;
import io.netty.channel.local.LocalEventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServerConnection {

    private static final Logger e;

    public static final LazyInitVar<NioEventLoopGroup> a;

    public static final LazyInitVar<EpollEventLoopGroup> b;

    public static final LazyInitVar<LocalEventLoopGroup> c;

    private final MinecraftServer f;

    public volatile boolean d;

    private final List<ChannelFuture> g;

    private final List<NetworkManager> h;

    public ServerConnection(MinecraftServer minecraftserver) {
    }

    public void a(InetAddress inetaddress, int i) throws IOException {
    }

    public void b() {
    }

    public void c() {
    }

    public MinecraftServer d() {
        return null;
    }
}
