package net.minecraft.server;

import java.io.IOException;

public class PacketPlayInWindowClick implements Packet<PacketListenerPlayIn> {

    private int a = 0;

    private int slot = 0;

    private int button = 0;

    private short d = 0;

    private ItemStack item = null;

    private InventoryClickType shift = null;

    public PacketPlayInWindowClick() {
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

    public int b() {
        return 0;
    }

    public int c() {
        return 0;
    }

    public short d() {
        return 0;
    }

    public ItemStack e() {
        return null;
    }

    public InventoryClickType f() {
        return null;
    }
}
