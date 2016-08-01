package net.minecraft.server;

import java.io.IOException;

public class PacketPlayOutCombatEvent implements Packet<PacketListenerPlayOut> {

    public PacketPlayOutCombatEvent.EnumCombatEventType a;

    public int b;

    public int c;

    public int d;

    public IChatBaseComponent e;

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

        static final int[] a;

        static {
        }
    }

    public static enum EnumCombatEventType {

        ENTER_COMBAT, END_COMBAT, ENTITY_DIED;

        private EnumCombatEventType() {
        }
    }
}
