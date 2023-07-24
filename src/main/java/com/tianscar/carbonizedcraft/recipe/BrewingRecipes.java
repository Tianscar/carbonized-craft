package com.tianscar.carbonizedcraft.recipe;

import com.tianscar.carbonizedcraft.item.Items;
import com.tianscar.carbonizedcraft.potion.Potions;
import com.tianscar.carbonizedcraft.util.NoInstanceError;
import net.minecraft.recipe.BrewingRecipeRegistry;

public class BrewingRecipes {

    private BrewingRecipes() {
        throw new NoInstanceError(BrewingRecipes.class);
    }

    public static void register() {
        BrewingRecipeRegistry.registerPotionRecipe(Potions.AWKWARD, Items.GOLDEN_APPLE, Potions.RESISTANCE);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.RESISTANCE, Items.REDSTONE, Potions.LONG_RESISTANCE);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.RESISTANCE, Items.GLOWSTONE_DUST, Potions.STRONG_RESISTANCE);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.THICK, Items.WITHER_SKELETON_SKULL, Potions.DECAY);
    }

}
