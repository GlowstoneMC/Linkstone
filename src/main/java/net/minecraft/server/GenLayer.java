package net.minecraft.server;

public abstract class GenLayer {

    private long c = 0;

    protected GenLayer a = null;

    private long d = 0;

    protected long b = 0;

    public static GenLayer[] a(long i, WorldType worldtype, String s) {
        return null;
    }

    public GenLayer(long i) {
    }

    public void a(long i) {
    }

    public void a(long i, long j) {
    }

    protected int a(int i) {
        return 0;
    }

    public abstract int[] a(int i, int j, int k, int l);

    protected static boolean a(int i, int j) {
        return false;
    }

    protected static boolean b(int i) {
        return false;
    }

    protected int a(int... aint) {
        return 0;
    }

    protected int b(int i, int j, int k, int l) {
        return 0;
    }
}
