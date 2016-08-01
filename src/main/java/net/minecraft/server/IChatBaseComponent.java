package net.minecraft.server;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public interface IChatBaseComponent extends Iterable<IChatBaseComponent> {

    IChatBaseComponent setChatModifier(ChatModifier chatmodifier) {
        return null;
    }

    ChatModifier getChatModifier() {
        return null;
    }

    IChatBaseComponent a(String s) {
        return null;
    }

    IChatBaseComponent addSibling(IChatBaseComponent ichatbasecomponent) {
        return null;
    }

    String getText() {
        return null;
    }

    String toPlainText() {
        return null;
    }

    List<IChatBaseComponent> a() {
        return null;
    }

    IChatBaseComponent f() {
        return null;
    }

    public static class ChatSerializer implements JsonDeserializer<IChatBaseComponent>, JsonSerializer<IChatBaseComponent> {

        private static final Gson a;

        public ChatSerializer() {
        }

        public IChatBaseComponent a(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext) throws JsonParseException {
            return null;
        }

        private void a(ChatModifier chatmodifier, JsonObject jsonobject, JsonSerializationContext jsonserializationcontext) {
        }

        public JsonElement a(IChatBaseComponent ichatbasecomponent, Type type, JsonSerializationContext jsonserializationcontext) {
            return null;
        }

        public static String a(IChatBaseComponent ichatbasecomponent) {
            return null;
        }

        public static IChatBaseComponent a(String s) {
            return null;
        }

        public static IChatBaseComponent b(String s) {
            return null;
        }

        public JsonElement serialize(Object object, Type type, JsonSerializationContext jsonserializationcontext) {
            return null;
        }

        public Object deserialize(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext) throws JsonParseException {
            return null;
        }

        static {
        }
    }
}
