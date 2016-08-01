package net.minecraft.server;

public abstract class WorldProvider {

    public static final float[] a;

    protected World b;

    private WorldType type;

    private String h;

    protected WorldChunkManager c;

    protected boolean d;

    protected boolean e;

    protected final float[] f;

    private final float[] i;

    public WorldProvider() {
    }

    public final void a(World world) {
    }

    protected void a() {
    }

    protected void b() {
    }

    public ChunkGenerator getChunkGenerator() {
        return null;
    }

    public boolean canSpawn(int i, int j) {
        return false;
    }

    public float a(long i, float f) {
        return 0.0F;
    }

    public int a(long i) {
        return 0;
    }

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public BlockPosition h() {
        return null;
    }

    public int getSeaLevel() {
        return 0;
    }

    public WorldChunkManager k() {
        return null;
    }

    public boolean l() {
        return false;
    }

    public boolean m() {
        return false;
    }

    public float[] n() {
        return null;
    }

    public WorldBorder getWorldBorder() {
        return null;
    }

    public void a(EntityPlayer entityplayer) {
    }

    public void b(EntityPlayer entityplayer) {
    }

    public abstract DimensionManager getDimensionManager();

    public void q() {
    }

    public void r() {
    }

    public boolean c(int i, int j) {
        return false;
    }
}
