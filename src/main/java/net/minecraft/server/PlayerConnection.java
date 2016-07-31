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

    private static final Logger LOGGER;

    public final NetworkManager networkManager;

    private final MinecraftServer minecraftServer;

    public EntityPlayer player;

    private int e;

    private int f;

    private long g;

    private long h;

    // CraftBukkit start - multithreaded fields
    private volatile int chatThrottle;

    private static final AtomicIntegerFieldUpdater chatSpamField;

    // CraftBukkit end
    private int j;

    private final IntHashMap<Short> k;

    private double l;

    private double m;

    private double n;

    private double o;

    private double p;

    private double q;

    private Entity r;

    private double s;

    private double t;

    private double u;

    private double v;

    private double w;

    private double x;

    private Vec3D teleportPos;

    private int teleportAwait;

    private int A;

    private boolean B;

    private int C;

    private boolean D;

    private int E;

    private int F;

    private int G;

    private boolean processedDisconnect;

    // CraftBukkit - Added
    public PlayerConnection(MinecraftServer minecraftserver, NetworkManager networkmanager, EntityPlayer entityplayer) {
    }

    private final org.bukkit.craftbukkit.CraftServer server;

    private int lastTick;

    private int allowedPlayerTicks;

    private int lastDropTick;

    private int dropCount;

    private static final int SURVIVAL_PLACE_DISTANCE_SQUARED;

    private static final int CREATIVE_PLACE_DISTANCE_SQUARED;

    // Get position of last block hit for BlockDamageLevel.STOPPED
    private double lastPosX;

    private double lastPosY;

    private double lastPosZ;

    private float lastPitch;

    private float lastYaw;

    private boolean justTeleported;

    public CraftPlayer getPlayer() {
        return null;
    }

    private static final HashSet<Integer> invalidItems;

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

        static final int[] a;

        static final int[] b;

        static final int[] c;

        static final int[] d;

        static {
        }
    }
}
