package org.ac.algocity;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.ac.algocity.block.ModBlocks;

public class ForgeModBlocks extends ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, "algocity");

    public static final RegistryObject<Block> STONE_DIRT_BLOCK =
            BLOCKS.register(STONE_DIRT_ID,
                    () -> new Block(STONE_DIRT_PROPERTIES));

    public static void register() {
        STONE_DIRT = STONE_DIRT_BLOCK.get();
    }
}