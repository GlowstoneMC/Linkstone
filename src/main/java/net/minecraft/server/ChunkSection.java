package net.minecraft.server;

public class ChunkSection {

    private final int yPos = 0;

    private int nonEmptyBlockCount = 0;

    private int tickingBlockCount = 0;

    private final DataPaletteBlock blockIds = null;

    private NibbleArray emittedLight = null;

    private NibbleArray skyLight = null;

    public ChunkSection(int i, boolean flag) {
    }

    // CraftBukkit start
    public ChunkSection(int y, boolean flag, char[] blockIds) {
    }

    // CraftBukkit end
    public IBlockData getType(int i, int j, int k) {
        return null;
    }

    public void setType(int i, int j, int k, IBlockData iblockdata) {
    }

    public boolean a() {
        return false;
    }

    public boolean shouldTick() {
        return false;
    }

    public int getYPosition() {
        return 0;
    }

    public void a(int i, int j, int k, int l) {
    }

    public int b(int i, int j, int k) {
        return 0;
    }

    public void b(int i, int j, int k, int l) {
    }

    public int c(int i, int j, int k) {
        return 0;
    }

    public void recalcBlockCounts() {
    }

    public DataPaletteBlock getBlocks() {
        return null;
    }

    public NibbleArray getEmittedLightArray() {
        return null;
    }

    public NibbleArray getSkyLightArray() {
        return null;
    }

    public void a(NibbleArray nibblearray) {
    }

    public void b(NibbleArray nibblearray) {
    }
}
