/**
 * This file has methods auto-generated (marked with // LinkFiller)
 */
package org.bukkit.craftbukkit;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import net.glowstone.linkstone.annotations.LClassfile;
import org.bukkit.BlockChangeDelegate;
import org.bukkit.Chunk;
import org.bukkit.ChunkSnapshot;
import org.bukkit.Difficulty;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.TreeType;
import org.bukkit.World;
import org.bukkit.WorldBorder;
import org.bukkit.WorldType;
import org.bukkit.block.Biome;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.block.CraftBlock;
import org.bukkit.craftbukkit.entity.CraftEntity;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.FallingBlock;
import org.bukkit.entity.Item;
import org.bukkit.entity.LightningStrike;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.MaterialData;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.Consumer;
import org.bukkit.util.Vector;

import net.glowstone.GlowWorld;
import net.glowstone.block.GlowBlock;
import net.glowstone.entity.GlowEntity;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class CraftWorld implements World {
    public GlowWorld base;
    public CraftWorld(GlowWorld base) {
        this.base = base;
    }

    @Override
    public Set<String> getListeningPluginChannels() {
        return base.getListeningPluginChannels(); // LinkFiller
    }

    @Override
    public void sendPluginMessage(Plugin arg0, String arg1, byte[] arg2) {
        base.sendPluginMessage(arg0, arg1, arg2); // LinkFiller
    }

    @Override
    public List<MetadataValue> getMetadata(String arg0) {
        return base.getMetadata(arg0); // LinkFiller
    }

    @Override
    public boolean hasMetadata(String arg0) {
        return base.hasMetadata(arg0); // LinkFiller
    }

    @Override
    public void removeMetadata(String arg0, Plugin arg1) {
        base.removeMetadata(arg0, arg1); // LinkFiller
    }

    @Override
    public void setMetadata(String arg0, MetadataValue arg1) {
        base.setMetadata(arg0, arg1); // LinkFiller
    }

    @Override
    public boolean canGenerateStructures() {
        return base.canGenerateStructures(); // LinkFiller
    }

    @Override
    public boolean createExplosion(Location arg0, float arg1) {
        return base.createExplosion(arg0, arg1); // LinkFiller
    }

    @Override
    public boolean createExplosion(Location arg0, float arg1, boolean arg2) {
        return base.createExplosion(arg0, arg1, arg2); // LinkFiller
    }

    @Override
    public boolean createExplosion(double arg0, double arg1, double arg2, float arg3) {
        return base.createExplosion(arg0, arg1, arg2, arg3); // LinkFiller
    }

    @Override
    public boolean createExplosion(double arg0, double arg1, double arg2, float arg3, boolean arg4) {
        return base.createExplosion(arg0, arg1, arg2, arg3, arg4); // LinkFiller
    }

    @Override
    public boolean createExplosion(double arg0, double arg1, double arg2, float arg3, boolean arg4, boolean arg5) {
        return base.createExplosion(arg0, arg1, arg2, arg3, arg4, arg5); // LinkFiller
    }

    @Override
    public Item dropItem(Location arg0, ItemStack arg1) {
        return base.dropItem(arg0, arg1); // LinkFiller
    }

    @Override
    public Item dropItemNaturally(Location arg0, ItemStack arg1) {
        return base.dropItemNaturally(arg0, arg1); // LinkFiller
    }

    @Override
    public boolean generateTree(Location arg0, TreeType arg1) {
        return base.generateTree(arg0, arg1); // LinkFiller
    }

    @Override
    public boolean generateTree(Location arg0, TreeType arg1, BlockChangeDelegate arg2) {
        return base.generateTree(arg0, arg1, arg2); // LinkFiller
    }

    @Override
    public boolean getAllowAnimals() {
        return base.getAllowAnimals(); // LinkFiller
    }

    @Override
    public boolean getAllowMonsters() {
        return base.getAllowMonsters(); // LinkFiller
    }

    @Override
    public int getAmbientSpawnLimit() {
        return base.getAmbientSpawnLimit(); // LinkFiller
    }

    @Override
    public int getAnimalSpawnLimit() {
        return base.getAnimalSpawnLimit(); // LinkFiller
    }

    @Override
    public Biome getBiome(int arg0, int arg1) {
        return base.getBiome(arg0, arg1); // LinkFiller
    }

    @Override
    public Block getBlockAt(Location arg0) {
        return new CraftBlock(base.getBlockAt(arg0));
    }

    @Override
    public Block getBlockAt(int arg0, int arg1, int arg2) {
        return new CraftBlock(base.getBlockAt(arg0, arg1, arg2));
    }

    @Override
    public int getBlockTypeIdAt(Location arg0) {
        return base.getBlockTypeIdAt(arg0); // LinkFiller
    }

    @Override
    public int getBlockTypeIdAt(int arg0, int arg1, int arg2) {
        return base.getBlockTypeIdAt(arg0, arg1, arg2); // LinkFiller
    }

    @Override
    public Chunk getChunkAt(Location arg0) {
        return base.getChunkAt(arg0); // LinkFiller // TODO CraftChunk
    }

    @Override
    public Chunk getChunkAt(Block arg0) {
        return base.getChunkAt(arg0); // LinkFiller
    }

    @Override
    public Chunk getChunkAt(int arg0, int arg1) {
        return base.getChunkAt(arg0, arg1); // LinkFiller
    }

    @Override
    public void getChunkAtAsync(Location arg0, ChunkLoadCallback arg1) {
        base.getChunkAtAsync(arg0, arg1); // LinkFiller
    }

    @Override
    public void getChunkAtAsync(Block arg0, ChunkLoadCallback arg1) {
        base.getChunkAtAsync(arg0, arg1); // LinkFiller
    }

    @Override
    public void getChunkAtAsync(int arg0, int arg1, ChunkLoadCallback arg2) {
        base.getChunkAtAsync(arg0, arg1, arg2); // LinkFiller
    }

    @Override
    public int getChunkCount() {
        return base.getChunkCount(); // LinkFiller
    }

    @Override
    public Difficulty getDifficulty() {
        return base.getDifficulty(); // LinkFiller
    }

    @Override
    public ChunkSnapshot getEmptyChunkSnapshot(int arg0, int arg1, boolean arg2, boolean arg3) {
        return base.getEmptyChunkSnapshot(arg0, arg1, arg2, arg3); // LinkFiller
    }

    @Override
    public List<Entity> getEntities() {
        List<Entity> craftlist = new ArrayList<>();
        for (Entity e : base.getEntities())
            craftlist.add(new CraftEntity((GlowEntity) e));

        return craftlist; // LinkFiller
    }

    @Override
    @Deprecated
    public <T extends Entity> Collection<T> getEntitiesByClass(Class<T>... arg0) {
        return base.getEntitiesByClass(arg0); // TODO CraftEntity
    }

    @Override
    public <T extends Entity> Collection<T> getEntitiesByClass(Class<T> arg0) {
        return base.getEntitiesByClass(arg0); // TODO CraftEntity
    }

    @Override
    public Collection<Entity> getEntitiesByClasses(Class<?>... arg0) {
        return base.getEntitiesByClasses(arg0); // LinkFiller
    }

    @Override
    public int getEntityCount() {
        return base.getEntityCount(); // LinkFiller
    }

    @Override
    public Environment getEnvironment() {
        return base.getEnvironment(); // LinkFiller
    }

    @Override
    public long getFullTime() {
        return base.getFullTime(); // LinkFiller
    }

    @Override
    public String getGameRuleValue(String arg0) {
        return base.getGameRuleValue(arg0); // LinkFiller
    }

    @Override
    public String[] getGameRules() {
        return base.getGameRules(); // LinkFiller
    }

    @Override
    public ChunkGenerator getGenerator() {
        return base.getGenerator(); // LinkFiller
    }

    @Override
    public Block getHighestBlockAt(Location arg0) {
        return new CraftBlock((GlowBlock) base.getHighestBlockAt(arg0));
    }

    @Override
    public Block getHighestBlockAt(int arg0, int arg1) {
        return new CraftBlock((GlowBlock) base.getHighestBlockAt(arg0, arg1));
    }

    @Override
    public int getHighestBlockYAt(Location arg0) {
        return base.getHighestBlockYAt(arg0); // LinkFiller
    }

    @Override
    public int getHighestBlockYAt(int arg0, int arg1) {
        return base.getHighestBlockYAt(arg0, arg1); // LinkFiller
    }

    @Override
    public double getHumidity(int arg0, int arg1) {
        return base.getHumidity(arg0, arg1); // LinkFiller
    }

    @Override
    public boolean getKeepSpawnInMemory() {
        return base.getKeepSpawnInMemory(); // LinkFiller
    }

    @Override
    public List<LivingEntity> getLivingEntities() {
        return base.getLivingEntities(); // LinkFiller
    }

    @Override
    public Chunk[] getLoadedChunks() {
        return base.getLoadedChunks(); // LinkFiller
    }

    @Override
    public int getMaxHeight() {
        return base.getMaxHeight(); // LinkFiller
    }

    @Override
    public int getMonsterSpawnLimit() {
        return base.getMonsterSpawnLimit(); // LinkFiller
    }

    @Override
    public String getName() {
        return base.getName(); // LinkFiller
    }

    @Override
    public Collection<Entity> getNearbyEntities(Location arg0, double arg1, double arg2, double arg3) {
        return base.getNearbyEntities(arg0, arg1, arg2, arg3); // LinkFiller
    }

    @Override
    public boolean getPVP() {
        return base.getPVP(); // LinkFiller
    }

    @Override
    public int getPlayerCount() {
        return base.getPlayerCount(); // LinkFiller
    }

    @Override
    public List<Player> getPlayers() {
        return base.getPlayers(); // LinkFiller
    }

    @Override
    public List<BlockPopulator> getPopulators() {
        return base.getPopulators(); // LinkFiller
    }

    @Override
    public int getSeaLevel() {
        return base.getSeaLevel(); // LinkFiller
    }

    @Override
    public long getSeed() {
        return base.getSeed(); // LinkFiller
    }

    @Override
    public Location getSpawnLocation() {
        return base.getSpawnLocation(); // LinkFiller
    }

    @Override
    public double getTemperature(int arg0, int arg1) {
        return base.getTemperature(arg0, arg1); // LinkFiller
    }

    @Override
    public int getThunderDuration() {
        return base.getThunderDuration(); // LinkFiller
    }

    @Override
    @Deprecated
    public int getTickableTileEntityCount() {
        return base.getTickableTileEntityCount(); // LinkFiller
    }

    @Override
    public long getTicksPerAnimalSpawns() {
        return base.getTicksPerAnimalSpawns(); // LinkFiller
    }

    @Override
    public long getTicksPerMonsterSpawns() {
        return base.getTicksPerMonsterSpawns(); // LinkFiller
    }

    @Override
    @Deprecated
    public int getTileEntityCount() {
        return base.getTileEntityCount(); // LinkFiller
    }

    @Override
    public long getTime() {
        return base.getTime(); // LinkFiller
    }

    @Override
    public UUID getUID() {
        return base.getUID(); // LinkFiller
    }

    @Override
    public int getWaterAnimalSpawnLimit() {
        return base.getWaterAnimalSpawnLimit(); // LinkFiller
    }

    @Override
    public int getWeatherDuration() {
        return base.getWeatherDuration(); // LinkFiller
    }

    @Override
    public WorldBorder getWorldBorder() {
        return base.getWorldBorder(); // LinkFiller
    }

    @Override
    public File getWorldFolder() {
        return base.getWorldFolder(); // LinkFiller
    }

    @Override
    public WorldType getWorldType() {
        return base.getWorldType(); // LinkFiller
    }

    @Override
    public boolean hasStorm() {
        return base.hasStorm(); // LinkFiller
    }

    @Override
    public boolean isAutoSave() {
        return base.isAutoSave(); // LinkFiller
    }

    @Override
    public boolean isChunkInUse(int arg0, int arg1) {
        return base.isChunkInUse(arg0, arg1); // LinkFiller
    }

    @Override
    public boolean isChunkLoaded(Chunk arg0) {
        return base.isChunkLoaded(arg0); // LinkFiller
    }

    @Override
    public boolean isChunkLoaded(int arg0, int arg1) {
        return base.isChunkLoaded(arg0, arg1); // LinkFiller
    }

    @Override
    public boolean isGameRule(String arg0) {
        return base.isGameRule(arg0); // LinkFiller
    }

    @Override
    public boolean isThundering() {
        return base.isThundering(); // LinkFiller
    }

    @Override
    public void loadChunk(Chunk arg0) {
        base.loadChunk(arg0); // LinkFiller
    }

    @Override
    public void loadChunk(int arg0, int arg1) {
        base.loadChunk(arg0, arg1); // LinkFiller
    }

    @Override
    public boolean loadChunk(int arg0, int arg1, boolean arg2) {
        return base.loadChunk(arg0, arg1, arg2); // LinkFiller
    }

    @Override
    public void playEffect(Location arg0, Effect arg1, int arg2) {
        base.playEffect(arg0, arg1, arg2); // LinkFiller
    }

    @Override
    public <T> void playEffect(Location arg0, Effect arg1, T arg2) {
        base.playEffect(arg0, arg1, arg2);
    }

    @Override
    public void playEffect(Location arg0, Effect arg1, int arg2, int arg3) {
        base.playEffect(arg0, arg1, arg2, arg3); // LinkFiller
    }

    @Override
    public <T> void playEffect(Location arg0, Effect arg1, T arg2, int arg3) {
        base.playEffect(arg0, arg1, arg2, arg3);
    }

    @Override
    public void playSound(Location arg0, Sound arg1, float arg2, float arg3) {
        base.playSound(arg0, arg1, arg2, arg3); // LinkFiller
    }

    @Override
    public void playSound(Location arg0, String arg1, float arg2, float arg3) {
        base.playSound(arg0, arg1, arg2, arg3); // LinkFiller
    }

    @Override
    public void playSound(Location arg0, Sound arg1, SoundCategory arg2, float arg3, float arg4) {
        base.playSound(arg0, arg1, arg2, arg3, arg4); // LinkFiller
    }

    @Override
    public void playSound(Location arg0, String arg1, SoundCategory arg2, float arg3, float arg4) {
        base.playSound(arg0, arg1, arg2, arg3, arg4); // LinkFiller
    }

    @Override
    public boolean refreshChunk(int arg0, int arg1) {
        return base.refreshChunk(arg0, arg1); // LinkFiller
    }

    @Override
    public boolean regenerateChunk(int arg0, int arg1) {
        return base.regenerateChunk(arg0, arg1); // LinkFiller
    }

    @Override
    public void save() {
        base.save(); // LinkFiller
    }

    @Override
    public void setAmbientSpawnLimit(int arg0) {
        base.setAmbientSpawnLimit(arg0); // LinkFiller
    }

    @Override
    public void setAnimalSpawnLimit(int arg0) {
        base.setAnimalSpawnLimit(arg0); // LinkFiller
    }

    @Override
    public void setAutoSave(boolean arg0) {
        base.setAutoSave(arg0); // LinkFiller
    }

    @Override
    public void setBiome(int arg0, int arg1, Biome arg2) {
        base.setBiome(arg0, arg1, arg2); // LinkFiller
    }

    @Override
    public void setDifficulty(Difficulty arg0) {
        base.setDifficulty(arg0); // LinkFiller
    }

    @Override
    public void setFullTime(long arg0) {
        base.setFullTime(arg0); // LinkFiller
    }

    @Override
    public boolean setGameRuleValue(String arg0, String arg1) {
        return base.setGameRuleValue(arg0, arg1); // LinkFiller
    }

    @Override
    public void setKeepSpawnInMemory(boolean arg0) {
        base.setKeepSpawnInMemory(arg0); // LinkFiller
    }

    @Override
    public void setMonsterSpawnLimit(int arg0) {
        base.setMonsterSpawnLimit(arg0); // LinkFiller
    }

    @Override
    public void setPVP(boolean arg0) {
        base.setPVP(arg0); // LinkFiller
    }

    @Override
    public void setSpawnFlags(boolean arg0, boolean arg1) {
        base.setSpawnFlags(arg0, arg1); // LinkFiller
    }

    @Override
    public boolean setSpawnLocation(Location arg0) {
        return base.setSpawnLocation(arg0); // LinkFiller
    }

    @Override
    public boolean setSpawnLocation(int arg0, int arg1, int arg2) {
        return base.setSpawnLocation(arg0, arg1, arg2); // LinkFiller
    }

    @Override
    public void setStorm(boolean arg0) {
        base.setStorm(arg0); // LinkFiller
    }

    @Override
    public void setThunderDuration(int arg0) {
        base.setThunderDuration(arg0); // LinkFiller
    }

    @Override
    public void setThundering(boolean arg0) {
        base.setThundering(arg0); // LinkFiller
    }

    @Override
    public void setTicksPerAnimalSpawns(int arg0) {
        base.setTicksPerAnimalSpawns(arg0); // LinkFiller
    }

    @Override
    public void setTicksPerMonsterSpawns(int arg0) {
        base.setTicksPerMonsterSpawns(arg0); // LinkFiller
    }

    @Override
    public void setTime(long arg0) {
        base.setTime(arg0); // LinkFiller
    }

    @Override
    public void setWaterAnimalSpawnLimit(int arg0) {
        base.setWaterAnimalSpawnLimit(arg0); // LinkFiller
    }

    @Override
    public void setWeatherDuration(int arg0) {
        base.setWeatherDuration(arg0); // LinkFiller
    }

    @Override
    public <T extends Entity> T spawn(Location arg0, Class<T> arg1) throws IllegalArgumentException {
        return base.spawn(arg0, arg1); // TODO CraftEntity
    }

    @Override
    public <T extends Entity> T spawn(Location arg0, Class<T> arg1, Consumer<T> arg2) throws IllegalArgumentException {
        return null; // TODO CraftEntity
    }

    @Override
    public Arrow spawnArrow(Location arg0, Vector arg1, float arg2, float arg3) {
        return base.spawnArrow(arg0, arg1, arg2, arg3); // LinkFiller
    }

    @Override
    public <T extends Arrow> T spawnArrow(Location arg0, Vector arg1, float arg2, float arg3, Class<T> arg4) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Entity spawnEntity(Location arg0, EntityType arg1) {
        return new CraftEntity((GlowEntity) base.spawnEntity(arg0, arg1));
    }

    @Override
    public FallingBlock spawnFallingBlock(Location arg0, MaterialData arg1) throws IllegalArgumentException {
        return base.spawnFallingBlock(arg0, arg1); // LinkFiller
    }

    @Override
    public FallingBlock spawnFallingBlock(Location arg0, Material arg1, byte arg2) throws IllegalArgumentException {
        return base.spawnFallingBlock(arg0, arg1, arg2); // LinkFiller
    }

    @Override
    public FallingBlock spawnFallingBlock(Location arg0, int arg1, byte arg2) throws IllegalArgumentException {
        return base.spawnFallingBlock(arg0, arg1, arg2); // LinkFiller
    }

    @Override
    public void spawnParticle(Particle arg0, Location arg1, int arg2) {
        base.spawnParticle(arg0, arg1, arg2); // LinkFiller
    }

    @Override
    public <T> void spawnParticle(Particle arg0, Location arg1, int arg2, T arg3) {
        // TODO Auto-generated method stub
    }

    @Override
    public void spawnParticle(Particle arg0, double arg1, double arg2, double arg3, int arg4) {
        base.spawnParticle(arg0, arg1, arg2, arg3, arg4); // LinkFiller
    }

    @Override
    public <T> void spawnParticle(Particle arg0, double arg1, double arg2, double arg3, int arg4, T arg5) {
        // TODO Auto-generated method stub
    }

    @Override
    public void spawnParticle(Particle arg0, Location arg1, int arg2, double arg3, double arg4, double arg5) {
        base.spawnParticle(arg0, arg1, arg2, arg3, arg4, arg5); // LinkFiller
    }

    @Override
    public <T> void spawnParticle(Particle arg0, Location arg1, int arg2, double arg3, double arg4, double arg5,
            T arg6) {
        // TODO Auto-generated method stub
    }

    @Override
    public void spawnParticle(Particle arg0, Location arg1, int arg2, double arg3, double arg4, double arg5,
            double arg6) {
        // TODO Auto-generated method stub
    }

    @Override
    public void spawnParticle(Particle arg0, double arg1, double arg2, double arg3, int arg4, double arg5, double arg6,
            double arg7) {
        // TODO Auto-generated method stub
    }

    @Override
    public <T> void spawnParticle(Particle arg0, Location arg1, int arg2, double arg3, double arg4, double arg5,
            double arg6, T arg7) {
        // TODO Auto-generated method stub
    }

    @Override
    public <T> void spawnParticle(Particle arg0, double arg1, double arg2, double arg3, int arg4, double arg5,
            double arg6, double arg7, T arg8) {
        // TODO Auto-generated method stub
    }

    @Override
    public void spawnParticle(Particle arg0, double arg1, double arg2, double arg3, int arg4, double arg5, double arg6,
            double arg7, double arg8) {
        // TODO Auto-generated method stub
    }

    @Override
    public <T> void spawnParticle(Particle arg0, double arg1, double arg2, double arg3, int arg4, double arg5,
            double arg6, double arg7, double arg8, T arg9) {
        // TODO Auto-generated method stub
    }

    @Override
    public Spigot spigot() {
        return base.spigot(); // LinkFiller
    }

    @Override
    public LightningStrike strikeLightning(Location arg0) {
        return base.strikeLightning(arg0); // LinkFiller
    }

    @Override
    public LightningStrike strikeLightningEffect(Location arg0) {
        return base.strikeLightningEffect(arg0); // LinkFiller
    }

    @Override
    public boolean unloadChunk(Chunk arg0) {
        return base.unloadChunk(arg0); // LinkFiller
    }

    @Override
    public boolean unloadChunk(int arg0, int arg1) {
        return base.unloadChunk(arg0, arg1); // LinkFiller
    }

    @Override
    public boolean unloadChunk(int arg0, int arg1, boolean arg2) {
        return base.unloadChunk(arg0, arg1, arg2); // LinkFiller
    }

    @Override
    public boolean unloadChunk(int arg0, int arg1, boolean arg2, boolean arg3) {
        return base.unloadChunk(arg0, arg1, arg2, arg3); // LinkFiller
    }

    @Override
    public boolean unloadChunkRequest(int arg0, int arg1) {
        return base.unloadChunkRequest(arg0, arg1); // LinkFiller
    }

    @Override
    public boolean unloadChunkRequest(int arg0, int arg1, boolean arg2) {
        return base.unloadChunkRequest(arg0, arg1, arg2); // LinkFiller
    }

    @Override
    public <T> void spawnParticle(Particle arg0, List<Player> arg1, Player arg2, double arg3, double arg4, double arg5,
            int arg6, double arg7, double arg8, double arg9, double arg10, T arg11) {
        // TODO Auto-generated method stub
    }

}