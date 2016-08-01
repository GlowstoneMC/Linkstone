package net.minecraft.server;

import javax.annotation.Nullable;

public interface IDragonController {

    boolean a() {
        return false;
    }

    void b() {
    }

    void c() {
    }

    void a(EntityEnderCrystal entityendercrystal, BlockPosition blockposition, DamageSource damagesource, @Nullable EntityHuman entityhuman) {
    }

    void d() {
    }

    void e() {
    }

    float f() {
        return 0.0F;
    }

    float h() {
        return 0.0F;
    }

    DragonControllerPhase<? extends IDragonController> getControllerPhase() {
        return null;
    }

    @Nullable
    Vec3D g() {
        return null;
    }

    float a(EntityComplexPart entitycomplexpart, DamageSource damagesource, float f) {
        return 0.0F;
    }
}
