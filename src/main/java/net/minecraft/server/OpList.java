package net.minecraft.server;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.util.Iterator;

public class OpList extends JsonList<GameProfile, OpListEntry> {

    public OpList(File file) {
    }

    protected JsonListEntry<GameProfile> a(JsonObject jsonobject) {
        return null;
    }

    public String[] getEntries() {
        return null;
    }

    public int a(GameProfile gameprofile) {
        return 0;
    }

    public boolean b(GameProfile gameprofile) {
        return false;
    }

    protected String c(GameProfile gameprofile) {
        return null;
    }

    public GameProfile a(String s) {
        return null;
    }

    protected String a(Object object) {
        return null;
    }
}
