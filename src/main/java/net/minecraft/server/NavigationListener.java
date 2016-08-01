package net.minecraft.server;

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class NavigationListener implements IWorldAccess {

    private final List<NavigationAbstract> a;

    public NavigationListener() {
    }

    public void a(World world, BlockPosition blockposition, IBlockData iblockdata, IBlockData iblockdata1, int i) {
    }

    protected boolean a(World world, BlockPosition blockposition, IBlockData iblockdata, IBlockData iblockdata1) {
        return false;
    }

    public void a(BlockPosition blockposition) {
    }

    public void a(int i, int j, int k, int l, int i1, int j1) {
    }

    public void a(@Nullable EntityHuman entityhuman, SoundEffect soundeffect, SoundCategory soundcategory, double d0, double d1, double d2, float f, float f1) {
    }

    public void a(int i, boolean flag, double d0, double d1, double d2, double d3, double d4, double d5, int... aint) {
    }

    public void a(Entity entity) {
    }

    public void b(Entity entity) {
    }

    public void a(SoundEffect soundeffect, BlockPosition blockposition) {
    }

    public void a(int i, BlockPosition blockposition, int j) {
    }

    public void a(EntityHuman entityhuman, int i, BlockPosition blockposition, int j) {
    }

    public void b(int i, BlockPosition blockposition, int j) {
    }
}
