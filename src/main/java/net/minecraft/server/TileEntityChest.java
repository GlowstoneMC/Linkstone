package net.minecraft.server;

import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.craftbukkit.entity.CraftHumanEntity;
import org.bukkit.entity.HumanEntity;

// CraftBukkit end
public class TileEntityChest extends TileEntityLootable implements ITickable, IInventory {

    private ItemStack[] items;

    public boolean a;

    public TileEntityChest f;

    public TileEntityChest g;

    public TileEntityChest h;

    public TileEntityChest i;

    public float j;

    public float k;

    public int l;

    private int p;

    private BlockChest.Type q;

    private String r;

    public TileEntityChest() {
    }

    // CraftBukkit start - add fields and methods
    public List<HumanEntity> transaction;

    private int maxStack;

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
    public TileEntityChest(BlockChest.Type blockchest_type) {
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

    public boolean a(EntityHuman entityhuman) {
        return false;
    }

    public void invalidateBlockCache() {
    }

    private void a(TileEntityChest tileentitychest, EnumDirection enumdirection) {
    }

    public void m() {
    }

    @Nullable
    protected TileEntityChest a(EnumDirection enumdirection) {
        return null;
    }

    private boolean b(BlockPosition blockposition) {
        return false;
    }

    public void E_() {
    }

    public boolean c(int i, int j) {
        return false;
    }

    public void startOpen(EntityHuman entityhuman) {
    }

    public void closeContainer(EntityHuman entityhuman) {
    }

    public boolean b(int i, ItemStack itemstack) {
        return false;
    }

    public void y() {
    }

    public BlockChest.Type o() {
        return null;
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

    // CraftBukkit start
    @Override
    public boolean isFilteredNBT() {
        return false;
    }

    // CraftBukkit end
    static class SyntheticClass_1 {

        static final int[] a;

        static {
        }
    }
}
