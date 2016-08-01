package net.minecraft.server;

public class CommandSeed extends CommandAbstract {

    public CommandSeed() {
    }

    public boolean canUse(MinecraftServer minecraftserver, ICommandListener icommandlistener) {
        return false;
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
}
