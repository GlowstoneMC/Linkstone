package net.minecraft.server;

import java.io.IOException;

public class PacketPlayOutSpawnPosition implements Packet<PacketListenerPlayOut> {

    public BlockPosition position = null;

    public PacketPlayOutSpawnPosition() {
    }

    public PacketPlayOutSpawnPosition(BlockPosition blockposition) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
    }
}
