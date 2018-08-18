package org.bukkit.craftbukkit.block;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LDelegate;
import org.bukkit.block.Block;

import net.glowstone.block.GlowBlock;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class CraftBlock {
    @LDelegate(Block.class)
    public GlowBlock glow;

    public CraftBlock(GlowBlock glow) {
        this.glow = glow;
    }
}