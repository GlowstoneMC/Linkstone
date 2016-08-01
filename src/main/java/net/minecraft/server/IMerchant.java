package net.minecraft.server;

public interface IMerchant {

    void setTradingPlayer(EntityHuman entityhuman) {
    }

    EntityHuman getTrader() {
        return null;
    }

    MerchantRecipeList getOffers(EntityHuman entityhuman) {
        return null;
    }

    void a(MerchantRecipe merchantrecipe) {
    }

    void a(ItemStack itemstack) {
    }

    IChatBaseComponent getScoreboardDisplayName() {
        return null;
    }
}
