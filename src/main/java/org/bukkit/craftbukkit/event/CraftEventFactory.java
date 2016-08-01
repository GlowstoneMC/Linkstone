package org.bukkit.craftbukkit.event;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import com.google.common.base.Function;
import com.google.common.base.Functions;
import net.minecraft.server.*;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.Statistic.Type;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.craftbukkit.CraftStatistic;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.craftbukkit.block.CraftBlock;
import org.bukkit.craftbukkit.block.CraftBlockState;
import org.bukkit.craftbukkit.entity.CraftEntity;
import org.bukkit.craftbukkit.entity.CraftLivingEntity;
import org.bukkit.craftbukkit.entity.CraftPlayer;
import org.bukkit.craftbukkit.inventory.CraftInventoryCrafting;
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.craftbukkit.inventory.CraftMetaBook;
import org.bukkit.craftbukkit.util.CraftDamageSource;
import org.bukkit.craftbukkit.util.CraftMagicNumbers;
import org.bukkit.entity.AreaEffectCloud;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Horse;
import org.bukkit.entity.LightningStrike;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Pig;
import org.bukkit.entity.PigZombie;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.ThrownExpBottle;
import org.bukkit.entity.ThrownPotion;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.block.*;
import org.bukkit.event.block.BlockIgniteEvent.IgniteCause;
import org.bukkit.event.entity.*;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.entity.EntityDamageEvent.DamageModifier;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.PrepareAnvilEvent;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.event.player.*;
import org.bukkit.event.server.ServerListPingEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.meta.BookMeta;

public class CraftEventFactory {

    public static final DamageSource MELTING = null;

    public static final DamageSource POISON = null;

    public static org.bukkit.block.Block blockDamage = null;

    // For use in EntityDamageByBlockEvent
    public static Entity entityDamage = null;

    // For use in EntityDamageByEntityEvent
    // helper methods
    private static boolean canBuild(CraftWorld world, Player player, int x, int z) {
        return false;
    }

    public static <T extends Event> T callEvent(T event) {
        return null;
    }

    /**
     * Block place methods
     */
    public static BlockMultiPlaceEvent callBlockMultiPlaceEvent(World world, EntityHuman who, EnumHand hand, List<BlockState> blockStates, int clickedX, int clickedY, int clickedZ) {
        return null;
    }

    public static BlockPlaceEvent callBlockPlaceEvent(World world, EntityHuman who, EnumHand hand, BlockState replacedBlockState, int clickedX, int clickedY, int clickedZ) {
        return null;
    }

    /**
     * Bucket methods
     */
    public static PlayerBucketEmptyEvent callPlayerBucketEmptyEvent(EntityHuman who, int clickedX, int clickedY, int clickedZ, EnumDirection clickedFace, ItemStack itemInHand) {
        return null;
    }

    public static PlayerBucketFillEvent callPlayerBucketFillEvent(EntityHuman who, int clickedX, int clickedY, int clickedZ, EnumDirection clickedFace, ItemStack itemInHand, net.minecraft.server.Item bucket) {
        return null;
    }

    private static PlayerEvent getPlayerBucketEvent(boolean isFilling, EntityHuman who, int clickedX, int clickedY, int clickedZ, EnumDirection clickedFace, ItemStack itemstack, net.minecraft.server.Item item) {
        return null;
    }

    /**
     * Player Interact event
     */
    public static PlayerInteractEvent callPlayerInteractEvent(EntityHuman who, Action action, ItemStack itemstack, EnumHand hand) {
        return null;
    }

    public static PlayerInteractEvent callPlayerInteractEvent(EntityHuman who, Action action, BlockPosition position, EnumDirection direction, ItemStack itemstack, EnumHand hand) {
        return null;
    }

    public static PlayerInteractEvent callPlayerInteractEvent(EntityHuman who, Action action, BlockPosition position, EnumDirection direction, ItemStack itemstack, boolean cancelledBlock, EnumHand hand) {
        return null;
    }

    /**
     * EntityShootBowEvent
     */
    public static EntityShootBowEvent callEntityShootBowEvent(EntityLiving who, ItemStack itemstack, EntityArrow entityArrow, float force) {
        return null;
    }

    /**
     * BlockDamageEvent
     */
    public static BlockDamageEvent callBlockDamageEvent(EntityHuman who, int x, int y, int z, ItemStack itemstack, boolean instaBreak) {
        return null;
    }

    /**
     * CreatureSpawnEvent
     */
    public static CreatureSpawnEvent callCreatureSpawnEvent(EntityLiving entityliving, SpawnReason spawnReason) {
        return null;
    }

