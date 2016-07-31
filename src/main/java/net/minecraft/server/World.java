package net.minecraft.server;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import javax.annotation.Nullable;
// CraftBukkit start
import com.google.common.collect.Maps;
import java.util.Map;
import org.bukkit.Bukkit;
import org.bukkit.block.BlockState;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.craftbukkit.event.CraftEventFactory;
import org.bukkit.craftbukkit.util.CraftMagicNumbers;
import org.bukkit.event.block.BlockCanBuildEvent;
import org.bukkit.event.block.BlockPhysicsEvent;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;
import org.bukkit.generator.ChunkGenerator;

// CraftBukkit end
public abstract class World implements IBlockAccess {

    private int a;

    protected boolean d;

    public final List<Entity> entityList;

    protected final List<Entity> f;

    public final List<TileEntity> tileEntityList;

    public final List<TileEntity> tileEntityListTick;

    private final List<TileEntity> b;

    private final List<TileEntity> tileEntityListUnload;

    public final List<EntityHuman> players;

    public final List<Entity> j;

    protected final IntHashMap<Entity> entitiesById;

    private final long I;

    private int J;

    protected int l;

    protected final int m;

    protected float n;

    protected float o;

    protected float p;

    protected float q;

    private int K;

    public final Random random;

    public WorldProvider worldProvider;

    protected NavigationListener t;

    protected List<IWorldAccess> u;

    protected IChunkProvider chunkProvider;

    protected final IDataManager dataManager;

    public WorldData worldData;

    protected boolean isLoading;

    public PersistentCollection worldMaps;

    protected PersistentVillage villages;

    protected LootTableRegistry B;

    public final MethodProfiler methodProfiler;

    private final Calendar L;

    public Scoreboard scoreboard;

    public final boolean isClientSide;

    public boolean allowMonsters;

    public boolean allowAnimals;

    private boolean M;

    private final WorldBorder N;

    int[] H;

    // CraftBukkit start Added the following
    private final CraftWorld world;

    public boolean pvpMode;

    public boolean keepSpawnInMemory;

    public ChunkGenerator generator;

    public boolean captureBlockStates;

    public boolean captureTreeGeneration;

    public ArrayList<BlockState> capturedBlockStates;

    public long ticksPerAnimalSpawns;

    public long ticksPerMonsterSpawns;

    public boolean populating;

    private int tickPosition;

    public CraftWorld getWorld() {
        return null;
    }

    public CraftServer getServer() {
        return null;
    }

    public Chunk getChunkIfLoaded(int x, int z) {
        return null;
    }

    protected World(IDataManager idatamanager, WorldData worlddata, WorldProvider worldprovider, MethodProfiler methodprofiler, boolean flag, ChunkGenerator gen, org.bukkit.World.Environment env) {
    }

    public World b() {
        return null;
    }

    public BiomeBase getBiome(final BlockPosition blockposition) {
        return null;
    }

    public WorldChunkManager getWorldChunkManager() {
        return null;
    }

    protected abstract IChunkProvider n();

    public void a(WorldSettings worldsettings) {
    }

    @Nullable
    public MinecraftServer getMinecraftServer() {
        return null;
    }

    public IBlockData c(BlockPosition blockposition) {
        return null;
    }

    private boolean isValidLocation(BlockPosition blockposition) {
        return false;
    }

    private boolean E(BlockPosition blockposition) {
        return false;
    }

    public boolean isEmpty(BlockPosition blockposition) {
        return false;
    }

    public boolean isLoaded(BlockPosition blockposition) {
        return false;
    }

    public boolean a(BlockPosition blockposition, boolean flag) {
        return false;
    }

    public boolean areChunksLoaded(BlockPosition blockposition, int i) {
        return false;
    }

    public boolean areChunksLoaded(BlockPosition blockposition, int i, boolean flag) {
        return false;
    }

    public boolean areChunksLoadedBetween(BlockPosition blockposition, BlockPosition blockposition1) {
        return false;
    }

    public boolean areChunksLoadedBetween(BlockPosition blockposition, BlockPosition blockposition1, boolean flag) {
        return false;
    }

    public boolean a(StructureBoundingBox structureboundingbox) {
        return false;
    }

    public boolean b(StructureBoundingBox structureboundingbox, boolean flag) {
        return false;
    }

    private boolean isAreaLoaded(int i, int j, int k, int l, int i1, int j1, boolean flag) {
        return false;
    }

    protected abstract boolean isChunkLoaded(int i, int j, boolean flag);

    public Chunk getChunkAtWorldCoords(BlockPosition blockposition) {
        return null;
    }

    public Chunk getChunkAt(int i, int j) {
        return null;
    }

    public boolean setTypeAndData(BlockPosition blockposition, IBlockData iblockdata, int i) {
        return false;
    }

