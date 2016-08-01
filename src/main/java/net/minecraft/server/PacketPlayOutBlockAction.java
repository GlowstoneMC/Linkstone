package net.minecraft.server;

import java.io.IOException;

public class PacketPlayOutBlockAction implements Packet<PacketListenerPlayOut> {

    private BlockPosition a;

    private int b;

    private int c;

    private Block d;

    public PacketPlayOutBlockAction() {
    }

    public PacketPlayOutBlockAction(BlockPosition blockposition, Block block, int i, int j) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
    }
}
