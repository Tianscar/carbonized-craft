package com.tianscar.carbonizedcraft.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EquipmentSlot;

public class PotentialEnchantment extends Enchantment {

    public PotentialEnchantment(Rarity weight, EquipmentSlot... slotTypes) {
        super(weight, EnchantmentTarget.TRIDENT, slotTypes);
    }

    public int getMinPower(int level) {
        return 1 + 8 * (level - 1);
    }

    public int getMaxPower(int level) {
        return this.getMinPower(level) + 20;
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public float getAttackDamage(int level, EntityGroup group) {
        return 0.5F * level + 0.5F;
    }

    public boolean canAccept(Enchantment other) {
        return super.canAccept(other) && other != Enchantments.IMPALING;
    }

}
