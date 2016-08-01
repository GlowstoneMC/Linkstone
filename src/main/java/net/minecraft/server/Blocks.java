package net.minecraft.server;

import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class Blocks {

    private static final Set<Block> dl;

    public static final Block AIR;

    public static final Block STONE;

    public static final BlockGrass GRASS;

    public static final Block DIRT;

    public static final Block COBBLESTONE;

    public static final Block PLANKS;

    public static final Block SAPLING;

    public static final Block BEDROCK;

    public static final BlockFlowing FLOWING_WATER;

    public static final BlockStationary WATER;

    public static final BlockFlowing FLOWING_LAVA;

    public static final BlockStationary LAVA;

    public static final BlockSand SAND;

    public static final Block GRAVEL;

    public static final Block GOLD_ORE;

    public static final Block IRON_ORE;

    public static final Block COAL_ORE;

    public static final Block LOG;

    public static final Block LOG2;

    public static final BlockLeaves LEAVES;

    public static final BlockLeaves LEAVES2;

    public static final Block SPONGE;

    public static final Block GLASS;

    public static final Block LAPIS_ORE;

    public static final Block LAPIS_BLOCK;

    public static final Block DISPENSER;

    public static final Block SANDSTONE;

    public static final Block NOTEBLOCK;

    public static final Block BED;

    public static final Block GOLDEN_RAIL;

    public static final Block DETECTOR_RAIL;

    public static final BlockPiston STICKY_PISTON;

    public static final Block WEB;

    public static final BlockLongGrass TALLGRASS;

    public static final BlockDeadBush DEADBUSH;

    public static final BlockPiston PISTON;

    public static final BlockPistonExtension PISTON_HEAD;

    public static final Block WOOL;

    public static final BlockPistonMoving PISTON_EXTENSION;

    public static final BlockFlowers YELLOW_FLOWER;

    public static final BlockFlowers RED_FLOWER;

    public static final BlockPlant BROWN_MUSHROOM;

    public static final BlockPlant RED_MUSHROOM;

    public static final Block GOLD_BLOCK;

    public static final Block IRON_BLOCK;

    public static final BlockStepAbstract DOUBLE_STONE_SLAB;

    public static final BlockStepAbstract STONE_SLAB;

    public static final Block BRICK_BLOCK;

    public static final Block TNT;

    public static final Block BOOKSHELF;

    public static final Block MOSSY_COBBLESTONE;

    public static final Block OBSIDIAN;

    public static final Block TORCH;

    public static final BlockFire FIRE;

    public static final Block MOB_SPAWNER;

    public static final Block OAK_STAIRS;

    public static final BlockChest CHEST;

    public static final BlockRedstoneWire REDSTONE_WIRE;

    public static final Block DIAMOND_ORE;

    public static final Block DIAMOND_BLOCK;

    public static final Block CRAFTING_TABLE;

    public static final Block WHEAT;

    public static final Block FARMLAND;

    public static final Block FURNACE;

    public static final Block LIT_FURNACE;

    public static final Block STANDING_SIGN;

    public static final BlockDoor WOODEN_DOOR;

    public static final BlockDoor SPRUCE_DOOR;

    public static final BlockDoor BIRCH_DOOR;

    public static final BlockDoor JUNGLE_DOOR;

    public static final BlockDoor ACACIA_DOOR;

    public static final BlockDoor DARK_OAK_DOOR;

    public static final Block LADDER;

    public static final Block RAIL;

    public static final Block STONE_STAIRS;

    public static final Block WALL_SIGN;

    public static final Block LEVER;

    public static final Block STONE_PRESSURE_PLATE;

    public static final BlockDoor IRON_DOOR;

    public static final Block WOODEN_PRESSURE_PLATE;

    public static final Block REDSTONE_ORE;

    public static final Block LIT_REDSTONE_ORE;

    public static final Block UNLIT_REDSTONE_TORCH;

    public static final Block REDSTONE_TORCH;

    public static final Block STONE_BUTTON;

    public static final Block SNOW_LAYER;

    public static final Block ICE;

    public static final Block SNOW;

    public static final BlockCactus CACTUS;

    public static final Block CLAY;

    public static final BlockReed REEDS;

    public static final Block JUKEBOX;

    public static final Block FENCE;

    public static final Block SPRUCE_FENCE;

    public static final Block BIRCH_FENCE;

    public static final Block JUNGLE_FENCE;

    public static final Block DARK_OAK_FENCE;

    public static final Block ACACIA_FENCE;

    public static final Block PUMPKIN;

    public static final Block NETHERRACK;

    public static final Block SOUL_SAND;

    public static final Block GLOWSTONE;

    public static final BlockPortal PORTAL;

    public static final Block LIT_PUMPKIN;

    public static final Block CAKE;

    public static final BlockRepeater UNPOWERED_REPEATER;

    public static final BlockRepeater POWERED_REPEATER;

    public static final Block TRAPDOOR;

    public static final Block MONSTER_EGG;

    public static final Block STONEBRICK;

    public static final Block BROWN_MUSHROOM_BLOCK;

    public static final Block RED_MUSHROOM_BLOCK;

    public static final Block IRON_BARS;

    public static final Block GLASS_PANE;

    public static final Block MELON_BLOCK;

    public static final Block PUMPKIN_STEM;

    public static final Block MELON_STEM;

    public static final Block VINE;

    public static final Block FENCE_GATE;

    public static final Block SPRUCE_FENCE_GATE;

    public static final Block BIRCH_FENCE_GATE;

    public static final Block JUNGLE_FENCE_GATE;

    public static final Block DARK_OAK_FENCE_GATE;

    public static final Block ACACIA_FENCE_GATE;

    public static final Block BRICK_STAIRS;

    public static final Block STONE_BRICK_STAIRS;

    public static final BlockMycel MYCELIUM;

    public static final Block WATERLILY;

    public static final Block NETHER_BRICK;

    public static final Block NETHER_BRICK_FENCE;

    public static final Block NETHER_BRICK_STAIRS;

    public static final Block NETHER_WART;

    public static final Block ENCHANTING_TABLE;

    public static final Block BREWING_STAND;

    public static final BlockCauldron cauldron;

    public static final Block END_PORTAL;

    public static final Block END_PORTAL_FRAME;

    public static final Block END_STONE;

    public static final Block DRAGON_EGG;

    public static final Block REDSTONE_LAMP;

    public static final Block LIT_REDSTONE_LAMP;

    public static final BlockStepAbstract DOUBLE_WOODEN_SLAB;

    public static final BlockStepAbstract WOODEN_SLAB;

    public static final Block COCOA;

    public static final Block SANDSTONE_STAIRS;

    public static final Block EMERALD_ORE;

    public static final Block ENDER_CHEST;

    public static final BlockTripwireHook TRIPWIRE_HOOK;

    public static final Block TRIPWIRE;

    public static final Block EMERALD_BLOCK;

    public static final Block SPRUCE_STAIRS;

    public static final Block BIRCH_STAIRS;

    public static final Block JUNGLE_STAIRS;

    public static final Block COMMAND_BLOCK;

    public static final BlockBeacon BEACON;

    public static final Block COBBLESTONE_WALL;

    public static final Block FLOWER_POT;

    public static final Block CARROTS;

    public static final Block POTATOES;

    public static final Block WOODEN_BUTTON;

    public static final BlockSkull SKULL;

    public static final Block ANVIL;

    public static final Block TRAPPED_CHEST;

    public static final Block LIGHT_WEIGHTED_PRESSURE_PLATE;

    public static final Block HEAVY_WEIGHTED_PRESSURE_PLATE;

    public static final BlockRedstoneComparator UNPOWERED_COMPARATOR;

    public static final BlockRedstoneComparator POWERED_COMPARATOR;

    public static final BlockDaylightDetector DAYLIGHT_DETECTOR;

    public static final BlockDaylightDetector DAYLIGHT_DETECTOR_INVERTED;

    public static final Block REDSTONE_BLOCK;

    public static final Block QUARTZ_ORE;

    public static final BlockHopper HOPPER;

    public static final Block QUARTZ_BLOCK;

    public static final Block QUARTZ_STAIRS;

    public static final Block ACTIVATOR_RAIL;

    public static final Block DROPPER;

    public static final Block STAINED_HARDENED_CLAY;

    public static final Block BARRIER;

    public static final Block IRON_TRAPDOOR;

    public static final Block HAY_BLOCK;

    public static final Block CARPET;

    public static final Block HARDENED_CLAY;

    public static final Block COAL_BLOCK;

    public static final Block PACKED_ICE;

    public static final Block ACACIA_STAIRS;

    public static final Block DARK_OAK_STAIRS;

    public static final Block SLIME;

    public static final BlockTallPlant DOUBLE_PLANT;

    public static final BlockStainedGlass STAINED_GLASS;

    public static final BlockStainedGlassPane STAINED_GLASS_PANE;

    public static final Block PRISMARINE;

    public static final Block SEA_LANTERN;

    public static final Block STANDING_BANNER;

    public static final Block WALL_BANNER;

    public static final Block RED_SANDSTONE;

    public static final Block RED_SANDSTONE_STAIRS;

    public static final BlockStepAbstract DOUBLE_STONE_SLAB2;

    public static final BlockStepAbstract STONE_SLAB2;

    public static final Block END_ROD;

    public static final Block CHORUS_PLANT;

    public static final Block CHORUS_FLOWER;

    public static final Block PURPUR_BLOCK;

    public static final Block PURPUR_PILLAR;

    public static final Block PURPUR_STAIRS;

    public static final BlockStepAbstract PURPUR_DOUBLE_SLAB;

    public static final BlockStepAbstract PURPUR_SLAB;

    public static final Block END_BRICKS;

    public static final Block BEETROOT;

    public static final Block GRASS_PATH;

    public static final Block END_GATEWAY;

    public static final Block dc;

    public static final Block dd;

    public static final Block FROSTED_ICE;

    public static final Block df;

    public static final Block dg;

    public static final Block dh;

    public static final Block di;

    public static final Block dj;

    public static final Block STRUCTURE_BLOCK;

    @Nullable
    private static Block get(String s) {
        return null;
    }

    static {
    }
}
