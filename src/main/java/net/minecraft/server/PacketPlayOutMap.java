package net.minecraft.server;

import java.io.IOException;
import java.util.Collection;

public class PacketPlayOutMap implements Packet<PacketListenerPlayOut> {

    private int a = 0;

    private byte b = 0;

    private boolean c = false;

    private MapIcon[] d = null;

    private int e = 0;

    private int f = 0;

    private int g = 0;

    private int h = 0;

    private byte[] i = null;

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
