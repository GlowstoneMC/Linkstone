package org.bukkit.craftbukkit.inventory;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.server.EntityHuman;
import net.minecraft.server.IChatBaseComponent;
import net.minecraft.server.IInventory;
import net.minecraft.server.ItemStack;
import org.bukkit.Location;
import org.bukkit.craftbukkit.entity.CraftHumanEntity;
import org.bukkit.craftbukkit.util.CraftChatMessage;
import org.bukkit.entity.HumanEntity;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

public class InventoryWrapper implements IInventory {

    private final Inventory inventory = null;

    private final List<HumanEntity> viewers = null;

    public InventoryWrapper(Inventory inventory) {
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public ItemStack getItem(int i) {
        return null;
    }

    @Override
    public ItemStack splitStack(int i, int j) {
        return null;
    }

    @Override
    public ItemStack splitWithoutUpdate(int i) {
        return null;
    }

    @Override
    public void setItem(int i, ItemStack itemstack) {
    }

    @Override
    public int getMaxStackSize() {
        return 0;
    }

    @Override
    public void update() {
    }

    @Override
    public boolean a(EntityHuman entityhuman) {
        return false;
    }

    @Override
    public void startOpen(EntityHuman entityhuman) {
    }

    @Override
    public void closeContainer(EntityHuman entityhuman) {
    }

    @Override
    public boolean b(int i, ItemStack itemstack) {
        return false;
    }

    @Override
    public int getProperty(int i) {
        return 0;
    }

    @Override
    public void setProperty(int i, int j) {
    }

    @Override
    public int g() {
        return 0;
    }

    @Override
    public void l() {
    }

    @Override
    public ItemStack[] getContents() {
        return null;
    }

    @Override
    public void onOpen(CraftHumanEntity who) {
    }

    @Override
    public void onClose(CraftHumanEntity who) {
    }

    @Override
    public List<HumanEntity> getViewers() {
        return null;
    }

    @Override
    public InventoryHolder getOwner() {
        return null;
    }

    @Override
    public void setMaxStackSize(int size) {
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean hasCustomName() {
        return false;
    }

    @Override
    public IChatBaseComponent getScoreboardDisplayName() {
        return null;
    }

    @Override
    public Location getLocation() {
        return null;
    }
}
