package net.minecraft.server;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.Date;
import java.util.UUID;

public class GameProfileBanEntry extends ExpirableListEntry<GameProfile> {

    public GameProfileBanEntry(GameProfile gameprofile) {
    }

    public GameProfileBanEntry(GameProfile gameprofile, Date date, String s, Date date1, String s1) {
    }

    public GameProfileBanEntry(JsonObject jsonobject) {
    }

    protected void a(JsonObject jsonobject) {
    }

    private static GameProfile b(JsonObject jsonobject) {
        return null;
    }
}
