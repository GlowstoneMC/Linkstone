package net.minecraft.server;

import com.google.common.base.Optional;
import javax.annotation.Nullable;

public class EntityFireworks extends Entity {

    public static final DataWatcherObject<Optional<ItemStack>> FIREWORK_ITEM;

    private int ticksFlown;

    public int expectedLifespan;

    public EntityFireworks(World world) {
    }

    protected void i() {
    }

    public EntityFireworks(World world, double d0, double d1, double d2, @Nullable ItemStack itemstack) {
    }

    public void m() {
    }

    public static void a(DataConverterManager dataconvertermanager) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public float e(float f) {
        return 0.0F;
    }

    public boolean aV() {
        return false;
    }
}
