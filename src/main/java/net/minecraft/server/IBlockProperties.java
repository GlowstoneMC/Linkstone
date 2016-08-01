package net.minecraft.server;

import java.util.List;
import javax.annotation.Nullable;

public interface IBlockProperties {

    Material getMaterial() {
        return null;
    }

    boolean b() {
        return false;
    }

    boolean a(Entity entity) {
        return false;
    }

    int c() {
        return 0;
    }

    int d() {
        return 0;
    }

    boolean f() {
        return false;
    }

    MaterialMapColor g() {
        return null;
    }

    IBlockData a(EnumBlockRotation enumblockrotation) {
        return null;
    }

    IBlockData a(EnumBlockMirror enumblockmirror) {
        return null;
    }

    boolean h() {
        return false;
    }

    EnumRenderType i() {
        return null;
    }

    boolean k() {
        return false;
    }

    boolean l() {
        return false;
    }

    boolean m() {
        return false;
    }

    int a(IBlockAccess iblockaccess, BlockPosition blockposition, EnumDirection enumdirection) {
        return 0;
    }

    boolean n() {
        return false;
    }

    int a(World world, BlockPosition blockposition) {
        return 0;
    }

    float b(World world, BlockPosition blockposition) {
        return 0.0F;
    }

    float a(EntityHuman entityhuman, World world, BlockPosition blockposition) {
        return 0.0F;
    }

    int b(IBlockAccess iblockaccess, BlockPosition blockposition, EnumDirection enumdirection) {
        return 0;
    }

    EnumPistonReaction o() {
        return null;
    }

    IBlockData b(IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    boolean p() {
        return false;
    }

    @Nullable
    AxisAlignedBB d(World world, BlockPosition blockposition) {
        return null;
    }

    void a(World world, BlockPosition blockposition, AxisAlignedBB axisalignedbb, List<AxisAlignedBB> list, @Nullable Entity entity) {
    }

    AxisAlignedBB c(IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    MovingObjectPosition a(World world, BlockPosition blockposition, Vec3D vec3d, Vec3D vec3d1) {
        return null;
    }

    boolean q() {
        return false;
    }
}
