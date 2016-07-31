package net.minecraft.server;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class CommandGamerule extends CommandAbstract {

    public CommandGamerule() {
    }

    public String getCommand() {
        return null;
    }

    public int a() {
        return 0;
    }

    public String getUsage(ICommandListener icommandlistener) {
        return null;
    }

    public void execute(MinecraftServer minecraftserver, ICommandListener icommandlistener, String[] astring) throws CommandException {
    }

    public static void a(GameRules gamerules, String s, MinecraftServer minecraftserver) {
    }

    public List<String> tabComplete(MinecraftServer minecraftserver, ICommandListener icommandlistener, String[] astring, @Nullable BlockPosition blockposition) {
        return null;
    }

    private GameRules a(MinecraftServer minecraftserver) {
        return null;
    }

    // CraftBukkit start - fix decompile error
    @Override
    public int compareTo(ICommand o) {
        return 0;
    }
    // CraftBukkit end
}
