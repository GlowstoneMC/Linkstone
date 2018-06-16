package net.minecraft.server;

import org.bukkit.GameMode;

import com.mojang.authlib.GameProfile;

import net.glowstone.entity.GlowPlayer;

// 1_12_2_R1
public class EntityPlayer extends EntityHuman {
    public GlowPlayer glowPlayer;
    public PlayerConnection playerConnection;

    public EntityPlayer(GlowPlayer p) {
        this.glowPlayer = p;
    }

    public GameProfile getProfile() {
        return new GameProfile(glowPlayer.getProfile());
    }

    public int getViewDistance() {
        return glowPlayer.getViewDistance();
    }

    public void setViewDistance(int arg0) {
        glowPlayer.setViewDistance(arg0);
    }

    @Override
    public boolean isSpectator() {
        return glowPlayer.getGameMode() == GameMode.SPECTATOR;
    }

    @Override
    public boolean z() { // isCreative
        return glowPlayer.getGameMode() == GameMode.CREATIVE;
    }
}