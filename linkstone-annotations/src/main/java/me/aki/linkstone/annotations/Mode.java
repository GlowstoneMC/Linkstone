package me.aki.linkstone.annotations;

public enum Mode {
    /**
     * The annotated package should be renamed to the declared name
     */
    SELF,

    /**
     * The whole path should be replaced against the declared name
     */
    ABSOLUTE
}
