package org.bukkit.craftbukkit.inventory;

import com.google.common.base.Objects;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import net.minecraft.server.BlockJukeBox;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.NBTBase;
import net.minecraft.server.NBTTagCompound;
import net.minecraft.server.TileEntity;
import net.minecraft.server.TileEntityBanner;
import net.minecraft.server.TileEntityBeacon;
import net.minecraft.server.TileEntityBrewingStand;
import net.minecraft.server.TileEntityChest;
import net.minecraft.server.TileEntityCommand;
import net.minecraft.server.TileEntityDispenser;
import net.minecraft.server.TileEntityDropper;
import net.minecraft.server.TileEntityEndGateway;
import net.minecraft.server.TileEntityFlowerPot;
import net.minecraft.server.TileEntityFurnace;
import net.minecraft.server.TileEntityHopper;
import net.minecraft.server.TileEntityMobSpawner;
import net.minecraft.server.TileEntityNote;
import net.minecraft.server.TileEntitySign;
import net.minecraft.server.TileEntitySkull;
import org.apache.commons.lang.Validate;
import org.bukkit.Material;
import org.bukkit.block.BlockState;
import org.bukkit.configuration.serialization.DelegateDeserialization;
import org.bukkit.craftbukkit.block.CraftBanner;
import org.bukkit.craftbukkit.block.CraftBeacon;
import org.bukkit.craftbukkit.block.CraftBlockState;
import org.bukkit.craftbukkit.block.CraftBrewingStand;
import org.bukkit.craftbukkit.block.CraftChest;
import org.bukkit.craftbukkit.block.CraftCommandBlock;
import org.bukkit.craftbukkit.block.CraftCreatureSpawner;
import org.bukkit.craftbukkit.block.CraftDispenser;
import org.bukkit.craftbukkit.block.CraftDropper;
import org.bukkit.craftbukkit.block.CraftEndGateway;
import org.bukkit.craftbukkit.block.CraftFlowerPot;
import org.bukkit.craftbukkit.block.CraftFurnace;
import org.bukkit.craftbukkit.block.CraftHopper;
import org.bukkit.craftbukkit.block.CraftJukebox;
import org.bukkit.craftbukkit.block.CraftNoteBlock;
import org.bukkit.craftbukkit.block.CraftSign;
import org.bukkit.craftbukkit.block.CraftSkull;
import org.bukkit.inventory.meta.BlockStateMeta;

@DelegateDeserialization(CraftMetaItem.SerializableMeta.class)
public class CraftMetaBlockState extends CraftMetaItem implements BlockStateMeta {

    @ItemMetaKey.Specific(ItemMetaKey.Specific.To.NBT)
    static final ItemMetaKey BLOCK_ENTITY_TAG = null;

    final Material material = null;

    NBTTagCompound blockEntityTag = null;

    CraftMetaBlockState(CraftMetaItem meta, Material material) {
    }

    CraftMetaBlockState(NBTTagCompound tag, Material material) {
    }

    CraftMetaBlockState(Map<String, Object> map) {
    }

    @Override
    void applyToItem(NBTTagCompound tag) {
    }

    @Override
    void deserializeInternal(NBTTagCompound tag) {
    }

    @Override
    void serializeInternal(final Map<String, NBTBase> internalTags) {
    }

    @Override
    ImmutableMap.Builder<String, Object> serialize(ImmutableMap.Builder<String, Object> builder) {
        return null;
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
    boolean isEmpty() {
        return false;
    }

    @Override
    boolean applicableTo(Material type) {
        return false;
    }

    @Override
    public boolean hasBlockState() {
        return false;
    }

    @Override
    public BlockState getBlockState() {
        return null;
    }

    @Override
    public void setBlockState(BlockState blockState) {
    }
}
