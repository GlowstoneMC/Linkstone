package net.minecraft.server;

import org.bukkit.event.entity.EntityTargetEvent;

public abstract class PathfinderGoalTarget extends PathfinderGoal {

    protected final EntityCreature e = null;

    protected boolean f = false;

    private final boolean a = false;

    private int b = 0;

    private int c = 0;

    private int d = 0;

    protected EntityLiving g = null;

    protected int h = 0;

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
