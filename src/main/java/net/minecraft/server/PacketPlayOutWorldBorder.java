package net.minecraft.server;

import java.io.IOException;

public class PacketPlayOutWorldBorder implements Packet<PacketListenerPlayOut> {

    private PacketPlayOutWorldBorder.EnumWorldBorderAction a = null;

    private int b = 0;

    private double c = 0.0;

    private double d = 0.0;

    private double e = 0.0;

    private double f = 0.0;

    private long g = 0;

    private int h = 0;

    private int i = 0;

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

        static final int[] a = null;

        static {
        }
    }

    public static enum EnumWorldBorderAction {

        SET_SIZE, LERP_SIZE, SET_CENTER, INITIALIZE, SET_WARNING_TIME, SET_WARNING_BLOCKS;

        private EnumWorldBorderAction() {
        }
    }
}
