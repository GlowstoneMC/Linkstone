package net.minecraft.server;

public interface IDispenseBehavior {

    IDispenseBehavior NONE = null;

    ItemStack a(ISourceBlock isourceblock, ItemStack itemstack) {
        return null;
    }
}
