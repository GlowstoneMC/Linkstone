package net.minecraft.server;

import com.google.common.base.Function;
import javax.annotation.Nullable;

public class ItemMultiTexture extends ItemBlock {

    protected final Block b;

    protected final Function<ItemStack, String> c;

    public ItemMultiTexture(Block block, Block block1, Function<ItemStack, String> function) {
    }

    public ItemMultiTexture(Block block, Block block1, final String[] astring) {
    }

    public int filterData(int i) {
        return 0;
    }

    public String f_(ItemStack itemstack) {
        return null;
    }
}
