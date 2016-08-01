package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;
// CraftBukkit start
import java.util.List;
import org.bukkit.Location;
import org.bukkit.craftbukkit.entity.CraftHumanEntity;
import org.bukkit.entity.HumanEntity;
import org.bukkit.inventory.InventoryHolder;

// CraftBukkit end
public abstract class EntityMinecartContainer extends EntityMinecartAbstract implements ITileInventory, ILootable {

    private ItemStack[] items = null;

    // CraftBukkit - 36 -> 27
    private boolean b = false;

    private MinecraftKey c = null;

    private long d = 0;

    // CraftBukkit start
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

    public InventoryHolder getOwner() {
        return null;
    }

    public void setMaxStackSize(int size) {
    }

    @Override
    public Location getLocation() {
        return null;
    }

    // CraftBukkit end
    public EntityMinecartContainer(World world) {
    }

    public EntityMinecartContainer(World world, double d0, double d1, double d2) {
    }

    public void a(DamageSource damagesource) {
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

    public void update() {
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

    public int getMaxStackSize() {
        return 0;
    }

    @Nullable
    public Entity c(int i) {
        return null;
    }

    public void die() {
    }

    public void b(boolean flag) {
    }

    public static void b(DataConverterManager dataconvertermanager, String s) {
    }

    protected void b(NBTTagCompound nbttagcompound) {
    }

    protected void a(NBTTagCompound nbttagcompound) {
    }

    public boolean a(EntityHuman entityhuman, @Nullable ItemStack itemstack, EnumHand enumhand) {
        return false;
    }

    protected void r() {
    }

    public int getProperty(int i) {
        return 0;
    }

    public void setProperty(int i, int j) {
    }

    public int g() {
        return 0;
    }

    public boolean x_() {
        return false;
    }

    public void a(ChestLock chestlock) {
    }

    public ChestLock y_() {
        return null;
    }

    public void f(@Nullable EntityHuman entityhuman) {
    }

    public void l() {
    }

    public void a(MinecraftKey minecraftkey, long i) {
    }

    public MinecraftKey b() {
        return null;
    }
}
