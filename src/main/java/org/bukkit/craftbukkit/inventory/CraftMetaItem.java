package org.bukkit.craftbukkit.inventory;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import net.minecraft.server.NBTBase;
import net.minecraft.server.NBTTagCompound;
import net.minecraft.server.NBTTagList;
import net.minecraft.server.NBTTagString;
import org.apache.commons.lang.Validate;
import org.bukkit.Material;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.configuration.serialization.DelegateDeserialization;
import org.bukkit.configuration.serialization.SerializableAs;
import org.bukkit.craftbukkit.Overridden;
import org.bukkit.craftbukkit.inventory.CraftMetaItem.ItemMetaKey.Specific;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.Repairable;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.minecraft.server.NBTCompressedStreamTools;
import org.apache.commons.codec.binary.Base64;

/**
 * Children must include the following:
 *
 * <li> Constructor(CraftMetaItem meta)
 * <li> Constructor(NBTTagCompound tag)
 * <li> Constructor(Map<String, Object> map)
 * <br><br>
 * <li> void applyToItem(NBTTagCompound tag)
 * <li> boolean applicableTo(Material type)
 * <br><br>
 * <li> boolean equalsCommon(CraftMetaItem meta)
 * <li> boolean notUncommon(CraftMetaItem meta)
 * <br><br>
 * <li> boolean isEmpty()
 * <li> boolean is{Type}Empty()
 * <br><br>
 * <li> int applyHash()
 * <li> public Class clone()
 * <br><br>
 * <li> Builder<String, Object> serialize(Builder<String, Object> builder)
 * <li> SerializableMeta.Deserializers deserializer()
 */
@DelegateDeserialization(CraftMetaItem.SerializableMeta.class)
class CraftMetaItem implements ItemMeta, Repairable {

    static class ItemMetaKey {

        @Retention(RetentionPolicy.SOURCE)
        @Target(ElementType.FIELD)
        @interface Specific {

            enum To {

                BUKKIT, NBT
            }

            To value();
        }

        final String BUKKIT = null;

        final String NBT = null;

        ItemMetaKey(final String both) {
        }

        ItemMetaKey(final String nbt, final String bukkit) {
        }
    }

    @SerializableAs("ItemMeta")
    public static class SerializableMeta implements ConfigurationSerializable {

        static final String TYPE_FIELD = null;

        static final ImmutableMap<Class<? extends CraftMetaItem>, String> classMap = null;

        static final ImmutableMap<String, Constructor<? extends CraftMetaItem>> constructorMap = null;

        static {
        }

        private SerializableMeta() {
        }

        public static ItemMeta deserialize(Map<String, Object> map) throws Throwable {
            return null;
        }

        public Map<String, Object> serialize() {
            return null;
        }

        static String getString(Map<?, ?> map, Object field, boolean nullable) {
            return null;
        }

        static boolean getBoolean(Map<?, ?> map, Object field) {
            return false;
        }

        static <T> T getObject(Class<T> clazz, Map<?, ?> map, Object field, boolean nullable) {
            return null;
        }
    }

    static final ItemMetaKey NAME = null;

    @Specific(Specific.To.NBT)
    static final ItemMetaKey DISPLAY = null;

    static final ItemMetaKey LORE = null;

    static final ItemMetaKey ENCHANTMENTS = null;

    @Specific(Specific.To.NBT)
    static final ItemMetaKey ENCHANTMENTS_ID = null;

    @Specific(Specific.To.NBT)
    static final ItemMetaKey ENCHANTMENTS_LVL = null;

    static final ItemMetaKey REPAIR = null;

    @Specific(Specific.To.NBT)
    static final ItemMetaKey ATTRIBUTES = null;

    @Specific(Specific.To.NBT)
    static final ItemMetaKey ATTRIBUTES_IDENTIFIER = null;

    @Specific(Specific.To.NBT)
    static final ItemMetaKey ATTRIBUTES_NAME = null;

    @Specific(Specific.To.NBT)
    static final ItemMetaKey ATTRIBUTES_VALUE = null;

    @Specific(Specific.To.NBT)
    static final ItemMetaKey ATTRIBUTES_TYPE = null;

    @Specific(Specific.To.NBT)
    static final ItemMetaKey ATTRIBUTES_UUID_HIGH = null;

    @Specific(Specific.To.NBT)
    static final ItemMetaKey ATTRIBUTES_UUID_LOW = null;

    @Specific(Specific.To.NBT)
    static final ItemMetaKey HIDEFLAGS = null;

