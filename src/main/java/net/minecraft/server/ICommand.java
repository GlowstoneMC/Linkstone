package net.minecraft.server;

import java.util.List;
import javax.annotation.Nullable;

public interface ICommand extends Comparable<ICommand> {

    String getCommand() {
        return null;
    }

    String getUsage(ICommandListener icommandlistener) {
        return null;
    }

    List<String> b() {
        return null;
    }

    void execute(MinecraftServer minecraftserver, ICommandListener icommandlistener, String[] astring) throws CommandException {
    }

    boolean canUse(MinecraftServer minecraftserver, ICommandListener icommandlistener) {
        return false;
    }

    List<String> tabComplete(MinecraftServer minecraftserver, ICommandListener icommandlistener, String[] astring, @Nullable BlockPosition blockposition) {
        return null;
    }

    boolean isListStart(String[] astring, int i) {
        return false;
    }
}
