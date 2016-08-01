package net.minecraft.server;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class CommandSpreadPlayers extends CommandAbstract {

    public CommandSpreadPlayers() {
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

    private void a(ICommandListener icommandlistener, List<Entity> list, CommandSpreadPlayers.Location2D commandspreadplayers_location2d, double d0, double d1, World world, boolean flag) throws CommandException {
    }

    private int b(List<Entity> list) {
        return 0;
    }

    private int a(CommandSpreadPlayers.Location2D commandspreadplayers_location2d, double d0, World world, Random random, double d1, double d2, double d3, double d4, CommandSpreadPlayers.Location2D[] acommandspreadplayers_location2d, boolean flag) throws CommandException {
        return 0;
    }

    private double a(List<Entity> list, World world, CommandSpreadPlayers.Location2D[] acommandspreadplayers_location2d, boolean flag) {
        return 0.0;
    }

    private CommandSpreadPlayers.Location2D[] a(Random random, int i, double d0, double d1, double d2, double d3) {
        return null;
    }

    public List<String> tabComplete(MinecraftServer minecraftserver, ICommandListener icommandlistener, String[] astring, @Nullable BlockPosition blockposition) {
        return null;
    }

    // CraftBukkit start - fix decompile error
    @Override
    public int compareTo(ICommand o) {
        return 0;
    }

    // CraftBukkit end
    static class Location2D {

        double a = 0.0;

        double b = 0.0;

        Location2D() {
        }

        Location2D(double d0, double d1) {
        }

        double a(CommandSpreadPlayers.Location2D commandspreadplayers_location2d) {
            return 0.0;
        }

        void a() {
        }

        float b() {
            return 0.0F;
        }

        public void b(CommandSpreadPlayers.Location2D commandspreadplayers_location2d) {
        }

        public boolean a(double d0, double d1, double d2, double d3) {
            return false;
        }

        public int a(World world) {
            return 0;
        }

        public boolean b(World world) {
            return false;
        }

        public void a(Random random, double d0, double d1, double d2, double d3) {
        }

        // CraftBukkit start - add a version of getType which force loads chunks
        private static IBlockData getType(World world, BlockPosition position) {
            return null;
        }
        // CraftBukkit end
    }
}
