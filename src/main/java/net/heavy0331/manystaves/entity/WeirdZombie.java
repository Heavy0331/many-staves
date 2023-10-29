package net.heavy0331.manystaves.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.world.World;

public class WeirdZombie extends ZombieEntity {
    public WeirdZombie(EntityType<? extends ZombieEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected boolean burnsInDaylight() {
        return false;
    }
}
