# Linkstone
Bridging the gap between CraftBukkit and [Glowstone](https://glowstone.net).

## What is Linkstone
Linkstone is a project with the goal to bridge plugins using **Mojang-dependant** code, as well as **CraftBukkit and Spigot** dependencies. The long-run goal is to allow plugins to use packages such as `net.minecraft.server.*` and `org.bukkit.craftbukkit.*` on a Glowstone server.

To achieve this, stub-code is generated to contain the same method, fields, constructors and classes from these packages, without containing any functional code; the different components have to be filled manually in order to ensure their functionality with Glowstone.

# Builds
Linkstone right now isn't fully functional right now, so if you're looking for a jar for your server than come back later when it's released.
But, if you want to test Linkstone a precompiled jar will be at https://files.zunozap.com/linkstone/linkstone.jar but it is best to compile your self for the latest changes.