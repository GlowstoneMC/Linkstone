package net.minecraft.server;

public abstract class PathfinderGoalGotoTarget extends PathfinderGoal {

    private final EntityCreature c;

    private final double d;

    protected int a;

    private int e;

    private int f;

    protected BlockPosition b;

    private boolean g;

    private final int h;

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