    private String displayName = null;

    private List<String> lore = null;

    private Map<Enchantment, Integer> enchantments = null;

    private int repairCost = 0;

    private int hideFlag = 0;

    private static final Set<String> HANDLED_TAGS = null;

    private final Map<String, NBTBase> unhandledTags = null;

    CraftMetaItem(CraftMetaItem meta) {
    }

    CraftMetaItem(NBTTagCompound tag) {
    }

    static Map<Enchantment, Integer> buildEnchantments(NBTTagCompound tag, ItemMetaKey key) {
        return null;
    }

    CraftMetaItem(Map<String, Object> map) {
    }

    void deserializeInternal(NBTTagCompound tag) {
    }

    static Map<Enchantment, Integer> buildEnchantments(Map<String, Object> map, ItemMetaKey key) {
        return null;
    }

    @Overridden
    void applyToItem(NBTTagCompound itemTag) {
    }

    static NBTTagList createStringList(List<String> list) {
        return null;
    }

    static void applyEnchantments(Map<Enchantment, Integer> enchantments, NBTTagCompound tag, ItemMetaKey key) {
    }

    void setDisplayTag(NBTTagCompound tag, String key, NBTBase value) {
    }

    @Overridden
    boolean applicableTo(Material type) {
        return false;
    }

    @Overridden
    boolean isEmpty() {
        return false;
    }

    public String getDisplayName() {
        return null;
    }

    public final void setDisplayName(String name) {
    }

    public boolean hasDisplayName() {
        return false;
    }

    public boolean hasLore() {
        return false;
    }

    public boolean hasRepairCost() {
        return false;
    }

    public boolean hasEnchant(Enchantment ench) {
        return false;
    }

    public int getEnchantLevel(Enchantment ench) {
        return 0;
    }

    public Map<Enchantment, Integer> getEnchants() {
        return null;
    }

    public boolean addEnchant(Enchantment ench, int level, boolean ignoreRestrictions) {
        return false;
    }

    public boolean removeEnchant(Enchantment ench) {
        return false;
    }

    public boolean hasEnchants() {
        return false;
    }

    public boolean hasConflictingEnchant(Enchantment ench) {
        return false;
    }

    @Override
    public void addItemFlags(ItemFlag... hideFlags) {
    }

    @Override
    public void removeItemFlags(ItemFlag... hideFlags) {
    }

    @Override
    public Set<ItemFlag> getItemFlags() {
        return null;
    }

    @Override
    public boolean hasItemFlag(ItemFlag flag) {
        return false;
    }

    private byte getBitModifier(ItemFlag hideFlag) {
        return 0;
    }

    public List<String> getLore() {
        return null;
    }

    public void setLore(List<String> lore) {
    }

    public int getRepairCost() {
        return 0;
    }

    public void setRepairCost(int cost) {
    }

    @Override
    public final boolean equals(Object object) {
        return false;
    }

    /**
     * This method is almost as weird as notUncommon.
     * Only return false if your common internals are unequal.
     * Checking your own internals is redundant if you are not common, as notUncommon is meant for checking those 'not common' variables.
     */
    @Overridden
    boolean equalsCommon(CraftMetaItem that) {
        return false;
    }

    /**
     * This method is a bit weird...
     * Return true if you are a common class OR your uncommon parts are empty.
     * Empty uncommon parts implies the NBT data would be equivalent if both were applied to an item
     */
    @Overridden
    boolean notUncommon(CraftMetaItem meta) {
        return false;
    }

    @Override
    public final int hashCode() {
        return 0;
    }

    @Overridden
    int applyHash() {
        return 0;
    }

    @Overridden
    @Override
    public CraftMetaItem clone() {
        return null;
    }

    public final Map<String, Object> serialize() {
        return null;
    }

    @Overridden
    ImmutableMap.Builder<String, Object> serialize(ImmutableMap.Builder<String, Object> builder) {
        return null;
    }

    void serializeInternal(final Map<String, NBTBase> unhandledTags) {
    }

    static void serializeEnchantments(Map<Enchantment, Integer> enchantments, ImmutableMap.Builder<String, Object> builder, ItemMetaKey key) {
    }

    static void safelyAdd(Iterable<?> addFrom, Collection<String> addTo, int maxItemLength) {
    }

    static boolean checkConflictingEnchants(Map<Enchantment, Integer> enchantments, Enchantment ench) {
        return false;
    }

    @Override
    public final String toString() {
        return null;
    }

    public static Set<String> getHandledTags() {
        return null;
    }
}
