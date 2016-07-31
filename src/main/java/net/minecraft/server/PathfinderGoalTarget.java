package net.minecraft.server;

import org.bukkit.event.entity.EntityTargetEvent;

public abstract class PathfinderGoalTarget extends PathfinderGoal {

    protected final EntityCreature e;

    protected boolean f;

    private final boolean a;

    private int b;

    private int c;

    private int d;

    protected EntityLiving g;

    protected int h;

    public PathfinderGoalTarget(EntityCreature entitycreature, boolean flag) {
    }

    public PathfinderGoalTarget(EntityCreature entitycreature, boolean flag, boolean flag1) {
    }

    public boolean b() {
        return false;
    }

    protected double i() {
        return 0.0;
    }

    public void c() {
    }

    public void d() {
    }

    public static boolean a(EntityInsentient entityinsentient, EntityLiving entityliving, boolean flag, boolean flag1) {
        return false;
    }

    protected boolean a(EntityLiving entityliving, boolean flag) {
        return false;
    }

    private boolean a(EntityLiving entityliving) {
        return false;
    }
}
