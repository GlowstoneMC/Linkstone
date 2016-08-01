package net.minecraft.server;

import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class BlockStatePredicate implements Predicate<IBlockData> {

    public static final Predicate<IBlockData> a = null;

    private final BlockStateList b = null;

    private final Map<IBlockState<?>, Predicate<?>> c = null;

    private BlockStatePredicate(BlockStateList blockstatelist) {
    }

    public static BlockStatePredicate a(Block block) {
        return null;
    }

    public boolean a(@Nullable IBlockData iblockdata) {
        return false;
    }

    protected <T extends Comparable<T>> boolean a(IBlockData iblockdata, IBlockState<T> iblockstate, Predicate<?> predicate) {
        return false;
    }

    public <V extends Comparable<V>> BlockStatePredicate a(IBlockState<V> iblockstate, Predicate<? extends V> predicate) {
        return null;
    }

    public boolean apply(Object object) {
        return false;
    }
}
