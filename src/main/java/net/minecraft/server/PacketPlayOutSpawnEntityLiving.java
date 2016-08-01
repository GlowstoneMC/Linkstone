package net.minecraft.server;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

public class PacketPlayOutSpawnEntityLiving implements Packet<PacketListenerPlayOut> {

    private int a;

    private UUID b;

    private int c;

    private double d;

    private double e;

    private double f;

    private int g;

    private int h;

    private int i;

    private byte j;

    private byte k;

    private byte l;

    private DataWatcher m;

    private List<DataWatcher.Item<?>> n;

    public PacketPlayOutSpawnEntityLiving() {
    }

    public PacketPlayOutSpawnEntityLiving(EntityLiving entityliving) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
    }
}
