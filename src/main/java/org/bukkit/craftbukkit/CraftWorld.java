package org.bukkit.craftbukkit;

import com.google.common.base.Preconditions;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import net.minecraft.server.*;
import org.apache.commons.lang.Validate;
import org.bukkit.BlockChangeDelegate;
import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.ChunkSnapshot;
import org.bukkit.Difficulty;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.TreeType;
import org.bukkit.World;
import org.bukkit.WorldBorder;
import org.bukkit.block.Biome;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.craftbukkit.block.CraftBlock;
import org.bukkit.craftbukkit.block.CraftBlockState;
import org.bukkit.craftbukkit.entity.*;
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.craftbukkit.metadata.BlockMetadataStore;
import org.bukkit.craftbukkit.potion.CraftPotionUtil;
import org.bukkit.craftbukkit.util.CraftMagicNumbers;
import org.bukkit.craftbukkit.util.LongHash;
import org.bukkit.entity.*;
import org.bukkit.entity.Entity;
import org.bukkit.entity.minecart.CommandMinecart;
import org.bukkit.entity.minecart.ExplosiveMinecart;
import org.bukkit.entity.minecart.HopperMinecart;
import org.bukkit.entity.minecart.PoweredMinecart;
import org.bukkit.entity.minecart.SpawnerMinecart;
import org.bukkit.entity.minecart.StorageMinecart;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;
import org.bukkit.event.world.SpawnChangeEvent;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.messaging.StandardMessenger;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionType;
import org.bukkit.util.Vector;

public class CraftWorld implements World {

    public static final int CUSTOM_DIMENSION_OFFSET = 0;

    private final WorldServer world = null;

    private WorldBorder worldBorder = null;

    private Environment environment = null;

    private final CraftServer server = null;

    private final ChunkGenerator generator = null;

    private final List<BlockPopulator> populators = null;

    private final BlockMetadataStore blockMetadata = null;

    private int monsterSpawn = 0;

    private int animalSpawn = 0;

    private int waterAnimalSpawn = 0;

    private int ambientSpawn = 0;

    private int chunkLoadCount = 0;

    private int chunkGCTickCount = 0;

    private static final Random rand = null;

    public CraftWorld(WorldServer world, ChunkGenerator gen, Environment env) {
    }

    public Block getBlockAt(int x, int y, int z) {
        return null;
    }

    public int getBlockTypeIdAt(int x, int y, int z) {
        return 0;
    }

    public int getHighestBlockYAt(int x, int z) {
        return 0;
    }

    public Location getSpawnLocation() {
        return null;
    }

    public boolean setSpawnLocation(int x, int y, int z) {
        return false;
    }

    public Chunk getChunkAt(int x, int z) {
        return null;
    }

    public Chunk getChunkAt(Block block) {
        return null;
    }

    public boolean isChunkLoaded(int x, int z) {
        return false;
    }

    public Chunk[] getLoadedChunks() {
        return null;
    }

    public void loadChunk(int x, int z) {
    }

    public boolean unloadChunk(Chunk chunk) {
        return false;
    }

    public boolean unloadChunk(int x, int z) {
        return false;
    }

    public boolean unloadChunk(int x, int z, boolean save) {
        return false;
    }

    public boolean unloadChunkRequest(int x, int z) {
        return false;
    }

    public boolean unloadChunkRequest(int x, int z, boolean safe) {
        return false;
    }

    public boolean unloadChunk(int x, int z, boolean save, boolean safe) {
        return false;
    }

    private boolean unloadChunk0(int x, int z, boolean save) {
        return false;
    }

    public boolean regenerateChunk(int x, int z) {
        return false;
    }

    public boolean refreshChunk(int x, int z) {
        return false;
    }

    public boolean isChunkInUse(int x, int z) {
        return false;
    }

    public boolean loadChunk(int x, int z, boolean generate) {
        return false;
    }

    public boolean isChunkLoaded(Chunk chunk) {
        return false;
    }

    public void loadChunk(Chunk chunk) {
    }

    public WorldServer getHandle() {
        return null;
    }

    public org.bukkit.entity.Item dropItem(Location loc, ItemStack item) {
        return null;
    }

    private static void randomLocationWithinBlock(Location loc, double xs, double ys, double zs) {
    }

    public org.bukkit.entity.Item dropItemNaturally(Location loc, ItemStack item) {
        return null;
    }

    public Arrow spawnArrow(Location loc, Vector velocity, float speed, float spread) {
        return null;
    }

    public <T extends Arrow> T spawnArrow(Location loc, Vector velocity, float speed, float spread, Class<T> clazz) {
        return null;
    }

    public Entity spawnEntity(Location loc, EntityType entityType) {
        return null;
    }

