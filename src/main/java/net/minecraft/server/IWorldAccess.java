package net.minecraft.server;

import javax.annotation.Nullable;

public interface IWorldAccess {

    void a(World world, BlockPosition blockposition, IBlockData iblockdata, IBlockData iblockdata1, int i) {
    }

    void a(BlockPosition blockposition) {
    }

    void a(int i, int j, int k, int l, int i1, int j1) {
    }

    void a(@Nullable EntityHuman entityhuman, SoundEffect soundeffect, SoundCategory soundcategory, double d0, double d1, double d2, float f, float f1) {
    }

    void a(SoundEffect soundeffect, BlockPosition blockposition) {
    }

    void a(int i, boolean flag, double d0, double d1, double d2, double d3, double d4, double d5, int... aint) {
    }

    void a(Entity entity) {
    }

    void b(Entity entity) {
    }

    void a(int i, BlockPosition blockposition, int j) {
    }

    void a(EntityHuman entityhuman, int i, BlockPosition blockposition, int j) {
    }

    void b(int i, BlockPosition blockposition, int j) {
    }
}
