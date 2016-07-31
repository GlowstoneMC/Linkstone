package net.minecraft.server;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class EntityTippedArrow extends EntityArrow {

    private static final DataWatcherObject<Integer> f;

    private PotionRegistry potionRegistry;

    public final Set<MobEffect> effects;

    public EntityTippedArrow(World world) {
    }

    public EntityTippedArrow(World world, double d0, double d1, double d2) {
    }

    public EntityTippedArrow(World world, EntityLiving entityliving) {
    }

    public void a(ItemStack itemstack) {
    }

    public void a(MobEffect mobeffect) {
    }

    protected void i() {
    }

    public void m() {
    }

    private void b(int i) {
    }

    // CraftBukkit start accessor methods
    public void refreshEffects() {
    }

    public String getType() {
        return null;
    }

    public void setType(String string) {
    }

    public boolean isTipped() {
        return false;
    }

    // CraftBukkit end
    public int n() {
        return 0;
    }

    public static void b(DataConverterManager dataconvertermanager) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    protected void a(EntityLiving entityliving) {
    }

    protected ItemStack j() {
        return null;
    }
}
