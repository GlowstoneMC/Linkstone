package net.minecraft.server;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

public class PacketPlayOutScoreboardTeam implements Packet<PacketListenerPlayOut> {

    private String a = null;

    private String b = null;

    private String c = null;

    private String d = null;

    private String e = null;

    private String f = null;

    private int g = 0;

    private final Collection<String> h = null;

    private int i = 0;

    private int j = 0;

    public PacketPlayOutScoreboardTeam() {
    }

    public PacketPlayOutScoreboardTeam(ScoreboardTeam scoreboardteam, int i) {
    }

    public PacketPlayOutScoreboardTeam(ScoreboardTeam scoreboardteam, Collection<String> collection, int i) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
    }
}
