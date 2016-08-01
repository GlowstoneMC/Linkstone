package net.minecraft.server;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

public class PacketPlayOutNamedEntitySpawn implements Packet<PacketListenerPlayOut> {

    private int a;

    private UUID b;

    private double c;

    private double d;

    private double e;

    private byte f;

    private byte g;

    private DataWatcher h;

    private List<DataWatcher.Item<?>> i;

    public PacketPlayOutNamedEntitySpawn() {
    }

    public PacketPlayOutNamedEntitySpawn(EntityHuman entityhuman) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
    }
}
