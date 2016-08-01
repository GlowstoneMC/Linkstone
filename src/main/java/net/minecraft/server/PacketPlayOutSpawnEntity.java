package net.minecraft.server;

import java.io.IOException;
import java.util.UUID;

public class PacketPlayOutSpawnEntity implements Packet<PacketListenerPlayOut> {

    private int a = 0;

    private UUID b = null;

    private double c = 0.0;

    private double d = 0.0;

    private double e = 0.0;

    private int f = 0;

    private int g = 0;

    private int h = 0;

    private int i = 0;

    private int j = 0;

    private int k = 0;

    private int l = 0;

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
