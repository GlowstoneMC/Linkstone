package net.minecraft.server;

import java.util.UUID;

public class CommandEntityData extends CommandAbstract {

    public CommandEntityData() {
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

    public boolean isListStart(String[] astring, int i) {
        return false;
    }
}
