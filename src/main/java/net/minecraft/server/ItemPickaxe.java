package net.minecraft.server;

import com.google.common.collect.Sets;
import java.util.Set;

public class ItemPickaxe extends ItemTool {

    private static final Set<Block> e = null;

    protected ItemPickaxe(Item.EnumToolMaterial item_enumtoolmaterial) {
    }

    public boolean canDestroySpecialBlock(IBlockData iblockdata) {
        return false;
    }

    public float getDestroySpeed(ItemStack itemstack, IBlockData iblockdata) {
        return 0.0F;
    }
}
