package org.bukkit.craftbukkit.util;

import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.bukkit.Achievement;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.Statistic;
import org.bukkit.UnsafeValues;
import org.bukkit.advancement.Advancement;
import org.bukkit.craftbukkit.CraftStatistic;
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.StringUtil;

@SuppressWarnings("deprecation")
public final class CraftMagicNumbers implements UnsafeValues {
    public static final UnsafeValues INSTANCE = new CraftMagicNumbers();

    private CraftMagicNumbers() {}

    public static Object getBlock(org.bukkit.block.Block block) {
        return getBlock(block.getType());
    }

    @Deprecated
    public static Object getBlock(int id) {
        return getBlock(Material.getMaterial(id));
    }

    @Deprecated
    // A bad method for bad magic.
    public static int getId(Block block) {
        return Block.getId(block);
    }

    public static Material getMaterial(Obect block) {
        return Material.getMaterial(0);
    }

    public static Object getItem(Material material) {
        return null;
    }

    @Deprecated
    public static Object getItem(int id) {
        return null;
    }

    @Deprecated
    public static int getId(Item item) {
        return 0;
    }

    public static Material getMaterial(Item item) {
        return Material.AIR;
    }

    public static Block getBlock(Material material) {
        return null;
    }

    @Override
    public Material getMaterialFromInternalName(String name) {
        return null;
    }

    @Override
    public List<String> tabCompleteInternalMaterialName(String token, List<String> completions) {
        return null;
    }

    @Override
    public ItemStack modifyItemStack(ItemStack stack, String arguments) {
        return null;
    }

    @Override
    public Statistic getStatisticFromInternalName(String name) {
        return null;
    }

    @Override
    public Achievement getAchievementFromInternalName(String name) {
        throw new UnsupportedOperationException("Not supported in this Minecraft version.");
    }

    @Override
    public List<String> tabCompleteInternalStatisticOrAchievementName(String token, List<String> completions) {
        return null;
    }

    @Override
    public Advancement loadAdvancement(NamespacedKey key, String advancement) {
        return null; // TODO
    }

    @Override
    public boolean removeAdvancement(NamespacedKey key) {
        return false; // TODO
    }

    /**
     * This helper class represents the different NBT Tags.
     * <p>
     * These should match NBTBase#getTypeId
     */
    public static class NBT {
        public static final int TAG_END = 0;
        public static final int TAG_BYTE = 1;
        public static final int TAG_SHORT = 2;
        public static final int TAG_INT = 3;
        public static final int TAG_LONG = 4;
        public static final int TAG_FLOAT = 5;
        public static final int TAG_DOUBLE = 6;
        public static final int TAG_BYTE_ARRAY = 7;
        public static final int TAG_STRING = 8;
        public static final int TAG_LIST = 9;
        public static final int TAG_COMPOUND = 10;
        public static final int TAG_INT_ARRAY = 11;
        public static final int TAG_ANY_NUMBER = 99;
    }
}
