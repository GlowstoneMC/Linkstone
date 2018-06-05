package org.bukkit.craftbukkit.entity;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Sign;
import org.bukkit.entity.Entity;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.InventoryView.Property;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.MainHand;
import org.bukkit.inventory.Merchant;
import org.bukkit.inventory.PlayerInventory;

import net.glowstone.entity.GlowHumanEntity;

public class CraftHumanEntity extends CraftLivingEntity implements HumanEntity {
    private GlowHumanEntity base;
    public CraftHumanEntity(GlowHumanEntity e) {
        super(e);
        this.base = e;
    }

    @Override
    public void closeInventory() {
        base.closeInventory(); // LinkFiller Generated
    }

    @Override
    public int getCooldown(Material arg0) {
        return base.getCooldown(arg0); // LinkFiller Generated
    }

    @Override
    public Inventory getEnderChest() {
        return base.getEnderChest(); // LinkFiller Generated
    }

    @Override
    public int getExpToLevel() {
        return base.getExpToLevel(); // LinkFiller Generated
    }

    @Override
    public GameMode getGameMode() {
        return base.getGameMode(); // LinkFiller Generated
    }

    @Override
    public PlayerInventory getInventory() {
        return base.getInventory(); // LinkFiller Generated
    }

    @Override
    public ItemStack getItemInHand() {
        return base.getItemInHand(); // LinkFiller Generated
    }

    @Override
    public ItemStack getItemOnCursor() {
        return base.getItemOnCursor(); // LinkFiller Generated
    }

    @Override
    public MainHand getMainHand() {
        return base.getMainHand(); // LinkFiller Generated
    }

    @Override
    public InventoryView getOpenInventory() {
        return base.getOpenInventory(); // LinkFiller Generated
    }

    @Override
    public Entity getShoulderEntityLeft() {
        return base.getShoulderEntityLeft(); // LinkFiller Generated
    }

    @Override
    public Entity getShoulderEntityRight() {
        return base.getShoulderEntityRight(); // LinkFiller Generated
    }

    @Override
    public int getSleepTicks() {
        return base.getSleepTicks(); // LinkFiller Generated
    }

    @Override
    public boolean hasCooldown(Material arg0) {
        return base.hasCooldown(arg0); // LinkFiller Generated
    }

    @Override
    public boolean isBlocking() {
        return base.isBlocking(); // LinkFiller Generated
    }

    @Override
    public boolean isHandRaised() {
        return base.isHandRaised(); // LinkFiller Generated
    }

    @Override
    public boolean isSleeping() {
        return base.isSleeping(); // LinkFiller Generated
    }

    @Override
    public InventoryView openEnchanting(Location arg0, boolean arg1) {
        return base.openEnchanting(arg0, arg1); // LinkFiller Generated
    }

    @Override
    public InventoryView openInventory(Inventory arg0) {
        return base.openInventory(arg0); // LinkFiller Generated
    }

    @Override
    public void openInventory(InventoryView arg0) {
        base.openInventory(arg0); // LinkFiller Generated
    }

    @Override
    public InventoryView openMerchant(Villager arg0, boolean arg1) {
        return base.openMerchant(arg0, arg1); // LinkFiller Generated
    }

    @Override
    public InventoryView openMerchant(Merchant arg0, boolean arg1) {
        return base.openMerchant(arg0, arg1); // LinkFiller Generated
    }

    @Override
    public void openSign(Sign arg0) {
        base.openSign(arg0); // LinkFiller Generated
    }

    @Override
    public InventoryView openWorkbench(Location arg0, boolean arg1) {
        return base.openWorkbench(arg0, arg1); // LinkFiller Generated
    }

    @Override
    public Entity releaseLeftShoulderEntity() {
        return base.releaseLeftShoulderEntity(); // LinkFiller Generated
    }

    @Override
    public Entity releaseRightShoulderEntity() {
        return base.releaseRightShoulderEntity(); // LinkFiller Generated
    }

    @Override
    public void setCooldown(Material arg0, int arg1) {
        base.setCooldown(arg0, arg1); // LinkFiller Generated
    }

    @Override
    public void setGameMode(GameMode arg0) {
        base.setGameMode(arg0); // LinkFiller Generated
    }

    @Override
    public void setItemInHand(ItemStack arg0) {
        base.setItemInHand(arg0); // LinkFiller Generated
    }

    @Override
    public void setItemOnCursor(ItemStack arg0) {
        base.setItemOnCursor(arg0); // LinkFiller Generated
    }

    @Override
    public void setShoulderEntityLeft(Entity arg0) {
        base.setShoulderEntityLeft(arg0); // LinkFiller Generated
    }

    @Override
    public void setShoulderEntityRight(Entity arg0) {
        base.setShoulderEntityRight(arg0); // LinkFiller Generated
    }

    @Override
    public boolean setWindowProperty(Property arg0, int arg1) {
        return base.setWindowProperty(arg0, arg1); // LinkFiller Generated
    }

}
