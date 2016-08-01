package net.minecraft.server;

import java.io.IOException;

public class PacketPlayOutCombatEvent implements Packet<PacketListenerPlayOut> {

    public PacketPlayOutCombatEvent.EnumCombatEventType a = null;

    public int b = 0;

    public int c = 0;

    public int d = 0;

    public IChatBaseComponent e = null;

    public PacketPlayOutCombatEvent() {
    }

    public PacketPlayOutCombatEvent(CombatTracker combattracker, PacketPlayOutCombatEvent.EnumCombatEventType packetplayoutcombatevent_enumcombateventtype) {
    }

    public PacketPlayOutCombatEvent(CombatTracker combattracker, PacketPlayOutCombatEvent.EnumCombatEventType packetplayoutcombatevent_enumcombateventtype, boolean flag) {
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

    public static enum EnumCombatEventType {

        ENTER_COMBAT, END_COMBAT, ENTITY_DIED;

        private EnumCombatEventType() {
        }
    }
}
