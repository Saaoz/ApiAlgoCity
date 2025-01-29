package org.ac.algocity;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import org.ac.algocity.block.ModBlocks;

public class FabricModBlocks extends ModBlocks {
    public static void register() {
        // Création du bloc
        STONE_DIRT = new Block(STONE_DIRT_PROPERTIES);

        // Enregistrement du bloc
        Registry.register(
                BuiltInRegistries.BLOCK,
                new ResourceLocation("algocity", STONE_DIRT_ID),
                STONE_DIRT
        );

        // Enregistrement de l'item du bloc
        Registry.register(
                BuiltInRegistries.ITEM,
                new ResourceLocation("algocity", STONE_DIRT_ID),
                new BlockItem(STONE_DIRT, new FabricItemSettings())
        );
    }
}