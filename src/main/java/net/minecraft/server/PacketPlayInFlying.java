package net.minecraft.server;

import java.io.IOException;

public class PacketPlayInFlying implements Packet<PacketListenerPlayIn> {

    protected double x = 0.0;

    protected double y = 0.0;

    protected double z = 0.0;

    protected float yaw = 0.0F;

    protected float pitch = 0.0F;

    protected boolean f = false;

    protected boolean hasPos = false;

    protected boolean hasLook = false;

    public PacketPlayInFlying() {
    }

    public void a(PacketListenerPlayIn packetlistenerplayin) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public double a(double d0) {
        return 0.0;
    }

    public double b(double d0) {
        return 0.0;
    }

    public double c(double d0) {
        return 0.0;
    }

    public float a(float f) {
        return 0.0F;
    }

    public float b(float f) {
        return 0.0F;
    }

    public boolean a() {
        return false;
    }

    public static class PacketPlayInLook extends PacketPlayInFlying {

        public PacketPlayInLook() {
        }

        public void a(PacketDataSerializer packetdataserializer) throws IOException {
        }

        public void b(PacketDataSerializer packetdataserializer) throws IOException {
        }
    }

    public static class PacketPlayInPosition extends PacketPlayInFlying {

        public PacketPlayInPosition() {
        }

        public void a(PacketDataSerializer packetdataserializer) throws IOException {
        }

        public void b(PacketDataSerializer packetdataserializer) throws IOException {
        }
    }

    public static class PacketPlayInPositionLook extends PacketPlayInFlying {

        public PacketPlayInPositionLook() {
        }

        public void a(PacketDataSerializer packetdataserializer) throws IOException {
        }

        public void b(PacketDataSerializer packetdataserializer) throws IOException {
        }
    }
}
