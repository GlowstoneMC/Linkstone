package net.minecraft.server;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.craftbukkit.entity.CraftHumanEntity;
import org.bukkit.craftbukkit.potion.CraftPotionUtil;
import org.bukkit.entity.HumanEntity;
import org.bukkit.potion.PotionEffect;

// CraftBukkit end
public class TileEntityBeacon extends TileEntityContainer implements ITickable, IWorldInventory {

    public static final MobEffectList[][] a = null;

    private static final Set<MobEffectList> f = null;

    private final List<TileEntityBeacon.BeaconColorTracker> g = null;

    private boolean j = false;

    public int k = 0;

    // PAIL: private -> public
    @Nullable
    public MobEffectList l = null;

    // PAIL: private -> public
    @Nullable
    public MobEffectList m = null;

    // PAIL: private -> public
    private ItemStack inventorySlot = null;

    private String o = null;

    // CraftBukkit start - add fields and methods
    public List<HumanEntity> transaction = null;

    private int maxStack = 0;

    public ItemStack[] getContents() {
        return null;
    }

    public void onOpen(CraftHumanEntity who) {
    }

    public void onClose(CraftHumanEntity who) {
    }

    public List<HumanEntity> getViewers() {
        return null;
    }

    public void setMaxStackSize(int size) {
    }

    public PotionEffect getPrimaryEffect() {
        return null;
    }

    public PotionEffect getSecondaryEffect() {
        return null;
    }

    // CraftBukkit end
    public TileEntityBeacon() {
    }

    public void E_() {
    }

    public void m() {
    }

    // CraftBukkit start - split into components
    private byte getAmplification() {
        return 0;
    }

    private int getLevel() {
        return 0;
    }

    public List getHumansInRange() {
        return null;
    }

    private void applyEffect(List list, MobEffectList effects, int i, int b0) {
    }

    private boolean hasSecondaryEffect() {
        return false;
    }

    private void E() {
    }

    // CraftBukkit end
    private void F() {
    }

    @Nullable
    public PacketPlayOutTileEntityData getUpdatePacket() {
        return null;
    }

    public NBTTagCompound c() {
        return null;
    }

    @Nullable
    private static MobEffectList f(int i) {
        return null;
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public NBTTagCompound save(NBTTagCompound nbttagcompound) {
        return null;
    }

    public int getSize() {
        return 0;
    }

    @Nullable
    public ItemStack getItem(int i) {
        return null;
    }

    @Nullable
    public ItemStack splitStack(int i, int j) {
        return null;
    }

    @Nullable
    public ItemStack splitWithoutUpdate(int i) {
        return null;
    }

    public void setItem(int i, @Nullable ItemStack itemstack) {
    }

    public String getName() {
        return null;
    }

    public boolean hasCustomName() {
        return false;
    }

    public void a(String s) {
    }

    public int getMaxStackSize() {
        return 0;
    }

    public boolean a(EntityHuman entityhuman) {
        return false;
    }

    public void startOpen(EntityHuman entityhuman) {
    }

    public void closeContainer(EntityHuman entityhuman) {
    }

    public boolean b(int i, ItemStack itemstack) {
        return false;
    }

    public String getContainerName() {
        return null;
    }

    public Container createContainer(PlayerInventory playerinventory, EntityHuman entityhuman) {
        return null;
    }

    public int getProperty(int i) {
        return 0;
    }

    public void setProperty(int i, int j) {
    }

    public int g() {
        return 0;
    }

    public void l() {
    }

    public boolean c(int i, int j) {
        return false;
    }

    public int[] getSlotsForFace(EnumDirection enumdirection) {
        return null;
    }

    public boolean canPlaceItemThroughFace(int i, ItemStack itemstack, EnumDirection enumdirection) {
        return false;
    }

    public boolean canTakeItemThroughFace(int i, ItemStack itemstack, EnumDirection enumdirection) {
        return false;
    }

    static {
    }

    public static class BeaconColorTracker {

        private final float[] a = null;

        private int b = 0;

        public BeaconColorTracker(float[] afloat) {
        }

        protected void a() {
        }

        public float[] b() {
            return null;
        }
    }
}