    public LightningStrike strikeLightning(Location loc) {
        return null;
    }

    public LightningStrike strikeLightningEffect(Location loc) {
        return null;
    }

    public boolean generateTree(Location loc, TreeType type) {
        return false;
    }

    public boolean generateTree(Location loc, TreeType type, BlockChangeDelegate delegate) {
        return false;
    }

    public TileEntity getTileEntityAt(final int x, final int y, final int z) {
        return null;
    }

    public String getName() {
        return null;
    }

    @Deprecated
    public long getId() {
        return 0;
    }

    public UUID getUID() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

    public long getTime() {
        return 0;
    }

    public void setTime(long time) {
    }

    public long getFullTime() {
        return 0;
    }

    public void setFullTime(long time) {
    }

    public boolean createExplosion(double x, double y, double z, float power) {
        return false;
    }

    public boolean createExplosion(double x, double y, double z, float power, boolean setFire) {
        return false;
    }

    public boolean createExplosion(double x, double y, double z, float power, boolean setFire, boolean breakBlocks) {
        return false;
    }

    public boolean createExplosion(Location loc, float power) {
        return false;
    }

    public boolean createExplosion(Location loc, float power, boolean setFire) {
        return false;
    }

    public Environment getEnvironment() {
        return null;
    }

    public void setEnvironment(Environment env) {
    }

    public Block getBlockAt(Location location) {
        return null;
    }

    public int getBlockTypeIdAt(Location location) {
        return 0;
    }

    public int getHighestBlockYAt(Location location) {
        return 0;
    }

    public Chunk getChunkAt(Location location) {
        return null;
    }

    public ChunkGenerator getGenerator() {
        return null;
    }

    public List<BlockPopulator> getPopulators() {
        return null;
    }

    public Block getHighestBlockAt(int x, int z) {
        return null;
    }

    public Block getHighestBlockAt(Location location) {
        return null;
    }

    public Biome getBiome(int x, int z) {
        return null;
    }

    public void setBiome(int x, int z, Biome bio) {
    }

    public double getTemperature(int x, int z) {
        return 0.0;
    }

    public double getHumidity(int x, int z) {
        return 0.0;
    }

    public List<Entity> getEntities() {
        return null;
    }

    public List<LivingEntity> getLivingEntities() {
        return null;
    }

    @SuppressWarnings("unchecked")
    @Deprecated
    public <T extends Entity> Collection<T> getEntitiesByClass(Class<T>... classes) {
        return null;
    }

    @SuppressWarnings("unchecked")
    public <T extends Entity> Collection<T> getEntitiesByClass(Class<T> clazz) {
        return null;
    }

    public Collection<Entity> getEntitiesByClasses(Class<?>... classes) {
        return null;
    }

    @Override
    public Collection<Entity> getNearbyEntities(Location location, double x, double y, double z) {
        return null;
    }

    public List<Player> getPlayers() {
        return null;
    }

    public void save() {
    }

    public boolean isAutoSave() {
        return false;
    }

    public void setAutoSave(boolean value) {
    }

    public void setDifficulty(Difficulty difficulty) {
    }

    public Difficulty getDifficulty() {
        return null;
    }

    public BlockMetadataStore getBlockMetadata() {
        return null;
    }

    public boolean hasStorm() {
        return false;
    }

    public void setStorm(boolean hasStorm) {
    }

    public int getWeatherDuration() {
        return 0;
    }

    public void setWeatherDuration(int duration) {
    }

    public boolean isThundering() {
        return false;
    }

    public void setThundering(boolean thundering) {
    }

    public int getThunderDuration() {
        return 0;
    }

    public void setThunderDuration(int duration) {
    }

    public long getSeed() {
        return 0;
    }

    public boolean getPVP() {
        return false;
    }

    public void setPVP(boolean pvp) {
    }

    public void playEffect(Player player, Effect effect, int data) {
    }

    public void playEffect(Location location, Effect effect, int data) {
    }

    public <T> void playEffect(Location loc, Effect effect, T data) {
    }

    public <T> void playEffect(Location loc, Effect effect, T data, int radius) {
    }

    public void playEffect(Location location, Effect effect, int data, int radius) {
    }

    public <T extends Entity> T spawn(Location location, Class<T> clazz) throws IllegalArgumentException {
        return null;
    }

    public FallingBlock spawnFallingBlock(Location location, org.bukkit.Material material, byte data) throws IllegalArgumentException {
        return null;
    }

    public FallingBlock spawnFallingBlock(Location location, int blockId, byte blockData) throws IllegalArgumentException {
        return null;
    }

    @SuppressWarnings("unchecked")
    public net.minecraft.server.Entity createEntity(Location location, Class<? extends Entity> clazz) throws IllegalArgumentException {
        return null;
    }

