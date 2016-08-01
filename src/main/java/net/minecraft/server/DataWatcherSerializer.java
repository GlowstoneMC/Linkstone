package net.minecraft.server;

public interface DataWatcherSerializer<T> {

    void a(PacketDataSerializer packetdataserializer, T t0) {
    }

    T a(PacketDataSerializer packetdataserializer) {
        return null;
    }

    DataWatcherObject<T> a(int i) {
        return null;
    }
}
