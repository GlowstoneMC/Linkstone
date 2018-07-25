package com.mojang.authlib;

import com.mojang.authlib.properties.PropertyMap;

import net.glowstone.entity.meta.profile.GlowPlayerProfile;

import java.util.UUID;

public class GameProfile {
    private final UUID id;
    private final String name;
    private final PropertyMap properties = new PropertyMap();

    public GlowPlayerProfile g;

    public GameProfile(GlowPlayerProfile g) {
        this.id = g.getId();
        this.name = g.getName();
        this.g = g;
    }

    public GameProfile(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public PropertyMap getProperties() {
        g.getProperties();
        return this.properties;
    }

    public boolean isComplete() {
        return g.isComplete();
    }

    public boolean equals(Object o) {
        return g.equals(((GameProfile)o).g);
    }

    public int hashCode() {
        return g.hashCode();
    }

    public String toString() {
        return g.toString();
    }

    public boolean isLegacy() {
        return false;
    }
}