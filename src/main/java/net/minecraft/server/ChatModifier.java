package net.minecraft.server;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public class ChatModifier {

    private ChatModifier a;

    private EnumChatFormat b;

    private Boolean c;

    private Boolean d;

    private Boolean e;

    private Boolean f;

    private Boolean g;

    private ChatClickable h;

    private ChatHoverable i;

    private String j;

    private static final ChatModifier k;

    public ChatModifier() {
    }

    @Nullable
    public EnumChatFormat getColor() {
        return null;
    }

    public boolean isBold() {
        return false;
    }

    public boolean isItalic() {
        return false;
    }

    public boolean isStrikethrough() {
        return false;
    }

    public boolean isUnderlined() {
        return false;
    }

    public boolean isRandom() {
        return false;
    }

    public boolean g() {
        return false;
    }

    @Nullable
    public ChatClickable h() {
        return null;
    }

    @Nullable
    public ChatHoverable i() {
        return null;
    }

    @Nullable
    public String j() {
        return null;
    }

    public ChatModifier setColor(EnumChatFormat enumchatformat) {
        return null;
    }

    public ChatModifier setBold(Boolean obool) {
        return null;
    }

    public ChatModifier setItalic(Boolean obool) {
        return null;
    }

    public ChatModifier setStrikethrough(Boolean obool) {
        return null;
    }

    public ChatModifier setUnderline(Boolean obool) {
        return null;
    }

    public ChatModifier setRandom(Boolean obool) {
        return null;
    }

    public ChatModifier setChatClickable(ChatClickable chatclickable) {
        return null;
    }

    public ChatModifier setChatHoverable(ChatHoverable chathoverable) {
        return null;
    }

    public ChatModifier setInsertion(String s) {
        return null;
    }

    public ChatModifier setChatModifier(ChatModifier chatmodifier) {
        return null;
    }

    private ChatModifier o() {
        return null;
    }

    public String toString() {
        return null;
    }

    public boolean equals(Object object) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public ChatModifier clone() {
        return null;
    }

    public ChatModifier n() {
        return null;
    }

    public static class ChatModifierSerializer implements JsonDeserializer<ChatModifier>, JsonSerializer<ChatModifier> {

        public ChatModifierSerializer() {
        }

        @Nullable
        public ChatModifier a(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext) throws JsonParseException {
            return null;
        }

        @Nullable
        public JsonElement a(ChatModifier chatmodifier, Type type, JsonSerializationContext jsonserializationcontext) {
            return null;
        }

        public JsonElement serialize(ChatModifier object, Type type, JsonSerializationContext jsonserializationcontext) {
            return null;
        }

        public ChatModifier deserialize(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext) throws JsonParseException {
            return null;
        }
    }
}
