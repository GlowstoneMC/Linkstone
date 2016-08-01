package net.minecraft.server;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

public class CommandTell extends CommandAbstract {

    public CommandTell() {
    }

    public List<String> b() {
        return null;
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

    public List<String> tabComplete(MinecraftServer minecraftserver, ICommandListener icommandlistener, String[] astring, @Nullable BlockPosition blockposition) {
        return null;
    }

    public boolean isListStart(String[] astring, int i) {
        return false;
    }
}
