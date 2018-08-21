package net.minecraft.server;

import net.glowstone.entity.GlowPlayer;
import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LGenerate;
import net.glowstone.linkstone.annotations.LMethod;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class PlayerInteractManager {
    @LGenerate
    @LField(version = V1_12_R1)
    public EntityPlayer player;

    public PlayerInteractManager(EntityPlayer player) {
        this.player = player;
    }

    @LMethod(version = V1_12_R1)
    public EnumGamemode getGameMode() {
        return EnumGamemode.fromGlowstone(player.glow.getGameMode());
    }

    @LMethod(version = V1_12_R1)
    public void setGameMode(EnumGamemode gameMode) {
        player.glow.setGameMode(EnumGamemode.toGlowstone(gameMode));
    }

    @LMethod(version = V1_12_R1, name = "b")
    public void setGameMode2(EnumGamemode gameMode) {
        setGameMode(gameMode);
    }

}
