package net.minecraft.server;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Nullable;

public class CommandClone extends CommandAbstract {

    public CommandClone() {
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

    static class CommandCloneStoredTileEntity {

        public final BlockPosition a = null;

        public final IBlockData b = null;

        public final NBTTagCompound c = null;

        public CommandCloneStoredTileEntity(BlockPosition blockposition, IBlockData iblockdata, NBTTagCompound nbttagcompound) {
        }
    }
}
