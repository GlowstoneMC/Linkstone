package net.minecraft.server;

import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class Block {

    private static final MinecraftKey a = null;

    public static final RegistryBlocks<MinecraftKey, Block> REGISTRY = null;

    public static final RegistryBlockID<IBlockData> REGISTRY_ID = null;

    public static final AxisAlignedBB j = null;

    public static final AxisAlignedBB k = null;

    private CreativeModeTab creativeTab = null;

    protected boolean l = false;

    protected int m = 0;

    protected boolean n = false;

    protected int o = 0;

    protected boolean p = false;

    protected float strength = 0.0F;

    protected float durability = 0.0F;

    protected boolean s = false;

    protected boolean t = false;

    protected boolean isTileEntity = false;

    protected SoundEffectType stepSound = null;

    public float w = 0.0F;

    protected final Material material = null;

    protected final MaterialMapColor y = null;

    public float frictionFactor = 0.0F;

    protected final BlockStateList blockStateList = null;

    private IBlockData blockData = null;

    private String name = null;

    public static int getId(Block block) {
        return 0;
    }

    public static int getCombinedId(IBlockData iblockdata) {
        return 0;
    }

    public static Block getById(int i) {
        return null;
    }

    public static IBlockData getByCombinedId(int i) {
        return null;
    }

    public static Block asBlock(Item item) {
        return null;
    }

    @Nullable
    public static Block getByName(String s) {
        return null;
    }

    @Deprecated
    public boolean k(IBlockData iblockdata) {
        return false;
    }

    @Deprecated
    public boolean l(IBlockData iblockdata) {
        return false;
    }

    @Deprecated
    public boolean a(IBlockData iblockdata, Entity entity) {
        return false;
    }

    @Deprecated
    public int m(IBlockData iblockdata) {
        return 0;
    }

    @Deprecated
    public int o(IBlockData iblockdata) {
        return 0;
    }

    @Deprecated
    public boolean p(IBlockData iblockdata) {
        return false;
    }

    @Deprecated
    public Material q(IBlockData iblockdata) {
        return null;
    }

    @Deprecated
    public MaterialMapColor r(IBlockData iblockdata) {
        return null;
    }

    @Deprecated
    public IBlockData fromLegacyData(int i) {
        return null;
    }

    public int toLegacyData(IBlockData iblockdata) {
        return 0;
    }

    @Deprecated
    public IBlockData updateState(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    @Deprecated
    public IBlockData a(IBlockData iblockdata, EnumBlockRotation enumblockrotation) {
        return null;
    }

    @Deprecated
    public IBlockData a(IBlockData iblockdata, EnumBlockMirror enumblockmirror) {
        return null;
    }

    public Block(Material material, MaterialMapColor materialmapcolor) {
    }

    protected Block(Material material) {
    }

    protected Block a(SoundEffectType soundeffecttype) {
        return null;
    }

    protected Block d(int i) {
        return null;
    }

    protected Block a(float f) {
        return null;
    }

    protected Block b(float f) {
        return null;
    }

    @Deprecated
    public boolean s(IBlockData iblockdata) {
        return false;
    }

    @Deprecated
    public boolean isOccluding(IBlockData iblockdata) {
        return false;
    }

    public boolean j() {
        return false;
    }

    @Deprecated
    public boolean c(IBlockData iblockdata) {
        return false;
    }

    public boolean b(IBlockAccess iblockaccess, BlockPosition blockposition) {
        return false;
    }

    @Deprecated
    public EnumRenderType a(IBlockData iblockdata) {
        return null;
    }

    public boolean a(IBlockAccess iblockaccess, BlockPosition blockposition) {
        return false;
    }

    protected Block c(float f) {
        return null;
    }

    protected Block k() {
        return null;
    }

    @Deprecated
    public float b(IBlockData iblockdata, World world, BlockPosition blockposition) {
        return 0.0F;
    }

    protected Block a(boolean flag) {
        return null;
    }

    public boolean isTicking() {
        return false;
    }

    public boolean isTileEntity() {
        return false;
    }

    @Deprecated
    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public boolean a(IBlockAccess iblockaccess, BlockPosition blockposition, EnumDirection enumdirection) {
        return false;
    }

    @Deprecated
    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, AxisAlignedBB axisalignedbb, List<AxisAlignedBB> list, @Nullable Entity entity) {
    }

    protected static void a(BlockPosition blockposition, AxisAlignedBB axisalignedbb, List<AxisAlignedBB> list, @Nullable AxisAlignedBB axisalignedbb1) {
    }

    @Deprecated
    @Nullable
    public AxisAlignedBB a(IBlockData iblockdata, World world, BlockPosition blockposition) {
        return null;
    }

    @Deprecated
    public boolean b(IBlockData iblockdata) {
        return false;
    }

    public boolean a(IBlockData iblockdata, boolean flag) {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void a(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    public void b(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    public void postBreak(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    @Deprecated
    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, Block block) {
    }

    public int a(World world) {
        return 0;
    }

    public void onPlace(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public void remove(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public int a(Random random) {
        return 0;
    }

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
        return null;
    }

    @Deprecated
    public float getDamage(IBlockData iblockdata, EntityHuman entityhuman, World world, BlockPosition blockposition) {
        return 0.0F;
    }

    public final void b(World world, BlockPosition blockposition, IBlockData iblockdata, int i) {
    }

    public void dropNaturally(World world, BlockPosition blockposition, IBlockData iblockdata, float f, int i) {
    }

    public static void a(World world, BlockPosition blockposition, ItemStack itemstack) {
    }

    protected void dropExperience(World world, BlockPosition blockposition, int i) {
    }

    public int getDropData(IBlockData iblockdata) {
        return 0;
    }

    public float a(Entity entity) {
        return 0.0F;
    }

    @Deprecated
    @Nullable
    public MovingObjectPosition a(IBlockData iblockdata, World world, BlockPosition blockposition, Vec3D vec3d, Vec3D vec3d1) {
        return null;
    }

    @Nullable
    protected MovingObjectPosition a(BlockPosition blockposition, Vec3D vec3d, Vec3D vec3d1, AxisAlignedBB axisalignedbb) {
        return null;
    }

    public void wasExploded(World world, BlockPosition blockposition, Explosion explosion) {
    }

    public boolean canPlace(World world, BlockPosition blockposition, EnumDirection enumdirection, @Nullable ItemStack itemstack) {
        return false;
    }

    public boolean canPlace(World world, BlockPosition blockposition, EnumDirection enumdirection) {
        return false;
    }

    public boolean canPlace(World world, BlockPosition blockposition) {
        return false;
    }

    public boolean interact(World world, BlockPosition blockposition, IBlockData iblockdata, EntityHuman entityhuman, EnumHand enumhand, @Nullable ItemStack itemstack, EnumDirection enumdirection, float f, float f1, float f2) {
        return false;
    }

    public void stepOn(World world, BlockPosition blockposition, Entity entity) {
    }

    public IBlockData getPlacedState(World world, BlockPosition blockposition, EnumDirection enumdirection, float f, float f1, float f2, int i, EntityLiving entityliving) {
        return null;
    }

    public void attack(World world, BlockPosition blockposition, EntityHuman entityhuman) {
    }

    public Vec3D a(World world, BlockPosition blockposition, Entity entity, Vec3D vec3d) {
        return null;
    }

    @Deprecated
    public int b(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition, EnumDirection enumdirection) {
        return 0;
    }

    @Deprecated
    public boolean isPowerSource(IBlockData iblockdata) {
        return false;
    }

    public void a(World world, BlockPosition blockposition, IBlockData iblockdata, Entity entity) {
    }

    @Deprecated
    public int c(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition, EnumDirection enumdirection) {
        return 0;
    }

    public void a(World world, EntityHuman entityhuman, BlockPosition blockposition, IBlockData iblockdata, @Nullable TileEntity tileentity, @Nullable ItemStack itemstack) {
    }

    protected boolean o() {
        return false;
    }

    @Nullable
    protected ItemStack u(IBlockData iblockdata) {
        return null;
    }

    public int getDropCount(int i, Random random) {
        return 0;
    }

    public void postPlace(World world, BlockPosition blockposition, IBlockData iblockdata, EntityLiving entityliving, ItemStack itemstack) {
    }

    public boolean d() {
        return false;
    }

    public Block c(String s) {
        return null;
    }

    public String getName() {
        return null;
    }

    public String a() {
        return null;
    }

    @Deprecated
    public boolean a(IBlockData iblockdata, World world, BlockPosition blockposition, int i, int j) {
        return false;
    }

    public boolean p() {
        return false;
    }

    protected Block q() {
        return null;
    }

    @Deprecated
    public EnumPistonReaction h(IBlockData iblockdata) {
        return null;
    }

    public void fallOn(World world, BlockPosition blockposition, Entity entity, float f) {
    }

    public void a(World world, Entity entity) {
    }

    @Nullable
    public ItemStack a(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return null;
    }

    public Block a(CreativeModeTab creativemodetab) {
        return null;
    }

    public void a(World world, BlockPosition blockposition, IBlockData iblockdata, EntityHuman entityhuman) {
    }

    public void h(World world, BlockPosition blockposition) {
    }

    public boolean s() {
        return false;
    }

    public boolean a(Explosion explosion) {
        return false;
    }

    public boolean b(Block block) {
        return false;
    }

    public static boolean a(Block block, Block block1) {
        return false;
    }

    @Deprecated
    public boolean isComplexRedstone(IBlockData iblockdata) {
        return false;
    }

    @Deprecated
    public int d(IBlockData iblockdata, World world, BlockPosition blockposition) {
        return 0;
    }

    protected BlockStateList getStateList() {
        return null;
    }

    public BlockStateList t() {
        return null;
    }

    protected final void w(IBlockData iblockdata) {
    }

    public final IBlockData getBlockData() {
        return null;
    }

    public SoundEffectType w() {
        return null;
    }

    public String toString() {
        return null;
    }

    public static void x() {
    }

    // CraftBukkit start
    public int getExpDrop(World world, IBlockData data, int enchantmentLevel) {
        return 0;
    }

    // CraftBukkit end
    private static void a(int i, MinecraftKey minecraftkey, Block block) {
    }

    private static void a(int i, String s, Block block) {
    }
}
