package net.minecraft.server;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;

public class BlockPredicate implements Predicate<IBlockData> {

    private final Block a;

    private BlockPredicate(Block block) {
    }

    public static BlockPredicate a(Block block) {
        return null;
    }

    public boolean a(@Nullable IBlockData iblockdata) {
        return false;
    }

    public boolean apply(Object object) {
        return false;
    }
}
