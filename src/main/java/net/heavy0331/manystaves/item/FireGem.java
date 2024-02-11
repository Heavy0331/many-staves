package net.heavy0331.manystaves.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
public class FireGem extends Item {
    public FireGem(Settings settings) {
        super(settings.fireproof());
    }
    // Set the player on fire when held
    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (selected) {
            entity.setOnFireFor(1);
        }
    }
    
}
