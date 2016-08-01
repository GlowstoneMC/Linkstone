package net.minecraft.server;

import com.google.common.collect.Lists;
import com.google.common.primitives.Doubles;
import com.google.common.primitives.Floats;
import com.google.common.util.concurrent.Futures;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
// CraftBukkit start
import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.bukkit.Location;
import org.bukkit.craftbukkit.entity.CraftPlayer;
import org.bukkit.craftbukkit.event.CraftEventFactory;
import org.bukkit.craftbukkit.inventory.CraftInventoryView;
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.craftbukkit.util.CraftChatMessage;
import org.bukkit.craftbukkit.util.LazyPlayerSet;
import org.bukkit.craftbukkit.util.Waitable;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCreativeEvent;
import org.bukkit.event.inventory.InventoryType.SlotType;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerAnimationEvent;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerResourcePackStatusEvent;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.event.player.PlayerToggleSprintEvent;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.InventoryView;
import org.bukkit.util.NumberConversions;

// CraftBukkit end
public class PlayerConnection implements PacketListenerPlayIn, ITickable {

    private static final Logger LOGGER = null;

    public final NetworkManager networkManager = null;

    private final MinecraftServer minecraftServer = null;

    public EntityPlayer player = null;

    private int e = 0;

    private int f = 0;

    private long g = 0;

    private long h = 0;

    // CraftBukkit start - multithreaded fields
    private volatile int chatThrottle = 0;

    private static final AtomicIntegerFieldUpdater chatSpamField = null;

    // CraftBukkit end
    private int j = 0;

    private final IntHashMap<Short> k = null;

    private double l = 0.0;

    private double m = 0.0;

    private double n = 0.0;

    private double o = 0.0;

    private double p = 0.0;

    private double q = 0.0;

    private Entity r = null;

    private double s = 0.0;

    private double t = 0.0;

    private double u = 0.0;

    private double v = 0.0;

    private double w = 0.0;

    private double x = 0.0;

    private Vec3D teleportPos = null;

    private int teleportAwait = 0;

    private int A = 0;

    private boolean B = false;

    private int C = 0;

    private boolean D = false;

    private int E = 0;

    private int F = 0;

    private int G = 0;

    private boolean processedDisconnect = false;

    // CraftBukkit - Added
    public PlayerConnection(MinecraftServer minecraftserver, NetworkManager networkmanager, EntityPlayer entityplayer) {
    }

    private final org.bukkit.craftbukkit.CraftServer server = null;

    private int lastTick = 0;

    private int allowedPlayerTicks = 0;

    private int lastDropTick = 0;

    private int dropCount = 0;

    private static final int SURVIVAL_PLACE_DISTANCE_SQUARED = 0;

    private static final int CREATIVE_PLACE_DISTANCE_SQUARED = 0;

    // Get position of last block hit for BlockDamageLevel.STOPPED
    private double lastPosX = 0.0;

    private double lastPosY = 0.0;

    private double lastPosZ = 0.0;

    private float lastPitch = 0.0F;

    private float lastYaw = 0.0F;

    private boolean justTeleported = false;

    public CraftPlayer getPlayer() {
        return null;
    }

    private static final HashSet<Integer> invalidItems = null;

    // TODO: Check after every update.
    // CraftBukkit end
    public void E_() {
    }

    private void d() {
    }

    public NetworkManager a() {
        return null;
    }

    public void disconnect(String s) {
    }

    public void a(PacketPlayInSteerVehicle packetplayinsteervehicle) {
    }

    private static boolean b(PacketPlayInFlying packetplayinflying) {
        return false;
    }

    private static boolean b(PacketPlayInVehicleMove packetplayinvehiclemove) {
        return false;
    }

    public void a(PacketPlayInVehicleMove packetplayinvehiclemove) {
    }

    public void a(PacketPlayInTeleportAccept packetplayinteleportaccept) {
    }

    public void a(PacketPlayInFlying packetplayinflying) {
    }

    public void a(double d0, double d1, double d2, float f, float f1) {
    }

    public void a(double d0, double d1, double d2, float f, float f1, Set<PacketPlayOutPosition.EnumPlayerTeleportFlags> set) {
    }

    public void teleport(Location dest) {
    }

    private void internalTeleport(double d0, double d1, double d2, float f, float f1, Set set) {
    }

    public void a(PacketPlayInBlockDig packetplayinblockdig) {
    }

    public void a(PacketPlayInUseItem packetplayinuseitem) {
    }

    public void a(PacketPlayInBlockPlace packetplayinblockplace) {
    }

    public void a(PacketPlayInSpectate packetplayinspectate) {
    }

    // CraftBukkit start
    public void a(PacketPlayInResourcePackStatus packetplayinresourcepackstatus) {
    }

    // CraftBukkit end
    public void a(PacketPlayInBoatMove packetplayinboatmove) {
    }

    public void a(IChatBaseComponent ichatbasecomponent) {
    }

    public void sendPacket(final Packet<?> packet) {
    }

    public void a(PacketPlayInHeldItemSlot packetplayinhelditemslot) {
    }

    public void a(PacketPlayInChat packetplayinchat) {
    }

    // CraftBukkit start - add method
    public void chat(String s, boolean async) {
    }

    // CraftBukkit end
    private void handleCommand(String s) {
    }

    public void a(PacketPlayInArmAnimation packetplayinarmanimation) {
    }

    public void a(PacketPlayInEntityAction packetplayinentityaction) {
    }

    public void a(PacketPlayInUseEntity packetplayinuseentity) {
    }

    public void a(PacketPlayInClientCommand packetplayinclientcommand) {
    }

    public void a(PacketPlayInCloseWindow packetplayinclosewindow) {
    }

    public void a(PacketPlayInWindowClick packetplayinwindowclick) {
    }

    public void a(PacketPlayInEnchantItem packetplayinenchantitem) {
    }

    public void a(PacketPlayInSetCreativeSlot packetplayinsetcreativeslot) {
    }

    public void a(PacketPlayInTransaction packetplayintransaction) {
    }

    public void a(PacketPlayInUpdateSign packetplayinupdatesign) {
    }

    public void a(PacketPlayInKeepAlive packetplayinkeepalive) {
    }

    private long e() {
        return 0;
    }

    public void a(PacketPlayInAbilities packetplayinabilities) {
    }

    public void a(PacketPlayInTabComplete packetplayintabcomplete) {
    }

    public void a(PacketPlayInSettings packetplayinsettings) {
    }

    public void a(PacketPlayInCustomPayload packetplayincustompayload) {
    }

    // CraftBukkit start - Add "isDisconnected" method
    public final boolean isDisconnected() {
        return false;
    }

    static class SyntheticClass_1 {

        static final int[] a = null;

        static final int[] b = null;

        static final int[] c = null;

        static final int[] d = null;

        static {
        }
    }
}
