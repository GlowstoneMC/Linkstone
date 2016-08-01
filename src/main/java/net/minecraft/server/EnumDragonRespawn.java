package net.minecraft.server;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public enum EnumDragonRespawn {

    START {

        ;

        public void a(WorldServer worldserver, EnderDragonBattle enderdragonbattle, List<EntityEnderCrystal> list, int i, BlockPosition blockposition) {
            BlockPosition blockposition1 = new BlockPosition(0, 128, 0);
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                EntityEnderCrystal entityendercrystal = (EntityEnderCrystal) iterator.next();
                entityendercrystal.setBeamTarget(blockposition1);
            }
            enderdragonbattle.a(null.PREPARING_TO_SUMMON_PILLARS);
        }
    }
    , PREPARING_TO_SUMMON_PILLARS {

        ;

        public void a(WorldServer worldserver, EnderDragonBattle enderdragonbattle, List<EntityEnderCrystal> list, int i, BlockPosition blockposition) {
            if (i < 100) {
                if (i == 0 || i == 50 || i == 51 || i == 52 || i >= 95) {
                    worldserver.triggerEffect(3001, new BlockPosition(0, 128, 0), 0);
                }
            } else {
                enderdragonbattle.a(null.SUMMONING_PILLARS);
            }
        }
    }
    , SUMMONING_PILLARS {

        ;

        public void a(WorldServer worldserver, EnderDragonBattle enderdragonbattle, List<EntityEnderCrystal> list, int i, BlockPosition blockposition) {
            boolean flag = true;
            boolean flag1 = i % 40 == 0;
            boolean flag2 = i % 40 == 39;
            if (flag1 || flag2) {
                WorldGenEnder.Spike[] aworldgenender_spike = BiomeTheEndDecorator.a(worldserver);
                int j = i / 40;
                if (j < aworldgenender_spike.length) {
                    WorldGenEnder.Spike worldgenender_spike = aworldgenender_spike[j];
                    if (flag1) {
                        Iterator iterator = list.iterator();
                        while (iterator.hasNext()) {
                            EntityEnderCrystal entityendercrystal = (EntityEnderCrystal) iterator.next();
                            entityendercrystal.setBeamTarget(new BlockPosition(worldgenender_spike.a(), worldgenender_spike.d() + 1, worldgenender_spike.b()));
                        }
                    } else {
                        boolean flag3 = true;
                        Iterator iterator1 = BlockPosition.b(new BlockPosition(worldgenender_spike.a() - 10, worldgenender_spike.d() - 10, worldgenender_spike.b() - 10), new BlockPosition(worldgenender_spike.a() + 10, worldgenender_spike.d() + 10, worldgenender_spike.b() + 10)).iterator();
                        while (iterator1.hasNext()) {
                            BlockPosition.MutableBlockPosition blockposition_mutableblockposition = (BlockPosition.MutableBlockPosition) iterator1.next();
                            worldserver.setAir(blockposition_mutableblockposition);
                        }
                        worldserver.explode((Entity) null, (double) ((float) worldgenender_spike.a() + 0.5F), (double) worldgenender_spike.d(), (double) ((float) worldgenender_spike.b() + 0.5F), 5.0F, true);
                        WorldGenEnder worldgenender = new WorldGenEnder();
                        worldgenender.a(worldgenender_spike);
                        worldgenender.a(true);
                        worldgenender.a(new BlockPosition(0, 128, 0));
                        worldgenender.generate(worldserver, new Random(), new BlockPosition(worldgenender_spike.a(), 45, worldgenender_spike.b()));
                    }
                } else if (flag1) {
                    enderdragonbattle.a(null.SUMMONING_DRAGON);
                }
            }
        }
    }
    , SUMMONING_DRAGON {

        ;

        public void a(WorldServer worldserver, EnderDragonBattle enderdragonbattle, List<EntityEnderCrystal> list, int i, BlockPosition blockposition) {
            Iterator iterator;
            EntityEnderCrystal entityendercrystal;
            if (i >= 100) {
                enderdragonbattle.a(null.END);
                enderdragonbattle.f();
                iterator = list.iterator();
                while (iterator.hasNext()) {
                    entityendercrystal = (EntityEnderCrystal) iterator.next();
                    entityendercrystal.setBeamTarget((BlockPosition) null);
                    worldserver.explode(entityendercrystal, entityendercrystal.locX, entityendercrystal.locY, entityendercrystal.locZ, 6.0F, false);
                    entityendercrystal.die();
                }
            } else if (i >= 80) {
                worldserver.triggerEffect(3001, new BlockPosition(0, 128, 0), 0);
            } else if (i == 0) {
                iterator = list.iterator();
                while (iterator.hasNext()) {
                    entityendercrystal = (EntityEnderCrystal) iterator.next();
                    entityendercrystal.setBeamTarget(new BlockPosition(0, 128, 0));
                }
            } else if (i < 5) {
                worldserver.triggerEffect(3001, new BlockPosition(0, 128, 0), 0);
            }
        }
    }
    , END {

        ;

        public void a(WorldServer worldserver, EnderDragonBattle enderdragonbattle, List<EntityEnderCrystal> list, int i, BlockPosition blockposition) {
        }
    }
    ;

    private EnumDragonRespawn() {
    }

    public abstract void a(WorldServer worldserver, EnderDragonBattle enderdragonbattle, List<EntityEnderCrystal> list, int i, BlockPosition blockposition);

    EnumDragonRespawn(Object object) {
    }
}
