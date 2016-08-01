package net.minecraft.server;

import javax.annotation.Nullable;

public class DataPaletteLinear implements DataPalette {

    private final IBlockData[] a;

    private final DataPaletteExpandable b;

    private final int c;

    private int d;

    public DataPaletteLinear(int i, DataPaletteExpandable datapaletteexpandable) {
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
