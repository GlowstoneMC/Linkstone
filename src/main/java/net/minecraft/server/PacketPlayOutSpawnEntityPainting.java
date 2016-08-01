package net.minecraft.server;

import java.io.IOException;
import java.util.UUID;

public class PacketPlayOutSpawnEntityPainting implements Packet<PacketListenerPlayOut> {

    private int a = 0;

    private UUID b = null;

    private BlockPosition c = null;

    private EnumDirection d = null;

    private String e = null;

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
