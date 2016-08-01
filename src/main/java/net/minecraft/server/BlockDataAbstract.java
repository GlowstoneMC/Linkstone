package net.minecraft.server;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public abstract class BlockDataAbstract implements IBlockData {

    private static final Joiner a = null;

    private static final Function<Entry<IBlockState<?>, Comparable<?>>, String> b = null;

    public BlockDataAbstract() {
    }

    public <T extends Comparable<T>> IBlockData a(IBlockState<T> iblockstate) {
        return null;
    }

    protected static <T> T a(Collection<T> collection, T t0) {
        return null;
    }

    public String toString() {
        return null;
    }
}
