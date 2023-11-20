package net.heavy0331.manystaves.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.heavy0331.manystaves.ManyStaves;
import net.minecraft.entity.*;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;

public class StaffWraith extends HostileEntity {
    protected StaffWraith(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    public static final EntityType<StaffWraith> STAFF_WRAITH = registerEntity("staff_wraith", FabricEntityTypeBuilder
            .create(SpawnGroup.MONSTER, StaffWraith::new)
            .dimensions(EntityDimensions.fixed(1.0f, 1.0f)));

    public static final Item STAFF_WRAITH_SPAWN_EGG = registerSpawnEgg("staff_wraith_spawn_egg", STAFF_WRAITH, 0x000000, 0xffffff, new Item.Settings());

    private static EntityType<StaffWraith> registerEntity(String name, FabricEntityTypeBuilder<StaffWraith> entityTypeBuilder) {
        EntityType<StaffWraith> entityType = Registry.register(Registries.ENTITY_TYPE, new Identifier(ManyStaves.MOD_ID, name), entityTypeBuilder.build());
        FabricDefaultAttributeRegistry.register(entityType, StaffWraith.createMobAttributes());
        return entityType;
    }
    private static Item registerSpawnEgg(String name, EntityType<? extends MobEntity> entityType, int primaryColor, int secondaryColor, Item.Settings settings) {
        return Registry.register(Registries.ITEM, new Identifier(ManyStaves.MOD_ID, name), new SpawnEggItem(entityType, primaryColor, secondaryColor, settings));
    }
    public static void logStaffWraith() {
        ManyStaves.LOGGER.info("Registering Staff Wraith :P");
    }
}