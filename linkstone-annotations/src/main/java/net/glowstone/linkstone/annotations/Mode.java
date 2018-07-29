package net.glowstone.linkstone.annotations;

public enum Mode {
    /**
     * The annotated package should be renamed to the declared name.
     */
    DEFAULT,

    /**
     * The whole path should be replaced against the declared name.
     */
    ABSOLUTE
}
