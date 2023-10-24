package com.heavy0331.manystaves.item;

import com.heavy0331.manystaves.ManyStaves;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item FIRE_STAFF = registerItem("fire_staff", new Item(new FabricItemSettings()));
    public static final Item WATER_STAFF = registerItem("water_staff", new Item(new FabricItemSettings()));
    public static final Item PLANT_STAFF = registerItem("plant_staff",new Item(new FabricItemSettings()));
    private static void addItemsToCreativeTabGroup(FabricItemGroupEntries entries) {
        entries.add(FIRE_STAFF);
        entries.add(WATER_STAFF);
        entries.add(PLANT_STAFF);
    }

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ManyStaves.MOD_ID, name), item);
    }
    public static void registerModItems() {
        ManyStaves.LOGGER.info("Registering items for..." + ManyStaves.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCreativeTabGroup);
    }
}
