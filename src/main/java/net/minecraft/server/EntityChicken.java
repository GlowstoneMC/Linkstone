package net.minecraft.server;

import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class EntityChicken extends EntityAnimal {

    private static final Set<Item> bF = null;

    public float bx = 0.0F;

    public float by = 0.0F;

    public float bz = 0.0F;

    public float bB = 0.0F;

    public float bC = 0.0F;

    public int bD = 0;

    public boolean bE = false;

    public EntityChicken(World world) {
    }

    protected void r() {
    }

    public float getHeadHeight() {
        return 0.0F;
    }

    protected void initAttributes() {
    }

    public void n() {
    }

    public void e(float f, float f1) {
    }

    protected SoundEffect G() {
        return null;
    }

    protected SoundEffect bV() {
        return null;
    }

    protected SoundEffect bW() {
        return null;
    }

    protected void a(BlockPosition blockposition, Block block) {
    }

    @Nullable
    protected MinecraftKey J() {
        return null;
    }

    public EntityChicken b(EntityAgeable entityageable) {
        return null;
    }

    public boolean e(@Nullable ItemStack itemstack) {
        return false;
    }

    protected int getExpValue(EntityHuman entityhuman) {
        return 0;
    }

    public static void b(DataConverterManager dataconvertermanager) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    protected boolean isTypeNotPersistent() {
        return false;
    }

    public void k(Entity entity) {
    }

    public boolean isChickenJockey() {
        return false;
    }

    public void p(boolean flag) {
    }

    public EntityAgeable createChild(EntityAgeable entityageable) {
        return null;
    }
}
