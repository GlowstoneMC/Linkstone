package net.minecraft.server;

import java.io.IOException;

public class PacketPlayInVehicleMove implements Packet<PacketListenerPlayIn> {

    private double a = 0.0;

    private double b = 0.0;

    private double c = 0.0;

    private float d = 0.0F;

    private float e = 0.0F;

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
