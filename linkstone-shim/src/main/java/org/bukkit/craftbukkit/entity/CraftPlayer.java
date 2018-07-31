package org.bukkit.craftbukkit.entity;

import net.glowstone.linkstone.Linkstone;
import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LDelegate;
import org.bukkit.configuration.serialization.DelegateDeserialization;
import com.mojang.authlib.GameProfile;

import net.glowstone.GlowOfflinePlayer;
import net.glowstone.entity.GlowPlayer;
import net.minecraft.server.EntityPlayer;
import org.bukkit.entity.Player;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
@DelegateDeserialization(GlowOfflinePlayer.class)
public class CraftPlayer extends CraftHumanEntity {
    @LDelegate(Player.class)
    private GlowPlayer base;

    private EntityPlayer nmsCache;

    public CraftPlayer(GlowPlayer p) {
        super(p);
        this.base = p;
    }

    public GameProfile getProfile() {
        return getHandle().getProfile();
    }

    public EntityPlayer getHandle() {
        return Linkstone.box(this);
    }
}
