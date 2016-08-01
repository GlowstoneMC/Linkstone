package org.bukkit.craftbukkit.inventory;

import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import net.minecraft.server.IHopper;
import net.minecraft.server.IInventory;
import net.minecraft.server.InventoryCrafting;
import net.minecraft.server.InventoryEnderChest;
import net.minecraft.server.InventoryMerchant;
import net.minecraft.server.PlayerInventory;
import net.minecraft.server.TileEntityBeacon;
import net.minecraft.server.TileEntityBrewingStand;
import net.minecraft.server.TileEntityDispenser;
import net.minecraft.server.TileEntityDropper;
import net.minecraft.server.TileEntityFurnace;
import org.apache.commons.lang.Validate;
import org.bukkit.Location;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;

public class CraftInventory implements Inventory {

    protected final IInventory inventory = null;

    public CraftInventory(IInventory inventory) {
    }

    public IInventory getInventory() {
        return null;
    }

    public int getSize() {
        return 0;
    }

    public String getName() {
        return null;
    }

    public ItemStack getItem(int index) {
        return null;
    }

    @Override
    public ItemStack[] getStorageContents() {
        return null;
    }

    @Override
    public void setStorageContents(ItemStack[] items) throws IllegalArgumentException {
    }

    public ItemStack[] getContents() {
        return null;
    }

    public void setContents(ItemStack[] items) {
    }

    public void setItem(int index, ItemStack item) {
    }

    public boolean contains(int materialId) {
        return false;
    }

    public boolean contains(Material material) {
        return false;
    }

    public boolean contains(ItemStack item) {
        return false;
    }

    public boolean contains(int materialId, int amount) {
        return false;
    }

    public boolean contains(Material material, int amount) {
        return false;
    }

    public boolean contains(ItemStack item, int amount) {
        return false;
    }

    public boolean containsAtLeast(ItemStack item, int amount) {
        return false;
    }

    public HashMap<Integer, ItemStack> all(int materialId) {
        return null;
    }

    public HashMap<Integer, ItemStack> all(Material material) {
        return null;
    }

    public HashMap<Integer, ItemStack> all(ItemStack item) {
        return null;
    }

    public int first(int materialId) {
        return 0;
    }

    public int first(Material material) {
        return 0;
    }

    public int first(ItemStack item) {
        return 0;
    }

    private int first(ItemStack item, boolean withAmount) {
        return 0;
    }

    public int firstEmpty() {
        return 0;
    }

    public int firstPartial(int materialId) {
        return 0;
    }

    public int firstPartial(Material material) {
        return 0;
    }

    private int firstPartial(ItemStack item) {
        return 0;
    }

    public HashMap<Integer, ItemStack> addItem(ItemStack... items) {
        return null;
    }

    public HashMap<Integer, ItemStack> removeItem(ItemStack... items) {
        return null;
    }

    private int getMaxItemStack() {
        return 0;
    }

    public void remove(int materialId) {
    }

    public void remove(Material material) {
    }

    public void remove(ItemStack item) {
    }

    public void clear(int index) {
    }

    public void clear() {
    }

    public ListIterator<ItemStack> iterator() {
        return null;
    }

    public ListIterator<ItemStack> iterator(int index) {
        return null;
    }

    public List<HumanEntity> getViewers() {
        return null;
    }

    public String getTitle() {
        return null;
    }

    public InventoryType getType() {
        return null;
    }

    public InventoryHolder getHolder() {
        return null;
    }

    public int getMaxStackSize() {
        return 0;
    }

    public void setMaxStackSize(int size) {
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(final Object obj) {
        return false;
    }

    @Override
    public Location getLocation() {
        return null;
    }
}
