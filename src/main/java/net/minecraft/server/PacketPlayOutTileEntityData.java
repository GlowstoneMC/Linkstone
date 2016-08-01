package net.minecraft.server;

import java.io.IOException;

public class PacketPlayOutTileEntityData implements Packet<PacketListenerPlayOut> {

    private BlockPosition a = null;

    private int b = 0;

    private NBTTagCompound c = null;

    public PacketPlayOutTileEntityData() {
    }

    public PacketPlayOutTileEntityData(BlockPosition blockposition, int i, NBTTagCompound nbttagcompound) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
    }
}
