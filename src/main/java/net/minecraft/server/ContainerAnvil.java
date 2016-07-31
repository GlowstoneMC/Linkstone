package net.minecraft.server;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
// CraftBukkit start
import org.bukkit.craftbukkit.inventory.CraftInventoryView;
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.event.inventory.PrepareAnvilEvent;

// CraftBukkit end
public class ContainerAnvil extends Container {

    private static final Logger f;

    private final IInventory g;

    private final IInventory h;

    private final World i;

    private final BlockPosition j;

    public int a;

    private int k;

    private String l;

    private final EntityHuman m;

    // CraftBukkit start
    private CraftInventoryView bukkitEntity;

    private PlayerInventory player;

    // CraftBukkit end
    public ContainerAnvil(PlayerInventory playerinventory, final World world, final BlockPosition blockposition, EntityHuman entityhuman) {
    }

    public void a(IInventory iinventory) {
    }

    public void e() {
    }

    public void addSlotListener(ICrafting icrafting) {
    }

    public void b(EntityHuman entityhuman) {
    }

    public boolean a(EntityHuman entityhuman) {
        return false;
    }

    @Nullable
    public ItemStack b(EntityHuman entityhuman, int i) {
        return null;
    }

    public void a(String s) {
    }

    // CraftBukkit start
    @Override
    public CraftInventoryView getBukkitView() {
        return null;
    }

    // CraftBukkit end
    static class SyntheticClass_1 {

        static final int[] a;

        static {
        }
    }
}
