package org.bukkit.craftbukkit.inventory;

import java.util.Map;
import net.minecraft.server.GameProfileSerializer;
import net.minecraft.server.NBTBase;
import net.minecraft.server.NBTTagCompound;
import org.bukkit.Material;
import org.bukkit.configuration.serialization.DelegateDeserialization;
import org.bukkit.craftbukkit.inventory.CraftMetaItem.SerializableMeta;
import org.bukkit.inventory.meta.SkullMeta;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.authlib.GameProfile;

@DelegateDeserialization(SerializableMeta.class)
class CraftMetaSkull extends CraftMetaItem implements SkullMeta {

    @ItemMetaKey.Specific(ItemMetaKey.Specific.To.NBT)
    static final ItemMetaKey SKULL_PROFILE;

    static final ItemMetaKey SKULL_OWNER;

    static final int MAX_OWNER_LENGTH;

    private GameProfile profile;

    CraftMetaSkull(CraftMetaItem meta) {
    }

    CraftMetaSkull(NBTTagCompound tag) {
    }

    CraftMetaSkull(Map<String, Object> map) {
    }

    @Override
    void deserializeInternal(NBTTagCompound tag) {
    }

    @Override
    void serializeInternal(final Map<String, NBTBase> internalTags) {
    }

    @Override
    void applyToItem(NBTTagCompound tag) {
    }

    @Override
    boolean isEmpty() {
        return false;
    }

    boolean isSkullEmpty() {
        return false;
    }

    @Override
    boolean applicableTo(Material type) {
        return false;
    }

    @Override
    public CraftMetaSkull clone() {
        return null;
    }

    public boolean hasOwner() {
        return false;
    }

    public String getOwner() {
        return null;
    }

    public boolean setOwner(String name) {
        return false;
    }

    @Override
    int applyHash() {
        return 0;
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
    Builder<String, Object> serialize(Builder<String, Object> builder) {
        return null;
    }
}
