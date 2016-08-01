package net.minecraft.server;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class RemoteConnectionThread implements Runnable {

    private static final AtomicInteger h;

    protected boolean a;

    protected IMinecraftServer b;

    protected final String c;

    protected Thread d;

    protected int e;

    protected List<DatagramSocket> f;

    protected List<ServerSocket> g;

    protected RemoteConnectionThread(IMinecraftServer iminecraftserver, String s) {
    }

    public synchronized void a() {
    }

    public boolean c() {
        return false;
    }

    protected void a(String s) {
    }

    protected void b(String s) {
    }

    protected void c(String s) {
    }

    protected void d(String s) {
    }

    protected int d() {
        return 0;
    }

    protected void a(DatagramSocket datagramsocket) {
    }

    protected boolean a(DatagramSocket datagramsocket, boolean flag) {
        return false;
    }

    protected boolean b(ServerSocket serversocket) {
        return false;
    }

    protected boolean a(ServerSocket serversocket, boolean flag) {
        return false;
    }

    protected void e() {
    }

    protected void a(boolean flag) {
    }
}