    /**
     * EntityTameEvent
     */
    public static EntityTameEvent callEntityTameEvent(EntityInsentient entity, EntityHuman tamer) {
        return null;
    }

    /**
     * ItemSpawnEvent
     */
    public static ItemSpawnEvent callItemSpawnEvent(EntityItem entityitem) {
        return null;
    }

    /**
     * ItemDespawnEvent
     */
    public static ItemDespawnEvent callItemDespawnEvent(EntityItem entityitem) {
        return null;
    }

    /**
     * ItemMergeEvent
     */
    public static ItemMergeEvent callItemMergeEvent(EntityItem merging, EntityItem mergingWith) {
        return null;
    }

    /**
     * PotionSplashEvent
     */
    public static PotionSplashEvent callPotionSplashEvent(EntityPotion potion, Map<LivingEntity, Double> affectedEntities) {
        return null;
    }

    public static LingeringPotionSplashEvent callLingeringPotionSplashEvent(EntityPotion potion, EntityAreaEffectCloud cloud) {
        return null;
    }

    /**
     * BlockFadeEvent
     */
    public static BlockFadeEvent callBlockFadeEvent(Block block, net.minecraft.server.Block type) {
        return null;
    }

    public static boolean handleBlockSpreadEvent(Block block, Block source, net.minecraft.server.Block type, int data) {
        return false;
    }

    public static EntityDeathEvent callEntityDeathEvent(EntityLiving victim) {
        return null;
    }

    public static EntityDeathEvent callEntityDeathEvent(EntityLiving victim, List<org.bukkit.inventory.ItemStack> drops) {
        return null;
    }

    public static PlayerDeathEvent callPlayerDeathEvent(EntityPlayer victim, List<org.bukkit.inventory.ItemStack> drops, String deathMessage, boolean keepInventory) {
        return null;
    }

    /**
     * Server methods
     */
    public static ServerListPingEvent callServerListPingEvent(Server craftServer, InetAddress address, String motd, int numPlayers, int maxPlayers) {
        return null;
    }

    private static EntityDamageEvent handleEntityDamageEvent(Entity entity, DamageSource source, Map<DamageModifier, Double> modifiers, Map<DamageModifier, Function<? super Double, Double>> modifierFunctions) {
        return null;
    }

    private static EntityDamageEvent callEntityDamageEvent(Entity damager, Entity damagee, DamageCause cause, Map<DamageModifier, Double> modifiers, Map<DamageModifier, Function<? super Double, Double>> modifierFunctions) {
        return null;
    }

    private static final Function<? super Double, Double> ZERO = null;

    public static EntityDamageEvent handleLivingEntityDamageEvent(Entity damagee, DamageSource source, double rawDamage, double hardHatModifier, double blockingModifier, double armorModifier, double resistanceModifier, double magicModifier, double absorptionModifier, Function<Double, Double> hardHat, Function<Double, Double> blocking, Function<Double, Double> armor, Function<Double, Double> resistance, Function<Double, Double> magic, Function<Double, Double> absorption) {
        return null;
    }

    // Non-Living Entities such as EntityEnderCrystal and EntityFireball need to call this
    public static boolean handleNonLivingEntityDamageEvent(Entity entity, DamageSource source, double damage) {
        return false;
    }

    public static boolean handleNonLivingEntityDamageEvent(Entity entity, DamageSource source, double damage, boolean cancelOnZeroDamage) {
        return false;
    }

    public static PlayerLevelChangeEvent callPlayerLevelChangeEvent(Player player, int oldLevel, int newLevel) {
        return null;
    }

    public static PlayerExpChangeEvent callPlayerExpChangeEvent(EntityHuman entity, int expAmount) {
        return null;
    }

    public static boolean handleBlockGrowEvent(World world, int x, int y, int z, net.minecraft.server.Block type, int data) {
        return false;
    }

    public static FoodLevelChangeEvent callFoodLevelChangeEvent(EntityHuman entity, int level) {
        return null;
    }

    public static PigZapEvent callPigZapEvent(Entity pig, Entity lightning, Entity pigzombie) {
        return null;
    }

    public static HorseJumpEvent callHorseJumpEvent(Entity horse, float power) {
        return null;
    }

    public static EntityChangeBlockEvent callEntityChangeBlockEvent(org.bukkit.entity.Entity entity, Block block, Material material) {
        return null;
    }

    public static EntityChangeBlockEvent callEntityChangeBlockEvent(Entity entity, Block block, Material material) {
        return null;
    }

