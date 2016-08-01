package net.minecraft.server;

import java.io.IOException;

public class PacketPlayOutScoreboardObjective implements Packet<PacketListenerPlayOut> {

    private String a = null;

    private String b = null;

    private IScoreboardCriteria.EnumScoreboardHealthDisplay c = null;

    private int d = 0;

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
