package net.minecraft.server;

import java.io.IOException;

public class PacketPlayOutEntityVelocity implements Packet<PacketListenerPlayOut> {

    private int a = 0;

    private int b = 0;

    private int c = 0;

    private int d = 0;

    public PacketPlayOutEntityVelocity() {
    }

    public PacketPlayOutEntityVelocity(Entity entity) {
    }

    public PacketPlayOutEntityVelocity(int i, double d0, double d1, double d2) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
    }
}
