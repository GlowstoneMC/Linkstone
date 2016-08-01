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

    private static final Logger f = null;

    private final IInventory g = null;

    private final IInventory h = null;

    private final World i = null;

    private final BlockPosition j = null;

    public int a = 0;

    private int k = 0;

    private String l = null;

    private final EntityHuman m = null;

    // CraftBukkit start
    private CraftInventoryView bukkitEntity = null;

    private PlayerInventory player = null;

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

        static final int[] a = null;

        static {
        }
    }
}
