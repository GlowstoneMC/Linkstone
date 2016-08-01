package net.minecraft.server;

import java.io.IOException;
import javax.annotation.Nullable;

public class PacketPlayOutTitle implements Packet<PacketListenerPlayOut> {

    private PacketPlayOutTitle.EnumTitleAction a;

    private IChatBaseComponent b;

    private int c;

    private int d;

    private int e;

    public PacketPlayOutTitle() {
    }

    public PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction packetplayouttitle_enumtitleaction, IChatBaseComponent ichatbasecomponent) {
    }

    public PacketPlayOutTitle(int i, int j, int k) {
    }

    public PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction packetplayouttitle_enumtitleaction, @Nullable IChatBaseComponent ichatbasecomponent, int i, int j, int k) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
    }

    public static enum EnumTitleAction {

        TITLE, SUBTITLE, TIMES, CLEAR, RESET;

        private EnumTitleAction() {
        }

        public static PacketPlayOutTitle.EnumTitleAction a(String s) {
            return null;
        }

        public static String[] a() {
            return null;
        }
    }
}
