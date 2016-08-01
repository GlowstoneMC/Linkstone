package net.minecraft.server;

import javax.annotation.Nullable;

public interface DataPalette {

    int a(IBlockData iblockdata) {
        return 0;
    }

    @Nullable
    IBlockData a(int i) {
        return null;
    }

    void b(PacketDataSerializer packetdataserializer) {
    }

    int a() {
        return 0;
    }
}
