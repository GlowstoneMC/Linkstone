package net.minecraft.server;

import java.util.Iterator;
import java.util.List;
// CraftBukkit start
import org.bukkit.entity.Player;
import org.bukkit.entity.Fish;
import org.bukkit.event.player.PlayerFishEvent;

// CraftBukkit end
public class EntityFishingHook extends Entity {

    private static final DataWatcherObject<Integer> c;

    private BlockPosition d;

    private Block e;

    private boolean isInGround;

    public EntityHuman owner;

    private int g;

    private int h;

    private int au;

    private int av;

    private int aw;

    private float ax;

    private int ay;

    private double az;

    private double aA;

    private double aB;

    private double aC;

    private double aD;

    public Entity hooked;

    public EntityFishingHook(World world) {
    }

    public EntityFishingHook(World world, EntityHuman entityhuman) {
    }

    protected void i() {
    }

    public void a(DataWatcherObject<?> datawatcherobject) {
    }

    public void c(double d0, double d1, double d2, float f, float f1) {
    }

    public void m() {
    }

    protected boolean a(Entity entity) {
        return false;
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public int j() {
        return 0;
    }

    protected void k() {
    }

    public void die() {
    }
}
