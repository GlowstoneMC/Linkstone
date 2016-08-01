package net.minecraft.server;

import java.io.IOException;

public class PacketPlayOutBlockChange implements Packet<PacketListenerPlayOut> {

    private BlockPosition a;

    public IBlockData block;

    public PacketPlayOutBlockChange() {
    }

    public PacketPlayOutBlockChange(World world, BlockPosition blockposition) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
    }
}
