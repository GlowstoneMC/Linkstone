package net.minecraft.server;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.craftbukkit.util.BlockStateListPopulator;
import org.bukkit.event.block.BlockRedstoneEvent;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;

// CraftBukkit end
public class BlockPumpkin extends BlockFacingHorizontal {

    private ShapeDetector snowGolemPart;

    private ShapeDetector snowGolem;

    private ShapeDetector ironGolemPart;

    private ShapeDetector ironGolem;

    private static final Predicate<IBlockData> e;

    protected BlockPumpkin() {
    }

    public void onPlace(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public boolean b(World world, BlockPosition blockposition) {
        return false;
    }

    private void c(World world, BlockPosition blockposition) {
    }

    public boolean canPlace(World world, BlockPosition blockposition) {
        return false;
    }

    public IBlockData a(IBlockData iblockdata, EnumBlockRotation enumblockrotation) {
        return null;
    }

    public IBlockData a(IBlockData iblockdata, EnumBlockMirror enumblockmirror) {
        return null;
    }

    public IBlockData getPlacedState(World world, BlockPosition blockposition, EnumDirection enumdirection, float f, float f1, float f2, int i, EntityLiving entityliving) {
        return null;
    }

    public IBlockData fromLegacyData(int i) {
        return null;
    }

    public int toLegacyData(IBlockData iblockdata) {
        return 0;
    }

    protected BlockStateList getStateList() {
        return null;
    }

    protected ShapeDetector getDetectorSnowGolemPart() {
        return null;
    }

    protected ShapeDetector getDetectorSnowGolem() {
        return null;
    }

    protected ShapeDetector getDetectorIronGolemPart() {
        return null;
    }

    protected ShapeDetector getDetectorIronGolem() {
        return null;
    }
}
