package net.minecraft.server;

import java.io.IOException;

public class PacketPlayOutWorldParticles implements Packet<PacketListenerPlayOut> {

    private EnumParticle a = null;

    private float b = 0.0F;

    private float c = 0.0F;

    private float d = 0.0F;

    private float e = 0.0F;

    private float f = 0.0F;

    private float g = 0.0F;

    private float h = 0.0F;

    private int i = 0;

    private boolean j = false;

    private int[] k = null;

    public PacketPlayOutWorldParticles() {
    }

    public PacketPlayOutWorldParticles(EnumParticle enumparticle, boolean flag, float f, float f1, float f2, float f3, float f4, float f5, float f6, int i, int... aint) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
    }
}
