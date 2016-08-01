package net.minecraft.server;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.List;
import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityCombustByEntityEvent;
import org.bukkit.event.player.PlayerPickupArrowEvent;

// CraftBukkit end
public abstract class EntityArrow extends Entity implements IProjectile {

    private static final Predicate<Entity> f = null;

    private static final DataWatcherObject<Byte> g = null;

    private int h = 0;

    private int au = 0;

    private int av = 0;

    private Block aw = null;

    private int ax = 0;

    protected boolean inGround = false;

    protected int b = 0;

    public EntityArrow.PickupStatus fromPlayer = null;

    public int shake = 0;

    public Entity shooter = null;

    private int ay = 0;

    private int az = 0;

    private double damage = 0.0;

    public int knockbackStrength = 0;

    public EntityArrow(World world) {
    }

    public EntityArrow(World world, double d0, double d1, double d2) {
    }

    public EntityArrow(World world, EntityLiving entityliving) {
    }

    protected void i() {
    }

    public void a(Entity entity, float f, float f1, float f2, float f3, float f4) {
    }

    public void shoot(double d0, double d1, double d2, float f, float f1) {
    }

    public void m() {
    }

    protected void a(MovingObjectPosition movingobjectposition) {
    }

    protected void a(EntityLiving entityliving) {
    }

    @Nullable
    protected Entity a(Vec3D vec3d, Vec3D vec3d1) {
        return null;
    }

    public static void a(DataConverterManager dataconvertermanager, String s) {
    }

    public static void a(DataConverterManager dataconvertermanager) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public void d(EntityHuman entityhuman) {
    }

    protected abstract ItemStack j();

    protected boolean playStepSound() {
        return false;
    }

    public void c(double d0) {
    }

    public double k() {
        return 0.0;
    }

    public void setKnockbackStrength(int i) {
    }

    public boolean aV() {
        return false;
    }

    public float getHeadHeight() {
        return 0.0F;
    }

    public void setCritical(boolean flag) {
    }

    public boolean isCritical() {
        return false;
    }

    // CraftBukkit start
    public boolean isInGround() {
        return false;
    }

    // CraftBukkit end
    public static enum PickupStatus {

        DISALLOWED, ALLOWED, CREATIVE_ONLY;

        private PickupStatus() {
        }

        public static EntityArrow.PickupStatus a(int i) {
            return null;
        }
    }
}
