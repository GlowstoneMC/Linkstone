package net.minecraft.server;

import com.google.common.collect.Maps;
import java.util.Map;

public class ChatHoverable {

    private final ChatHoverable.EnumHoverAction a = null;

    private final IChatBaseComponent b = null;

    public ChatHoverable(ChatHoverable.EnumHoverAction chathoverable_enumhoveraction, IChatBaseComponent ichatbasecomponent) {
    }

    public ChatHoverable.EnumHoverAction a() {
        return null;
    }

    public IChatBaseComponent b() {
        return null;
    }

    public boolean equals(Object object) {
        return false;
    }

    public String toString() {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public static enum EnumHoverAction {

        SHOW_TEXT("show_text", true), SHOW_ACHIEVEMENT("show_achievement", true), SHOW_ITEM("show_item", true), SHOW_ENTITY("show_entity", true);

        private static final Map<String, ChatHoverable.EnumHoverAction> e = null;

        private final boolean f = false;

        private final String g = null;

        private EnumHoverAction(String s, boolean flag) {
        }

        public boolean a() {
            return false;
        }

        public String b() {
            return null;
        }

        public static ChatHoverable.EnumHoverAction a(String s) {
            return null;
        }

        static {
        }
    }
}
