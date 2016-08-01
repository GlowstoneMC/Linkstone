package net.minecraft.server;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class PacketPlayOutExplosion implements Packet<PacketListenerPlayOut> {

    private double a = 0.0;

    private double b = 0.0;

    private double c = 0.0;

    private float d = 0.0F;

    private List<BlockPosition> e = null;

    private float f = 0.0F;

    private float g = 0.0F;

    private float h = 0.0F;

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
