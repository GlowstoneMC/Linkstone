package net.minecraft.server;

import java.util.Arrays;
import javax.annotation.Nullable;
// CraftBukkit start
import java.util.List;
import org.bukkit.craftbukkit.entity.CraftHumanEntity;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.inventory.BrewEvent;

// CraftBukkit end
public class TileEntityBrewingStand extends TileEntityContainer implements ITickable, IWorldInventory {

    private static final int[] a = null;

    private static final int[] f = null;

    private static final int[] g = null;

    private ItemStack[] items = null;

    private int brewTime = 0;

    private boolean[] j = null;

    private Item k = null;

    private String l = null;

    private int m = 0;

    private int lastTick = 0;

    // CraftBukkit - add field
    public TileEntityBrewingStand() {
    }

    // CraftBukkit start - add fields and methods
    public List<HumanEntity> transaction = null;

    private int maxStack = 0;

    public void onOpen(CraftHumanEntity who) {
    }

    public void onClose(CraftHumanEntity who) {
    }

    public List<HumanEntity> getViewers() {
        return null;
    }

    public ItemStack[] getContents() {
        return null;
    }

    public void setMaxStackSize(int size) {
    }

    // CraftBukkit end
    public String getName() {
        return null;
    }

    public boolean hasCustomName() {
        return false;
    }

    public void a(String s) {
    }

    public int getSize() {
        return 0;
    }

    public void E_() {
    }

    public boolean[] m() {
        return null;
    }

    private boolean n() {
        return false;
    }

    private void o() {
    }

    public static void a(DataConverterManager dataconvertermanager) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public NBTTagCompound save(NBTTagCompound nbttagcompound) {
        return null;
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
