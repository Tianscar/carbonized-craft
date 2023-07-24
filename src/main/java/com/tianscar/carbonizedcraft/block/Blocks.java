package com.tianscar.carbonizedcraft.block;

import com.tianscar.carbonizedcraft.util.NoInstanceError;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.tianscar.carbonizedcraft.CarbonizedCraft.NAMESPACE;

public class Blocks extends net.minecraft.block.Blocks {

    private Blocks() {
        throw new NoInstanceError(Blocks.class);
    }

    public static final Block CHARCOAL_BLOCK = new Block(AbstractBlock.Settings.copy(COAL_BLOCK));

    public static void register() {
        Registry.register(Registries.BLOCK, new Identifier(NAMESPACE, "charcoal_block"), CHARCOAL_BLOCK);
        FlammableBlockRegistry.getDefaultInstance().add(CHARCOAL_BLOCK, 5, 5);
    }

}
