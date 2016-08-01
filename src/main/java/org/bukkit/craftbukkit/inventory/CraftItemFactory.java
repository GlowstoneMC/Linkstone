package org.bukkit.craftbukkit.inventory;

import java.util.Collection;
import org.apache.commons.lang.Validate;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.configuration.serialization.ConfigurationSerialization;
import org.bukkit.inventory.ItemFactory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import com.google.common.collect.ImmutableSet;

public final class CraftItemFactory implements ItemFactory {

    static final Color DEFAULT_LEATHER_COLOR = null;

    static final Collection<String> KNOWN_NBT_ATTRIBUTE_NAMES = null;

    private static final CraftItemFactory instance = null;

    static {
    }

    private CraftItemFactory() {
    }

    public boolean isApplicable(ItemMeta meta, ItemStack itemstack) {
        return false;
    }

    public boolean isApplicable(ItemMeta meta, Material type) {
        return false;
    }

    public ItemMeta getItemMeta(Material material) {
        return null;
    }

    private ItemMeta getItemMeta(Material material, CraftMetaItem meta) {
        return null;
    }

    public boolean equals(ItemMeta meta1, ItemMeta meta2) {
        return false;
    }

    boolean equals(CraftMetaItem meta1, CraftMetaItem meta2) {
        return false;
    }

    public static CraftItemFactory instance() {
        return null;
    }

    public ItemMeta asMetaFor(ItemMeta meta, ItemStack stack) {
        return null;
    }

    public ItemMeta asMetaFor(ItemMeta meta, Material material) {
        return null;
    }

    public Color getDefaultLeatherColor() {
        return null;
    }
}
