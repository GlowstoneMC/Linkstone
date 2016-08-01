package net.minecraft.server;

import java.io.IOException;

public class PacketPlayInEntityAction implements Packet<PacketListenerPlayIn> {

    private int a;

    private PacketPlayInEntityAction.EnumPlayerAction animation;

    private int c;

    public PacketPlayInEntityAction() {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayIn packetlistenerplayin) {
    }

    public PacketPlayInEntityAction.EnumPlayerAction b() {
        return null;
    }

    public int c() {
        return 0;
    }

    public static enum EnumPlayerAction {

        START_SNEAKING, STOP_SNEAKING, STOP_SLEEPING, START_SPRINTING, STOP_SPRINTING, START_RIDING_JUMP, STOP_RIDING_JUMP, OPEN_INVENTORY, START_FALL_FLYING;

        private EnumPlayerAction() {
        }
    }
}
