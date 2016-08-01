package net.minecraft.server;

import java.io.IOException;

public class PacketPlayInSettings implements Packet<PacketListenerPlayIn> {

    private String a = null;

    private int b = 0;

    private EntityHuman.EnumChatVisibility c = null;

    private boolean d = false;

    private int e = 0;

    private EnumMainHand f = null;

    public PacketPlayInSettings() {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayIn packetlistenerplayin) {
    }

    public String a() {
        return null;
    }

    public EntityHuman.EnumChatVisibility c() {
        return null;
    }

    public boolean d() {
        return false;
    }

    public int e() {
        return 0;
    }

    public EnumMainHand getMainHand() {
        return null;
    }
}
