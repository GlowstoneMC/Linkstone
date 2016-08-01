package net.minecraft.server;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class RemoteConnectionThread implements Runnable {

    private static final AtomicInteger h = null;

    protected boolean a = false;

    protected IMinecraftServer b = null;

    protected final String c = null;

    protected Thread d = null;

    protected int e = 0;

    protected List<DatagramSocket> f = null;

    protected List<ServerSocket> g = null;

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
