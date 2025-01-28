package org.ac.algocity.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class ModBlocks {
    // ID de notre bloc
    public static final String STONE_DIRT_ID = "stone_dirt";

    // Le bloc lui-même
    public static Block STONE_DIRT;

    // Propriétés du bloc
    public static final BlockBehaviour.Properties STONE_DIRT_PROPERTIES = BlockBehaviour.Properties
            .of(Material.DIRT)
            .strength(0.5F)
            .sound(SoundType.STONE);
}