package net.minecraft.server;

import java.io.IOException;

public class PacketPlayOutEntity implements Packet<PacketListenerPlayOut> {

    protected int a;

    protected int b;

    protected int c;

    protected int d;

    protected byte e;

    protected byte f;

    protected boolean g;

    protected boolean h;

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
