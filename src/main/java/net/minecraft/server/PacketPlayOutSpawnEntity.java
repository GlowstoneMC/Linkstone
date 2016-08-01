package net.minecraft.server;

import java.io.IOException;
import java.util.UUID;

public class PacketPlayOutSpawnEntity implements Packet<PacketListenerPlayOut> {

    private int a;

    private UUID b;

    private double c;

    private double d;

    private double e;

    private int f;

    private int g;

    private int h;

    private int i;

    private int j;

    private int k;

    private int l;

    public PacketPlayOutSpawnEntity() {
    }

    public PacketPlayOutSpawnEntity(Entity entity, int i) {
    }

    public PacketPlayOutSpawnEntity(Entity entity, int i, int j) {
    }

    public PacketPlayOutSpawnEntity(Entity entity, int i, int j, BlockPosition blockposition) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
    }

    public void a(int i) {
    }

    public void b(int i) {
    }

    public void c(int i) {
    }
}
