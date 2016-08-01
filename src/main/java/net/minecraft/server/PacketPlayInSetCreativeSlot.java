package net.minecraft.server;

import java.io.IOException;

public class PacketPlayInSetCreativeSlot implements Packet<PacketListenerPlayIn> {

    private int slot;

    private ItemStack b;

    public PacketPlayInSetCreativeSlot() {
    }

    public void a(PacketListenerPlayIn packetlistenerplayin) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public int a() {
        return 0;
    }

    public ItemStack getItemStack() {
        return null;
    }
}
