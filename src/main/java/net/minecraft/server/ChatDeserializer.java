package net.minecraft.server;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class ChatDeserializer {

    public static boolean a(JsonObject jsonobject, String s) {
        return false;
    }

    public static boolean b(JsonElement jsonelement) {
        return false;
    }

    public static boolean d(JsonObject jsonobject, String s) {
        return false;
    }

    public static boolean f(JsonObject jsonobject, String s) {
        return false;
    }

    public static boolean g(JsonObject jsonobject, String s) {
        return false;
    }

    public static String a(JsonElement jsonelement, String s) {
        return null;
    }

    public static String h(JsonObject jsonobject, String s) {
        return null;
    }

    public static Item b(JsonElement jsonelement, String s) {
        return null;
    }

    public static Item i(JsonObject jsonobject, String s) {
        return null;
    }

    public static boolean c(JsonElement jsonelement, String s) {
        return false;
    }

    public static boolean a(JsonObject jsonobject, String s, boolean flag) {
        return false;
    }

    public static float e(JsonElement jsonelement, String s) {
        return 0.0F;
    }

    public static float l(JsonObject jsonobject, String s) {
        return 0.0F;
    }

    public static float a(JsonObject jsonobject, String s, float f) {
        return 0.0F;
    }

    public static int g(JsonElement jsonelement, String s) {
        return 0;
    }

    public static int n(JsonObject jsonobject, String s) {
        return 0;
    }

    public static int a(JsonObject jsonobject, String s, int i) {
        return 0;
    }

    public static JsonObject m(JsonElement jsonelement, String s) {
        return null;
    }

    public static JsonObject t(JsonObject jsonobject, String s) {
        return null;
    }

    public static JsonArray n(JsonElement jsonelement, String s) {
        return null;
    }

    public static JsonArray u(JsonObject jsonobject, String s) {
        return null;
    }

    public static <T> T a(@Nullable JsonElement jsonelement, String s, JsonDeserializationContext jsondeserializationcontext, Class<? extends T> oclass) {
        return null;
    }

    public static <T> T a(JsonObject jsonobject, String s, JsonDeserializationContext jsondeserializationcontext, Class<? extends T> oclass) {
        return null;
    }

    public static <T> T a(JsonObject jsonobject, String s, T t0, JsonDeserializationContext jsondeserializationcontext, Class<? extends T> oclass) {
        return null;
    }

    public static String d(JsonElement jsonelement) {
        return null;
    }

    public static <T> T a(Gson gson, Reader reader, Class<T> oclass, boolean flag) {
        return null;
    }

    public static <T> T a(Gson gson, String s, Class<T> oclass) {
        return null;
    }

    public static <T> T a(Gson gson, String s, Class<T> oclass, boolean flag) {
        return null;
    }
}
