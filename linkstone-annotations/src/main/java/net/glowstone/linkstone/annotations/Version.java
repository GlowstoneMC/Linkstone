package net.glowstone.linkstone.annotations;

/**
 * Server versions
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

    private final String name;

    Version(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
