package org.bukkit.craftbukkit.inventory;

import static org.bukkit.craftbukkit.inventory.CraftItemFactory.DEFAULT_LEATHER_COLOR;
import java.util.Map;
import net.minecraft.server.NBTTagCompound;
import net.minecraft.server.NBTTagInt;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.configuration.serialization.DelegateDeserialization;
import org.bukkit.craftbukkit.inventory.CraftMetaItem.SerializableMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import com.google.common.collect.ImmutableMap.Builder;

@DelegateDeserialization(SerializableMeta.class)
class CraftMetaLeatherArmor extends CraftMetaItem implements LeatherArmorMeta {

    static final ItemMetaKey COLOR = null;

    private Color color = null;

    CraftMetaLeatherArmor(CraftMetaItem meta) {
    }

    CraftMetaLeatherArmor(NBTTagCompound tag) {
    }

    CraftMetaLeatherArmor(Map<String, Object> map) {
    }

    @Override
    void applyToItem(NBTTagCompound itemTag) {
    }

    @Override
    boolean isEmpty() {
        return false;
    }

    boolean isLeatherArmorEmpty() {
        return false;
    }

    @Override
    boolean applicableTo(Material type) {
        return false;
    }

    @Override
    public CraftMetaLeatherArmor clone() {
        return null;
    }

    public Color getColor() {
        return null;
    }

    public void setColor(Color color) {
    }

    boolean hasColor() {
        return false;
    }

    @Override
    Builder<String, Object> serialize(Builder<String, Object> builder) {
        return null;
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
}
