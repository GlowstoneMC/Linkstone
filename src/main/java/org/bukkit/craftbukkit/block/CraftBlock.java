package org.bukkit.craftbukkit.block;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import net.minecraft.server.*;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.block.PistonMoveReaction;
import org.bukkit.craftbukkit.CraftChunk;
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.craftbukkit.util.CraftMagicNumbers;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.BlockVector;

public class CraftBlock implements Block {

    private final CraftChunk chunk;

    private final int x;

    private final int y;

    private final int z;

    public CraftBlock(CraftChunk chunk, int x, int y, int z) {
    }

    private net.minecraft.server.Block getNMSBlock() {
        return null;
    }

    private static net.minecraft.server.Block getNMSBlock(int type) {
        return null;
    }

    public World getWorld() {
        return null;
    }

    public Location getLocation() {
        return null;
    }

    public Location getLocation(Location loc) {
        return null;
    }

    public BlockVector getVector() {
        return null;
    }

    public int getX() {
        return 0;
    }

    public int getY() {
        return 0;
    }

    public int getZ() {
        return 0;
    }

    public Chunk getChunk() {
        return null;
    }

    public void setData(final byte data) {
    }

    public void setData(final byte data, boolean applyPhysics) {
    }

    private void setData(final byte data, int flag) {
    }

    private IBlockData getData0() {
        return null;
    }

    public byte getData() {
        return 0;
    }

    public void setType(final Material type) {
    }

    @Override
    public void setType(Material type, boolean applyPhysics) {
    }

    public boolean setTypeId(final int type) {
        return false;
    }

    public boolean setTypeId(final int type, final boolean applyPhysics) {
        return false;
    }

    public boolean setTypeIdAndData(final int type, final byte data, final boolean applyPhysics) {
        return false;
    }

    public Material getType() {
        return null;
    }

    @Deprecated
    @Override
    public int getTypeId() {
        return 0;
    }

    public byte getLightLevel() {
        return 0;
    }

    public byte getLightFromSky() {
        return 0;
    }

    public byte getLightFromBlocks() {
        return 0;
    }

    public Block getFace(final BlockFace face) {
        return null;
    }

    public Block getFace(final BlockFace face, final int distance) {
        return null;
    }

    public Block getRelative(final int modX, final int modY, final int modZ) {
        return null;
    }

    public Block getRelative(BlockFace face) {
        return null;
    }

    public Block getRelative(BlockFace face, int distance) {
        return null;
    }

    public BlockFace getFace(final Block block) {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

    public static BlockFace notchToBlockFace(EnumDirection notch) {
        return null;
    }

    public static EnumDirection blockFaceToNotch(BlockFace face) {
        return null;
    }

    public BlockState getState() {
        return null;
    }

    public Biome getBiome() {
        return null;
    }

    public void setBiome(Biome bio) {
    }

    public static Biome biomeBaseToBiome(BiomeBase base) {
        return null;
    }

    public static BiomeBase biomeToBiomeBase(Biome bio) {
        return null;
    }

    public double getTemperature() {
        return 0.0;
    }

    public double getHumidity() {
        return 0.0;
    }

    public boolean isBlockPowered() {
        return false;
    }

    public boolean isBlockIndirectlyPowered() {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public boolean isBlockFacePowered(BlockFace face) {
        return false;
    }

    public boolean isBlockFaceIndirectlyPowered(BlockFace face) {
        return false;
    }

    public int getBlockPower(BlockFace face) {
        return 0;
    }

    public int getBlockPower() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean isLiquid() {
        return false;
    }

    public PistonMoveReaction getPistonMoveReaction() {
        return null;
    }

    private boolean itemCausesDrops(ItemStack item) {
        return false;
    }

    public boolean breakNaturally() {
        return false;
    }

    public boolean breakNaturally(ItemStack item) {
        return false;
    }

    public Collection<ItemStack> getDrops() {
        return null;
    }

    public Collection<ItemStack> getDrops(ItemStack item) {
        return null;
    }

    public void setMetadata(String metadataKey, MetadataValue newMetadataValue) {
    }

    public List<MetadataValue> getMetadata(String metadataKey) {
        return null;
    }

    public boolean hasMetadata(String metadataKey) {
        return false;
    }

    public void removeMetadata(String metadataKey, Plugin owningPlugin) {
    }
}
