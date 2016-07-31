package net.minecraft.server;

import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.UUID;

public class Village {

    private World a;

    private final List<VillageDoor> b;

    private BlockPosition c;

    private BlockPosition d;

    private int e;

    private int f;

    private int g;

    private int h;

    private int i;

    private final TreeMap<String, Integer> j;

    private final List<Village.Aggressor> k;

    private int l;

    public Village() {
    }

    public Village(World world) {
    }

    public void a(World world) {
    }

    public void a(int i) {
    }

    private Vec3D a(BlockPosition blockposition, int i, int j, int k) {
        return null;
    }

    private boolean a(BlockPosition blockposition, BlockPosition blockposition1) {
        return false;
    }

    private void j() {
    }

    private void k() {
    }

    public BlockPosition a() {
        return null;
    }

    public int b() {
        return 0;
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public int e() {
        return 0;
    }

    public boolean a(BlockPosition blockposition) {
        return false;
    }

    public List<VillageDoor> f() {
        return null;
    }

    public VillageDoor b(BlockPosition blockposition) {
        return null;
    }

    public VillageDoor c(BlockPosition blockposition) {
        return null;
    }

    public VillageDoor e(BlockPosition blockposition) {
        return null;
    }

    public void a(VillageDoor villagedoor) {
    }

    public boolean g() {
        return false;
    }

    public void a(EntityLiving entityliving) {
    }

    public EntityLiving b(EntityLiving entityliving) {
        return null;
    }

    public EntityHuman c(EntityLiving entityliving) {
        return null;
    }

    private void l() {
    }

    private void m() {
    }

    private boolean f(BlockPosition blockposition) {
        return false;
    }

    private void n() {
    }

    public int a(String s) {
        return 0;
    }

    public int a(String s, int i) {
        return 0;
    }

    public boolean d(String s) {
        return false;
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public void h() {
    }

    public boolean i() {
        return false;
    }

    public void b(int i) {
    }

    class Aggressor {

        public EntityLiving a;

        public int b;

        Aggressor(EntityLiving entityliving, int i) {
        }
    }
}
