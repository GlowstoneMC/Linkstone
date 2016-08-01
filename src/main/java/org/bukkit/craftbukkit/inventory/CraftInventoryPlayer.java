package org.bukkit.craftbukkit.inventory;

import com.google.common.base.Preconditions;
import java.util.Arrays;
import net.minecraft.server.EntityPlayer;
import net.minecraft.server.PacketPlayOutHeldItemSlot;
import net.minecraft.server.PacketPlayOutSetSlot;
import net.minecraft.server.PlayerInventory;
import org.apache.commons.lang.Validate;
import org.bukkit.craftbukkit.entity.CraftPlayer;
import org.bukkit.entity.HumanEntity;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;

public class CraftInventoryPlayer extends CraftInventory implements org.bukkit.inventory.PlayerInventory, EntityEquipment {

    public CraftInventoryPlayer(net.minecraft.server.PlayerInventory inventory) {
    }

    @Override
    public PlayerInventory getInventory() {
        return null;
    }

    @Override
    public ItemStack[] getStorageContents() {
        return null;
    }

    @Override
    public ItemStack getItemInMainHand() {
        return null;
    }

    @Override
    public void setItemInMainHand(ItemStack item) {
    }

    @Override
    public ItemStack getItemInOffHand() {
        return null;
    }

    @Override
    public void setItemInOffHand(ItemStack item) {
    }

    @Override
    public ItemStack getItemInHand() {
        return null;
    }

    @Override
    public void setItemInHand(ItemStack stack) {
    }

    @Override
    public void setItem(int index, ItemStack item) {
    }

    public int getHeldItemSlot() {
        return 0;
    }

    public void setHeldItemSlot(int slot) {
    }

    public ItemStack getHelmet() {
        return null;
    }

    public ItemStack getChestplate() {
        return null;
    }

    public ItemStack getLeggings() {
        return null;
    }

    public ItemStack getBoots() {
        return null;
    }

    public void setHelmet(ItemStack helmet) {
    }

    public void setChestplate(ItemStack chestplate) {
    }

    public void setLeggings(ItemStack leggings) {
    }

    public void setBoots(ItemStack boots) {
    }

    public ItemStack[] getArmorContents() {
        return null;
    }

    private void setSlots(ItemStack[] items, int baseSlot, int length) {
    }

    @Override
    public void setStorageContents(ItemStack[] items) throws IllegalArgumentException {
    }

    @Override
    public void setArmorContents(ItemStack[] items) {
    }

    @Override
    public ItemStack[] getExtraContents() {
        return null;
    }

    @Override
    public void setExtraContents(ItemStack[] items) {
    }

    public int clear(int id, int data) {
        return 0;
    }

    @Override
    public HumanEntity getHolder() {
        return null;
    }

    @Override
    public float getItemInHandDropChance() {
        return 0.0F;
    }

    @Override
    public void setItemInHandDropChance(float chance) {
    }

    @Override
    public float getItemInMainHandDropChance() {
        return 0.0F;
    }

    @Override
    public void setItemInMainHandDropChance(float chance) {
    }

    @Override
    public float getItemInOffHandDropChance() {
        return 0.0F;
    }

    @Override
    public void setItemInOffHandDropChance(float chance) {
    }

    public float getHelmetDropChance() {
        return 0.0F;
    }

    public void setHelmetDropChance(float chance) {
    }

    public float getChestplateDropChance() {
        return 0.0F;
    }

    public void setChestplateDropChance(float chance) {
    }

    public float getLeggingsDropChance() {
        return 0.0F;
    }

    public void setLeggingsDropChance(float chance) {
    }

    public float getBootsDropChance() {
        return 0.0F;
    }

    public void setBootsDropChance(float chance) {
    }
}
