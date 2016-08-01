package net.minecraft.server;

import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import javax.annotation.Nullable;

public class CommandPardonIP extends CommandAbstract {

    public CommandPardonIP() {
    }

    public String getCommand() {
        return null;
    }

    public int a() {
        return 0;
    }

    public boolean canUse(MinecraftServer minecraftserver, ICommandListener icommandlistener) {
        return false;
    }

    public String getUsage(ICommandListener icommandlistener) {
        return null;
    }

    public void execute(MinecraftServer minecraftserver, ICommandListener icommandlistener, String[] astring) throws CommandException {
    }

    public List<String> tabComplete(MinecraftServer minecraftserver, ICommandListener icommandlistener, String[] astring, @Nullable BlockPosition blockposition) {
        return null;
    }
}
