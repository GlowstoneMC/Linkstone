package net.minecraft.server;

import com.google.common.base.Objects;

public abstract class BlockState<T extends Comparable<T>> implements IBlockState<T> {

    private final Class<T> a = null;

    private final String b = null;

    protected BlockState(String s, Class<T> oclass) {
    }

    public String a() {
        return null;
    }

    public Class<T> b() {
        return null;
    }

    public String toString() {
        return null;
    }

    public boolean equals(Object object) {
        return false;
    }

    public int hashCode() {
        return 0;
    }
}
