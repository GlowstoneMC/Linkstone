package net.minecraft.server;

import java.io.IOException;
import java.util.UUID;

public class PacketPlayOutBoss implements Packet<PacketListenerPlayOut> {

    private UUID a;

    private PacketPlayOutBoss.Action b;

    private IChatBaseComponent c;

    private float d;

    private BossBattle.BarColor e;

    private BossBattle.BarStyle f;

    private boolean g;

    private boolean h;

    private boolean i;

    public PacketPlayOutBoss() {
    }

    public PacketPlayOutBoss(PacketPlayOutBoss.Action packetplayoutboss_action, BossBattle bossbattle) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    private void a(int i) {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    private int j() {
        return 0;
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
    }

    static class SyntheticClass_1 {

        static final int[] a;

        static {
        }
    }

    public static enum Action {

        ADD, REMOVE, UPDATE_PCT, UPDATE_NAME, UPDATE_STYLE, UPDATE_PROPERTIES;

        private Action() {
        }
    }
}
