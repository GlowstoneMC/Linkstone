package net.minecraft.server;

import java.util.List;
import javax.annotation.Nullable;

public class TileEntityBanner extends TileEntity {

    public int color = 0;

    public NBTTagList patterns = null;

    private boolean g = false;

    private List<TileEntityBanner.EnumBannerPatternType> h = null;

    private List<EnumColor> i = null;

    private String j = null;

    public TileEntityBanner() {
    }

    public void a(ItemStack itemstack) {
    }

    public NBTTagCompound save(NBTTagCompound nbttagcompound) {
        return null;
    }

    public static void a(NBTTagCompound nbttagcompound, int i, @Nullable NBTTagList nbttaglist) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    @Nullable
    public PacketPlayOutTileEntityData getUpdatePacket() {
        return null;
    }

    public NBTTagCompound c() {
        return null;
    }

    public int d() {
        return 0;
    }

    public static int b(ItemStack itemstack) {
        return 0;
    }

    public static int c(ItemStack itemstack) {
        return 0;
    }

    public NBTTagList g() {
        return null;
    }

    public static void a(ItemStack itemstack, EnumColor enumcolor) {
    }

    public static void e(ItemStack itemstack) {
    }

    public static enum EnumBannerPatternType {

        BASE("base", "b"), SQUARE_BOTTOM_LEFT("square_bottom_left", "bl", "   ", "   ", "#  "), SQUARE_BOTTOM_RIGHT("square_bottom_right", "br", "   ", "   ", "  #"), SQUARE_TOP_LEFT("square_top_left", "tl", "#  ", "   ", "   "), SQUARE_TOP_RIGHT("square_top_right", "tr", "  #", "   ", "   "), STRIPE_BOTTOM("stripe_bottom", "bs", "   ", "   ", "###"), STRIPE_TOP("stripe_top", "ts", "###", "   ", "   "), STRIPE_LEFT("stripe_left", "ls", "#  ", "#  ", "#  "), STRIPE_RIGHT("stripe_right", "rs", "  #", "  #", "  #"), STRIPE_CENTER("stripe_center", "cs", " # ", " # ", " # "), STRIPE_MIDDLE("stripe_middle", "ms", "   ", "###", "   "), STRIPE_DOWNRIGHT("stripe_downright", "drs", "#  ", " # ", "  #"), STRIPE_DOWNLEFT("stripe_downleft", "dls", "  #", " # ", "#  "), STRIPE_SMALL("small_stripes", "ss", "# #", "# #", "   "), CROSS("cross", "cr", "# #", " # ", "# #"), STRAIGHT_CROSS("straight_cross", "sc", " # ", "###", " # "), TRIANGLE_BOTTOM("triangle_bottom", "bt", "   ", " # ", "# #"), TRIANGLE_TOP("triangle_top", "tt", "# #", " # ", "   "), TRIANGLES_BOTTOM("triangles_bottom", "bts", "   ", "# #", " # "), TRIANGLES_TOP("triangles_top", "tts", " # ", "# #", "   "), DIAGONAL_LEFT("diagonal_left", "ld", "## ", "#  ", "   "), DIAGONAL_RIGHT("diagonal_up_right", "rd", "   ", "  #", " ##"), DIAGONAL_LEFT_MIRROR("diagonal_up_left", "lud", "   ", "#  ", "## "), DIAGONAL_RIGHT_MIRROR("diagonal_right", "rud", " ##", "  #", "   "), CIRCLE_MIDDLE("circle", "mc", "   ", " # ", "   "), RHOMBUS_MIDDLE("rhombus", "mr", " # ", "# #", " # "), HALF_VERTICAL("half_vertical", "vh", "## ", "## ", "## "), HALF_HORIZONTAL("half_horizontal", "hh", "###", "###", "   "), HALF_VERTICAL_MIRROR("half_vertical_right", "vhr", " ##", " ##", " ##"), HALF_HORIZONTAL_MIRROR("half_horizontal_bottom", "hhb", "   ", "###", "###"), BORDER("border", "bo", "###", "# #", "###"), CURLY_BORDER("curly_border", "cbo", new ItemStack(Blocks.VINE)), CREEPER("creeper", "cre", new ItemStack(Items.SKULL, 1, 4)), GRADIENT("gradient", "gra", "# #", " # ", " # "), GRADIENT_UP("gradient_up", "gru", " # ", " # ", "# #"), BRICKS("bricks", "bri", new ItemStack(Blocks.BRICK_BLOCK)), SKULL("skull", "sku", new ItemStack(Items.SKULL, 1, 1)), FLOWER("flower", "flo", new ItemStack(Blocks.RED_FLOWER, 1, BlockFlowers.EnumFlowerVarient.OXEYE_DAISY.b())), MOJANG("mojang", "moj", new ItemStack(Items.GOLDEN_APPLE, 1, 1));

        private final String N = null;

        private final String O = null;

        private final String[] P = null;

        private ItemStack Q = null;

        private EnumBannerPatternType(String s, String s1) {
        }

        private EnumBannerPatternType(String s, String s1, ItemStack itemstack) {
        }

        private EnumBannerPatternType(String s, String s1, String s2, String s3, String s4) {
        }

        public String b() {
            return null;
        }

        public String[] c() {
            return null;
        }

        public boolean d() {
            return false;
        }

        public boolean e() {
            return false;
        }

        public ItemStack f() {
            return null;
        }
    }
}
