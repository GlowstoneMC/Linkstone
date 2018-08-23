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

    /**
     * Does a certain instruction push a int value onto the stack.
     *
     * @param insn instruction to be checked
     * @return does the instruction push a int
     */
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

    /**
     * Does a certain instruction push a String value onto the stack.
     *
     * @param insn instruction to be checked
     * @return does the instruction push a string
     */
    public static boolean isStringPush(AbstractInsnNode insn) {
        return insn instanceof LdcInsnNode &&
                ((LdcInsnNode) insn).cst instanceof String;
    }

    /**
     * Get a {@link AbstractInsnNode} that pushes a certain value onto the stack.
     *
     * @param value int value to be pushed onto to stack
     * @return instruction that pushes the int value
     */
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

    /**
     * Get the integer value that a ICONST, BIPUSH, SIPUSH or LDC
     * instruction pushed onto the stack.
     *
     * @param insn instruction that pushes an integer
     * @return int value pushed by the insn
     */
    public static int getPushedInt(AbstractInsnNode insn) {
        switch (insn.getOpcode()) {
            case ICONST_M1: return -1;
            case ICONST_0: return 0;
            case ICONST_1: return 1;
            case ICONST_2: return 2;
            case ICONST_3: return 3;
            case ICONST_4: return 4;
            case ICONST_5: return 5;

            case BIPUSH:
            case SIPUSH:
                return ((IntInsnNode) insn).operand;

            case LDC:
                Object cst = ((LdcInsnNode) insn).cst;
                if (cst instanceof Integer) {
                    return (Integer) cst;
                }
        }

        throw new IllegalStateException("Expected int push got " + insnToString(insn));
    }
}
