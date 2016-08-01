package net.minecraft.server;

import com.google.common.base.Optional;
import javax.annotation.Nullable;

public class EntityItemFrame extends EntityHanging {

    private static final DataWatcherObject<Optional<ItemStack>> c = null;

    private static final DataWatcherObject<Integer> d = null;

    private float e = 0.0F;

    public EntityItemFrame(World world) {
    }

    public EntityItemFrame(World world, BlockPosition blockposition, EnumDirection enumdirection) {
    }

    protected void i() {
    }

    public float aA() {
        return 0.0F;
    }

    public boolean damageEntity(DamageSource damagesource, float f) {
        return false;
    }

    public int getWidth() {
        return 0;
    }

    public int getHeight() {
        return 0;
    }

    public void a(@Nullable Entity entity) {
    }

    public void o() {
    }

    public void b(@Nullable Entity entity, boolean flag) {
    }

    private void b(ItemStack itemstack) {
    }

    @Nullable
    public ItemStack getItem() {
        return null;
    }

    public void setItem(@Nullable ItemStack itemstack) {
    }

    private void setItem(@Nullable ItemStack itemstack, boolean flag) {
    }

    public void a(DataWatcherObject<?> datawatcherobject) {
    }

    public int getRotation() {
        return 0;
    }

    public void setRotation(int i) {
    }

    private void setRotation(int i, boolean flag) {
    }

    public static void a(DataConverterManager dataconvertermanager) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public boolean a(EntityHuman entityhuman, @Nullable ItemStack itemstack, EnumHand enumhand) {
        return false;
    }

    public int t() {
        return 0;
    }
}
