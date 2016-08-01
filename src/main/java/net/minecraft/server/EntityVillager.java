package net.minecraft.server;

import java.util.Iterator;
import java.util.Random;
import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.entity.CraftVillager;
import org.bukkit.craftbukkit.inventory.CraftMerchantRecipe;
import org.bukkit.entity.Villager;
import org.bukkit.event.entity.VillagerAcquireTradeEvent;
import org.bukkit.event.entity.VillagerReplenishTradeEvent;

// CraftBukkit end
public class EntityVillager extends EntityAgeable implements IMerchant, NPC {

    private static final DataWatcherObject<Integer> by = null;

    private int profession = 0;

    private boolean bA = false;

    private boolean bB = false;

    Village village = null;

    private EntityHuman tradingPlayer = null;

    private MerchantRecipeList trades = null;

    private int bE = 0;

    private boolean bF = false;

    private boolean bG = false;

    public int riches = 0;

    private String bI = null;

    private int bJ = 0;

    private int bK = 0;

    private boolean bL = false;

    private boolean bM = false;

    public final InventorySubcontainer inventory = null;

    private static final EntityVillager.IMerchantRecipeOption[][][][] bO = null;

    public EntityVillager(World world) {
    }

    public EntityVillager(World world, int i) {
    }

    protected void r() {
    }

    private void do_() {
    }

    protected void o() {
    }

    protected void initAttributes() {
    }

    protected void M() {
    }

    public boolean a(EntityHuman entityhuman, EnumHand enumhand, @Nullable ItemStack itemstack) {
        return false;
    }

    protected void i() {
    }

    public static void b(DataConverterManager dataconvertermanager) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    protected boolean isTypeNotPersistent() {
        return false;
    }

    protected SoundEffect G() {
        return null;
    }

    protected SoundEffect bV() {
        return null;
    }

    protected SoundEffect bW() {
        return null;
    }

    public void setProfession(int i) {
    }

    public int getProfession() {
        return 0;
    }

    public boolean df() {
        return false;
    }

    public void p(boolean flag) {
    }

    public void q(boolean flag) {
    }

    public boolean dg() {
        return false;
    }

    public void a(@Nullable EntityLiving entityliving) {
    }

    public void die(DamageSource damagesource) {
    }

    public void setTradingPlayer(EntityHuman entityhuman) {
    }

    public EntityHuman getTrader() {
        return null;
    }

    public boolean dh() {
        return false;
    }

    public boolean r(boolean flag) {
        return false;
    }

    public void s(boolean flag) {
    }

    public void a(MerchantRecipe merchantrecipe) {
    }

    public void a(ItemStack itemstack) {
    }

    public MerchantRecipeList getOffers(EntityHuman entityhuman) {
        return null;
    }

    private void dp() {
    }

    public IChatBaseComponent getScoreboardDisplayName() {
        return null;
    }

    public float getHeadHeight() {
        return 0.0F;
    }

    @Nullable
    public GroupDataEntity prepare(DifficultyDamageScaler difficultydamagescaler, @Nullable GroupDataEntity groupdataentity) {
        return null;
    }

    public void di() {
    }

    public EntityVillager b(EntityAgeable entityageable) {
        return null;
    }

    public boolean a(EntityHuman entityhuman) {
        return false;
    }

    public void onLightningStrike(EntityLightning entitylightning) {
    }

    public InventorySubcontainer dj() {
        return null;
    }

    protected void a(EntityItem entityitem) {
    }

    private boolean a(Item item) {
        return false;
    }

    public boolean dk() {
        return false;
    }

    public boolean dl() {
        return false;
    }

    public boolean dm() {
        return false;
    }

    private boolean m(int i) {
        return false;
    }

    public boolean dn() {
        return false;
    }

    public boolean c(int i, @Nullable ItemStack itemstack) {
        return false;
    }

    public EntityAgeable createChild(EntityAgeable entityageable) {
        return null;
    }

    static class MerchantRecipeOptionProcess implements EntityVillager.IMerchantRecipeOption {

        public ItemStack a = null;

        public EntityVillager.MerchantOptionRandomRange b = null;

        public ItemStack c = null;

        public EntityVillager.MerchantOptionRandomRange d = null;

        public MerchantRecipeOptionProcess(Item item, EntityVillager.MerchantOptionRandomRange entityvillager_merchantoptionrandomrange, Item item1, EntityVillager.MerchantOptionRandomRange entityvillager_merchantoptionrandomrange1) {
        }

        public void a(MerchantRecipeList merchantrecipelist, Random random) {
        }
    }

    static class MerchantRecipeOptionBook implements EntityVillager.IMerchantRecipeOption {

        public MerchantRecipeOptionBook() {
        }

        public void a(MerchantRecipeList merchantrecipelist, Random random) {
        }
    }

    static class MerchantRecipeOptionEnchant implements EntityVillager.IMerchantRecipeOption {

        public ItemStack a = null;

        public EntityVillager.MerchantOptionRandomRange b = null;

        public MerchantRecipeOptionEnchant(Item item, EntityVillager.MerchantOptionRandomRange entityvillager_merchantoptionrandomrange) {
        }

        public void a(MerchantRecipeList merchantrecipelist, Random random) {
        }
    }

    static class MerchantRecipeOptionSell implements EntityVillager.IMerchantRecipeOption {

        public ItemStack a = null;

        public EntityVillager.MerchantOptionRandomRange b = null;

        public MerchantRecipeOptionSell(Item item, EntityVillager.MerchantOptionRandomRange entityvillager_merchantoptionrandomrange) {
        }

        public MerchantRecipeOptionSell(ItemStack itemstack, EntityVillager.MerchantOptionRandomRange entityvillager_merchantoptionrandomrange) {
        }

        public void a(MerchantRecipeList merchantrecipelist, Random random) {
        }
    }

    static class MerchantRecipeOptionBuy implements EntityVillager.IMerchantRecipeOption {

        public Item a = null;

        public EntityVillager.MerchantOptionRandomRange b = null;

        public MerchantRecipeOptionBuy(Item item, EntityVillager.MerchantOptionRandomRange entityvillager_merchantoptionrandomrange) {
        }

        public void a(MerchantRecipeList merchantrecipelist, Random random) {
        }
    }

    interface IMerchantRecipeOption {

        void a(MerchantRecipeList merchantrecipelist, Random random) {
        }
    }

    static class MerchantOptionRandomRange extends Tuple<Integer, Integer> {

        public MerchantOptionRandomRange(int i, int j) {
        }

        public int a(Random random) {
            return 0;
        }
    }
}
