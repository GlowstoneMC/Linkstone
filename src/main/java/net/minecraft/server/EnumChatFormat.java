package net.minecraft.server;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public enum EnumChatFormat {

    BLACK("BLACK", '0', 0), DARK_BLUE("DARK_BLUE", '1', 1), DARK_GREEN("DARK_GREEN", '2', 2), DARK_AQUA("DARK_AQUA", '3', 3), DARK_RED("DARK_RED", '4', 4), DARK_PURPLE("DARK_PURPLE", '5', 5), GOLD("GOLD", '6', 6), GRAY("GRAY", '7', 7), DARK_GRAY("DARK_GRAY", '8', 8), BLUE("BLUE", '9', 9), GREEN("GREEN", 'a', 10), AQUA("AQUA", 'b', 11), RED("RED", 'c', 12), LIGHT_PURPLE("LIGHT_PURPLE", 'd', 13), YELLOW("YELLOW", 'e', 14), WHITE("WHITE", 'f', 15), OBFUSCATED("OBFUSCATED", 'k', true), BOLD("BOLD", 'l', true), STRIKETHROUGH("STRIKETHROUGH", 'm', true), UNDERLINE("UNDERLINE", 'n', true), ITALIC("ITALIC", 'o', true), RESET("RESET", 'r', -1);

    private static final Map<String, EnumChatFormat> w;

    private static final Pattern x;

    private final String y;

    private final char z;

    private final boolean A;

    private final String B;

    private final int C;

    private static String c(String s) {
        return null;
    }

    private EnumChatFormat(String s, char c0, int i) {
    }

    private EnumChatFormat(String s, char c0, boolean flag) {
    }

    private EnumChatFormat(String s, char c0, boolean flag, int i) {
    }

    public int b() {
        return 0;
    }

    public boolean isFormat() {
        return false;
    }

    public boolean d() {
        return false;
    }

    public String e() {
        return null;
    }

    public String toString() {
        return null;
    }

    @Nullable
    public static String a(@Nullable String s) {
        return null;
    }

    @Nullable
    public static EnumChatFormat b(@Nullable String s) {
        return null;
    }

    @Nullable
    public static EnumChatFormat a(int i) {
        return null;
    }

    public static Collection<String> a(boolean flag, boolean flag1) {
        return null;
    }

    static {
    }
}
