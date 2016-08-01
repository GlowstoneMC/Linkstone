package net.minecraft.server;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class OpListEntry extends JsonListEntry<GameProfile> {

    private final int a = 0;

    private final boolean b = false;

    public OpListEntry(GameProfile gameprofile, int i, boolean flag) {
    }

    public OpListEntry(JsonObject jsonobject) {
    }

    public int a() {
        return 0;
    }

    public boolean b() {
        return false;
    }

    protected void a(JsonObject jsonobject) {
    }

    private static GameProfile b(JsonObject jsonobject) {
        return null;
    }
}
