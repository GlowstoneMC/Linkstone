package net.minecraft.server;

public abstract class PathfinderGoalGotoTarget extends PathfinderGoal {

    private final EntityCreature c = null;

    private final double d = 0.0;

    protected int a = 0;

    private int e = 0;

    private int f = 0;

    protected BlockPosition b = null;

    private boolean g = false;

    private final int h = 0;

    public PathfinderGoalGotoTarget(EntityCreature entitycreature, double d0, int i) {
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }

    protected boolean f() {
        return false;
    }

    private boolean i() {
        return false;
    }

    protected abstract boolean a(World world, BlockPosition blockposition);
}
