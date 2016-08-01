package net.minecraft.server;

import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class PacketPlayOutStatistic implements Packet<PacketListenerPlayOut> {

    private Map<Statistic, Integer> a = null;

    public PacketPlayOutStatistic() {
    }

    public PacketPlayOutStatistic(Map<Statistic, Integer> map) {
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }
}
