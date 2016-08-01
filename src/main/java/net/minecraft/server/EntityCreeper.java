package net.minecraft.server;

import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.craftbukkit.event.CraftEventFactory;
import org.bukkit.event.entity.ExplosionPrimeEvent;

// CraftBukkit end
public class EntityCreeper extends EntityMonster {

    private static final DataWatcherObject<Integer> a = null;

    private static final DataWatcherObject<Boolean> b = null;

    private static final DataWatcherObject<Boolean> c = null;

    private int bx = 0;

    private int fuseTicks = 0;

    private int maxFuseTicks = 0;

    private int explosionRadius = 0;

    private int bB = 0;

    public EntityCreeper(World world) {
    }

    protected void r() {
    }

    protected void initAttributes() {
    }

    public int aY() {
        return 0;
    }

    public void e(float f, float f1) {
    }

    protected void i() {
    }

    public static void b(DataConverterManager dataconvertermanager) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public void m() {
    }

    protected SoundEffect bV() {
        return null;
    }

    protected SoundEffect bW() {
        return null;
    }

    public void die(DamageSource damagesource) {
    }

    public boolean B(Entity entity) {
        return false;
    }

    public boolean isPowered() {
        return false;
    }

    @Nullable
    protected MinecraftKey J() {
        return null;
    }

    public int df() {
        return 0;
    }

    public void a(int i) {
    }

    public void onLightningStrike(EntityLightning entitylightning) {
    }

    public void setPowered(boolean powered) {
    }

    // CraftBukkit end
    protected boolean a(EntityHuman entityhuman, EnumHand enumhand, @Nullable ItemStack itemstack) {
        return false;
    }

    private void dk() {
    }

    public boolean isIgnited() {
        return false;
    }

    public void dh() {
    }

    public boolean canCauseHeadDrop() {
        return false;
    }

    public void setCausedHeadDrop() {
    }
}
