package net.minecraft.server;

import javax.annotation.Nullable;

public abstract class NavigationAbstract {

    protected EntityInsentient a = null;

    protected World b = null;

    @Nullable
    protected PathEntity c = null;

    protected double d = 0.0;

    private final AttributeInstance f = null;

    private int g = 0;

    private int h = 0;

    private Vec3D i = null;

    private Vec3D j = null;

    private long k = 0;

    private long l = 0;

    private double m = 0.0;

    private float n = 0.0F;

    private boolean o = false;

    private long p = 0;

    protected PathfinderAbstract e = null;

    private BlockPosition q = null;

    private final Pathfinder r = null;

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
