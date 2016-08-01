package net.minecraft.server;

import java.io.IOException;
import java.util.Collection;

public class PacketPlayOutMap implements Packet<PacketListenerPlayOut> {

    private int a;

    private byte b;

    private boolean c;

    private MapIcon[] d;

    private int e;

    private int f;

    private int g;

    private int h;

    private byte[] i;

    public PacketPlayOutMap() {
    }

    public PacketPlayOutMap(int i, byte b0, boolean flag, Collection<MapIcon> collection, byte[] abyte, int j, int k, int l, int i1) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
    }
}
