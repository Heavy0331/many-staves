package net.heavy0331.manystaves.item;

import net.heavy0331.manystaves.ManyStaves;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MSItems extends Item {

    public MSItems(Settings settings) {
        super(settings);
    }

    public static final Item FIRE_STAFF = registerItem("fire_staff", new FireStaff(new Item.Settings()));
    public static final Item WATER_STAFF = registerItem("water_staff", new Item(new FabricItemSettings()));
    public static final Item PLANT_STAFF = registerItem("plant_staff",new Item(new FabricItemSettings()));
    public static final Item FIRE_GEM = registerItem("fire_gem", new FireGem(new Item.Settings()));
    public static final Item CRASH_ITEM = registerItem("crash_item", new CrashYourGameItem(new FabricItemSettings()));
    private static void addItemsToCreativeTabGroup(FabricItemGroupEntries entries) {
        entries.add(FIRE_STAFF);
        entries.add(WATER_STAFF);
        entries.add(PLANT_STAFF);
        entries.add(FIRE_GEM);
        entries.add(CRASH_ITEM);
    }

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ManyStaves.MOD_ID, name), item);
    }
    public static void registerModItems() {
        ManyStaves.LOGGER.info("Registering items for..." + ManyStaves.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(MSItems::addItemsToCreativeTabGroup);
    }
}
