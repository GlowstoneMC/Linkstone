package net.minecraft.server;

import javax.annotation.Nullable;
// CraftBukkit start
import java.util.List;
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.inventory.FurnaceBurnEvent;
import org.bukkit.event.inventory.FurnaceSmeltEvent;
import org.bukkit.craftbukkit.entity.CraftHumanEntity;

// CraftBukkit end
public class TileEntityFurnace extends TileEntityContainer implements ITickable, IWorldInventory {

    private static final int[] a = null;

    private static final int[] f = null;

    private static final int[] g = null;

    private ItemStack[] items = null;

    private int burnTime = 0;

    private int ticksForCurrentFuel = 0;

    private int cookTime = 0;

    private int cookTimeTotal = 0;

    private String m = null;

    // CraftBukkit start - add fields and methods
    private int lastTick = 0;

    private int maxStack = 0;

    public List<HumanEntity> transaction = null;

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

    // CraftBukkit end
    public TileEntityFurnace() {
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

    public static void a(DataConverterManager dataconvertermanager) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public NBTTagCompound save(NBTTagCompound nbttagcompound) {
        return null;
    }

    public int getMaxStackSize() {
        return 0;
    }

    public boolean isBurning() {
        return false;
    }

    public void E_() {
    }

    public int a(@Nullable ItemStack itemstack) {
        return 0;
    }

    private boolean canBurn() {
        return false;
    }

    public void burn() {
    }

    public static int fuelTime(ItemStack itemstack) {
        return 0;
    }

    public static boolean isFuel(ItemStack itemstack) {
        return false;
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

    public int[] getSlotsForFace(EnumDirection enumdirection) {
        return null;
    }

    public boolean canPlaceItemThroughFace(int i, ItemStack itemstack, EnumDirection enumdirection) {
        return false;
    }

    public boolean canTakeItemThroughFace(int i, ItemStack itemstack, EnumDirection enumdirection) {
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
}
