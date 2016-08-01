package org.bukkit.craftbukkit.inventory;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.server.NBTTagCompound;
import org.bukkit.Material;
import org.bukkit.configuration.serialization.DelegateDeserialization;
import org.bukkit.craftbukkit.inventory.CraftMetaItem.SerializableMeta;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;

@DelegateDeserialization(SerializableMeta.class)
class CraftMetaEnchantedBook extends CraftMetaItem implements EnchantmentStorageMeta {

    static final ItemMetaKey STORED_ENCHANTMENTS;

    private Map<Enchantment, Integer> enchantments;

    CraftMetaEnchantedBook(CraftMetaItem meta) {
    }

    CraftMetaEnchantedBook(NBTTagCompound tag) {
    }

    CraftMetaEnchantedBook(Map<String, Object> map) {
    }

    @Override
    void applyToItem(NBTTagCompound itemTag) {
    }

    @Override
    boolean applicableTo(Material type) {
        return false;
    }

    @Override
    boolean isEmpty() {
        return false;
    }

    @Override
    boolean equalsCommon(CraftMetaItem meta) {
        return false;
    }

    @Override
    boolean notUncommon(CraftMetaItem meta) {
        return false;
    }

    @Override
    int applyHash() {
        return 0;
    }

    @Override
    public CraftMetaEnchantedBook clone() {
        return null;
    }

    @Override
    Builder<String, Object> serialize(Builder<String, Object> builder) {
        return null;
    }

    boolean isEnchantedEmpty() {
        return false;
    }

    public boolean hasStoredEnchant(Enchantment ench) {
        return false;
    }

    public int getStoredEnchantLevel(Enchantment ench) {
        return 0;
    }

    public Map<Enchantment, Integer> getStoredEnchants() {
        return null;
    }

    public boolean addStoredEnchant(Enchantment ench, int level, boolean ignoreRestrictions) {
        return false;
    }

    public boolean removeStoredEnchant(Enchantment ench) {
        return false;
    }

    public boolean hasStoredEnchants() {
        return false;
    }

    public boolean hasConflictingStoredEnchant(Enchantment ench) {
        return false;
    }
}
