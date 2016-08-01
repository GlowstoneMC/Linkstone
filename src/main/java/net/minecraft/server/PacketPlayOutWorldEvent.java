package net.minecraft.server;

import java.io.IOException;

public class PacketPlayOutWorldEvent implements Packet<PacketListenerPlayOut> {

    private int a;

    private BlockPosition b;

    private int c;

    private boolean d;

    public PacketPlayOutWorldEvent() {
    }

    public PacketPlayOutWorldEvent(int i, BlockPosition blockposition, int j, boolean flag) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
    }
}
