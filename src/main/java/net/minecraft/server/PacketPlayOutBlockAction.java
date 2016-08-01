package net.minecraft.server;

import java.io.IOException;

public class PacketPlayOutBlockAction implements Packet<PacketListenerPlayOut> {

    private BlockPosition a = null;

    private int b = 0;

    private int c = 0;

    private Block d = null;

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
