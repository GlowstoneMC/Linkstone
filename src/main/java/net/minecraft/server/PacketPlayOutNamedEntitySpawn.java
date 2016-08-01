package net.minecraft.server;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

public class PacketPlayOutNamedEntitySpawn implements Packet<PacketListenerPlayOut> {

    private int a = 0;

    private UUID b = null;

    private double c = 0.0;

    private double d = 0.0;

    private double e = 0.0;

    private byte f = 0;

    private byte g = 0;

    private DataWatcher h = null;

    private List<DataWatcher.Item<?>> i = null;

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
