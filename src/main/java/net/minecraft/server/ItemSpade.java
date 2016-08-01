package net.minecraft.server;

import com.google.common.collect.Sets;
import java.util.Set;

public class ItemSpade extends ItemTool {

    private static final Set<Block> e;

    public ItemSpade(Item.EnumToolMaterial item_enumtoolmaterial) {
    }

    public boolean canDestroySpecialBlock(IBlockData iblockdata) {
        return false;
    }

    public EnumInteractionResult a(ItemStack itemstack, EntityHuman entityhuman, World world, BlockPosition blockposition, EnumHand enumhand, EnumDirection enumdirection, float f, float f1, float f2) {
        return null;
    }
}
