package net.minecraft.server;

import com.google.gson.JsonObject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class ExpirableListEntry<T> extends JsonListEntry<T> {

    public static final SimpleDateFormat a;

    protected final Date b;

    protected final String c;

    protected final Date d;

    protected final String e;

    public ExpirableListEntry(T t0, Date date, String s, Date date1, String s1) {
    }

    protected ExpirableListEntry(T t0, JsonObject jsonobject) {
    }

    public Date getExpires() {
        return null;
    }

    public String getReason() {
        return null;
    }

    boolean hasExpired() {
        return false;
    }

    protected void a(JsonObject jsonobject) {
    }

    // CraftBukkit start
    public String getSource() {
        return null;
    }

    public Date getCreated() {
        return null;
    }

    private static <T> T checkExpiry(T object, JsonObject jsonobject) {
        return null;
    }
    // CraftBukkit end
}
