/**
 * This file has methods auto-generated (marked with // LinkFiller)
 */
package org.bukkit.craftbukkit.block;

import java.util.Collection;
import java.util.List;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.block.PistonMoveReaction;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;

import net.glowstone.block.GlowBlock;

public class CraftBlock implements Block {
    public GlowBlock base;
    public CraftBlock(GlowBlock glow) {
        this.base = glow;
    }

    @Override
    public List<MetadataValue> getMetadata(String arg0) {
        return base.getMetadata(arg0); // LinkFiller
    }

    @Override
    public boolean hasMetadata(String arg0) {
        return base.hasMetadata(arg0); // LinkFiller
    }

    @Override
    public void removeMetadata(String arg0, Plugin arg1) {
        base.removeMetadata(arg0, arg1); // LinkFiller
    }

    @Override
    public void setMetadata(String arg0, MetadataValue arg1) {
        base.setMetadata(arg0, arg1); // LinkFiller
    }

    @Override
    public boolean breakNaturally() {
        return base.breakNaturally(); // LinkFiller
    }

    @Override
    public boolean breakNaturally(ItemStack arg0) {
        return base.breakNaturally(arg0); // LinkFiller
    }

    @Override
    public Biome getBiome() {
        return base.getBiome(); // LinkFiller
    }

    @Override
    public int getBlockPower() {
        return base.getBlockPower(); // LinkFiller
    }

    @Override
    public int getBlockPower(BlockFace arg0) {
        return base.getBlockPower(arg0); // LinkFiller
    }

    @Override
    public Chunk getChunk() {
        return base.getChunk(); // LinkFiller // TODO: CraftChunk
    }

    @Override
    public byte getData() {
        return base.getData(); // LinkFiller
    }

    @Override
    public Collection<ItemStack> getDrops() {
        return base.getDrops(); // LinkFiller // TODO CraftItemStack
    }

    @Override
    public Collection<ItemStack> getDrops(ItemStack arg0) {
        return base.getDrops(arg0); // LinkFiller
    }

    @Override
    public BlockFace getFace(Block arg0) {
        return base.getFace(arg0); // LinkFiller
    }

    @Override
    public double getHumidity() {
        return base.getHumidity(); // LinkFiller
    }

    @Override
    public byte getLightFromBlocks() {
        return base.getLightFromBlocks(); // LinkFiller
    }

    @Override
    public byte getLightFromSky() {
        return base.getLightFromSky(); // LinkFiller
    }

    @Override
    public byte getLightLevel() {
        return base.getLightLevel(); // LinkFiller
    }

    @Override
    public Location getLocation() {
        return base.getLocation(); // LinkFiller
    }

    @Override
    public Location getLocation(Location arg0) {
        return base.getLocation(arg0); // LinkFiller
    }

    @Override
    public PistonMoveReaction getPistonMoveReaction() {
        return base.getPistonMoveReaction(); // LinkFiller
    }

    @Override
    public Block getRelative(BlockFace arg0) {
        return new CraftBlock(base.getRelative(arg0));
    }

    @Override
    public Block getRelative(BlockFace arg0, int arg1) {
        return new CraftBlock(base.getRelative(arg0, arg1));
    }

    @Override
    public Block getRelative(int arg0, int arg1, int arg2) {
        return new CraftBlock(base.getRelative(arg0, arg1, arg2));
    }

    @Override
    public BlockState getState() {
        return base.getState(); // LinkFiller
    }

    @Override
    public BlockState getState(boolean arg0) {
        return base.getState(arg0); // LinkFiller
    }

    @Override
    public double getTemperature() {
        return base.getTemperature(); // LinkFiller
    }

    @Override
    public Material getType() {
        return base.getType(); // LinkFiller
    }

    @Override
    public int getTypeId() {
        return base.getTypeId(); // LinkFiller
    }

    @Override
    public World getWorld() {
        return new CraftWorld(base.getWorld());
    }

    @Override
    public int getX() {
        return base.getX(); // LinkFiller
    }

    @Override
    public int getY() {
        return base.getY(); // LinkFiller
    }

    @Override
    public int getZ() {
        return base.getZ(); // LinkFiller
    }

    @Override
    public boolean isBlockFaceIndirectlyPowered(BlockFace arg0) {
        return base.isBlockFaceIndirectlyPowered(arg0); // LinkFiller
    }

    @Override
    public boolean isBlockFacePowered(BlockFace arg0) {
        return base.isBlockFacePowered(arg0); // LinkFiller
    }

    @Override
    public boolean isBlockIndirectlyPowered() {
        return base.isBlockIndirectlyPowered(); // LinkFiller
    }

    @Override
    public boolean isBlockPowered() {
        return base.isBlockPowered(); // LinkFiller
    }

    @Override
    public boolean isEmpty() {
        return base.isEmpty(); // LinkFiller
    }

    @Override
    public boolean isLiquid() {
        return base.isLiquid(); // LinkFiller
    }

    @Override
    public void setBiome(Biome arg0) {
        base.setBiome(arg0); // LinkFiller
    }

    @Override
    public void setData(byte arg0) {
        base.setData(arg0); // LinkFiller
    }

    @Override
    public void setData(byte arg0, boolean arg1) {
        base.setData(arg0, arg1); // LinkFiller
    }

    @Override
    public void setType(Material arg0) {
        base.setType(arg0); // LinkFiller
    }

    @Override
    public void setType(Material arg0, boolean arg1) {
        base.setType(arg0, arg1); // LinkFiller
    }

    @Override
    public boolean setTypeId(int arg0) {
        return base.setTypeId(arg0); // LinkFiller
    }

    @Override
    public boolean setTypeId(int arg0, boolean arg1) {
        return base.setTypeId(arg0, arg1); // LinkFiller
    }

    @Override
    public boolean setTypeIdAndData(int arg0, byte arg1, boolean arg2) {
        return base.setTypeIdAndData(arg0, arg1, arg2); // LinkFiller
    }

}