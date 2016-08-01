package net.minecraft.server;

import com.google.common.base.Function;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import javax.annotation.Nullable;

public class Item {

    public static final RegistryMaterials<MinecraftKey, Item> REGISTRY;

    private static final Map<Block, Item> a;

    private static final IDynamicTexture b;

    private static final IDynamicTexture c;

    private static final IDynamicTexture d;

    private static final IDynamicTexture e;

    private final IRegistry<MinecraftKey, IDynamicTexture> f;

    protected static final UUID h;

    protected static final UUID i;

    private CreativeModeTab n;

    protected static Random j;

    protected int maxStackSize;

    private int durability;

    protected boolean l;

    protected boolean m;

    private Item craftingResult;

    private String name;

    public static int getId(Item item) {
        return 0;
    }

    public static Item getById(int i) {
        return null;
    }

    @Nullable
    public static Item getItemOf(Block block) {
        return null;
    }

    public static Item d(String s) {
        return null;
    }

    public final void a(MinecraftKey minecraftkey, IDynamicTexture idynamictexture) {
    }

    public boolean a(NBTTagCompound nbttagcompound) {
        return false;
    }

    public Item() {
    }

    public Item d(int i) {
        return null;
    }

    public EnumInteractionResult a(ItemStack itemstack, EntityHuman entityhuman, World world, BlockPosition blockposition, EnumHand enumhand, EnumDirection enumdirection, float f, float f1, float f2) {
        return null;
    }

    public float getDestroySpeed(ItemStack itemstack, IBlockData iblockdata) {
        return 0.0F;
    }

    public InteractionResultWrapper<ItemStack> a(ItemStack itemstack, World world, EntityHuman entityhuman, EnumHand enumhand) {
        return null;
    }

    @Nullable
    public ItemStack a(ItemStack itemstack, World world, EntityLiving entityliving) {
        return null;
    }

    public int getMaxStackSize() {
        return 0;
    }

    public int filterData(int i) {
        return 0;
    }

    public boolean k() {
        return false;
    }

    protected Item a(boolean flag) {
        return null;
    }

    public int getMaxDurability() {
        return 0;
    }

    protected Item setMaxDurability(int i) {
        return null;
    }

    public boolean usesDurability() {
        return false;
    }

    public boolean a(ItemStack itemstack, EntityLiving entityliving, EntityLiving entityliving1) {
        return false;
    }

    public boolean a(ItemStack itemstack, World world, IBlockData iblockdata, BlockPosition blockposition, EntityLiving entityliving) {
        return false;
    }

    public boolean canDestroySpecialBlock(IBlockData iblockdata) {
        return false;
    }

    public boolean a(ItemStack itemstack, EntityHuman entityhuman, EntityLiving entityliving, EnumHand enumhand) {
        return false;
    }

    public Item n() {
        return null;
    }

    public Item c(String s) {
        return null;
    }

    public String j(ItemStack itemstack) {
        return null;
    }

    public String getName() {
        return null;
    }

    public String f_(ItemStack itemstack) {
        return null;
    }

    public Item b(Item item) {
        return null;
    }

    public boolean p() {
        return false;
    }

    public Item q() {
        return null;
    }

    public boolean r() {
        return false;
    }

    public void a(ItemStack itemstack, World world, Entity entity, int i, boolean flag) {
    }

    public void b(ItemStack itemstack, World world, EntityHuman entityhuman) {
    }

    public boolean f() {
        return false;
    }

    public EnumAnimation f(ItemStack itemstack) {
        return null;
    }

    public int e(ItemStack itemstack) {
        return 0;
    }

    public void a(ItemStack itemstack, World world, EntityLiving entityliving, int i) {
    }

    public String a(ItemStack itemstack) {
        return null;
    }

    public EnumItemRarity g(ItemStack itemstack) {
        return null;
    }

    public boolean g_(ItemStack itemstack) {
        return false;
    }

    protected MovingObjectPosition a(World world, EntityHuman entityhuman, boolean flag) {
        return null;
    }

    public int c() {
        return 0;
    }

    public Item a(CreativeModeTab creativemodetab) {
        return null;
    }

    public boolean s() {
        return false;
    }

    public boolean a(ItemStack itemstack, ItemStack itemstack1) {
        return false;
    }

    public Multimap<String, AttributeModifier> a(EnumItemSlot enumitemslot) {
        return null;
    }

    public static void t() {
    }

    private static void b(Block block) {
    }

    protected static void a(Block block, Item item) {
    }

    private static void a(int i, String s, Item item) {
    }

    private static void a(int i, MinecraftKey minecraftkey, Item item) {
    }

    public static enum EnumToolMaterial {

        WOOD(0, 59, 2.0F, 0.0F, 15), STONE(1, 131, 4.0F, 1.0F, 5), IRON(2, 250, 6.0F, 2.0F, 14), DIAMOND(3, 1561, 8.0F, 3.0F, 10), GOLD(0, 32, 12.0F, 0.0F, 22);

        private final int f;

        private final int g;

        private final float h;

        private final float i;

        private final int j;

        private EnumToolMaterial(int i, int j, float f, float f1, int k) {
        }

        public int a() {
            return 0;
        }

        public float b() {
            return 0.0F;
        }

        public float c() {
            return 0.0F;
        }

        public int d() {
            return 0;
        }

        public int e() {
            return 0;
        }

        public Item f() {
            return null;
        }
    }
}
