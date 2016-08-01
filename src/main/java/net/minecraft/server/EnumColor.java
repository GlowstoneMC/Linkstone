package net.minecraft.server;

public enum EnumColor implements INamable {

    WHITE(0, 15, "white", "white", MaterialMapColor.j, EnumChatFormat.WHITE), ORANGE(1, 14, "orange", "orange", MaterialMapColor.q, EnumChatFormat.GOLD), MAGENTA(2, 13, "magenta", "magenta", MaterialMapColor.r, EnumChatFormat.AQUA), LIGHT_BLUE(3, 12, "light_blue", "lightBlue", MaterialMapColor.s, EnumChatFormat.BLUE), YELLOW(4, 11, "yellow", "yellow", MaterialMapColor.t, EnumChatFormat.YELLOW), LIME(5, 10, "lime", "lime", MaterialMapColor.u, EnumChatFormat.GREEN), PINK(6, 9, "pink", "pink", MaterialMapColor.v, EnumChatFormat.LIGHT_PURPLE), GRAY(7, 8, "gray", "gray", MaterialMapColor.w, EnumChatFormat.DARK_GRAY), SILVER(8, 7, "silver", "silver", MaterialMapColor.x, EnumChatFormat.GRAY), CYAN(9, 6, "cyan", "cyan", MaterialMapColor.y, EnumChatFormat.DARK_AQUA), PURPLE(10, 5, "purple", "purple", MaterialMapColor.z, EnumChatFormat.DARK_PURPLE), BLUE(11, 4, "blue", "blue", MaterialMapColor.A, EnumChatFormat.DARK_BLUE), BROWN(12, 3, "brown", "brown", MaterialMapColor.B, EnumChatFormat.GOLD), GREEN(13, 2, "green", "green", MaterialMapColor.C, EnumChatFormat.DARK_GREEN), RED(14, 1, "red", "red", MaterialMapColor.D, EnumChatFormat.DARK_RED), BLACK(15, 0, "black", "black", MaterialMapColor.E, EnumChatFormat.BLACK);

    private static final EnumColor[] q;

    private static final EnumColor[] r;

    private final int s;

    private final int t;

    private final String u;

    private final String v;

    private final MaterialMapColor w;

    private final EnumChatFormat x;

    private EnumColor(int i, int j, String s, String s1, MaterialMapColor materialmapcolor, EnumChatFormat enumchatformat) {
    }

    public int getColorIndex() {
        return 0;
    }

    public int getInvColorIndex() {
        return 0;
    }

    public String d() {
        return null;
    }

    public MaterialMapColor e() {
        return null;
    }

    public static EnumColor fromInvColorIndex(int i) {
        return null;
    }

    public static EnumColor fromColorIndex(int i) {
        return null;
    }

    public String toString() {
        return null;
    }

    public String getName() {
        return null;
    }

    static {
    }
}
