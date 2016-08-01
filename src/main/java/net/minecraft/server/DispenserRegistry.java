package net.minecraft.server;

import com.mojang.authlib.GameProfile;
import java.io.PrintStream;
import java.util.Random;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
// CraftBukkit start
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.event.block.BlockDispenseEvent;

// CraftBukkit end
public class DispenserRegistry {

    public static final PrintStream a;

    private static boolean b;

    private static final Logger c;

    public static boolean a() {
        return false;
    }

    static void b() {
    }

    public static void c() {
    }

    private static void d() {
    }

    public static class a extends DispenseBehaviorItem {

        private final DispenseBehaviorItem b;

        private final EntityBoat.EnumBoatType c;

        public a(EntityBoat.EnumBoatType entityboat_enumboattype) {
        }

        public ItemStack b(ISourceBlock isourceblock, ItemStack itemstack) {
            return null;
        }

        protected void a(ISourceBlock isourceblock) {
        }
    }
}
