package com.tianscar.carbonizedcraft.enchantment;

import com.tianscar.carbonizedcraft.util.NoInstanceError;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.tianscar.carbonizedcraft.CarbonizedCraft.NAMESPACE;

public class Enchantments extends net.minecraft.enchantment.Enchantments {

    private Enchantments() {
        throw new NoInstanceError(Enchantments.class);
    }

    public static final Enchantment POTENTIAL = new PotentialEnchantment(Enchantment.Rarity.UNCOMMON, EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND);

    public static void register() {
        Registry.register(Registries.ENCHANTMENT, new Identifier(NAMESPACE, "potential"), POTENTIAL);
    }

}
