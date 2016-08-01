package net.minecraft.server;

import com.google.common.collect.Maps;
import java.util.Map;

public class ChatClickable {

    private final ChatClickable.EnumClickAction a = null;

    private final String b = null;

    public ChatClickable(ChatClickable.EnumClickAction chatclickable_enumclickaction, String s) {
    }

    public ChatClickable.EnumClickAction a() {
        return null;
    }

    public String b() {
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

    public static enum EnumClickAction {

        OPEN_URL("open_url", true), OPEN_FILE("open_file", false), RUN_COMMAND("run_command", true), SUGGEST_COMMAND("suggest_command", true), CHANGE_PAGE("change_page", true);

        private static final Map<String, ChatClickable.EnumClickAction> f = null;

        private final boolean g = false;

        private final String h = null;

        private EnumClickAction(String s, boolean flag) {
        }

        public boolean a() {
            return false;
        }

        public String b() {
            return null;
        }

        public static ChatClickable.EnumClickAction a(String s) {
            return null;
        }

        static {
        }
    }
}
