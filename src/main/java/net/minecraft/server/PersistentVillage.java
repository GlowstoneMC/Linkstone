package net.minecraft.server;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;

public class PersistentVillage extends PersistentBase {

    private World world;

    private final List<BlockPosition> c;

    private final List<VillageDoor> d;

    private final List<Village> villages;

    private int time;

    public PersistentVillage(String s) {
    }

    public PersistentVillage(World world) {
    }

    public void a(World world) {
    }

    public void a(BlockPosition blockposition) {
    }

    public void tick() {
    }

    private void e() {
    }

    public List<Village> getVillages() {
        return null;
    }

    public Village getClosestVillage(BlockPosition blockposition, int i) {
        return null;
    }

    private void f() {
    }

    private void g() {
    }

    private void b(BlockPosition blockposition) {
    }

    private VillageDoor c(BlockPosition blockposition) {
        return null;
    }

    private void d(BlockPosition blockposition) {
    }

    private int a(BlockPosition blockposition, EnumDirection enumdirection, int i) {
        return 0;
    }

    private boolean e(BlockPosition blockposition) {
        return false;
    }

    private boolean f(BlockPosition blockposition) {
        return false;
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public NBTTagCompound b(NBTTagCompound nbttagcompound) {
        return null;
    }

    public static String a(WorldProvider worldprovider) {
        return null;
    }
}
