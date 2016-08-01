package net.minecraft.server;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.util.Iterator;

public class GameProfileBanList extends JsonList<GameProfile, GameProfileBanEntry> {

    public GameProfileBanList(File file) {
    }

    protected JsonListEntry<GameProfile> a(JsonObject jsonobject) {
        return null;
    }

    public boolean isBanned(GameProfile gameprofile) {
        return false;
    }

    public String[] getEntries() {
        return null;
    }

    protected String b(GameProfile gameprofile) {
        return null;
    }

    public GameProfile a(String s) {
        return null;
    }

    protected String a(Object object) {
        return null;
    }
}
