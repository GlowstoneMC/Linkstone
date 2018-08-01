package net.minecraft.server;

import com.mojang.authlib.GameProfile;
import net.glowstone.entity.GlowHumanEntity;
import net.glowstone.linkstone.annotations.LBox;
import net.glowstone.linkstone.annotations.LBoxed;
import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LMethod;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LBox(GlowHumanEntity.class)
@LClassfile(version = V1_12_R1)
public abstract class EntityHuman extends EntityLiving {
    @LBoxed
    private GlowHumanEntity glow;

    public EntityHuman(GlowHumanEntity glow) {
        this.glow = glow;
    }

    @LMethod(version = V1_12_R1)
    public GameProfile getProfile() {
        return new GameProfile(glow.getProfile());
    }

    @LMethod(version = V1_12_R1)
    public abstract boolean isSpectator();

    @LMethod(version = V1_12_R1, name = "z")
    public abstract boolean isCreative();

}
