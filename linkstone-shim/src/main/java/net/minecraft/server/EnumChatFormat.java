package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.md_5.bungee.api.ChatColor;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public enum EnumChatFormat {
    BLACK,
    DARK_BLUE,
    DARK_GREEN,
    DARK_AQUA,
    DARK_RED,
    DARK_PURPLE,
    GOLD,
    GRAY,
    DARK_GRAY,
    BLUE,
    GREEN,
    AQUA,
    RED,
    LIGHT_PURPLE,
    YELLOW,
    WHITE,
    OBFUSCATED,
    BOLD,
    STRIKETHROUGH,
    UNDERLINE,
    ITALIC,
    RESET;

    public static ChatColor toGlowstone(EnumChatFormat color) {
        if(color == null) {
            return null;
        }
        switch (color) {
            case BLACK: return ChatColor.BLACK;
            case DARK_BLUE: return ChatColor.DARK_BLUE;
            case DARK_GREEN: return ChatColor.DARK_GREEN;
            case DARK_AQUA: return ChatColor.DARK_AQUA;
            case DARK_RED: return ChatColor.DARK_RED;
            case DARK_PURPLE: return ChatColor.DARK_PURPLE;
            case GOLD: return ChatColor.GOLD;
            case GRAY: return ChatColor.GRAY;
            case DARK_GRAY: return ChatColor.DARK_GRAY;
            case BLUE: return ChatColor.BLUE;
            case GREEN: return ChatColor.GREEN;
            case AQUA: return ChatColor.AQUA;
            case RED: return ChatColor.RED;
            case LIGHT_PURPLE: return ChatColor.LIGHT_PURPLE;
            case YELLOW: return ChatColor.YELLOW;
            case WHITE: return ChatColor.WHITE;
            case OBFUSCATED: return ChatColor.MAGIC;
            case BOLD: return ChatColor.BOLD;
            case STRIKETHROUGH: return ChatColor.STRIKETHROUGH;
            case UNDERLINE: return ChatColor.UNDERLINE;
            case ITALIC: return ChatColor.ITALIC;
            case RESET: return ChatColor.RESET;
            default: throw new AssertionError();
        }
    }
}
