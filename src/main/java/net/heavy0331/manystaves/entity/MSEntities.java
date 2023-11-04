package net.heavy0331.manystaves.entity;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MSEntities implements ModInitializer {
    public static final EntityType<MSEntityType> WERID_ENTITY = Registry.register(Registries.ENTITY_TYPE,
            new Identifier("manystaves", "weird_entity"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, MSEntityType::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f))
                    .build());
    @Override
    public void onInitialize() {

    }
}