package net.minecraft.server;

import java.util.Iterator;
import java.util.List;
// CraftBukkit start
import org.bukkit.entity.Player;
import org.bukkit.entity.Fish;
import org.bukkit.event.player.PlayerFishEvent;

// CraftBukkit end
public class EntityFishingHook extends Entity {

    private static final DataWatcherObject<Integer> c = null;

    private BlockPosition d = null;

    private Block e = null;

    private boolean isInGround = false;

    public EntityHuman owner = null;

    private int g = 0;

    private int h = 0;

    private int au = 0;

    private int av = 0;

    private int aw = 0;

    private float ax = 0.0F;

    private int ay = 0;

    private double az = 0.0;

    private double aA = 0.0;

    private double aB = 0.0;

    private double aC = 0.0;

    private double aD = 0.0;

    public Entity hooked = null;

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
