package org.bukkit.craftbukkit.block;

import net.minecraft.server.BlockPosition;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.BlockState;
import org.bukkit.craftbukkit.CraftChunk;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.craftbukkit.util.CraftMagicNumbers;
import org.bukkit.material.Attachable;
import org.bukkit.material.MaterialData;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;
import java.util.List;
import net.minecraft.server.EnumDirection;
import net.minecraft.server.IBlockData;
import net.minecraft.server.TileEntity;

public class CraftBlockState implements BlockState {

    private final CraftWorld world;

    private final CraftChunk chunk;

    private final int x;

    private final int y;

    private final int z;

    protected int type;

    protected MaterialData data;

    protected int flag;

    public CraftBlockState(final Block block) {
    }

    public CraftBlockState(final Block block, int flag) {
    }

    public CraftBlockState(Material material) {
    }

    public static CraftBlockState getBlockState(net.minecraft.server.World world, int x, int y, int z) {
        return null;
    }

    public static CraftBlockState getBlockState(net.minecraft.server.World world, int x, int y, int z, int flag) {
        return null;
    }

    public World getWorld() {
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

    public void setData(final MaterialData data) {
    }

    public MaterialData getData() {
        return null;
    }

    public void setType(final Material type) {
    }

    public boolean setTypeId(final int type) {
        return false;
    }

    public Material getType() {
        return null;
    }

    public void setFlag(int flag) {
    }

    public int getFlag() {
        return 0;
    }

    public int getTypeId() {
        return 0;
    }

    public byte getLightLevel() {
        return 0;
    }

    public Block getBlock() {
        return null;
    }

    public boolean update() {
        return false;
    }

    public boolean update(boolean force) {
        return false;
    }

    public boolean update(boolean force, boolean applyPhysics) {
        return false;
    }

    private void createData(final byte data) {
    }

    public byte getRawData() {
        return 0;
    }

    public Location getLocation() {
        return null;
    }

    public Location getLocation(Location loc) {
        return null;
    }

    public void setRawData(byte data) {
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public TileEntity getTileEntity() {
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

    @Override
    public boolean isPlaced() {
        return false;
    }

    protected void requirePlaced() {
    }
}
