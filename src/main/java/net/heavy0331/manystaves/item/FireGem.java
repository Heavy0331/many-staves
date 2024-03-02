package net.heavy0331.manystaves.item;

import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.entity.Entity;

public class FireGem extends Item {
    public FireGem(Settings settings) {
        super(settings.fireproof());
    }

    // set the player on fire while holding the item
    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (selected) {
            entity.setOnFireFor(1);
        }
    }
}
