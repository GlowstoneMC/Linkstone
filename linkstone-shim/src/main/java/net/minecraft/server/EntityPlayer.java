package net.minecraft.server;

import net.glowstone.linkstone.Linkstone;
import net.glowstone.linkstone.annotations.LBox;
import net.glowstone.linkstone.annotations.LBoxed;
import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LGenerate;
import net.glowstone.linkstone.annotations.LMethod;
import net.glowstone.linkstone.annotations.LOverride;
import org.bukkit.GameMode;

import net.glowstone.entity.GlowPlayer;
import org.bukkit.craftbukkit.entity.CraftPlayer;
import org.bukkit.entity.Player;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LBox(GlowPlayer.class)
@LClassfile(version = V1_12_R1)
public class EntityPlayer extends EntityHuman {
    @LBoxed
    public final GlowPlayer glow;

    @LGenerate
    @LField(version = V1_12_R1)
    public PlayerConnection playerConnection = new PlayerConnection(this);

    public EntityPlayer(GlowPlayer glow) {
        super(glow);
        this.glow = glow;
    }

    @Override
    @LOverride
    public boolean isSpectator() {
        return glow.getGameMode() == GameMode.SPECTATOR;
    }

    @Override
    @LOverride
    public boolean isCreative() {
        return glow.getGameMode() == GameMode.CREATIVE;
    }

    @LMethod(version = V1_12_R1)
    public CraftPlayer getBukkitEntity() {
        return Linkstone.box(glow);
    }
}
