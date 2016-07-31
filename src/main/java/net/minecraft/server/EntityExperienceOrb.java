package net.minecraft.server;

// CraftBukkit start
import org.bukkit.craftbukkit.event.CraftEventFactory;
import org.bukkit.event.entity.EntityTargetLivingEntityEvent;
import org.bukkit.event.entity.EntityTargetEvent;

// CraftBukkit end
public class EntityExperienceOrb extends Entity {

    public int a;

    public int b;

    public int c;

    private int d;

    public int value;

    private EntityHuman targetPlayer;

    private int targetTime;

    public EntityExperienceOrb(World world, double d0, double d1, double d2, int i) {
    }

    protected boolean playStepSound() {
        return false;
    }

    public EntityExperienceOrb(World world) {
    }

    protected void i() {
    }

    public void m() {
    }

    public boolean ak() {
        return false;
    }

    protected void burn(int i) {
    }

    public boolean damageEntity(DamageSource damagesource, float f) {
        return false;
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public void d(EntityHuman entityhuman) {
    }

    private int b(int i) {
        return 0;
    }

    private int d(int i) {
        return 0;
    }

    public int j() {
        return 0;
    }

    public static int getOrbValue(int i) {
        return 0;
    }

    public boolean aV() {
        return false;
    }
}
