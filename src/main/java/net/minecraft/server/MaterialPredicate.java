package net.minecraft.server;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;

public class MaterialPredicate implements Predicate<IBlockData> {

    private final Material a;

    private MaterialPredicate(Material material) {
    }

    public static MaterialPredicate a(Material material) {
        return null;
    }

    public boolean a(@Nullable IBlockData iblockdata) {
        return false;
    }

    public boolean apply(Object object) {
        return false;
    }
}
