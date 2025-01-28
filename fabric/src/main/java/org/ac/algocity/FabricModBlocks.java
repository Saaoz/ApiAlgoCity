package org.ac.algocity;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;

import net.minecraft.util.Identifier;
import net.minecraft.world.level.block.Block;
import org.ac.algocity.block.ModBlocks;


public class FabricModBlocks extends ModBlocks {
    public static void register() {

    }
}



//public class FabricModBlocks extends ModBlocks {
//    public static void register() {
//        // Création du bloc
//        STONE_DIRT = new Block(STONE_DIRT_PROPERTIES);
//
//        // Enregistrement du bloc
//        Registry.register(
//                Registries.BLOCK,
//                new Identifier("algocity", STONE_DIRT_ID),
//                STONE_DIRT
//        );
//    }
//}