package net.minecraft.server;

import java.util.Arrays;
import javax.annotation.Nullable;
// CraftBukkit start
import java.util.List;
import org.bukkit.Location;
import org.bukkit.craftbukkit.entity.CraftHumanEntity;
import org.bukkit.entity.HumanEntity;

// CraftBukkit end
public class PlayerInventory implements IInventory {

    public final ItemStack[] items = null;

    public final ItemStack[] armor = null;

    public final ItemStack[] extraSlots = null;

    private final ItemStack[][] g = null;

    public int itemInHandIndex = 0;

    public EntityHuman player = null;

    private ItemStack carried = null;

    public boolean f = false;

    // CraftBukkit start - add fields and methods
    public List<HumanEntity> transaction = null;

    private int maxStack = 0;

    public ItemStack[] getContents() {
        return null;
    }

    public ItemStack[] getArmorContents() {
        return null;
    }

    public void onOpen(CraftHumanEntity who) {
    }

    public void onClose(CraftHumanEntity who) {
    }

    public List<HumanEntity> getViewers() {
        return null;
    }

    public org.bukkit.inventory.InventoryHolder getOwner() {
        return null;
    }

    public void setMaxStackSize(int size) {
    }

    @Override
    public Location getLocation() {
        return null;
    }

    // CraftBukkit end
    public PlayerInventory(EntityHuman entityhuman) {
    }

    @Nullable
    public ItemStack getItemInHand() {
        return null;
    }

    public static int getHotbarSize() {
        return 0;
    }

    private boolean a(@Nullable ItemStack itemstack, ItemStack itemstack1) {
        return false;
    }

    private boolean b(ItemStack itemstack, ItemStack itemstack1) {
        return false;
    }

    // CraftBukkit start - Watch method above! :D
    public int canHold(ItemStack itemstack) {
        return 0;
    }

    // CraftBukkit end
    public int getFirstEmptySlotIndex() {
        return 0;
    }

    public void d(int i) {
    }

    public static boolean e(int i) {
        return false;
    }

    public int k() {
        return 0;
    }

    public int a(@Nullable Item item, int i, int j, @Nullable NBTTagCompound nbttagcompound) {
        return 0;
    }

    private int g(ItemStack itemstack) {
        return 0;
    }

    private int firstPartial(ItemStack itemstack) {
        return 0;
    }

    public void m() {
    }

    public boolean pickup(@Nullable final ItemStack itemstack) {
        return false;
    }

    @Nullable
    public ItemStack splitStack(int i, int j) {
        return null;
    }

    public void d(ItemStack itemstack) {
    }

    @Nullable
    public ItemStack splitWithoutUpdate(int i) {
        return null;
    }

    public void setItem(int i, @Nullable ItemStack itemstack) {
    }

    public float a(IBlockData iblockdata) {
        return 0.0F;
    }

    public NBTTagList a(NBTTagList nbttaglist) {
        return null;
    }

    public void b(NBTTagList nbttaglist) {
    }

    public int getSize() {
        return 0;
    }

    @Nullable
    public ItemStack getItem(int i) {
        return null;
    }

    public String getName() {
        return null;
    }

    public boolean hasCustomName() {
        return false;
    }

    public IChatBaseComponent getScoreboardDisplayName() {
        return null;
    }

    public int getMaxStackSize() {
        return 0;
    }

    public boolean b(IBlockData iblockdata) {
        return false;
    }

    public void a(float f) {
    }

    public void n() {
    }

    public void update() {
    }

    public void setCarried(@Nullable ItemStack itemstack) {
    }

    @Nullable
    public ItemStack getCarried() {
        return null;
    }

    public boolean a(EntityHuman entityhuman) {
        return false;
    }

    public boolean f(ItemStack itemstack) {
        return false;
    }

    public void startOpen(EntityHuman entityhuman) {
    }

    public void closeContainer(EntityHuman entityhuman) {
    }

    public boolean b(int i, ItemStack itemstack) {
        return false;
    }

    public void a(PlayerInventory playerinventory) {
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
