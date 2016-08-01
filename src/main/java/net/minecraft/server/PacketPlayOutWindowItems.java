package net.minecraft.server;

import java.io.IOException;
import java.util.List;

public class PacketPlayOutWindowItems implements Packet<PacketListenerPlayOut> {

    private int a = 0;

    private ItemStack[] b = null;

    public PacketPlayOutWindowItems() {
    }

    public PacketPlayOutWindowItems(int i, List<ItemStack> list) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
    }
}
