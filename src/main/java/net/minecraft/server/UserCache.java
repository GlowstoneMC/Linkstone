package net.minecraft.server;

import com.google.common.base.Charsets;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.ProfileLookupCallback;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;

public class UserCache {

    public static final SimpleDateFormat a;

    private static boolean c;

    private final Map<String, UserCache.UserCacheEntry> d;

    private final Map<UUID, UserCache.UserCacheEntry> e;

    private final Deque<GameProfile> f;

    // CraftBukkit
    private final GameProfileRepository g;

    protected final Gson b;

    private final File h;

    private static final ParameterizedType i;

    public UserCache(GameProfileRepository gameprofilerepository, File file) {
    }

    private static GameProfile a(GameProfileRepository gameprofilerepository, String s) {
        return null;
    }

    public static void a(boolean flag) {
    }

    private static boolean d() {
        return false;
    }

    public void a(GameProfile gameprofile) {
    }

    private void a(GameProfile gameprofile, Date date) {
    }

    @Nullable
    public GameProfile getProfile(String s) {
        return null;
    }

    public String[] a() {
        return null;
    }

    @Nullable
    public GameProfile a(UUID uuid) {
        return null;
    }

    private UserCache.UserCacheEntry b(UUID uuid) {
        return null;
    }

    public void b() {
    }

    public void c() {
    }

    private List<UserCache.UserCacheEntry> a(int i) {
        return null;
    }

    class UserCacheEntry {

        private final GameProfile b;

        private final Date c;

        private UserCacheEntry(GameProfile gameprofile, Date date) {
        }

        public GameProfile a() {
            return null;
        }

        public Date b() {
            return null;
        }

        UserCacheEntry(GameProfile gameprofile, Date date, Object object) {
        }
    }

    class BanEntrySerializer implements JsonDeserializer<UserCache.UserCacheEntry>, JsonSerializer<UserCache.UserCacheEntry> {

        private BanEntrySerializer() {
        }

        public JsonElement a(UserCache.UserCacheEntry usercache_usercacheentry, Type type, JsonSerializationContext jsonserializationcontext) {
            return null;
        }

        public UserCache.UserCacheEntry a(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext) throws JsonParseException {
            return null;
        }

        public JsonElement serialize(UserCacheEntry object, Type type, JsonSerializationContext jsonserializationcontext) {
            return null;
        }

        public UserCacheEntry deserialize(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext) throws JsonParseException {
            return null;
        }

        BanEntrySerializer(Object object) {
        }
    }
}
