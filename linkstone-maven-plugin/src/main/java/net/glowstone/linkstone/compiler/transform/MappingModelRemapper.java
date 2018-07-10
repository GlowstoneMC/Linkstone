package net.glowstone.linkstone.compiler.transform;

import net.glowstone.linkstone.compiler.MappingModel;
import org.objectweb.asm.commons.Remapper;

/**
 * Adapter for the ASM {@link Remapper} type
 */
public class MappingModelRemapper extends Remapper {
    private final MappingModel mappingModel;

    public MappingModelRemapper(MappingModel mappingModel) {
        this.mappingModel = mappingModel;
    }

    @Override
    public String map(String internalName) {
        return mappingModel.resolveClass(internalName);
    }

    @Override
    public String mapFieldName(String owner, String name, String descriptor) {
        return mappingModel.resolveFieldName(owner, name, descriptor);
    }

    @Override
    public String mapMethodName(String owner, String name, String descriptor) {
        return mappingModel.resolveMethodName(owner, name, descriptor);
    }
}
