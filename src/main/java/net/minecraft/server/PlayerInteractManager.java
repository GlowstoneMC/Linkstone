package net.minecraft.server;

import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.craftbukkit.event.CraftEventFactory;
import org.bukkit.event.Event;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

// CraftBukkit end
public class PlayerInteractManager {

    public World world;

    public EntityPlayer player;

    private EnumGamemode gamemode;

    private boolean d;

    private int lastDigTick;

    private BlockPosition f;

    private int currentTick;

    private boolean h;

    private BlockPosition i;

    private int j;

    private int k;

    public PlayerInteractManager(World world) {
    }

    public void setGameMode(EnumGamemode enumgamemode) {
    }

    public EnumGamemode getGameMode() {
        return null;
    }

    public boolean c() {
        return false;
    }

    public boolean isCreative() {
        return false;
    }

    public void b(EnumGamemode enumgamemode) {
    }

    public void a() {
    }

    public void a(BlockPosition blockposition, EnumDirection enumdirection) {
    }

    public void a(BlockPosition blockposition) {
    }

    public void e() {
    }

    private boolean c(BlockPosition blockposition) {
        return false;
    }

    public boolean breakBlock(BlockPosition blockposition) {
        return false;
    }

    public EnumInteractionResult a(EntityHuman entityhuman, World world, ItemStack itemstack, EnumHand enumhand) {
        return null;
    }

    // CraftBukkit start
    public boolean interactResult;

    public boolean firedInteract;

    // CraftBukkit end
    public EnumInteractionResult a(EntityHuman entityhuman, World world, @Nullable ItemStack itemstack, EnumHand enumhand, BlockPosition blockposition, EnumDirection enumdirection, float f, float f1, float f2) {
        return null;
    }

    public void a(WorldServer worldserver) {
    }
}
