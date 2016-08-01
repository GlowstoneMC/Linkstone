package net.minecraft.server;

public class MovingObjectPosition {

    private BlockPosition e;

    public MovingObjectPosition.EnumMovingObjectType type;

    public EnumDirection direction;

    public Vec3D pos;

    public Entity entity;

    public MovingObjectPosition(Vec3D vec3d, EnumDirection enumdirection, BlockPosition blockposition) {
    }

    public MovingObjectPosition(Vec3D vec3d, EnumDirection enumdirection) {
    }

    public MovingObjectPosition(Entity entity) {
    }

    public MovingObjectPosition(MovingObjectPosition.EnumMovingObjectType movingobjectposition_enummovingobjecttype, Vec3D vec3d, EnumDirection enumdirection, BlockPosition blockposition) {
    }

    public MovingObjectPosition(Entity entity, Vec3D vec3d) {
    }

    public BlockPosition a() {
        return null;
    }

    public String toString() {
        return null;
    }

    public static enum EnumMovingObjectType {

        MISS, BLOCK, ENTITY;

        private EnumMovingObjectType() {
        }
    }
}
