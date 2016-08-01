package net.minecraft.server;

import com.google.common.base.Optional;
import java.util.Collection;

public interface IBlockState<T extends Comparable<T>> {

    String a() {
        return null;
    }

    Collection<T> c() {
        return null;
    }

    Class<T> b() {
        return null;
    }

    Optional<T> b(String s) {
        return null;
    }

    String a(T t0) {
        return null;
    }
}
