package org.bukkit.craftbukkit.inventory;

import static org.bukkit.craftbukkit.inventory.CraftMetaItem.ENCHANTMENTS;
import static org.bukkit.craftbukkit.inventory.CraftMetaItem.ENCHANTMENTS_ID;
import static org.bukkit.craftbukkit.inventory.CraftMetaItem.ENCHANTMENTS_LVL;
import java.util.Map;
import net.minecraft.server.EnchantmentManager;
import net.minecraft.server.Item;
import net.minecraft.server.NBTTagCompound;
import net.minecraft.server.NBTTagList;
import org.apache.commons.lang.Validate;
import org.bukkit.Material;
import org.bukkit.configuration.serialization.DelegateDeserialization;
import org.bukkit.craftbukkit.util.CraftMagicNumbers;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import com.google.common.collect.ImmutableMap;
import net.minecraft.server.IChatBaseComponent.ChatSerializer;
import net.minecraft.server.Items;
import net.minecraft.server.NBTTagString;
import org.bukkit.craftbukkit.enchantments.CraftEnchantment;
import org.bukkit.craftbukkit.util.CraftChatMessage;

@DelegateDeserialization(ItemStack.class)
public final class CraftItemStack extends ItemStack {

    public static net.minecraft.server.ItemStack asNMSCopy(ItemStack original) {
        return null;
    }

    public static net.minecraft.server.ItemStack copyNMSStack(net.minecraft.server.ItemStack original, int amount) {
        return null;
    }

    /**
     * Copies the NMS stack to return as a strictly-Bukkit stack
     */
    public static ItemStack asBukkitCopy(net.minecraft.server.ItemStack original) {
        return null;
    }

    public static CraftItemStack asCraftMirror(net.minecraft.server.ItemStack original) {
        return null;
    }

    public static CraftItemStack asCraftCopy(ItemStack original) {
        return null;
    }

    public static CraftItemStack asNewCraftStack(Item item) {
        return null;
    }

    public static CraftItemStack asNewCraftStack(Item item, int amount) {
        return null;
    }

    net.minecraft.server.ItemStack handle = null;

    /**
     * Mirror
     */
    private CraftItemStack(net.minecraft.server.ItemStack item) {
    }

    private CraftItemStack(ItemStack item) {
    }

    private CraftItemStack(Material type, int amount, short durability, ItemMeta itemMeta) {
    }

    private CraftItemStack(int typeId, int amount, short durability, ItemMeta itemMeta) {
    }

    @Override
    public int getTypeId() {
        return 0;
    }

    @Override
    public void setTypeId(int type) {
    }

    @Override
    public int getAmount() {
        return 0;
    }

    @Override
    public void setAmount(int amount) {
    }

    @Override
    public void setDurability(final short durability) {
    }

    @Override
    public short getDurability() {
        return 0;
    }

    @Override
    public int getMaxStackSize() {
        return 0;
    }

    @Override
    public void addUnsafeEnchantment(Enchantment ench, int level) {
    }

    static boolean makeTag(net.minecraft.server.ItemStack item) {
        return false;
    }

    @Override
    public boolean containsEnchantment(Enchantment ench) {
        return false;
    }

    @Override
    public int getEnchantmentLevel(Enchantment ench) {
        return 0;
    }

    @Override
    public int removeEnchantment(Enchantment ench) {
        return 0;
    }

    @Override
    public Map<Enchantment, Integer> getEnchantments() {
        return null;
    }

    static Map<Enchantment, Integer> getEnchantments(net.minecraft.server.ItemStack item) {
        return null;
    }

    static NBTTagList getEnchantmentList(net.minecraft.server.ItemStack item) {
        return null;
    }

    @Override
    public CraftItemStack clone() {
        return null;
    }

    @Override
    public ItemMeta getItemMeta() {
        return null;
    }

    public static ItemMeta getItemMeta(net.minecraft.server.ItemStack item) {
        return null;
    }

    static Material getType(net.minecraft.server.ItemStack item) {
        return null;
    }

    @Override
    public boolean setItemMeta(ItemMeta itemMeta) {
        return false;
    }

    public static boolean setItemMeta(net.minecraft.server.ItemStack item, ItemMeta itemMeta) {
        return false;
    }

    @Override
    public boolean isSimilar(ItemStack stack) {
        return false;
    }

    @Override
    public boolean hasItemMeta() {
        return false;
    }

    static boolean hasItemMeta(net.minecraft.server.ItemStack item) {
        return false;
    }
}
