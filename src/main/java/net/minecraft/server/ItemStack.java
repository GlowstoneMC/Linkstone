package net.minecraft.server;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import java.text.DecimalFormat;
import java.util.Random;
import javax.annotation.Nullable;
// CraftBukkit start
import java.util.List;
import java.util.Map;
import org.bukkit.Location;
import org.bukkit.TreeType;
import org.bukkit.block.BlockState;
import org.bukkit.craftbukkit.block.CraftBlockState;
import org.bukkit.craftbukkit.util.CraftMagicNumbers;
import org.bukkit.entity.Player;
import org.bukkit.event.world.StructureGrowEvent;

// CraftBukkit end
public final class ItemStack {

    public static final DecimalFormat a = null;

    public int count = 0;

    public int c = 0;

    private Item item = null;

    private NBTTagCompound tag = null;

    private int damage = 0;

    private EntityItemFrame g = null;

    private Block h = null;

    private boolean i = false;

    private Block j = null;

    private boolean k = false;

    public ItemStack(Block block) {
    }

    public ItemStack(Block block, int i) {
    }

    public ItemStack(Block block, int i, int j) {
    }

    public ItemStack(Item item) {
    }

    public ItemStack(Item item, int i) {
    }

    public ItemStack(Item item, int i, int j) {
    }

    public static ItemStack createStack(NBTTagCompound nbttagcompound) {
        return null;
    }

    private ItemStack() {
    }

    public static void a(DataConverterManager dataconvertermanager) {
    }

    public ItemStack cloneAndSubtract(int i) {
        return null;
    }

    public Item getItem() {
        return null;
    }

    public EnumInteractionResult placeItem(EntityHuman entityhuman, World world, BlockPosition blockposition, EnumHand enumhand, EnumDirection enumdirection, float f, float f1, float f2) {
        return null;
    }

    public float a(IBlockData iblockdata) {
        return 0.0F;
    }

    public InteractionResultWrapper<ItemStack> a(World world, EntityHuman entityhuman, EnumHand enumhand) {
        return null;
    }

    @Nullable
    public ItemStack a(World world, EntityLiving entityliving) {
        return null;
    }

    public NBTTagCompound save(NBTTagCompound nbttagcompound) {
        return null;
    }

    public void c(NBTTagCompound nbttagcompound) {
    }

    public int getMaxStackSize() {
        return 0;
    }

    public boolean isStackable() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public boolean usesData() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public int h() {
        return 0;
    }

    public int getData() {
        return 0;
    }

    public void setData(int i) {
    }

    public int j() {
        return 0;
    }

    public boolean isDamaged(int i, Random random) {
        return false;
    }

    public void damage(int i, EntityLiving entityliving) {
    }

    public void a(EntityLiving entityliving, EntityHuman entityhuman) {
    }

    public void a(World world, IBlockData iblockdata, BlockPosition blockposition, EntityHuman entityhuman) {
    }

    public boolean b(IBlockData iblockdata) {
        return false;
    }

    public boolean a(EntityHuman entityhuman, EntityLiving entityliving, EnumHand enumhand) {
        return false;
    }

    public ItemStack cloneItemStack() {
        return null;
    }

    public static boolean equals(@Nullable ItemStack itemstack, @Nullable ItemStack itemstack1) {
        return false;
    }

    public static boolean matches(@Nullable ItemStack itemstack, @Nullable ItemStack itemstack1) {
        return false;
    }

    private boolean e(ItemStack itemstack) {
        return false;
    }

    public static boolean c(@Nullable ItemStack itemstack, @Nullable ItemStack itemstack1) {
        return false;
    }

    public static boolean d(@Nullable ItemStack itemstack, @Nullable ItemStack itemstack1) {
        return false;
    }

    public boolean doMaterialsMatch(@Nullable ItemStack itemstack) {
        return false;
    }

    public boolean b(@Nullable ItemStack itemstack) {
        return false;
    }

    public String a() {
        return null;
    }

    public static ItemStack c(ItemStack itemstack) {
        return null;
    }

    public String toString() {
        return null;
    }

    public void a(World world, Entity entity, int i, boolean flag) {
    }

    public void a(World world, EntityHuman entityhuman, int i) {
    }

    public int l() {
        return 0;
    }

    public EnumAnimation m() {
        return null;
    }

    public void a(World world, EntityLiving entityliving, int i) {
    }

    public boolean hasTag() {
        return false;
    }

    @Nullable
    public NBTTagCompound getTag() {
        return null;
    }

    public NBTTagCompound a(String s, boolean flag) {
        return null;
    }

    public NBTTagList getEnchantments() {
        return null;
    }

    public void setTag(NBTTagCompound nbttagcompound) {
    }

    public String getName() {
        return null;
    }

    public ItemStack c(String s) {
        return null;
    }

    public void r() {
    }

    public boolean hasName() {
        return false;
    }

    public EnumItemRarity u() {
        return null;
    }

    public boolean v() {
        return false;
    }

    public void addEnchantment(Enchantment enchantment, int i) {
    }

    public boolean hasEnchantments() {
        return false;
    }

    public void a(String s, NBTBase nbtbase) {
    }

    public boolean x() {
        return false;
    }

    public boolean y() {
        return false;
    }

    public void a(EntityItemFrame entityitemframe) {
    }

    @Nullable
    public EntityItemFrame z() {
        return null;
    }

    public int getRepairCost() {
        return 0;
    }

    public void setRepairCost(int i) {
    }

    public Multimap<String, AttributeModifier> a(EnumItemSlot enumitemslot) {
        return null;
    }

    public void a(String s, AttributeModifier attributemodifier, EnumItemSlot enumitemslot) {
    }

    @Deprecated
    public void setItem(Item item) {
    }

    public IChatBaseComponent B() {
        return null;
    }

    public boolean a(Block block) {
        return false;
    }

    public boolean b(Block block) {
        return false;
    }
}
