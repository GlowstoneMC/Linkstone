package net.minecraft.server;

import javax.annotation.Nullable;

public class ItemWorldMapBase extends Item {

    protected ItemWorldMapBase() {
    }

    public boolean f() {
        return false;
    }

    @Nullable
    public Packet<?> a(ItemStack itemstack, World world, EntityHuman entityhuman) {
        return null;
    }
}
