package net.minecraft.server;

import java.util.Iterator;
import java.util.List;
import org.bukkit.event.hanging.HangingPlaceEvent;

// CraftBukkit
public class ItemLeash extends Item {

    public ItemLeash() {
    }

    public EnumInteractionResult a(ItemStack itemstack, EntityHuman entityhuman, World world, BlockPosition blockposition, EnumHand enumhand, EnumDirection enumdirection, float f, float f1, float f2) {
        return null;
    }

    public static boolean a(EntityHuman entityhuman, World world, BlockPosition blockposition) {
        return false;
    }
}
