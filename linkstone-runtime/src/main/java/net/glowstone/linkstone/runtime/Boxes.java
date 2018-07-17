package net.glowstone.linkstone.runtime;

import org.objectweb.asm.Type;

import java.util.*;

/**
 * Datastructure that stores boxes and what type they box.
 */
public class Boxes {
    /**
     * Map box types to the type they are boxing.
     */
    private final Map<Type, Type> boxToBoxed = new HashMap<>();

    /**
     * Map a class to all boxes that can box it.
     */
    private final Map<Type, Set<Type>> boxedToBoxes = new HashMap<>();

    /**
     * Register a new box type
     *
     * @param boxType Type of the box
     * @param boxedType Type that the box contains
     */
    public void addBox(Type boxType, Type boxedType) {
        boxToBoxed.put(boxType, boxedType);
        boxedToBoxes.computeIfAbsent(boxedType, x -> new HashSet<>()).add(boxType);
    }

    /**
     * Check what type a class boxes.
     *
     * @param boxType type of box
     * @return boxed type or null if boxType is not a box
     */
    public Type getBoxedType(Type boxType) {
        return boxToBoxed.get(boxType);
    }

    /**
     * Check what types may box a certain type.
     *
     * @param boxedType type to be boxed
     * @return all available boxes
     */
    public Set<Type> getBoxTypes(Type boxedType) {
        return boxedToBoxes.getOrDefault(boxedType, Collections.emptySet());
    }

    /**
     * @return whether this collection contains no values
     */
    public boolean isEmpty() {
        return boxToBoxed.isEmpty();
    }
}