    public static EntityChangeBlockEvent callEntityChangeBlockEvent(Entity entity, Block block, Material material, boolean cancelled) {
        return null;
    }

    public static EntityChangeBlockEvent callEntityChangeBlockEvent(Entity entity, BlockPosition position, net.minecraft.server.Block type, int data) {
        return null;
    }

    public static EntityChangeBlockEvent callEntityChangeBlockEvent(org.bukkit.entity.Entity entity, Block block, Material material, int data) {
        return null;
    }

    public static EntityChangeBlockEvent callEntityChangeBlockEvent(org.bukkit.entity.Entity entity, Block block, Material material, int data, boolean cancelled) {
        return null;
    }

    public static CreeperPowerEvent callCreeperPowerEvent(Entity creeper, Entity lightning, CreeperPowerEvent.PowerCause cause) {
        return null;
    }

    public static EntityTargetEvent callEntityTargetEvent(Entity entity, Entity target, EntityTargetEvent.TargetReason reason) {
        return null;
    }

    public static EntityTargetLivingEntityEvent callEntityTargetLivingEvent(Entity entity, EntityLiving target, EntityTargetEvent.TargetReason reason) {
        return null;
    }

    public static EntityBreakDoorEvent callEntityBreakDoorEvent(Entity entity, int x, int y, int z) {
        return null;
    }

    public static Container callInventoryOpenEvent(EntityPlayer player, Container container) {
        return null;
    }

    public static Container callInventoryOpenEvent(EntityPlayer player, Container container, boolean cancelled) {
        return null;
    }

    public static ItemStack callPreCraftEvent(InventoryCrafting matrix, ItemStack result, InventoryView lastCraftView, boolean isRepair) {
        return null;
    }

    public static ProjectileLaunchEvent callProjectileLaunchEvent(Entity entity) {
        return null;
    }

    public static ProjectileHitEvent callProjectileHitEvent(Entity entity) {
        return null;
    }

    public static ExpBottleEvent callExpBottleEvent(Entity entity, int exp) {
        return null;
    }

    public static BlockRedstoneEvent callRedstoneChange(World world, int x, int y, int z, int oldCurrent, int newCurrent) {
        return null;
    }

    public static NotePlayEvent callNotePlayEvent(World world, int x, int y, int z, byte instrument, byte note) {
        return null;
    }

    public static void callPlayerItemBreakEvent(EntityHuman human, ItemStack brokenItem) {
    }

    public static BlockIgniteEvent callBlockIgniteEvent(World world, int x, int y, int z, int igniterX, int igniterY, int igniterZ) {
        return null;
    }

    public static BlockIgniteEvent callBlockIgniteEvent(World world, int x, int y, int z, Entity igniter) {
        return null;
    }

    public static BlockIgniteEvent callBlockIgniteEvent(World world, int x, int y, int z, Explosion explosion) {
        return null;
    }

    public static BlockIgniteEvent callBlockIgniteEvent(World world, int x, int y, int z, IgniteCause cause, Entity igniter) {
        return null;
    }

    public static void handleInventoryCloseEvent(EntityHuman human) {
    }

    public static void handleEditBookEvent(EntityPlayer player, ItemStack newBookItem) {
    }

    private static IChatBaseComponent stripEvents(IChatBaseComponent c) {
        return null;
    }

    public static PlayerUnleashEntityEvent callPlayerUnleashEntityEvent(EntityInsentient entity, EntityHuman player) {
        return null;
    }

    public static PlayerLeashEntityEvent callPlayerLeashEntityEvent(EntityInsentient entity, Entity leashHolder, EntityHuman player) {
        return null;
    }

    public static Cancellable handleStatisticsIncrease(EntityHuman entityHuman, net.minecraft.server.Statistic statistic, int current, int incrementation) {
        return null;
    }

    public static FireworkExplodeEvent callFireworkExplodeEvent(EntityFireworks firework) {
        return null;
    }

    public static PrepareAnvilEvent callPrepareAnvilEvent(InventoryView view, ItemStack item) {
        return null;
    }

    public static EntityToggleGlideEvent callToggleGlideEvent(EntityLiving entity, boolean gliding) {
        return null;
    }

    public static AreaEffectCloudApplyEvent callAreaEffectCloudApplyEvent(EntityAreaEffectCloud cloud, List<LivingEntity> entities) {
        return null;
    }

    public static EntityBreedEvent callEntityBreedEvent(EntityLiving child, EntityLiving mother, EntityLiving father, EntityLiving breeder, ItemStack bredWith, int experience) {
        return null;
    }
}
