package net.minecraft.server;

// CraftBukkit start
import java.util.List;
import org.bukkit.craftbukkit.entity.CraftHumanEntity;
import org.bukkit.entity.HumanEntity;

// CraftBukkit end
public class InventoryHorseChest extends InventorySubcontainer {

    public InventoryHorseChest(String s, int i) {
    }

    // CraftBukkit start - add fields and methods
    public List<HumanEntity> transaction;

    private EntityHorse horse;

    private int maxStack;

    public InventoryHorseChest(String s, int i, EntityHorse horse) {
    }

    @Override
    public ItemStack[] getContents() {
        return null;
    }

    @Override
    public void onOpen(CraftHumanEntity who) {
    }

    @Override
    public void onClose(CraftHumanEntity who) {
    }

    @Override
    public List<HumanEntity> getViewers() {
        return null;
    }

    @Override
    public org.bukkit.inventory.InventoryHolder getOwner() {
        return null;
    }

    @Override
    public void setMaxStackSize(int size) {
    }

    @Override
    public int getMaxStackSize() {
        return 0;
    }
    // CraftBukkit end
}
