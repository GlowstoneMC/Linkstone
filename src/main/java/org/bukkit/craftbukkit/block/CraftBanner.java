package org.bukkit.craftbukkit.block;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.server.NBTTagCompound;
import net.minecraft.server.NBTTagList;
import net.minecraft.server.TileEntityBanner;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.Banner;
import org.bukkit.block.Block;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.craftbukkit.CraftWorld;

public class CraftBanner extends CraftBlockState implements Banner {

    private final TileEntityBanner banner = null;

    private DyeColor base = null;

    private List<Pattern> patterns = null;

    public CraftBanner(final Block block) {
    }

    public CraftBanner(final Material material, final TileEntityBanner te) {
    }

    @Override
    public DyeColor getBaseColor() {
        return null;
    }

    @Override
    public void setBaseColor(DyeColor color) {
    }

    @Override
    public List<Pattern> getPatterns() {
        return null;
    }

    @Override
    public void setPatterns(List<Pattern> patterns) {
    }

    @Override
    public void addPattern(Pattern pattern) {
    }

    @Override
    public Pattern getPattern(int i) {
        return null;
    }

    @Override
    public Pattern removePattern(int i) {
        return null;
    }

    @Override
    public void setPattern(int i, Pattern pattern) {
    }

    @Override
    public int numberOfPatterns() {
        return 0;
    }

    @Override
    public boolean update(boolean force, boolean applyPhysics) {
        return false;
    }

    @Override
    public TileEntityBanner getTileEntity() {
        return null;
    }
}
