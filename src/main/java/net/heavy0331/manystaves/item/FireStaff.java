package net.heavy0331.manystaves.item;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.SmallFireballEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class FireStaff extends Item {
    public FireStaff(Settings settings) {
        super(settings.maxDamage(1500));
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {

        // damage on use
        ItemStack itemStack = playerEntity.getStackInHand(hand);
        itemStack.damage(1, playerEntity, (p) -> p.sendToolBreakStatus(hand));

        SmallFireballEntity smallFireball = new SmallFireballEntity(EntityType.SMALL_FIREBALL, world);
        playerEntity.playSound(SoundEvents.ENTITY_BLAZE_SHOOT, 1.0f, 1.0f);

        // get player's pitch and yaw
        float pitch = playerEntity.getPitch();
        float yaw = playerEntity.getYaw();

        // convert to vector
        Vec3d direction = Vec3d.fromPolar(pitch, yaw);
        smallFireball.updatePosition(
                playerEntity.getX() + direction.x * 2.0D,
                playerEntity.getY() + direction.y * 2.0D + playerEntity.getEyeHeight(playerEntity.getPose()),
                playerEntity.getZ() + direction.z * 2.0D
        );


        // raycasting
        HitResult hitResult = playerEntity.raycast(100.0D, 1.0F, false);
        BlockHitResult blockHitResult = (BlockHitResult) hitResult;
        double distance = blockHitResult.getPos().distanceTo(playerEntity.getPos());

        // adjust fireball velocity the further away the target is
        smallFireball.setVelocity(direction.multiply(distance));


        // set fireball owner to the current player
        smallFireball.setOwner(playerEntity);

        world.spawnEntity(smallFireball);
        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }
}
