package net.minecraft.server;

import java.io.IOException;

public class PacketPlayInBlockPlace implements Packet<PacketListenerPlayIn> {

    private EnumHand a = null;

    public long timestamp = 0;

    // CraftBukkit
    public PacketPlayInBlockPlace() {
    }

    public PacketPlayInBlockPlace(EnumHand enumhand) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayIn packetlistenerplayin) {
    }

    public EnumHand a() {
        return null;
    }
}
