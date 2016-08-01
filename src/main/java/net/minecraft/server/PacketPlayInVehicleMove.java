package net.minecraft.server;

import java.io.IOException;

public class PacketPlayInVehicleMove implements Packet<PacketListenerPlayIn> {

    private double a;

    private double b;

    private double c;

    private float d;

    private float e;

    public PacketPlayInVehicleMove() {
    }

    public PacketPlayInVehicleMove(Entity entity) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayIn packetlistenerplayin) {
    }

    public double getX() {
        return 0.0;
    }

    public double getY() {
        return 0.0;
    }

    public double getZ() {
        return 0.0;
    }

    public float getYaw() {
        return 0.0F;
    }

    public float getPitch() {
        return 0.0F;
    }
}
