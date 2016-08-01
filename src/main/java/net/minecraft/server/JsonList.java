package net.minecraft.server;

import com.google.common.base.Charsets;
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
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JsonList<K, V extends JsonListEntry<K>> {

    protected static final Logger a = null;

    protected final Gson b = null;

    private final File c = null;

    private final Map<String, V> d = null;

    private boolean e = false;

    private static final ParameterizedType f = null;

    public JsonList(File file) {
    }

    public boolean isEnabled() {
        return false;
    }

    public void a(boolean flag) {
    }

    public File c() {
        return null;
    }

    public void add(V v0) {
    }

    public V get(K k0) {
        return null;
    }

    public void remove(K k0) {
    }

    public String[] getEntries() {
        return null;
    }

    // CraftBukkit start
    public Collection<V> getValues() {
        return null;
    }

    // CraftBukkit end
    public boolean isEmpty() {
        return false;
    }

    protected String a(K k0) {
        return null;
    }

    protected boolean d(K k0) {
        return false;
    }

    private void h() {
    }

    protected JsonListEntry<K> a(JsonObject jsonobject) {
        return null;
    }

    protected Map<String, V> e() {
        return null;
    }

    public void save() throws IOException {
    }

    public void load() throws FileNotFoundException {
    }

    class JsonListEntrySerializer implements JsonDeserializer<JsonListEntry<K>>, JsonSerializer<JsonListEntry<K>> {

        private JsonListEntrySerializer() {
        }

        public JsonElement a(JsonListEntry<K> jsonlistentry, Type type, JsonSerializationContext jsonserializationcontext) {
            return null;
        }

        public JsonListEntry<K> a(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext) throws JsonParseException {
            return null;
        }

        public JsonElement serialize(JsonListEntry<K> object, Type type, JsonSerializationContext jsonserializationcontext) {
            return null;
        }

        public JsonListEntry<K> deserialize(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext) throws JsonParseException {
            return null;
        }

        JsonListEntrySerializer(Object object) {
        }
    }
}
