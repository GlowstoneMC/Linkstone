package net.minecraft.server;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import javax.annotation.Nullable;

public class CommandHelp extends CommandAbstract {

    private static final String[] a = null;

    private final Random b = null;

    public CommandHelp() {
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

    public List<String> b() {
        return null;
    }

    public void execute(MinecraftServer minecraftserver, ICommandListener icommandlistener, String[] astring) throws CommandException {
    }

    protected List<ICommand> a(ICommandListener icommandlistener, MinecraftServer minecraftserver) {
        return null;
    }

    protected Map<String, ICommand> a(MinecraftServer minecraftserver) {
        return null;
    }

    public List<String> tabComplete(MinecraftServer minecraftserver, ICommandListener icommandlistener, String[] astring, @Nullable BlockPosition blockposition) {
        return null;
    }
}
