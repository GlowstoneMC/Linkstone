package net.minecraft.server;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class WhiteListEntry extends JsonListEntry<GameProfile> {

    public WhiteListEntry(GameProfile gameprofile) {
    }

    public WhiteListEntry(JsonObject jsonobject) {
    }

    protected void a(JsonObject jsonobject) {
    }

    private static GameProfile b(JsonObject jsonobject) {
        return null;
    }
}
