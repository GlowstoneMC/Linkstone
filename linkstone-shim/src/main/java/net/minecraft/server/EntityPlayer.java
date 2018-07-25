package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import org.bukkit.GameMode;

import com.mojang.authlib.GameProfile;

import net.glowstone.entity.GlowPlayer;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
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