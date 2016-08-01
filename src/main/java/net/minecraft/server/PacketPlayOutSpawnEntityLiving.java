package net.minecraft.server;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

public class PacketPlayOutSpawnEntityLiving implements Packet<PacketListenerPlayOut> {

    private int a = 0;

    private UUID b = null;

    private int c = 0;

    private double d = 0.0;

    private double e = 0.0;

    private double f = 0.0;

    private int g = 0;

    private int h = 0;

    private int i = 0;

    private byte j = 0;

    private byte k = 0;

    private byte l = 0;

    private DataWatcher m = null;

    private List<DataWatcher.Item<?>> n = null;

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
