package org.bukkit.craftbukkit.inventory;

import java.util.Map;
import net.minecraft.server.NBTTagCompound;
import org.bukkit.Material;
import org.bukkit.configuration.serialization.DelegateDeserialization;
import org.bukkit.craftbukkit.inventory.CraftMetaItem.SerializableMeta;
import org.bukkit.inventory.meta.MapMeta;
import com.google.common.collect.ImmutableMap;

@DelegateDeserialization(SerializableMeta.class)
class CraftMetaMap extends CraftMetaItem implements MapMeta {

    static final ItemMetaKey MAP_SCALING = null;

    static final byte SCALING_EMPTY = 0;

    static final byte SCALING_TRUE = 0;

    static final byte SCALING_FALSE = 0;

    private byte scaling = 0;

    CraftMetaMap(CraftMetaItem meta) {
    }

    CraftMetaMap(NBTTagCompound tag) {
    }

    CraftMetaMap(Map<String, Object> map) {
    }

    @Override
    void applyToItem(NBTTagCompound tag) {
    }

    @Override
    boolean applicableTo(Material type) {
        return false;
    }

    @Override
    boolean isEmpty() {
        return false;
    }

    boolean isMapEmpty() {
        return false;
    }

    boolean hasScaling() {
        return false;
    }

    public boolean isScaling() {
        return false;
    }

    public void setScaling(boolean scaling) {
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

    public CraftMetaMap clone() {
        return null;
    }

    @Override
    ImmutableMap.Builder<String, Object> serialize(ImmutableMap.Builder<String, Object> builder) {
        return null;
    }
}
