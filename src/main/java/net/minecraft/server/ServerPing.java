package net.minecraft.server;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.authlib.GameProfile;
import java.lang.reflect.Type;
import java.util.UUID;

public class ServerPing {

    private IChatBaseComponent a = null;

    private ServerPing.ServerPingPlayerSample b = null;

    private ServerPing.ServerData c = null;

    private String d = null;

    public ServerPing() {
    }

    public IChatBaseComponent a() {
        return null;
    }

    public void setMOTD(IChatBaseComponent ichatbasecomponent) {
    }

    public ServerPing.ServerPingPlayerSample b() {
        return null;
    }

    public void setPlayerSample(ServerPing.ServerPingPlayerSample serverping_serverpingplayersample) {
    }

    public ServerPing.ServerData getServerData() {
        return null;
    }

    public void setServerInfo(ServerPing.ServerData serverping_serverdata) {
    }

    public void setFavicon(String s) {
    }

    public String d() {
        return null;
    }

    public static class Serializer implements JsonDeserializer<ServerPing>, JsonSerializer<ServerPing> {

        public Serializer() {
        }

        public ServerPing a(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext) throws JsonParseException {
            return null;
        }

        public JsonElement a(ServerPing serverping, Type type, JsonSerializationContext jsonserializationcontext) {
            return null;
        }

        public JsonElement serialize(Object object, Type type, JsonSerializationContext jsonserializationcontext) {
            return null;
        }

        public Object deserialize(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext) throws JsonParseException {
            return null;
        }
    }

    public static class ServerData {

        private final String a = null;

        private final int b = 0;

        public ServerData(String s, int i) {
        }

        public String a() {
            return null;
        }

        public int getProtocolVersion() {
            return 0;
        }

        public static class ServerData$Serializer implements JsonDeserializer<ServerPing.ServerData>, JsonSerializer<ServerPing.ServerData> {

            public ServerData$Serializer() {
            }

            public ServerPing.ServerData a(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext) throws JsonParseException {
                return null;
            }

            public JsonElement a(ServerPing.ServerData serverping_serverdata, Type type, JsonSerializationContext jsonserializationcontext) {
                return null;
            }

            public JsonElement serialize(Object object, Type type, JsonSerializationContext jsonserializationcontext) {
                return null;
            }

            public Object deserialize(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext) throws JsonParseException {
                return null;
            }
        }
    }

    public static class ServerPingPlayerSample {

        private final int a = 0;

        private final int b = 0;

        private GameProfile[] c = null;

        public ServerPingPlayerSample(int i, int j) {
        }

        public int a() {
            return 0;
        }

        public int b() {
            return 0;
        }

        public GameProfile[] c() {
            return null;
        }

        public void a(GameProfile[] agameprofile) {
        }

        public static class ServerPingPlayerSample$Serializer implements JsonDeserializer<ServerPing.ServerPingPlayerSample>, JsonSerializer<ServerPing.ServerPingPlayerSample> {

            public ServerPingPlayerSample$Serializer() {
            }

            public ServerPing.ServerPingPlayerSample a(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext) throws JsonParseException {
                return null;
            }

            public JsonElement a(ServerPing.ServerPingPlayerSample serverping_serverpingplayersample, Type type, JsonSerializationContext jsonserializationcontext) {
                return null;
            }

            public JsonElement serialize(Object object, Type type, JsonSerializationContext jsonserializationcontext) {
                return null;
            }

            public Object deserialize(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext) throws JsonParseException {
                return null;
            }
        }
    }
}
