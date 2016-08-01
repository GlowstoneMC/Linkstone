package net.minecraft.server;

import java.io.IOException;

public class PacketPlayOutWorldBorder implements Packet<PacketListenerPlayOut> {

    private PacketPlayOutWorldBorder.EnumWorldBorderAction a;

    private int b;

    private double c;

    private double d;

    private double e;

    private double f;

    private long g;

    private int h;

    private int i;

    public PacketPlayOutWorldBorder() {
    }

    public PacketPlayOutWorldBorder(WorldBorder worldborder, PacketPlayOutWorldBorder.EnumWorldBorderAction packetplayoutworldborder_enumworldborderaction) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
    }

    static class SyntheticClass_1 {

        static final int[] a;

        static {
        }
    }

    public static enum EnumWorldBorderAction {

        SET_SIZE, LERP_SIZE, SET_CENTER, INITIALIZE, SET_WARNING_TIME, SET_WARNING_BLOCKS;

        private EnumWorldBorderAction() {
        }
    }
}
