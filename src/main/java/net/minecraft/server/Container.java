package net.minecraft.server;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
// CraftBukkit start
import java.util.HashMap;
import java.util.Map;
import org.bukkit.craftbukkit.inventory.CraftInventory;
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.event.Event.Result;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.InventoryView;

// CraftBukkit end
public abstract class Container {

    public List<ItemStack> b;

    public List<Slot> c;

    public int windowId;

    private int dragType;

    private int g;

    private final Set<Slot> h;

    protected List<ICrafting> listeners;

    private final Set<EntityHuman> i;

    // CraftBukkit start
    public boolean checkReachable;

    public abstract InventoryView getBukkitView();

    public void transferTo(Container other, org.bukkit.craftbukkit.entity.CraftHumanEntity player) {
    }

    // CraftBukkit end
    public Container() {
    }

    protected Slot a(Slot slot) {
        return null;
    }

    public void addSlotListener(ICrafting icrafting) {
    }

    public List<ItemStack> a() {
        return null;
    }

    public void b() {
    }

    public boolean a(EntityHuman entityhuman, int i) {
        return false;
    }

    @Nullable
    public Slot getSlot(IInventory iinventory, int i) {
        return null;
    }

    public Slot getSlot(int i) {
        return null;
    }

    @Nullable
    public ItemStack b(EntityHuman entityhuman, int i) {
        return null;
    }

    @Nullable
    public ItemStack a(int i, int j, InventoryClickType inventoryclicktype, EntityHuman entityhuman) {
        return null;
    }

    public boolean a(ItemStack itemstack, Slot slot) {
        return false;
    }

    protected void a(int i, int j, boolean flag, EntityHuman entityhuman) {
    }

    public void b(EntityHuman entityhuman) {
    }

    public void a(IInventory iinventory) {
    }

    public void setItem(int i, ItemStack itemstack) {
    }

    public boolean c(EntityHuman entityhuman) {
        return false;
    }

    public void a(EntityHuman entityhuman, boolean flag) {
    }

    public abstract boolean a(EntityHuman entityhuman);

    protected boolean a(ItemStack itemstack, int i, int j, boolean flag) {
        return false;
    }

    private static boolean a(ItemStack itemstack, ItemStack itemstack1) {
        return false;
    }

    public static int b(int i) {
        return 0;
    }

    public static int c(int i) {
        return 0;
    }

    public static boolean a(int i, EntityHuman entityhuman) {
        return false;
    }

    protected void d() {
    }

    public static boolean a(Slot slot, ItemStack itemstack, boolean flag) {
        return false;
    }

    public static void a(Set<Slot> set, int i, ItemStack itemstack, int j) {
    }

    public boolean b(Slot slot) {
        return false;
    }

    public static int a(@Nullable TileEntity tileentity) {
        return 0;
    }

    public static int b(@Nullable IInventory iinventory) {
        return 0;
    }
}
