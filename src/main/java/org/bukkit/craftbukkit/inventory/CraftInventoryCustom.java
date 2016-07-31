package org.bukkit.craftbukkit.inventory;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.server.ChatComponentText;
import net.minecraft.server.IChatBaseComponent;
import org.apache.commons.lang.Validate;
import org.bukkit.craftbukkit.entity.CraftHumanEntity;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.InventoryHolder;
import net.minecraft.server.EntityHuman;
import net.minecraft.server.IInventory;
import net.minecraft.server.ItemStack;
import org.bukkit.Location;

public class CraftInventoryCustom extends CraftInventory {

    public CraftInventoryCustom(InventoryHolder owner, InventoryType type) {
    }

    public CraftInventoryCustom(InventoryHolder owner, InventoryType type, String title) {
    }

    public CraftInventoryCustom(InventoryHolder owner, int size) {
    }

    public CraftInventoryCustom(InventoryHolder owner, int size, String title) {
    }

    static class MinecraftInventory implements IInventory {

        private final ItemStack[] items;

        private int maxStack;

        private final List<HumanEntity> viewers;

        private final String title;

        private InventoryType type;

        private final InventoryHolder owner;

        public MinecraftInventory(InventoryHolder owner, InventoryType type) {
        }

        public MinecraftInventory(InventoryHolder owner, InventoryType type, String title) {
        }

        public MinecraftInventory(InventoryHolder owner, int size) {
        }

        public MinecraftInventory(InventoryHolder owner, int size, String title) {
        }

        public int getSize() {
            return 0;
        }

        public ItemStack getItem(int i) {
            return null;
        }

        public ItemStack splitStack(int i, int j) {
            return null;
        }

        public ItemStack splitWithoutUpdate(int i) {
            return null;
        }

        public void setItem(int i, ItemStack itemstack) {
        }

        public int getMaxStackSize() {
            return 0;
        }

        public void setMaxStackSize(int size) {
        }

        public void update() {
        }

        public boolean a(EntityHuman entityhuman) {
            return false;
        }

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

        public InventoryType getType() {
            return null;
        }

        public InventoryHolder getOwner() {
            return null;
        }

        public boolean b(int i, ItemStack itemstack) {
            return false;
        }

        @Override
        public void startOpen(EntityHuman entityHuman) {
        }

        @Override
        public void closeContainer(EntityHuman entityHuman) {
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
}
