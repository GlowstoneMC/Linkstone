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

    private long h = 0;

    private int i = 0;

    private final int j = 0;

    private final int k = 0;

    private final String l = null;

    private final String m = null;

    private DatagramSocket n = null;

    private final byte[] o = null;

    private DatagramPacket p = null;

    private final Map<SocketAddress, String> q = null;

    private String r = null;

    private String s = null;

    private final Map<SocketAddress, RemoteStatusListener.RemoteStatusChallenge> t = null;

    private final long u = 0;

    private final RemoteStatusReply v = null;

    private long w = 0;

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

        private final long time = 0;

        private final int token = 0;

        private final byte[] identity = null;

        private final byte[] response = null;

        private final String f = null;

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
