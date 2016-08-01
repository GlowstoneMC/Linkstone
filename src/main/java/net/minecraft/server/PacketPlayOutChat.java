package net.minecraft.server;

import java.io.IOException;

public class PacketPlayOutChat implements Packet<PacketListenerPlayOut> {

    private IChatBaseComponent a = null;

    private byte b = 0;

    public PacketPlayOutChat() {
    }

    public PacketPlayOutChat(IChatBaseComponent ichatbasecomponent) {
    }

    public PacketPlayOutChat(IChatBaseComponent ichatbasecomponent, byte b0) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
    }

    public boolean b() {
        return false;
    }
}
