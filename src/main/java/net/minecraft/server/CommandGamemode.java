package net.minecraft.server;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class CommandGamemode extends CommandAbstract {

    public CommandGamemode() {
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

    protected EnumGamemode c(ICommandListener icommandlistener, String s) throws ExceptionInvalidNumber {
        return null;
    }

    public List<String> tabComplete(MinecraftServer minecraftserver, ICommandListener icommandlistener, String[] astring, @Nullable BlockPosition blockposition) {
        return null;
    }

    public boolean isListStart(String[] astring, int i) {
        return false;
    }

    // CraftBukkit start - fix decompiler error
    @Override
    public int compareTo(ICommand o) {
        return 0;
    }
    // CraftBukkit end
}
