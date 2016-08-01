package net.minecraft.server;

import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class CommandTeleport extends CommandAbstract {

    public CommandTeleport() {
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

    private static void a(Entity entity, CommandAbstract.CommandNumber commandabstract_commandnumber, CommandAbstract.CommandNumber commandabstract_commandnumber1, CommandAbstract.CommandNumber commandabstract_commandnumber2, CommandAbstract.CommandNumber commandabstract_commandnumber3, CommandAbstract.CommandNumber commandabstract_commandnumber4) {
    }

    public List<String> tabComplete(MinecraftServer minecraftserver, ICommandListener icommandlistener, String[] astring, @Nullable BlockPosition blockposition) {
        return null;
    }

    public boolean isListStart(String[] astring, int i) {
        return false;
    }
}
