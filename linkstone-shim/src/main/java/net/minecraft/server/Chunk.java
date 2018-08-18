package net.minecraft.server;

import net.glowstone.chunk.GlowChunk;
import net.glowstone.linkstone.annotations.LBox;
import net.glowstone.linkstone.annotations.LBoxed;
import net.glowstone.linkstone.annotations.LClassfile;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LBox(GlowChunk.class)
@LClassfile(version = V1_12_R1)
public class Chunk {
    @LBoxed
    public GlowChunk glow;

    public Chunk(GlowChunk glow) {
        this.glow = glow;
    }
}