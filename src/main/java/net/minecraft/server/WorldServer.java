package net.minecraft.server;

import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
// CraftBukkit start
import java.util.logging.Level;
import org.bukkit.WeatherType;
import org.bukkit.block.BlockState;
import org.bukkit.craftbukkit.util.HashTreeSet;
import org.bukkit.event.block.BlockFormEvent;
import org.bukkit.event.weather.LightningStrikeEvent;

// CraftBukkit end
public class WorldServer extends World implements IAsyncTaskHandler {

    private static final Logger a;

    private final MinecraftServer server;

    public EntityTracker tracker;

    private final PlayerChunkMap manager;

    // private final Set<NextTickListEntry> nextTickListHash = Sets.newHashSet();
    private final HashTreeSet<NextTickListEntry> nextTickList;

    // CraftBukkit - HashTreeSet
    private final Map<UUID, Entity> entitiesByUUID;

    public boolean savingDisabled;

    private boolean O;

    private int emptyTime;

    private final PortalTravelAgent portalTravelAgent;

    private final SpawnerCreature spawnerCreature;

    protected final VillageSiege siegeManager;

    private final WorldServer.BlockActionDataList[] S;

    private int T;

    private final List<NextTickListEntry> U;

    // CraftBukkit start
    public final int dimension;

    // Add env and gen to constructor
    public WorldServer(MinecraftServer minecraftserver, IDataManager idatamanager, WorldData worlddata, int i, MethodProfiler methodprofiler, org.bukkit.World.Environment env, org.bukkit.generator.ChunkGenerator gen) {
    }

    public World b() {
        return null;
    }

    // CraftBukkit start
    @Override
    public TileEntity getTileEntity(BlockPosition pos) {
        return null;
    }

    private TileEntity fixTileEntity(BlockPosition pos, Block type, TileEntity found) {
        return null;
    }

    private boolean canSpawn(int x, int z) {
        return false;
    }

    // CraftBukkit end
    public void doTick() {
    }

    @Nullable
    public BiomeBase.BiomeMeta a(EnumCreatureType enumcreaturetype, BlockPosition blockposition) {
        return null;
    }

    public boolean a(EnumCreatureType enumcreaturetype, BiomeBase.BiomeMeta biomebase_biomemeta, BlockPosition blockposition) {
        return false;
    }

    public void everyoneSleeping() {
    }

    protected void f() {
    }

    private void c() {
    }

    public boolean everyoneDeeplySleeping() {
        return false;
    }

    protected boolean isChunkLoaded(int i, int j, boolean flag) {
        return false;
    }

    protected void i() {
    }

    protected void j() {
    }

    protected BlockPosition a(BlockPosition blockposition) {
        return null;
    }

    public boolean a(BlockPosition blockposition, Block block) {
        return false;
    }

    public boolean b(BlockPosition blockposition, Block block) {
        return false;
    }

    public void a(BlockPosition blockposition, Block block, int i) {
    }

    public void a(BlockPosition blockposition, Block block, int i, int j) {
    }

    public void b(BlockPosition blockposition, Block block, int i, int j) {
    }

    public void tickEntities() {
    }

    protected void l() {
    }

    public void m() {
    }

    public boolean a(boolean flag) {
        return false;
    }

    @Nullable
    public List<NextTickListEntry> a(Chunk chunk, boolean flag) {
        return null;
    }

    @Nullable
    public List<NextTickListEntry> a(StructureBoundingBox structureboundingbox, boolean flag) {
        return null;
    }

    /* CraftBukkit start - We prevent spawning in general, so this butchering is not needed
    public void entityJoinedWorld(Entity entity, boolean flag) {
        if (!this.getSpawnAnimals() && (entity instanceof EntityAnimal || entity instanceof EntityWaterAnimal)) {
            entity.die();
        }

        if (!this.getSpawnNPCs() && entity instanceof NPC) {
            entity.die();
        }

        super.entityJoinedWorld(entity, flag);
    }
    // CraftBukkit end */
    private boolean getSpawnNPCs() {
        return false;
    }

    private boolean getSpawnAnimals() {
        return false;
    }

    protected IChunkProvider n() {
        return null;
    }

    public List<TileEntity> getTileEntities(int i, int j, int k, int l, int i1, int j1) {
        return null;
    }

    public boolean a(EntityHuman entityhuman, BlockPosition blockposition) {
        return false;
    }

    public void a(WorldSettings worldsettings) {
    }

    private void an() {
    }

    private void b(WorldSettings worldsettings) {
    }

    protected void o() {
    }

    public BlockPosition getDimensionSpawn() {
        return null;
    }

    public void save(boolean flag, @Nullable IProgressUpdate iprogressupdate) throws ExceptionWorldConflict {
    }

    public void flushSave() {
    }

    protected void a() throws ExceptionWorldConflict {
    }

    public boolean addEntity(Entity entity) {
        return false;
    }

    public void a(Collection<Entity> collection) {
    }

    private boolean i(Entity entity) {
        return false;
    }

    protected void b(Entity entity) {
    }

    protected void c(Entity entity) {
    }

    public boolean strikeLightning(Entity entity) {
        return false;
    }

    public void broadcastEntityEffect(Entity entity, byte b0) {
    }

    public ChunkProviderServer getChunkProviderServer() {
        return null;
    }

    public Explosion createExplosion(@Nullable Entity entity, double d0, double d1, double d2, float f, boolean flag, boolean flag1) {
        return null;
    }

    public void playBlockAction(BlockPosition blockposition, Block block, int i, int j) {
    }

    private void ao() {
    }

    private boolean a(BlockActionData blockactiondata) {
        return false;
    }

    public void saveLevel() {
    }

    protected void t() {
    }

    @Nullable
    public MinecraftServer getMinecraftServer() {
        return null;
    }

    public EntityTracker getTracker() {
        return null;
    }

    public PlayerChunkMap getPlayerChunkMap() {
        return null;
    }

    public PortalTravelAgent getTravelAgent() {
        return null;
    }

    public DefinedStructureManager y() {
        return null;
    }

    public void a(EnumParticle enumparticle, double d0, double d1, double d2, int i, double d3, double d4, double d5, double d6, int... aint) {
    }

    public void a(EnumParticle enumparticle, boolean flag, double d0, double d1, double d2, int i, double d3, double d4, double d5, double d6, int... aint) {
    }

    public void sendParticles(EntityPlayer sender, EnumParticle enumparticle, boolean flag, double d0, double d1, double d2, int i, double d3, double d4, double d5, double d6, int... aint) {
    }

    public void a(EntityPlayer entityplayer, EnumParticle enumparticle, boolean flag, double d0, double d1, double d2, int i, double d3, double d4, double d5, double d6, int... aint) {
    }

    private void a(EntityPlayer entityplayer, boolean flag, double d0, double d1, double d2, Packet<?> packet) {
    }

    @Nullable
    public Entity getEntity(UUID uuid) {
        return null;
    }

    public ListenableFuture<Object> postToMainThread(Runnable runnable) {
        return null;
    }

    public boolean isMainThread() {
        return false;
    }

    public IChunkProvider getChunkProvider() {
        return null;
    }

    static class BlockActionDataList extends ArrayList<BlockActionData> {

        private BlockActionDataList() {
        }

        BlockActionDataList(Object object) {
        }
    }
}
