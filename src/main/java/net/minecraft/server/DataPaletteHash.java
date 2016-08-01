package net.minecraft.server;

import javax.annotation.Nullable;

public class DataPaletteHash implements DataPalette {

    private final RegistryID<IBlockData> a;

    private final DataPaletteExpandable b;

    private final int c;

    public DataPaletteHash(int i, DataPaletteExpandable datapaletteexpandable) {
    }

    public int a(IBlockData iblockdata) {
        return 0;
    }

    @Nullable
    public IBlockData a(int i) {
        return null;
    }

    public void b(PacketDataSerializer packetdataserializer) {
    }

    public int a() {
        return 0;
    }
}
