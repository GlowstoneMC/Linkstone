package net.minecraft.server;

import javax.annotation.Nullable;

public interface DefinedStructureProcessor {

    @Nullable
    DefinedStructure.BlockInfo a(World world, BlockPosition blockposition, DefinedStructure.BlockInfo definedstructure_blockinfo) {
        return null;
    }
}
