package net.minecraft.server;

import javax.annotation.Nullable;
import org.bukkit.craftbukkit.inventory.CraftInventoryView;

// CraftBukkit
public class ContainerMerchant extends Container {

    private final IMerchant merchant;

    private final InventoryMerchant f;

    private final World g;

    // CraftBukkit start
    private CraftInventoryView bukkitEntity;

    private PlayerInventory player;

    @Override
    public CraftInventoryView getBukkitView() {
        return null;
    }

    // CraftBukkit end
    public ContainerMerchant(PlayerInventory playerinventory, IMerchant imerchant, World world) {
    }

    public InventoryMerchant e() {
        return null;
    }

    public void addSlotListener(ICrafting icrafting) {
    }

    public void b() {
    }

    public void a(IInventory iinventory) {
    }

    public void d(int i) {
    }

    public boolean a(EntityHuman entityhuman) {
        return false;
    }

    @Nullable
    public ItemStack b(EntityHuman entityhuman, int i) {
        return null;
    }

    public void b(EntityHuman entityhuman) {
    }
}
