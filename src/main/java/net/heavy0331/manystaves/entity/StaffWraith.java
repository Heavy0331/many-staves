package net.heavy0331.manystaves.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.heavy0331.manystaves.ManyStaves;
import net.minecraft.entity.*;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;

public class StaffWraith extends HostileEntity implements GeoEntity {
    protected StaffWraith(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    public static boolean canSpawnInDark(EntityType<? extends HostileEntity> type, ServerWorldAccess world, SpawnReason spawnReason, BlockPos pos, Random random) {
        boolean isDarkEnough = world.getBlockState(pos).getLuminance() < 8;
        return isDarkEnough;
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {

    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return null;
    }
    private static final EntityType<StaffWraith> STAFF_WRAITH = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier("manystaves", "staff_wraith"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, StaffWraith::new)
                    .dimensions(EntityDimensions.fixed(0.75f, 0.75f))
                    .build()
    );
    private static final Item STAFF_WRAITH_SPAWN_EGG = Registry.register(Registries.ITEM,
                    new Identifier("manystaves", "staff_wraith_spawn_egg"),
                    new SpawnEggItem(STAFF_WRAITH, 0x000000, 0xFFFFFF,
                    new Item.Settings()));

    public static void logStaffWraith() {
        ManyStaves.LOGGER.info("Registering Staff Wraith :P");
    }
}