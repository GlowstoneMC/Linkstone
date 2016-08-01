package net.minecraft.server;

import java.io.IOException;

public class PacketPlayInBlockDig implements Packet<PacketListenerPlayIn> {

    private BlockPosition a = null;

    private EnumDirection b = null;

    private PacketPlayInBlockDig.EnumPlayerDigType c = null;

    public PacketPlayInBlockDig() {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayIn packetlistenerplayin) {
    }

    public BlockPosition a() {
        return null;
    }

    public EnumDirection b() {
        return null;
    }

    public PacketPlayInBlockDig.EnumPlayerDigType c() {
        return null;
    }

    public static enum EnumPlayerDigType {

        START_DESTROY_BLOCK, ABORT_DESTROY_BLOCK, STOP_DESTROY_BLOCK, DROP_ALL_ITEMS, DROP_ITEM, RELEASE_USE_ITEM, SWAP_HELD_ITEMS;

        private EnumPlayerDigType() {
        }
    }
}
