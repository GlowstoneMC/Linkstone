package net.minecraft.server;

import java.io.IOException;

public class PacketPlayOutEntity implements Packet<PacketListenerPlayOut> {

    protected int a = 0;

    protected int b = 0;

    protected int c = 0;

    protected int d = 0;

    protected byte e = 0;

    protected byte f = 0;

    protected boolean g = false;

    protected boolean h = false;

    public PacketPlayOutEntity() {
    }

    public PacketPlayOutEntity(int i) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
    }

    public String toString() {
        return null;
    }

    public static class PacketPlayOutEntityLook extends PacketPlayOutEntity {

        public PacketPlayOutEntityLook() {
        }

        public PacketPlayOutEntityLook(int i, byte b0, byte b1, boolean flag) {
        }

        public void a(PacketDataSerializer packetdataserializer) throws IOException {
        }

        public void b(PacketDataSerializer packetdataserializer) throws IOException {
        }
    }

    public static class PacketPlayOutRelEntityMove extends PacketPlayOutEntity {

        public PacketPlayOutRelEntityMove() {
        }

        public PacketPlayOutRelEntityMove(int i, long j, long k, long l, boolean flag) {
        }

        public void a(PacketDataSerializer packetdataserializer) throws IOException {
        }

        public void b(PacketDataSerializer packetdataserializer) throws IOException {
        }
    }

    public static class PacketPlayOutRelEntityMoveLook extends PacketPlayOutEntity {

        public PacketPlayOutRelEntityMoveLook() {
        }

        public PacketPlayOutRelEntityMoveLook(int i, long j, long k, long l, byte b0, byte b1, boolean flag) {
        }

        public void a(PacketDataSerializer packetdataserializer) throws IOException {
        }

        public void b(PacketDataSerializer packetdataserializer) throws IOException {
        }
    }
}
