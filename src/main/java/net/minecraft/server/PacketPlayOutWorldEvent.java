package net.minecraft.server;

import java.io.IOException;

public class PacketPlayOutWorldEvent implements Packet<PacketListenerPlayOut> {

    private int a = 0;

    private BlockPosition b = null;

    private int c = 0;

    private boolean d = false;

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
