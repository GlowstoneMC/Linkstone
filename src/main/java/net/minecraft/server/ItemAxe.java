package net.minecraft.server;

import com.google.common.collect.Sets;
import java.util.Set;

public class ItemAxe extends ItemTool {

    private static final Set<Block> e;

    private static final float[] f;

    private static final float[] n;

    protected ItemAxe(Item.EnumToolMaterial item_enumtoolmaterial) {
    }

    public float getDestroySpeed(ItemStack itemstack, IBlockData iblockdata) {
        return 0.0F;
    }
}
