package net.minecraft.server;

// CraftBukkit start
import java.util.List;
import org.bukkit.craftbukkit.entity.CraftHumanEntity;
import org.bukkit.entity.HumanEntity;

// CraftBukkit end
public class InventoryEnderChest extends InventorySubcontainer {

    private TileEntityEnderChest a = null;

    // CraftBukkit start - add fields and methods
    public List<HumanEntity> transaction = null;

    public org.bukkit.entity.Player player = null;

    private int maxStack = 0;

    public ItemStack[] getContents() {
        return null;
    }

    public void onOpen(CraftHumanEntity who) {
    }

    public void onClose(CraftHumanEntity who) {
    }

    public List<HumanEntity> getViewers() {
        return null;
    }

    public org.bukkit.inventory.InventoryHolder getOwner() {
        return null;
    }

    public void setMaxStackSize(int size) {
    }

    public int getMaxStackSize() {
        return 0;
    }

    // CraftBukkit end
    public InventoryEnderChest() {
    }

    public void a(TileEntityEnderChest tileentityenderchest) {
    }

    public void a(NBTTagList nbttaglist) {
    }

    public NBTTagList h() {
        return null;
    }

    public boolean a(EntityHuman entityhuman) {
        return false;
    }

    public void startOpen(EntityHuman entityhuman) {
    }

    public void closeContainer(EntityHuman entityhuman) {
    }
}
