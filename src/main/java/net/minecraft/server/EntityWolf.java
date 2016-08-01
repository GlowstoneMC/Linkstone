package net.minecraft.server;

import com.google.common.base.Predicate;
import java.util.UUID;
import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.craftbukkit.event.CraftEventFactory;
import org.bukkit.event.entity.EntityTargetEvent.TargetReason;

// CraftBukkit end
public class EntityWolf extends EntityTameableAnimal {

    private static final DataWatcherObject<Float> DATA_HEALTH = null;

    private static final DataWatcherObject<Boolean> bC = null;

    private static final DataWatcherObject<Integer> bD = null;

    private float bE = 0.0F;

    private float bF = 0.0F;

    private boolean bG = false;

    private boolean bH = false;

    private float bI = 0.0F;

    private float bJ = 0.0F;

    public EntityWolf(World world) {
    }

    protected void r() {
    }

    protected void initAttributes() {
    }

    // CraftBukkit - add overriden version
    @Override
    public boolean setGoalTarget(EntityLiving entityliving, org.bukkit.event.entity.EntityTargetEvent.TargetReason reason, boolean fire) {
        return false;
    }

    // CraftBukkit end
    public void setGoalTarget(@Nullable EntityLiving entityliving) {
    }

    protected void M() {
    }

    protected void i() {
    }

    protected void a(BlockPosition blockposition, Block block) {
    }

    public static void b(DataConverterManager dataconvertermanager) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public void a(NBTTagCompound nbttagcompound) {
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

    protected float ch() {
        return 0.0F;
    }

    @Nullable
    protected MinecraftKey J() {
        return null;
    }

    public void n() {
    }

    public void m() {
    }

    public float getHeadHeight() {
        return 0.0F;
    }

    public int N() {
        return 0;
    }

    public boolean damageEntity(DamageSource damagesource, float f) {
        return false;
    }

    public boolean B(Entity entity) {
        return false;
    }

    public void setTamed(boolean flag) {
    }

    public boolean a(EntityHuman entityhuman, EnumHand enumhand, @Nullable ItemStack itemstack) {
        return false;
    }

    public boolean e(@Nullable ItemStack itemstack) {
        return false;
    }

    public int cO() {
        return 0;
    }

    public boolean isAngry() {
        return false;
    }

    public void setAngry(boolean flag) {
    }

    public EnumColor getCollarColor() {
        return null;
    }

    public void setCollarColor(EnumColor enumcolor) {
    }

    public EntityWolf b(EntityAgeable entityageable) {
        return null;
    }

    public void t(boolean flag) {
    }

    public boolean mate(EntityAnimal entityanimal) {
        return false;
    }

    public boolean dq() {
        return false;
    }

    public boolean a(EntityLiving entityliving, EntityLiving entityliving1) {
        return false;
    }

    public boolean a(EntityHuman entityhuman) {
        return false;
    }

    public EntityAgeable createChild(EntityAgeable entityageable) {
        return null;
    }
}
