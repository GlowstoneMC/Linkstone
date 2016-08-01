package net.minecraft.server;

import com.google.common.collect.Maps;
import java.util.Map;

public class ItemRecord extends Item {

    private static final Map<SoundEffect, ItemRecord> a;

    private final SoundEffect b;

    private final String c;

    protected ItemRecord(String s, SoundEffect soundeffect) {
    }

    public EnumInteractionResult a(ItemStack itemstack, EntityHuman entityhuman, World world, BlockPosition blockposition, EnumHand enumhand, EnumDirection enumdirection, float f, float f1, float f2) {
        return null;
    }

    public EnumItemRarity g(ItemStack itemstack) {
        return null;
    }
}
