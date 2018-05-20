package org.bukkit.craftbukkit.util.permissions;

import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionDefault;
import org.bukkit.util.permissions.DefaultPermissions;

public final class CraftDefaultPermissions {
    private CraftDefaultPermissions() {}

    public static void registerCorePermissions() {
        Permission parent = DefaultPermissions.registerPermission("minecraft", "Gives the user the ability to use all vanilla utilities and commands");
        CommandPermissions.registerPermissions(parent);
        parent.recalculatePermissibles();
    }
}
