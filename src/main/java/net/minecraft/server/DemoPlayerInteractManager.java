package net.minecraft.server;

import javax.annotation.Nullable;

public class DemoPlayerInteractManager extends PlayerInteractManager {

    private boolean c = false;

    private boolean d = false;

    private int e = 0;

    private int f = 0;

    public DemoPlayerInteractManager(World world) {
    }

    public void a() {
    }

    private void f() {
    }

    public void a(BlockPosition blockposition, EnumDirection enumdirection) {
    }

    public void a(BlockPosition blockposition) {
    }

    public boolean breakBlock(BlockPosition blockposition) {
        return false;
    }

    public EnumInteractionResult a(EntityHuman entityhuman, World world, ItemStack itemstack, EnumHand enumhand) {
        return null;
    }

    public EnumInteractionResult a(EntityHuman entityhuman, World world, @Nullable ItemStack itemstack, EnumHand enumhand, BlockPosition blockposition, EnumDirection enumdirection, float f, float f1, float f2) {
        return null;
    }
}