    @SuppressWarnings("unchecked")
    public <T extends Entity> T addEntity(net.minecraft.server.Entity entity, SpawnReason reason) throws IllegalArgumentException {
        return null;
    }

    public <T extends Entity> T spawn(Location location, Class<T> clazz, SpawnReason reason) throws IllegalArgumentException {
        return null;
    }

    public ChunkSnapshot getEmptyChunkSnapshot(int x, int z, boolean includeBiome, boolean includeBiomeTempRain) {
        return null;
    }

    public void setSpawnFlags(boolean allowMonsters, boolean allowAnimals) {
    }

    public boolean getAllowAnimals() {
        return false;
    }

    public boolean getAllowMonsters() {
        return false;
    }

    public int getMaxHeight() {
        return 0;
    }

    public int getSeaLevel() {
        return 0;
    }

    public boolean getKeepSpawnInMemory() {
        return false;
    }

    public void setKeepSpawnInMemory(boolean keepLoaded) {
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    public File getWorldFolder() {
        return null;
    }

    public void sendPluginMessage(Plugin source, String channel, byte[] message) {
    }

    public Set<String> getListeningPluginChannels() {
        return null;
    }

    public org.bukkit.WorldType getWorldType() {
        return null;
    }

    public boolean canGenerateStructures() {
        return false;
    }

    public long getTicksPerAnimalSpawns() {
        return 0;
    }

    public void setTicksPerAnimalSpawns(int ticksPerAnimalSpawns) {
    }

    public long getTicksPerMonsterSpawns() {
        return 0;
    }

    public void setTicksPerMonsterSpawns(int ticksPerMonsterSpawns) {
    }

    public void setMetadata(String metadataKey, MetadataValue newMetadataValue) {
    }

    public List<MetadataValue> getMetadata(String metadataKey) {
        return null;
    }

    public boolean hasMetadata(String metadataKey) {
        return false;
    }

    public void removeMetadata(String metadataKey, Plugin owningPlugin) {
    }

    public int getMonsterSpawnLimit() {
        return 0;
    }

    public void setMonsterSpawnLimit(int limit) {
    }

    public int getAnimalSpawnLimit() {
        return 0;
    }

    public void setAnimalSpawnLimit(int limit) {
    }

    public int getWaterAnimalSpawnLimit() {
        return 0;
    }

    public void setWaterAnimalSpawnLimit(int limit) {
    }

    public int getAmbientSpawnLimit() {
        return 0;
    }

    public void setAmbientSpawnLimit(int limit) {
    }

    public void playSound(Location loc, Sound sound, float volume, float pitch) {
    }

    public void playSound(Location loc, String sound, float volume, float pitch) {
    }

    public String getGameRuleValue(String rule) {
        return null;
    }

    public boolean setGameRuleValue(String rule, String value) {
        return false;
    }

    public String[] getGameRules() {
        return null;
    }

    public boolean isGameRule(String rule) {
        return false;
    }

    @Override
    public WorldBorder getWorldBorder() {
        return null;
    }

    @Override
    public void spawnParticle(Particle particle, Location location, int count) {
    }

    @Override
    public void spawnParticle(Particle particle, double x, double y, double z, int count) {
    }

    @Override
    public <T> void spawnParticle(Particle particle, Location location, int count, T data) {
    }

    @Override
    public <T> void spawnParticle(Particle particle, double x, double y, double z, int count, T data) {
    }

    @Override
    public void spawnParticle(Particle particle, Location location, int count, double offsetX, double offsetY, double offsetZ) {
    }

    @Override
    public void spawnParticle(Particle particle, double x, double y, double z, int count, double offsetX, double offsetY, double offsetZ) {
    }

    @Override
    public <T> void spawnParticle(Particle particle, Location location, int count, double offsetX, double offsetY, double offsetZ, T data) {
    }

    @Override
    public <T> void spawnParticle(Particle particle, double x, double y, double z, int count, double offsetX, double offsetY, double offsetZ, T data) {
    }

    @Override
    public void spawnParticle(Particle particle, Location location, int count, double offsetX, double offsetY, double offsetZ, double extra) {
    }

    @Override
    public void spawnParticle(Particle particle, double x, double y, double z, int count, double offsetX, double offsetY, double offsetZ, double extra) {
    }

    @Override
    public <T> void spawnParticle(Particle particle, Location location, int count, double offsetX, double offsetY, double offsetZ, double extra, T data) {
    }

    @Override
    public <T> void spawnParticle(Particle particle, double x, double y, double z, int count, double offsetX, double offsetY, double offsetZ, double extra, T data) {
    }

    public void processChunkGC() {
    }
}
