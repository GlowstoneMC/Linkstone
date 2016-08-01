package net.minecraft.server;

import java.io.IOException;
import java.util.UUID;

public class PacketPlayOutBoss implements Packet<PacketListenerPlayOut> {

    private UUID a = null;

    private PacketPlayOutBoss.Action b = null;

    private IChatBaseComponent c = null;

    private float d = 0.0F;

    private BossBattle.BarColor e = null;

    private BossBattle.BarStyle f = null;

    private boolean g = false;

    private boolean h = false;

    private boolean i = false;

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

        static final int[] a = null;

        static {
        }
    }

    public static enum Action {

        ADD, REMOVE, UPDATE_PCT, UPDATE_NAME, UPDATE_STYLE, UPDATE_PROPERTIES;

        private Action() {
        }
    }
}
