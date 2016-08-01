package net.minecraft.server;

import java.io.IOException;
import java.util.UUID;

public class PacketPlayOutSpawnEntityPainting implements Packet<PacketListenerPlayOut> {

    private int a;

    private UUID b;

    private BlockPosition c;

    private EnumDirection d;

    private String e;

    public PacketPlayOutSpawnEntityPainting() {
    }

    public PacketPlayOutSpawnEntityPainting(EntityPainting entitypainting) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
    }
}
