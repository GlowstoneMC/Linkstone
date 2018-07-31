package net.minecraft.server;

import net.glowstone.chunk.GlowChunk;
import net.glowstone.linkstone.annotations.LClassfile;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class Chunk {
    public GlowChunk glow;

    public Chunk(GlowChunk glow) {
        this.glow = glow;
    }
}