package net.minecraft.server;

import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.craftbukkit.event.CraftEventFactory;
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.event.player.PlayerBucketEmptyEvent;
import org.bukkit.event.player.PlayerBucketFillEvent;

// CraftBukkit end
public class ItemBucket extends Item {

    private final Block a = null;

    public ItemBucket(Block block) {
    }

    public InteractionResultWrapper<ItemStack> a(ItemStack itemstack, World world, EntityHuman entityhuman, EnumHand enumhand) {
        return null;
    }

    // CraftBukkit - added ob.ItemStack result - TODO: Is this... the right way to handle this?
    private ItemStack a(ItemStack itemstack, EntityHuman entityhuman, Item item, org.bukkit.inventory.ItemStack result) {
        return null;
    }

    // CraftBukkit start
    public boolean a(@Nullable EntityHuman entityhuman, World world, BlockPosition blockposition) {
        return false;
    }

    public boolean a(EntityHuman entityhuman, World world, BlockPosition blockposition, EnumDirection enumdirection, BlockPosition clicked, ItemStack itemstack) {
        return false;
    }
}
