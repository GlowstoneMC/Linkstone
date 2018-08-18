package com.mojang.authlib;

import com.mojang.authlib.properties.PropertyMap;

import net.glowstone.entity.meta.profile.GlowPlayerProfile;
import net.glowstone.linkstone.annotations.LBox;
import net.glowstone.linkstone.annotations.LBoxed;
import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LMethod;
import net.glowstone.linkstone.annotations.Version;

import java.util.UUID;

@LBox(GlowPlayerProfile.class)
@LClassfile(version = Version.V1_12_R1)
public class GameProfile {
    @LBoxed
    public GlowPlayerProfile glow;

    public GameProfile(GlowPlayerProfile glow) {
        this.glow = glow;
    }

    @LMethod(version = Version.V1_12_R1)
    public UUID getId() {
        return this.glow.getId();
    }

    @LMethod(version = Version.V1_12_R1)
    public String getName() {
        return this.glow.getName();
    }

    @LMethod(version = Version.V1_12_R1)
    public PropertyMap getProperties() {
        return new PropertyMap(glow);
    }

    @LMethod(version = Version.V1_12_R1)
    public boolean isComplete() {
        return glow.isComplete();
    }

    @LMethod(version = Version.V1_12_R1)
    public boolean isLegacy() {
        return false;
    }
}