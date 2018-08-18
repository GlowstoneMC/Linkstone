package net.glowstone.linkstone.annotations;

/**
 * CraftBukkit releases that can be targeted by the compiler.
 */
public enum Version {
    V1_12_R1("1_12_R1");

    public static Version forName(String name) {
        for (Version version : values()) {
            if (version.getName().equals(name)) {
                return version;
            }
        }
        throw new IllegalArgumentException("No enum named " + name + ".");
    }

    /**
     * Name of the version as set in the maven plugin configuration
     */
    private final String name;

    Version(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
