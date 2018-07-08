package me.aki.linkstone.compiler.transform;

import org.objectweb.asm.Type;
import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

import java.lang.reflect.Modifier;

import static org.objectweb.asm.Opcodes.*;

public class AbstractDelegateGenerator {
    /**
     * Generate a method that redirects call to the annotated field.
     *
     * @param cn where to add the generated method
     * @param instanceField instance that will be invoked
     * @param owner interface containing the method to delegate
     * @param name name of method to be called
     * @param desc descriptor of method to be called
     */
    protected void generateDelegateMethod(ClassNode cn, FieldNode instanceField, Type owner, String name, String desc) {
        if (existsMethod(cn, name, desc)) {
            return;
        }

        MethodNode mn = new MethodNode(ACC_PUBLIC, name, desc, null, null);
        cn.methods.add(mn);

        GeneratorAdapter mv = new GeneratorAdapter(mn, mn.access, mn.name, mn.desc);
        mv.visitCode();

        if (!Modifier.isStatic(instanceField.access)) {
            mv.loadThis();
        }
        mv.getField(Type.getObjectType(cn.name), instanceField.name, Type.getType(instanceField.desc));

        int paramCount = Type.getArgumentTypes(mn.desc).length;
        for (int i = 0; i < paramCount; i++) {
            mv.loadArg(i);
        }

        mv.visitMethodInsn(INVOKEINTERFACE, owner.getInternalName(), name, desc, true);

        mv.returnValue();

        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    private boolean existsMethod(ClassNode cn, String name, String desc) {
        for (MethodNode mn : cn.methods) {
            if (name.equals(mn.name) && desc.equals(mn.desc)) {
                return true;
            }
        }
        return false;
    }

}