    // CraftBukkit start - Split off from original setTypeAndData(int i, int j, int k, Block block, int l, int i1) method in order to directly send client and physic updates
    public void notifyAndUpdatePhysics(BlockPosition blockposition, Chunk chunk, IBlockData oldBlock, IBlockData newBlock, int flag) {
    }

    // CraftBukkit end
    public boolean setAir(BlockPosition blockposition) {
        return false;
    }

    public boolean setAir(BlockPosition blockposition, boolean flag) {
        return false;
    }

    public boolean setTypeUpdate(BlockPosition blockposition, IBlockData iblockdata) {
        return false;
    }

    public void notify(BlockPosition blockposition, IBlockData iblockdata, IBlockData iblockdata1, int i) {
    }

    public void update(BlockPosition blockposition, Block block) {
    }

    public void a(int i, int j, int k, int l) {
    }

    public void b(BlockPosition blockposition, BlockPosition blockposition1) {
    }

    public void b(int i, int j, int k, int l, int i1, int j1) {
    }

    public void applyPhysics(BlockPosition blockposition, Block block) {
    }

    public void a(BlockPosition blockposition, Block block, EnumDirection enumdirection) {
    }

    public void e(BlockPosition blockposition, final Block block) {
    }

    public boolean a(BlockPosition blockposition, Block block) {
        return false;
    }

    public boolean h(BlockPosition blockposition) {
        return false;
    }

    public boolean i(BlockPosition blockposition) {
        return false;
    }

    public int j(BlockPosition blockposition) {
        return 0;
    }

    public int getLightLevel(BlockPosition blockposition) {
        return 0;
    }

    public int c(BlockPosition blockposition, boolean flag) {
        return 0;
    }

    public BlockPosition getHighestBlockYAt(BlockPosition blockposition) {
        return null;
    }

    public int b(int i, int j) {
        return 0;
    }

    @Deprecated
    public int c(int i, int j) {
        return 0;
    }

    public int b(EnumSkyBlock enumskyblock, BlockPosition blockposition) {
        return 0;
    }

    public void a(EnumSkyBlock enumskyblock, BlockPosition blockposition, int i) {
    }

    public void m(BlockPosition blockposition) {
    }

    public float n(BlockPosition blockposition) {
        return 0.0F;
    }

    public IBlockData getType(BlockPosition blockposition) {
        return null;
    }

    public boolean B() {
        return false;
    }

    @Nullable
    public MovingObjectPosition rayTrace(Vec3D vec3d, Vec3D vec3d1) {
        return null;
    }

    @Nullable
    public MovingObjectPosition rayTrace(Vec3D vec3d, Vec3D vec3d1, boolean flag) {
        return null;
    }

    @Nullable
    public MovingObjectPosition rayTrace(Vec3D vec3d, Vec3D vec3d1, boolean flag, boolean flag1, boolean flag2) {
        return null;
    }

    public void a(@Nullable EntityHuman entityhuman, BlockPosition blockposition, SoundEffect soundeffect, SoundCategory soundcategory, float f, float f1) {
    }

    public void a(@Nullable EntityHuman entityhuman, double d0, double d1, double d2, SoundEffect soundeffect, SoundCategory soundcategory, float f, float f1) {
    }

    public void a(double d0, double d1, double d2, SoundEffect soundeffect, SoundCategory soundcategory, float f, float f1, boolean flag) {
    }

    public void a(BlockPosition blockposition, @Nullable SoundEffect soundeffect) {
    }

    public void addParticle(EnumParticle enumparticle, double d0, double d1, double d2, double d3, double d4, double d5, int... aint) {
    }

    private void a(int i, boolean flag, double d0, double d1, double d2, double d3, double d4, double d5, int... aint) {
    }

    public boolean strikeLightning(Entity entity) {
        return false;
    }

    public boolean addEntity(Entity entity) {
        return false;
    }

    public boolean addEntity(Entity entity, SpawnReason spawnReason) {
        return false;
    }

    protected void b(Entity entity) {
    }

    protected void c(Entity entity) {
    }

    public void kill(Entity entity) {
    }

    public void removeEntity(Entity entity) {
    }

    public void addIWorldAccess(IWorldAccess iworldaccess) {
    }

    public List<AxisAlignedBB> getCubes(@Nullable Entity entity, AxisAlignedBB axisalignedbb) {
        return null;
    }

    public boolean a(WorldBorder worldborder, Entity entity) {
        return false;
    }

    public List<AxisAlignedBB> a(AxisAlignedBB axisalignedbb) {
        return null;
    }

    public boolean b(AxisAlignedBB axisalignedbb) {
        return false;
    }

    public int a(float f) {
        return 0;
    }

    public float c(float f) {
        return 0.0F;
    }

    public float E() {
        return 0.0F;
    }

    public float d(float f) {
        return 0.0F;
    }

