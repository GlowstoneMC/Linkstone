package net.minecraft.server;

import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.craftbukkit.entity.CraftHumanEntity;
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.event.inventory.InventoryPickupItemEvent;
import org.bukkit.inventory.Inventory;

// CraftBukkit end
public class TileEntityHopper extends TileEntityLootable implements IHopper, ITickable {

    private ItemStack[] items = null;

    private String f = null;

    private int g = 0;

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

    // CraftBukkit end
    public TileEntityHopper() {
    }

    public static void a(DataConverterManager dataconvertermanager) {
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

    public void E_() {
    }

    public boolean m() {
        return false;
    }

    private boolean q() {
        return false;
    }

    private boolean r() {
        return false;
    }

    private boolean H() {
        return false;
    }

    private boolean a(IInventory iinventory, EnumDirection enumdirection) {
        return false;
    }

    private static boolean b(IInventory iinventory, EnumDirection enumdirection) {
        return false;
    }

    public static boolean a(IHopper ihopper) {
        return false;
    }

    private static boolean a(IHopper ihopper, IInventory iinventory, int i, EnumDirection enumdirection) {
        return false;
    }

    public static boolean a(IInventory iinventory, EntityItem entityitem) {
        return false;
    }

    public static ItemStack addItem(IInventory iinventory, ItemStack itemstack, @Nullable EnumDirection enumdirection) {
        return null;
    }

    private static boolean a(IInventory iinventory, ItemStack itemstack, int i, EnumDirection enumdirection) {
        return false;
    }

    private static boolean b(IInventory iinventory, ItemStack itemstack, int i, EnumDirection enumdirection) {
        return false;
    }

    private static ItemStack c(IInventory iinventory, ItemStack itemstack, int i, EnumDirection enumdirection) {
        return null;
    }

    private IInventory I() {
        return null;
    }

    public static IInventory b(IHopper ihopper) {
        return null;
    }

    public static List<EntityItem> a(World world, double d0, double d1, double d2) {
        return null;
    }

    public static IInventory b(World world, double d0, double d1, double d2) {
        return null;
    }

    private static boolean a(ItemStack itemstack, ItemStack itemstack1) {
        return false;
    }

    public double E() {
        return 0.0;
    }

    public double F() {
        return 0.0;
    }

    public double G() {
        return 0.0;
    }

    public void setCooldown(int i) {
    }

    public boolean o() {
        return false;
    }

    public boolean p() {
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
