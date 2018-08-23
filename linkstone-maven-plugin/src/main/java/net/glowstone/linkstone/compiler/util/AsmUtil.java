package net.glowstone.linkstone.compiler.util;

import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.IntInsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.util.Printer;
import org.objectweb.asm.util.Textifier;
import org.objectweb.asm.util.TraceMethodVisitor;

import java.io.PrintWriter;
import java.io.StringWriter;

import static org.objectweb.asm.Opcodes.*;

public class AsmUtil {

    public static String insnToString(AbstractInsnNode insn) {
        Printer printer = new Textifier();

        insn.accept(new TraceMethodVisitor(printer));

        StringWriter sw = new StringWriter();
        printer.print(new PrintWriter(sw));
        return sw.toString().trim();
    }

    public static boolean isIntPush(AbstractInsnNode insn) {
        switch (insn.getOpcode()) {
            case ICONST_M1:
            case ICONST_0:
            case ICONST_1:
            case ICONST_2:
            case ICONST_3:
            case ICONST_4:
            case ICONST_5:
            case BIPUSH:
            case SIPUSH:
                return true;

            case LDC:
                return ((LdcInsnNode) insn).cst instanceof Integer;

            default:
                return false;
        }

    }

    public static boolean isStringPush(AbstractInsnNode pushNameInsn) {
        return pushNameInsn instanceof LdcInsnNode &&
                ((LdcInsnNode) pushNameInsn).cst instanceof String;
    }

    public static AbstractInsnNode pushInt(int value) {
        if (value >= -1 && value <= 5) {
            return new InsnNode(ICONST_0 + value);
        } else if (value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE) {
            return new IntInsnNode(BIPUSH, value);
        } else if (value >= Short.MIN_VALUE && value <= Short.MAX_VALUE) {
            return new IntInsnNode(SIPUSH, value);
        } else {
            return new LdcInsnNode(value);
        }
    }
}
