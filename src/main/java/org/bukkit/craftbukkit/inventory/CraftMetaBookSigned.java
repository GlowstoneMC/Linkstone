package org.bukkit.craftbukkit.inventory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.minecraft.server.NBTTagCompound;
import net.minecraft.server.NBTTagList;
import org.bukkit.Material;
import org.bukkit.configuration.serialization.DelegateDeserialization;
import org.bukkit.craftbukkit.inventory.CraftMetaItem.SerializableMeta;
import org.bukkit.inventory.meta.BookMeta;
import com.google.common.collect.ImmutableMap.Builder;
import net.minecraft.server.IChatBaseComponent.ChatSerializer;
import net.minecraft.server.IChatBaseComponent;
import net.minecraft.server.NBTTagString;
import org.bukkit.craftbukkit.util.CraftChatMessage;

@DelegateDeserialization(SerializableMeta.class)
class CraftMetaBookSigned extends CraftMetaBook implements BookMeta {

    CraftMetaBookSigned(CraftMetaItem meta) {
    }

    CraftMetaBookSigned(NBTTagCompound tag) {
    }

    CraftMetaBookSigned(Map<String, Object> map) {
    }

    @Override
    void applyToItem(NBTTagCompound itemData) {
    }

    @Override
    boolean isEmpty() {
        return false;
    }

    @Override
    boolean applicableTo(Material type) {
        return false;
    }

    @Override
    public CraftMetaBookSigned clone() {
        return null;
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
