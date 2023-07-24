package com.tianscar.carbonizedcraft.potion;

import com.tianscar.carbonizedcraft.util.NoInstanceError;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.tianscar.carbonizedcraft.CarbonizedCraft.NAMESPACE;

public class Potions extends net.minecraft.potion.Potions {

    private Potions(){
        throw new NoInstanceError(Potions.class);
    }

    public static final Potion RESISTANCE = new Potion(new StatusEffectInstance(StatusEffects.RESISTANCE, 900));
    public static final Potion LONG_RESISTANCE = new Potion(new StatusEffectInstance(StatusEffects.RESISTANCE, 1800));
    public static final Potion STRONG_RESISTANCE = new Potion(new StatusEffectInstance(StatusEffects.RESISTANCE, 450, 1));
    public static final Potion DECAY = new Potion(new StatusEffectInstance(StatusEffects.WITHER, 800, 1));

    public static void register() {
        Registry.register(Registries.POTION, new Identifier(NAMESPACE, "resistance"), RESISTANCE);
        Registry.register(Registries.POTION, new Identifier(NAMESPACE, "long_resistance"), LONG_RESISTANCE);
        Registry.register(Registries.POTION, new Identifier(NAMESPACE, "strong_resistance"), STRONG_RESISTANCE);
        Registry.register(Registries.POTION, new Identifier(NAMESPACE, "decay"), DECAY);
    }

}
