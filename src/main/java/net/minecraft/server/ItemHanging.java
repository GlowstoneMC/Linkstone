package net.minecraft.server;

import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.entity.Player;
import org.bukkit.event.hanging.HangingPlaceEvent;

// CraftBukkit end
public class ItemHanging extends Item {

    private final Class<? extends EntityHanging> a;

    public ItemHanging(Class<? extends EntityHanging> oclass) {
    }

    public EnumInteractionResult a(ItemStack itemstack, EntityHuman entityhuman, World world, BlockPosition blockposition, EnumHand enumhand, EnumDirection enumdirection, float f, float f1, float f2) {
        return null;
    }

    @Nullable
    private EntityHanging a(World world, BlockPosition blockposition, EnumDirection enumdirection) {
        return null;
    }
}
