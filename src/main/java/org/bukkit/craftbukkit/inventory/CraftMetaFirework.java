package org.bukkit.craftbukkit.inventory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import net.minecraft.server.NBTTagCompound;
import net.minecraft.server.NBTTagList;
import org.apache.commons.lang.Validate;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Material;
import org.bukkit.configuration.serialization.DelegateDeserialization;
import org.bukkit.craftbukkit.inventory.CraftMetaItem.ItemMetaKey.Specific;
import org.bukkit.craftbukkit.inventory.CraftMetaItem.ItemMetaKey.Specific.To;
import org.bukkit.craftbukkit.inventory.CraftMetaItem.SerializableMeta;
import org.bukkit.inventory.meta.FireworkMeta;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap.Builder;

@DelegateDeserialization(SerializableMeta.class)
class CraftMetaFirework extends CraftMetaItem implements FireworkMeta {

    /*
       "Fireworks", "Explosion", "Explosions", "Flight", "Type", "Trail", "Flicker", "Colors", "FadeColors";

        Fireworks
        - Compound: Fireworks
        -- Byte: Flight
        -- List: Explosions
        --- Compound: Explosion
        ---- IntArray: Colors
        ---- Byte: Type
        ---- Boolean: Trail
        ---- Boolean: Flicker
        ---- IntArray: FadeColors
     */
    @Specific(To.NBT)
    static final ItemMetaKey FIREWORKS = null;

    static final ItemMetaKey FLIGHT = null;

    static final ItemMetaKey EXPLOSIONS = null;

    @Specific(To.NBT)
    static final ItemMetaKey EXPLOSION_COLORS = null;

    @Specific(To.NBT)
    static final ItemMetaKey EXPLOSION_TYPE = null;

    @Specific(To.NBT)
    static final ItemMetaKey EXPLOSION_TRAIL = null;

    @Specific(To.NBT)
    static final ItemMetaKey EXPLOSION_FLICKER = null;

    @Specific(To.NBT)
    static final ItemMetaKey EXPLOSION_FADE = null;

    private List<FireworkEffect> effects = null;

    private int power = 0;

    CraftMetaFirework(CraftMetaItem meta) {
    }

    CraftMetaFirework(NBTTagCompound tag) {
    }

    static FireworkEffect getEffect(NBTTagCompound explosion) {
        return null;
    }

    static NBTTagCompound getExplosion(FireworkEffect effect) {
        return null;
    }

    static int getNBT(Type type) {
        return 0;
    }

    static Type getEffectType(int nbt) {
        return null;
    }

    CraftMetaFirework(Map<String, Object> map) {
    }

    public boolean hasEffects() {
        return false;
    }

    void safelyAddEffects(Iterable<?> collection) {
    }

    @Override
    void applyToItem(NBTTagCompound itemTag) {
    }

    static void addColors(NBTTagCompound compound, ItemMetaKey key, List<Color> colors) {
    }

    @Override
    boolean applicableTo(Material type) {
        return false;
    }

    @Override
    boolean isEmpty() {
        return false;
    }

    boolean isFireworkEmpty() {
        return false;
    }

    boolean hasPower() {
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
    Builder<String, Object> serialize(Builder<String, Object> builder) {
        return null;
    }

    @Override
    public CraftMetaFirework clone() {
        return null;
    }

    public void addEffect(FireworkEffect effect) {
    }

    public void addEffects(FireworkEffect... effects) {
    }

    public void addEffects(Iterable<FireworkEffect> effects) {
    }

    public List<FireworkEffect> getEffects() {
        return null;
    }

    public int getEffectsSize() {
        return 0;
    }

    public void removeEffect(int index) {
    }

    public void clearEffects() {
    }

    public int getPower() {
        return 0;
    }

    public void setPower(int power) {
    }
}
