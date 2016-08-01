package org.bukkit.craftbukkit.inventory;

import java.util.Map;
import net.minecraft.server.NBTTagCompound;
import org.bukkit.FireworkEffect;
import org.bukkit.Material;
import org.bukkit.configuration.serialization.DelegateDeserialization;
import org.bukkit.craftbukkit.inventory.CraftMetaItem.SerializableMeta;
import org.bukkit.inventory.meta.FireworkEffectMeta;
import com.google.common.collect.ImmutableMap.Builder;

@DelegateDeserialization(SerializableMeta.class)
class CraftMetaCharge extends CraftMetaItem implements FireworkEffectMeta {

    static final ItemMetaKey EXPLOSION = null;

    private FireworkEffect effect = null;

    CraftMetaCharge(CraftMetaItem meta) {
    }

    CraftMetaCharge(Map<String, Object> map) {
    }

    CraftMetaCharge(NBTTagCompound tag) {
    }

    @Override
    public void setEffect(FireworkEffect effect) {
    }

    @Override
    public boolean hasEffect() {
        return false;
    }

    @Override
    public FireworkEffect getEffect() {
        return null;
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

    boolean hasChargeMeta() {
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
    public CraftMetaCharge clone() {
        return null;
    }

    @Override
    Builder<String, Object> serialize(Builder<String, Object> builder) {
        return null;
    }
}
