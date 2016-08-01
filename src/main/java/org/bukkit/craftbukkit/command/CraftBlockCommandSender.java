package org.bukkit.craftbukkit.command;

import net.minecraft.server.ICommandListener;
import net.minecraft.server.IChatBaseComponent;
import org.bukkit.block.Block;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.craftbukkit.util.CraftChatMessage;

/**
 * Represents input from a command block
 */
public class CraftBlockCommandSender extends ServerCommandSender implements BlockCommandSender {

    private final ICommandListener block = null;

    public CraftBlockCommandSender(ICommandListener commandBlockListenerAbstract) {
    }

    public Block getBlock() {
        return null;
    }

    public void sendMessage(String message) {
    }

    public void sendMessage(String[] messages) {
    }

    public String getName() {
        return null;
    }

    public boolean isOp() {
        return false;
    }

    public void setOp(boolean value) {
    }

    public ICommandListener getTileEntity() {
        return null;
    }
}
