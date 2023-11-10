package net.heavy0331.manystaves.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.heavy0331.manystaves.ManyStaves;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class MSBlocks {

    public static final Block FIRE_BLOCK = registerBlock("fire_block",
            new Block(FabricBlockSettings.copyOf(Blocks.BONE_BLOCK).sounds(BlockSoundGroup.BONE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ManyStaves.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(ManyStaves.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));

    }
    public static void registerModBlocks() {
        ManyStaves.LOGGER.info("Registering blocks for " + ManyStaves.MOD_ID);
    }
}
