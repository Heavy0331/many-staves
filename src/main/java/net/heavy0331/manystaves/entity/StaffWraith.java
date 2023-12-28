package net.heavy0331.manystaves.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.heavy0331.manystaves.ManyStaves;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.Monster;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class StaffWraith extends HostileEntity {
    protected StaffWraith(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }
    public static final EntityType<StaffWraith> STAFF_WRAITH = registerEntity("staff_wraith", FabricEntityTypeBuilder
            .create(SpawnGroup.MONSTER, StaffWraith::new)
            .dimensions(EntityDimensions.fixed(0.75f, 2.0f)));
    private static EntityType<StaffWraith> registerEntity(String name, FabricEntityTypeBuilder<StaffWraith> entityTypeBuilder) {
        EntityType<StaffWraith> entityType = Registry.register(Registries.ENTITY_TYPE, new Identifier(ManyStaves.MOD_ID, name), entityTypeBuilder.build());
        FabricDefaultAttributeRegistry.register(entityType, StaffWraith.createMobAttributes());
        return entityType;
    }

    public static DefaultAttributeContainer.Builder registerStaffWraithAttributes() {
        return HostileEntity.createHostileAttributes()
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 25)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.23)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 5.0)
                .add(EntityAttributes.GENERIC_ARMOR, 1.0)
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 15.0D);
    }
    protected boolean burnsInDaylight() {
        return true;
    }
    @Override
    protected void initGoals(){

        this.goalSelector.add(1, new RevengeGoal(this, new Class[0]));
        this.goalSelector.add(2, new MeleeAttackGoal(this, 1.0D, false));
        this.goalSelector.add(3, new FleeEntityGoal(this, WolfEntity.class, 6.0F, 1.0, 1.2));
        this.goalSelector.add(5,new WanderAroundFarGoal(this, 1.0d));
        this.goalSelector.add(6, new LookAtEntityGoal(this, PlayerEntity.class, 8.0F));
        this.targetSelector.add(1, new ActiveTargetGoal(this, PlayerEntity.class,true));
    }

    public static void logStaffWraith() {
        ManyStaves.LOGGER.info("Registering Staff Wraith :P");
    }
}