    public BlockPosition p(BlockPosition blockposition) {
        return null;
    }

    public BlockPosition q(BlockPosition blockposition) {
        return null;
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

    public boolean a(TileEntity tileentity) {
        return false;
    }

    public void b(Collection<TileEntity> collection) {
    }

    public void g(Entity entity) {
    }

    public void entityJoinedWorld(Entity entity, boolean flag) {
    }

    public boolean c(AxisAlignedBB axisalignedbb) {
        return false;
    }

    public boolean a(AxisAlignedBB axisalignedbb, @Nullable Entity entity) {
        return false;
    }

    public boolean d(AxisAlignedBB axisalignedbb) {
        return false;
    }

    public boolean containsLiquid(AxisAlignedBB axisalignedbb) {
        return false;
    }

    public boolean f(AxisAlignedBB axisalignedbb) {
        return false;
    }

    public boolean a(AxisAlignedBB axisalignedbb, Material material, Entity entity) {
        return false;
    }

    public boolean a(AxisAlignedBB axisalignedbb, Material material) {
        return false;
    }

    public boolean b(AxisAlignedBB axisalignedbb, Material material) {
        return false;
    }

    public Explosion explode(@Nullable Entity entity, double d0, double d1, double d2, float f, boolean flag) {
        return null;
    }

    public Explosion createExplosion(@Nullable Entity entity, double d0, double d1, double d2, float f, boolean flag, boolean flag1) {
        return null;
    }

    public float a(Vec3D vec3d, AxisAlignedBB axisalignedbb) {
        return 0.0F;
    }

    public boolean douseFire(@Nullable EntityHuman entityhuman, BlockPosition blockposition, EnumDirection enumdirection) {
        return false;
    }

    public Map<BlockPosition, TileEntity> capturedTileEntities;

    @Nullable
    public TileEntity getTileEntity(BlockPosition blockposition) {
        return null;
    }

    @Nullable
    private TileEntity F(BlockPosition blockposition) {
        return null;
    }

    public void setTileEntity(BlockPosition blockposition, @Nullable TileEntity tileentity) {
    }

    public void s(BlockPosition blockposition) {
    }

    public void b(TileEntity tileentity) {
    }

    public boolean t(BlockPosition blockposition) {
        return false;
    }

    public boolean d(BlockPosition blockposition, boolean flag) {
        return false;
    }

    public void H() {
    }

    public void setSpawnFlags(boolean flag, boolean flag1) {
    }

    public void doTick() {
    }

    protected void I() {
    }

    protected void t() {
    }

    protected void j() {
    }

    public void a(BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    public boolean u(BlockPosition blockposition) {
        return false;
    }

    public boolean v(BlockPosition blockposition) {
        return false;
    }

    public boolean e(BlockPosition blockposition, boolean flag) {
        return false;
    }

    private boolean G(BlockPosition blockposition) {
        return false;
    }

    public boolean f(BlockPosition blockposition, boolean flag) {
        return false;
    }

    public boolean w(BlockPosition blockposition) {
        return false;
    }

    private int a(BlockPosition blockposition, EnumSkyBlock enumskyblock) {
        return 0;
    }

    public boolean c(EnumSkyBlock enumskyblock, BlockPosition blockposition) {
        return false;
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

    public List<Entity> getEntities(@Nullable Entity entity, AxisAlignedBB axisalignedbb) {
        return null;
    }

    public List<Entity> getEntities(@Nullable Entity entity, AxisAlignedBB axisalignedbb, @Nullable Predicate<? super Entity> predicate) {
        return null;
    }

    public <T extends Entity> List<T> a(Class<? extends T> oclass, Predicate<? super T> predicate) {
        return null;
    }

    public <T extends Entity> List<T> b(Class<? extends T> oclass, Predicate<? super T> predicate) {
        return null;
    }

    public <T extends Entity> List<T> a(Class<? extends T> oclass, AxisAlignedBB axisalignedbb) {
        return null;
    }

    public <T extends Entity> List<T> a(Class<? extends T> oclass, AxisAlignedBB axisalignedbb, @Nullable Predicate<? super T> predicate) {
        return null;
    }

    @Nullable
    public <T extends Entity> T a(Class<? extends T> oclass, AxisAlignedBB axisalignedbb, T t0) {
        return null;
    }

    @Nullable
    public Entity getEntity(int i) {
        return null;
    }

    public void b(BlockPosition blockposition, TileEntity tileentity) {
    }

    public int a(Class<?> oclass) {
        return 0;
    }

    public void a(Collection<Entity> collection) {
    }

    public void c(Collection<Entity> collection) {
    }

    public boolean a(Block block, BlockPosition blockposition, boolean flag, EnumDirection enumdirection, @Nullable Entity entity, @Nullable ItemStack itemstack) {
        return false;
    }

    public int K() {
        return 0;
    }

    public void b(int i) {
    }

    public int getBlockPower(BlockPosition blockposition, EnumDirection enumdirection) {
        return 0;
    }

    public WorldType L() {
        return null;
    }

    public int getBlockPower(BlockPosition blockposition) {
        return 0;
    }

    public boolean isBlockFacePowered(BlockPosition blockposition, EnumDirection enumdirection) {
        return false;
    }

    public int getBlockFacePower(BlockPosition blockposition, EnumDirection enumdirection) {
        return 0;
    }

    public boolean isBlockIndirectlyPowered(BlockPosition blockposition) {
        return false;
    }

    public int z(BlockPosition blockposition) {
        return 0;
    }

    @Nullable
    public EntityHuman findNearbyPlayer(Entity entity, double d0) {
        return null;
    }

    @Nullable
    public EntityHuman b(Entity entity, double d0) {
        return null;
    }

    @Nullable
    public EntityHuman a(double d0, double d1, double d2, double d3, boolean flag) {
        return null;
    }

    public boolean isPlayerNearby(double d0, double d1, double d2, double d3) {
        return false;
    }

    @Nullable
    public EntityHuman a(Entity entity, double d0, double d1) {
        return null;
    }

    @Nullable
    public EntityHuman a(BlockPosition blockposition, double d0, double d1) {
        return null;
    }

    @Nullable
    public EntityHuman a(double d0, double d1, double d2, double d3, double d4, @Nullable Function<EntityHuman, Double> function, @Nullable Predicate<EntityHuman> predicate) {
        return null;
    }

    @Nullable
    public EntityHuman a(String s) {
        return null;
    }

    @Nullable
    public EntityHuman b(UUID uuid) {
        return null;
    }

    public void checkSession() throws ExceptionWorldConflict {
    }

    public long getSeed() {
        return 0;
    }

    public long getTime() {
        return 0;
    }

    public long getDayTime() {
        return 0;
    }

    public void setDayTime(long i) {
    }

    public BlockPosition getSpawn() {
        return null;
    }

    public void A(BlockPosition blockposition) {
    }

    public boolean a(EntityHuman entityhuman, BlockPosition blockposition) {
        return false;
    }

    public void broadcastEntityEffect(Entity entity, byte b0) {
    }

    public IChunkProvider getChunkProvider() {
        return null;
    }

    public void playBlockAction(BlockPosition blockposition, Block block, int i, int j) {
    }

    public IDataManager getDataManager() {
        return null;
    }

    public WorldData getWorldData() {
        return null;
    }

    public GameRules getGameRules() {
        return null;
    }

    public void everyoneSleeping() {
    }

    // CraftBukkit start
    // Calls the method that checks to see if players are sleeping
    // Called by CraftPlayer.setPermanentSleeping()
    public void checkSleepStatus() {
    }

    // CraftBukkit end
    public float h(float f) {
        return 0.0F;
    }

    public float j(float f) {
        return 0.0F;
    }

    public boolean V() {
        return false;
    }

    public boolean W() {
        return false;
    }

    public boolean isRainingAt(BlockPosition blockposition) {
        return false;
    }

    public boolean C(BlockPosition blockposition) {
        return false;
    }

    @Nullable
    public PersistentCollection X() {
        return null;
    }

    public void a(String s, PersistentBase persistentbase) {
    }

    @Nullable
    public PersistentBase a(Class<? extends PersistentBase> oclass, String s) {
        return null;
    }

    public int b(String s) {
        return 0;
    }

    public void a(int i, BlockPosition blockposition, int j) {
    }

    public void triggerEffect(int i, BlockPosition blockposition, int j) {
    }

    public void a(@Nullable EntityHuman entityhuman, int i, BlockPosition blockposition, int j) {
    }

    public int getHeight() {
        return 0;
    }

    public int Z() {
        return 0;
    }

    public Random a(int i, int j, int k) {
        return null;
    }

    public CrashReportSystemDetails a(CrashReport crashreport) {
        return null;
    }

    public void c(int i, BlockPosition blockposition, int j) {
    }

    public Calendar ac() {
        return null;
    }

    public Scoreboard getScoreboard() {
        return null;
    }

    public void updateAdjacentComparators(BlockPosition blockposition, Block block) {
    }

    public DifficultyDamageScaler D(BlockPosition blockposition) {
        return null;
    }

    public EnumDifficulty getDifficulty() {
        return null;
    }

    public int af() {
        return 0;
    }

    public void c(int i) {
    }

    public void d(int i) {
    }

    public PersistentVillage ai() {
        return null;
    }

    public WorldBorder getWorldBorder() {
        return null;
    }

    public boolean d(int i, int j) {
        return false;
    }

    public void a(Packet<?> packet) {
    }

    public LootTableRegistry ak() {
        return null;
    }
}
