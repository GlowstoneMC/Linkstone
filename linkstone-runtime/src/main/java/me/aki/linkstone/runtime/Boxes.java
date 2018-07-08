package me.aki.linkstone.runtime;

import org.objectweb.asm.Type;

import java.util.HashMap;
import java.util.Map;

/**
 * Datastructure that stores boxes and what type they box.
 */
public class Boxes {
    /**
     * Map box types to the type they are boxing.
     */
    private final Map<Type, Type> boxes = new HashMap<>();

    /**
     * Register a new box type
     *
     * @param boxType Type of the box
     * @param boxedType Type that the box contains
     */
    public void addBox(Type boxType, Type boxedType) {
        boxes.put(boxType, boxedType);
    }

    /**
     * Check what type a class boxes.
     *
     * @param boxType type of box
     * @return boxed type or null if boxType is not a box
     */
    public Type getBoxedType(Type boxType) {
        return boxes.get(boxType);
    }
}
