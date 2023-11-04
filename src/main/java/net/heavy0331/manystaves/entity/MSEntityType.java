package net.heavy0331.manystaves.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class MSEntityType extends PathAwareEntity {
    public MSEntityType(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }
}
