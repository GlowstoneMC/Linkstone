package com.mojang.authlib.properties;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import com.destroystokyo.paper.profile.ProfileProperty;
import com.google.common.collect.ForwardingMultimap;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multiset;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import net.glowstone.entity.meta.profile.GlowPlayerProfile;
import net.glowstone.linkstone.Linkstone;
import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.Version;

import javax.annotation.Nullable;

@LClassfile(version = Version.V1_12_R1)
public class PropertyMap extends ForwardingMultimap<String, Property> {
    private final Multimap<String, Property> propertyMap;

    public PropertyMap() {
        this.propertyMap = LinkedHashMultimap.create();
    }

    public PropertyMap(GlowPlayerProfile glow) {
        this.propertyMap = new GlowPlayerProfileMultimapAdapter(glow);
    }

    @Override
    protected Multimap<String, Property> delegate() {
        return propertyMap;
    }

    @LClassfile(version = Version.V1_12_R1)
    public static class Serializer implements JsonSerializer<PropertyMap>, JsonDeserializer<PropertyMap> {
        @Override
        public PropertyMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            PropertyMap map = new PropertyMap();
            if (json.isJsonArray()) {
                json.getAsJsonArray().forEach(element -> {
                    if (element.isJsonObject()) {
                        JsonObject obj = element.getAsJsonObject();
                        String name = obj.get("name").getAsString();
                        String value = obj.get("value").getAsString();
                        Property property = obj.has("signature") ?
                                new Property(name, value, obj.get("signature").getAsString()) :
                                new Property(name, value);
                        map.put(property.getName(), property);
                    }
                });
            } else if(json.isJsonObject()) {
                for (Map.Entry<String, JsonElement> entry : json.getAsJsonObject().entrySet()) {
                    JsonElement elem = entry.getValue();
                    if (elem.isJsonPrimitive()) {
                        map.put(entry.getKey(), new Property(entry.getKey(), elem.getAsString()));
                    } else if (elem.isJsonArray()) {
                        elem.getAsJsonArray().forEach(value -> {
                            map.put(entry.getKey(), new Property(entry.getKey(), value.getAsString()));
                        });
                    }
                }
            }
            return map;
        }

        @Override
        public JsonElement serialize(PropertyMap src, Type typeOfSrc, JsonSerializationContext context) {
            JsonArray array = new JsonArray();
            src.forEach((key, property) -> {
                JsonObject object = new JsonObject();

                object.addProperty("name", property.getName());
                object.addProperty("value", property.getValue());
                if (property.hasSignature()) {
                    object.addProperty("signature", property.getSignature());
                }

                array.add(object);
            });
            return array;
        }
    }
}
