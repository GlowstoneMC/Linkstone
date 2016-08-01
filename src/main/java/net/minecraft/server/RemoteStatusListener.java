package net.minecraft.server;

import com.google.common.collect.Maps;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.PortUnreachableException;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

public class RemoteStatusListener extends RemoteConnectionThread {

    private long h;

    private int i;

    private final int j;

    private final int k;

    private final String l;

    private final String m;

    private DatagramSocket n;

    private final byte[] o;

    private DatagramPacket p;

    private final Map<SocketAddress, String> q;

    private String r;

    private String s;

    private final Map<SocketAddress, RemoteStatusListener.RemoteStatusChallenge> t;

    private final long u;

    private final RemoteStatusReply v;

    private long w;

    public RemoteStatusListener(IMinecraftServer iminecraftserver) {
    }

    private void a(byte[] abyte, DatagramPacket datagrampacket) throws IOException {
    }

    private boolean a(DatagramPacket datagrampacket) throws IOException {
        return false;
    }

    private byte[] b(DatagramPacket datagrampacket) throws IOException {
        return null;
    }

    private byte[] a(SocketAddress socketaddress) {
        return null;
    }

    private Boolean c(DatagramPacket datagrampacket) {
        return null;
    }

    private void d(DatagramPacket datagrampacket) throws IOException {
    }

    private void f() {
    }

    public void run() {
    }

    public void a() {
    }

    private void a(Exception exception) {
    }

    private boolean g() {
        return false;
    }

    class RemoteStatusChallenge {

        private final long time;

        private final int token;

        private final byte[] identity;

        private final byte[] response;

        private final String f;

        public RemoteStatusChallenge(DatagramPacket datagrampacket) {
        }

        public Boolean a(long i) {
            return null;
        }

        public int a() {
            return 0;
        }

        public byte[] b() {
            return null;
        }

        public byte[] c() {
            return null;
        }
    }
}
