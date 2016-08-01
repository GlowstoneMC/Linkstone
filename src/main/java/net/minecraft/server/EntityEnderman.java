package net.minecraft.server;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.Sets;
import org.bukkit.event.entity.EntityTargetEvent;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class EntityEnderman extends EntityMonster {

    private static final UUID a = null;

    private static final AttributeModifier b = null;

    private static final Set<Block> c = null;

    private static final DataWatcherObject<Optional<IBlockData>> bx = null;

    private static final DataWatcherObject<Boolean> by = null;

    private int bz = 0;

    private int bA = 0;

    public EntityEnderman(World world) {
    }

    protected void r() {
    }

    protected void initAttributes() {
    }

    public void setGoalTarget(@Nullable EntityLiving entityliving) {
    }

    @Override
    public boolean setGoalTarget(EntityLiving entityliving, org.bukkit.event.entity.EntityTargetEvent.TargetReason reason, boolean fireEvent) {
        return false;
    }

    protected void i() {
    }

    public void o() {
    }

    public void a(DataWatcherObject<?> datawatcherobject) {
    }

    public static void b(DataConverterManager dataconvertermanager) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    private boolean c(EntityHuman entityhuman) {
        return false;
    }

    public float getHeadHeight() {
        return 0.0F;
    }

    public void n() {
    }

    protected void M() {
    }

    protected boolean df() {
        return false;
    }

    protected boolean a(Entity entity) {
        return false;
    }

    private boolean l(double d0, double d1, double d2) {
        return false;
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

    protected void dropEquipment(boolean flag, int i) {
    }

    @Nullable
    protected MinecraftKey J() {
        return null;
    }

    public void setCarried(@Nullable IBlockData iblockdata) {
    }

    @Nullable
    public IBlockData getCarried() {
        return null;
    }

    public boolean damageEntity(DamageSource damagesource, float f) {
        return false;
    }

    public boolean dh() {
        return false;
    }

    static {
    }

    static class PathfinderGoalEndermanPickupBlock extends PathfinderGoal {

        private final EntityEnderman enderman = null;

        public PathfinderGoalEndermanPickupBlock(EntityEnderman entityenderman) {
        }

        public boolean a() {
            return false;
        }

        public void e() {
        }
    }

    static class PathfinderGoalEndermanPlaceBlock extends PathfinderGoal {

        private final EntityEnderman a = null;

        public PathfinderGoalEndermanPlaceBlock(EntityEnderman entityenderman) {
        }

        public boolean a() {
            return false;
        }

        public void e() {
        }

        private boolean a(World world, BlockPosition blockposition, Block block, IBlockData iblockdata, IBlockData iblockdata1) {
            return false;
        }
    }

    static class PathfinderGoalPlayerWhoLookedAtTarget extends PathfinderGoalNearestAttackableTarget<EntityHuman> {

        private final EntityEnderman i = null;

        private EntityHuman j = null;

        private int k = 0;

        private int l = 0;

        public PathfinderGoalPlayerWhoLookedAtTarget(EntityEnderman entityenderman) {
        }

        public boolean a() {
            return false;
        }

        public void c() {
        }

        public void d() {
        }

        public boolean b() {
            return false;
        }

        public void e() {
        }
    }
}
