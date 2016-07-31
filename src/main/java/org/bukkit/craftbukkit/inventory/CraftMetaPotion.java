package org.bukkit.craftbukkit.inventory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.server.NBTTagCompound;
import net.minecraft.server.NBTTagList;
import org.apache.commons.lang.Validate;
import org.bukkit.Material;
import org.bukkit.configuration.serialization.DelegateDeserialization;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;
import org.bukkit.craftbukkit.inventory.CraftMetaItem.SerializableMeta;
import org.bukkit.craftbukkit.potion.CraftPotionUtil;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap.Builder;

@DelegateDeserialization(SerializableMeta.class)
class CraftMetaPotion extends CraftMetaItem implements PotionMeta {

    static final ItemMetaKey AMPLIFIER;

    static final ItemMetaKey AMBIENT;

    static final ItemMetaKey DURATION;

    static final ItemMetaKey SHOW_PARTICLES;

    static final ItemMetaKey POTION_EFFECTS;

    static final ItemMetaKey ID;

    static final ItemMetaKey DEFAULT_POTION;

    // Having an initial "state" in ItemMeta seems bit dirty but the UNCRAFTABLE potion type
    // is treated as the empty form of the meta because it represents an empty potion with no effect
    private PotionData type;

    private List<PotionEffect> customEffects;

    CraftMetaPotion(CraftMetaItem meta) {
    }

    CraftMetaPotion(NBTTagCompound tag) {
    }

    CraftMetaPotion(Map<String, Object> map) {
    }

    @Override
    void applyToItem(NBTTagCompound tag) {
    }

    @Override
    boolean isEmpty() {
        return false;
    }

    boolean isPotionEmpty() {
        return false;
    }

    @Override
    boolean applicableTo(Material type) {
        return false;
    }

    @Override
    public CraftMetaPotion clone() {
        return null;
    }

    @Override
    public void setBasePotionData(PotionData data) {
    }

    @Override
    public PotionData getBasePotionData() {
        return null;
    }

    public boolean hasCustomEffects() {
        return false;
    }

    public List<PotionEffect> getCustomEffects() {
        return null;
    }

    public boolean addCustomEffect(PotionEffect effect, boolean overwrite) {
        return false;
    }

    public boolean removeCustomEffect(PotionEffectType type) {
        return false;
    }

    public boolean hasCustomEffect(PotionEffectType type) {
        return false;
    }

    public boolean setMainEffect(PotionEffectType type) {
        return false;
    }

    private int indexOfEffect(PotionEffectType type) {
        return 0;
    }

    public boolean clearCustomEffects() {
        return false;
    }

    @Override
    int applyHash() {
        return 0;
    }

    @Override
    public boolean equalsCommon(CraftMetaItem meta) {
        return false;
    }

    @Override
    boolean notUncommon(CraftMetaItem meta) {
        return false;
    }

    @Override
    Builder<String, Object> serialize(Builder<String, Object> builder) {
        return null;
    }
}
