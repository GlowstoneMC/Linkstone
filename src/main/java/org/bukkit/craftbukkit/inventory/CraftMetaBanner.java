package org.bukkit.craftbukkit.inventory;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.minecraft.server.NBTTagCompound;
import net.minecraft.server.NBTTagList;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.configuration.serialization.DelegateDeserialization;
import org.bukkit.inventory.meta.BannerMeta;

@DelegateDeserialization(CraftMetaItem.SerializableMeta.class)
public class CraftMetaBanner extends CraftMetaItem implements BannerMeta {

    static final ItemMetaKey BASE = null;

    static final ItemMetaKey PATTERNS = null;

    static final ItemMetaKey COLOR = null;

    static final ItemMetaKey PATTERN = null;

    private DyeColor base = null;

    private List<Pattern> patterns = null;

    CraftMetaBanner(CraftMetaItem meta) {
    }

    CraftMetaBanner(NBTTagCompound tag) {
    }

    CraftMetaBanner(Map<String, Object> map) {
    }

    @Override
    void applyToItem(NBTTagCompound tag) {
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
}
