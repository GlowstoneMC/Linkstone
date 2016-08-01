package net.minecraft.server;

import com.google.common.base.Predicate;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.craftbukkit.CraftEquipmentSlot;
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerArmorStandManipulateEvent;

// CraftBukkit end
public class EntityArmorStand extends EntityLiving {

    private static final Vector3f br = null;

    private static final Vector3f bs = null;

    private static final Vector3f bt = null;

    private static final Vector3f bu = null;

    private static final Vector3f bv = null;

    private static final Vector3f bw = null;

    public static final DataWatcherObject<Byte> a = null;

    public static final DataWatcherObject<Vector3f> b = null;

    public static final DataWatcherObject<Vector3f> c = null;

    public static final DataWatcherObject<Vector3f> d = null;

    public static final DataWatcherObject<Vector3f> e = null;

    public static final DataWatcherObject<Vector3f> f = null;

    public static final DataWatcherObject<Vector3f> g = null;

    private static final Predicate<Entity> bx = null;

    private final ItemStack[] by = null;

    private final ItemStack[] bz = null;

    private boolean bA = false;

    public long h = 0;

    private int bB = 0;

    private boolean bC = false;

    public Vector3f headPose = null;

    public Vector3f bodyPose = null;

    public Vector3f leftArmPose = null;

    public Vector3f rightArmPose = null;

    public Vector3f leftLegPose = null;

    public Vector3f rightLegPose = null;

    public EntityArmorStand(World world) {
    }

    public EntityArmorStand(World world, double d0, double d1, double d2) {
    }

    public boolean ct() {
        return false;
    }

    protected void i() {
    }

    public Iterable<ItemStack> aG() {
        return null;
    }

    public Iterable<ItemStack> getArmorItems() {
        return null;
    }

    @Nullable
    public ItemStack getEquipment(EnumItemSlot enumitemslot) {
        return null;
    }

    public void setSlot(EnumItemSlot enumitemslot, @Nullable ItemStack itemstack) {
    }

    public boolean c(int i, @Nullable ItemStack itemstack) {
        return false;
    }

    public static void a(DataConverterManager dataconvertermanager) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    private void g(NBTTagCompound nbttagcompound) {
    }

    private NBTTagCompound C() {
        return null;
    }

    public boolean isCollidable() {
        return false;
    }

    protected void C(Entity entity) {
    }

    protected void cs() {
    }

    public EnumInteractionResult a(EntityHuman entityhuman, Vec3D vec3d, @Nullable ItemStack itemstack, EnumHand enumhand) {
        return null;
    }

    private boolean b(EnumItemSlot enumitemslot) {
        return false;
    }

    private void a(EntityHuman entityhuman, EnumItemSlot enumitemslot, @Nullable ItemStack itemstack, EnumHand enumhand) {
    }

    public boolean damageEntity(DamageSource damagesource, float f) {
        return false;
    }

    private void D() {
    }

    private void a(float f) {
    }

    private void E() {
    }

    private void G() {
    }

    protected float h(float f, float f1) {
        return 0.0F;
    }

    public float getHeadHeight() {
        return 0.0F;
    }

    public double ax() {
        return 0.0;
    }

    public void g(float f, float f1) {
    }

    public void m() {
    }

    private void a(boolean flag) {
    }

    protected void F() {
    }

    public void setInvisible(boolean flag) {
    }

    public boolean isBaby() {
        return false;
    }

    public void Q() {
    }

    public boolean bt() {
        return false;
    }

    public void setSmall(boolean flag) {
    }

    public boolean isSmall() {
        return false;
    }

    public void setArms(boolean flag) {
    }

    public boolean hasArms() {
        return false;
    }

    public void setBasePlate(boolean flag) {
    }

    public boolean hasBasePlate() {
        return false;
    }

    public void setMarker(boolean flag) {
    }

    public boolean isMarker() {
        return false;
    }

    private byte a(byte b0, int i, boolean flag) {
        return 0;
    }

    public void setHeadPose(Vector3f vector3f) {
    }

    public void setBodyPose(Vector3f vector3f) {
    }

    public void setLeftArmPose(Vector3f vector3f) {
    }

    public void setRightArmPose(Vector3f vector3f) {
    }

    public void setLeftLegPose(Vector3f vector3f) {
    }

    public void setRightLegPose(Vector3f vector3f) {
    }

    public Vector3f u() {
        return null;
    }

    public Vector3f w() {
        return null;
    }

    public boolean isInteractable() {
        return false;
    }

    public EnumMainHand getMainHand() {
        return null;
    }

    protected SoundEffect e(int i) {
        return null;
    }

    @Nullable
    protected SoundEffect bV() {
        return null;
    }

    @Nullable
    protected SoundEffect bW() {
        return null;
    }

    public void onLightningStrike(EntityLightning entitylightning) {
    }

    public boolean cI() {
        return false;
    }

    static class SyntheticClass_1 {

        static final int[] a = null;

        static {
        }
    }
}
