package net.glowstone.linkstone;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @deprecated Linkstone as a plugin won't work due to downcasting not allowed
 * 			   "GlowPlayer cannot be cast to CraftPlayer"
 */
@Deprecated
public class LinkPlugin extends JavaPlugin {
	@Override
	public void onEnable() {
		boolean isGlowstone = true;
		if (!isGlowstone) {
			// TODO
		}

		getLogger().info("Running Linkstone. API version: 1_12_2");	
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("linkstonetest")) {
			// Tests
			CraftPlayer testplr = ((CraftPlayer)((Player) sender));
			testplr.sendMessage("CraftPlayer wrapped sender name return: " + testplr.getName());
		}
		
		return true;
	}
}
