package org.bukkit.craftbukkit.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.server.ChatClickable;
import net.minecraft.server.ChatComponentText;
import net.minecraft.server.ChatModifier;
import net.minecraft.server.EnumChatFormat;
import net.minecraft.server.ChatClickable.EnumClickAction;
import net.minecraft.server.IChatBaseComponent;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import net.minecraft.server.ChatMessage;

public final class CraftChatMessage {

    private static final Pattern LINK_PATTERN;

    private static class StringMessage {

        private static final Map<Character, EnumChatFormat> formatMap;

        private static final Pattern INCREMENTAL_PATTERN;

        static {
        }

        private final List<IChatBaseComponent> list;

        private IChatBaseComponent currentChatComponent;

        private ChatModifier modifier;

        private final IChatBaseComponent[] output;

        private int currentIndex;

        private final String message;

        private StringMessage(String message, boolean keepNewlines) {
        }

        private void appendNewComponent(int index) {
        }

        private IChatBaseComponent[] getOutput() {
            return null;
        }
    }

    public static IChatBaseComponent[] fromString(String message) {
        return null;
    }

    public static IChatBaseComponent[] fromString(String message, boolean keepNewlines) {
        return null;
    }

    public static String fromComponent(IChatBaseComponent component) {
        return null;
    }

    public static String fromComponent(IChatBaseComponent component, EnumChatFormat defaultColor) {
        return null;
    }

    public static IChatBaseComponent fixComponent(IChatBaseComponent component) {
        return null;
    }

    private static IChatBaseComponent fixComponent(IChatBaseComponent component, Matcher matcher) {
        return null;
    }

    private CraftChatMessage() {
    }
}
