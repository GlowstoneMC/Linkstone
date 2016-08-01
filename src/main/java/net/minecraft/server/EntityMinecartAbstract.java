package net.minecraft.server;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.Location;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.vehicle.VehicleDamageEvent;
import org.bukkit.event.vehicle.VehicleDestroyEvent;
import org.bukkit.event.vehicle.VehicleEntityCollisionEvent;
import org.bukkit.util.Vector;

// CraftBukkit end
public abstract class EntityMinecartAbstract extends Entity implements INamableTileEntity {

    private static final DataWatcherObject<Integer> a = null;

    private static final DataWatcherObject<Integer> b = null;

    private static final DataWatcherObject<Float> c = null;

    private static final DataWatcherObject<Integer> d = null;

    private static final DataWatcherObject<Integer> e = null;

    private static final DataWatcherObject<Boolean> f = null;

    private boolean g = false;

    private static final int[][][] h = null;

    private int au = 0;

    private double av = 0.0;

    private double aw = 0.0;

    private double ax = 0.0;

    private double ay = 0.0;

    private double az = 0.0;

    // CraftBukkit start
    public boolean slowWhenEmpty = false;

    private double derailedX = 0.0;

    private double derailedY = 0.0;

    private double derailedZ = 0.0;

    private double flyingX = 0.0;

    private double flyingY = 0.0;

    private double flyingZ = 0.0;

    public double maxSpeed = 0.0;

    // CraftBukkit end
    public EntityMinecartAbstract(World world) {
    }

    public static EntityMinecartAbstract a(World world, double d0, double d1, double d2, EntityMinecartAbstract.EnumMinecartType entityminecartabstract_enumminecarttype) {
        return null;
    }

    protected boolean playStepSound() {
        return false;
    }

    protected void i() {
    }

    @Nullable
    public AxisAlignedBB j(Entity entity) {
        return null;
    }

    @Nullable
    public AxisAlignedBB ag() {
        return null;
    }

    public boolean isCollidable() {
        return false;
    }

    public EntityMinecartAbstract(World world, double d0, double d1, double d2) {
    }

    public double ay() {
        return 0.0;
    }

    public boolean damageEntity(DamageSource damagesource, float f) {
        return false;
    }

    public void a(DamageSource damagesource) {
    }

    public boolean isInteractable() {
        return false;
    }

    public void die() {
    }

    public EnumDirection bm() {
        return null;
    }

    public void m() {
    }

    protected double o() {
        return 0.0;
    }

    public void a(int i, int j, int k, boolean flag) {
    }

    protected void q() {
    }

    protected void a(BlockPosition blockposition, IBlockData iblockdata) {
    }

    protected void r() {
    }

    public void setPosition(double d0, double d1, double d2) {
    }

    public Vec3D k(double d0, double d1, double d2) {
        return null;
    }

    public static void a(DataConverterManager dataconvertermanager, String s) {
    }

    protected void a(NBTTagCompound nbttagcompound) {
    }

    protected void b(NBTTagCompound nbttagcompound) {
    }

    public void collide(Entity entity) {
    }

    public void setDamage(float f) {
    }

    public float getDamage() {
        return 0.0F;
    }

    public void d(int i) {
    }

    public int getType() {
        return 0;
    }

    public void e(int i) {
    }

    public int u() {
        return 0;
    }

    public abstract EntityMinecartAbstract.EnumMinecartType v();

    public IBlockData getDisplayBlock() {
        return null;
    }

    public IBlockData x() {
        return null;
    }

    public int getDisplayBlockOffset() {
        return 0;
    }

    public int z() {
        return 0;
    }

    public void setDisplayBlock(IBlockData iblockdata) {
    }

    public void setDisplayBlockOffset(int i) {
    }

    public boolean A() {
        return false;
    }

    public void a(boolean flag) {
    }

    static class SyntheticClass_1 {

        static final int[] a = null;

        static final int[] b = null;

        static {
        }
    }

    public static enum EnumMinecartType {

        RIDEABLE(0, "MinecartRideable"), CHEST(1, "MinecartChest"), FURNACE(2, "MinecartFurnace"), TNT(3, "MinecartTNT"), SPAWNER(4, "MinecartSpawner"), HOPPER(5, "MinecartHopper"), COMMAND_BLOCK(6, "MinecartCommandBlock");

        private static final Map<Integer, EntityMinecartAbstract.EnumMinecartType> h = null;

        private final int i = 0;

        private final String j = null;

        private EnumMinecartType(int i, String s) {
        }

        public int a() {
            return 0;
        }

        public String b() {
            return null;
        }

        static {
        }
    }

    // CraftBukkit start - Methods for getting and setting flying and derailed velocity modifiers
    public Vector getFlyingVelocityMod() {
        return null;
    }

    public void setFlyingVelocityMod(Vector flying) {
    }

    public Vector getDerailedVelocityMod() {
        return null;
    }

    public void setDerailedVelocityMod(Vector derailed) {
    }
    // CraftBukkit end
}
