package net.heavy0331.manystaves.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class CrashYourGameItem extends Item {
    public CrashYourGameItem(Settings settings) {
        super(settings.maxDamage(1).fireproof());

    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        // damage on use
        ItemStack itemStack = playerEntity.getStackInHand(hand);
        itemStack.damage(1, playerEntity, (p) -> p.sendToolBreakStatus(hand));

        // throw an exception
        throw new RuntimeException("We crashed your game lol");

    }
}
