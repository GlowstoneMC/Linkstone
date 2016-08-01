package net.minecraft.server;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class PacketPlayOutExplosion implements Packet<PacketListenerPlayOut> {

    private double a;

    private double b;

    private double c;

    private float d;

    private List<BlockPosition> e;

    private float f;

    private float g;

    private float h;

    public PacketPlayOutExplosion() {
    }

    public PacketPlayOutExplosion(double d0, double d1, double d2, float f, List<BlockPosition> list, Vec3D vec3d) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
    }
}
