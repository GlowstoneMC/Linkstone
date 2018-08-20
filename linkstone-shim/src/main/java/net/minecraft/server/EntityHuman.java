package net.minecraft.server;

import com.mojang.authlib.GameProfile;
import net.glowstone.entity.GlowHumanEntity;
import net.glowstone.linkstone.Linkstone;
import net.glowstone.linkstone.annotations.LBox;
import net.glowstone.linkstone.annotations.LBoxed;
import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LMethod;
import net.glowstone.linkstone.annotations.LOverride;
import org.bukkit.craftbukkit.entity.CraftHumanEntity;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LBox(GlowHumanEntity.class)
@LClassfile(version = V1_12_R1)
public abstract class EntityHuman extends EntityLiving {
    @LBoxed
    public final GlowHumanEntity glow;

    public EntityHuman(GlowHumanEntity glow) {
        super(glow);
        this.glow = glow;
    }

    @LMethod(version = V1_12_R1)
    public GameProfile getProfile() {
        return Linkstone.box(glow.getProfile());
    }

    @LMethod(version = V1_12_R1)
    public abstract boolean isSpectator();

    @LMethod(version = V1_12_R1, name = "z")
    public abstract boolean isCreative();

    @Override
    @LOverride
    public CraftHumanEntity getBukkitEntity() {
        return Linkstone.box(glow);
    }
}
