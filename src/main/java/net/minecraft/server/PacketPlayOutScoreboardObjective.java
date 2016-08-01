package net.minecraft.server;

import java.io.IOException;

public class PacketPlayOutScoreboardObjective implements Packet<PacketListenerPlayOut> {

    private String a;

    private String b;

    private IScoreboardCriteria.EnumScoreboardHealthDisplay c;

    private int d;

    public PacketPlayOutScoreboardObjective() {
    }

    public PacketPlayOutScoreboardObjective(ScoreboardObjective scoreboardobjective, int i) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
    }
}
