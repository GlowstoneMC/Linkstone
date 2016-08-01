package net.minecraft.server;

import javax.annotation.Nullable;

public abstract class NavigationAbstract {

    protected EntityInsentient a;

    protected World b;

    @Nullable
    protected PathEntity c;

    protected double d;

    private final AttributeInstance f;

    private int g;

    private int h;

    private Vec3D i;

    private Vec3D j;

    private long k;

    private long l;

    private double m;

    private float n;

    private boolean o;

    private long p;

    protected PathfinderAbstract e;

    private BlockPosition q;

    private final Pathfinder r;

    public NavigationAbstract(EntityInsentient entityinsentient, World world) {
    }

    protected abstract Pathfinder a();

    public void a(double d0) {
    }

    public float h() {
        return 0.0F;
    }

    public boolean i() {
        return false;
    }

    public void j() {
    }

    @Nullable
    public final PathEntity a(double d0, double d1, double d2) {
        return null;
    }

    @Nullable
    public PathEntity a(BlockPosition blockposition) {
        return null;
    }

    @Nullable
    public PathEntity a(Entity entity) {
        return null;
    }

    public boolean a(double d0, double d1, double d2, double d3) {
        return false;
    }

    public boolean a(Entity entity, double d0) {
        return false;
    }

    public boolean a(@Nullable PathEntity pathentity, double d0) {
        return false;
    }

    @Nullable
    public PathEntity k() {
        return null;
    }

    public void l() {
    }

    protected void m() {
    }

    protected void a(Vec3D vec3d) {
    }

    public boolean n() {
        return false;
    }

    public void o() {
    }

    protected abstract Vec3D c();

    protected abstract boolean b();

    protected boolean p() {
        return false;
    }

    protected void d() {
    }

    protected abstract boolean a(Vec3D vec3d, Vec3D vec3d1, int i, int j, int k);

    public boolean b(BlockPosition blockposition) {
        return false;
    }

    public PathfinderAbstract q() {
        return null;
    }
}
