package net.minecraft.server;

import com.google.common.collect.ImmutableMap;
import java.util.Collection;

public interface IBlockData extends IBlockPhysics, IBlockProperties {

    Collection<IBlockState<?>> r() {
        return null;
    }

    <T extends Comparable<T>> T get(IBlockState<T> iblockstate) {
        return null;
    }

    <T extends Comparable<T>, V extends T> IBlockData set(IBlockState<T> iblockstate, V v0) {
        return null;
    }

    <T extends Comparable<T>> IBlockData a(IBlockState<T> iblockstate) {
        return null;
    }

    ImmutableMap<IBlockState<?>, Comparable<?>> s() {
        return null;
    }

    Block getBlock() {
        return null;
    }
}
