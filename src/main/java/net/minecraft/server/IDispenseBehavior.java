package net.minecraft.server;

public interface IDispenseBehavior {

    IDispenseBehavior NONE;

    ItemStack a(ISourceBlock isourceblock, ItemStack itemstack) {
        return null;
    }
}
