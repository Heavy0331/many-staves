package net.heavy0331.manystaves.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.heavy0331.manystaves.ManyStaves;
import net.heavy0331.manystaves.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class MSItemsGroup {
    public static final ItemGroup MANY_STAVES = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ManyStaves.MOD_ID, "manystaves"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.manystaves"))
                    .icon(() -> new ItemStack(MSItems.FIRE_STAFF)).entries((displayContext, entries) -> {
                        entries.add(MSItems.FIRE_STAFF);
                        entries.add(MSItems.WATER_STAFF);
                        entries.add(MSItems.PLANT_STAFF);
                        entries.add(MSItems.FIRE_GEM);
                        entries.add(ModBlocks.FIRE_BLOCK);

                    }).build());


    public static void registerItemGroups() {
        ManyStaves.LOGGER.info("Registering item groups for " + ManyStaves.MOD_ID);
    }
}
