package com.tianscar.carbonizedcraft.mixin;

import com.tianscar.carbonizedcraft.util.NoInstanceError;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Util;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.EnumMap;
import java.util.function.Supplier;

@Mixin(ArmorMaterials.class)
public class ArmorMaterialsMixin {

    private ArmorMaterialsMixin(String enumName, int ordinal, String name, int durabilityMultiplier, EnumMap protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier repairIngredientSupplier) {
        throw new NoInstanceError(ArmorMaterialsMixin.class);
    }

    @Shadow
    @Mutable
    private static ArmorMaterials[] field_7888;

    @Shadow
    @Mutable
    private static ArmorMaterials CHAIN;

    @Inject(method = "<clinit>()V", at = @At("TAIL"))
    private static void clinit(CallbackInfo info) {
        field_7888[1] = CHAIN = (ArmorMaterials) (Object) new ArmorMaterialsMixin("CHAIN", 1,
                "chainmail", 15, Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
            map.put(ArmorItem.Type.BOOTS, 1);
            map.put(ArmorItem.Type.LEGGINGS, 4);
            map.put(ArmorItem.Type.CHESTPLATE, 5);
            map.put(ArmorItem.Type.HELMET, 2);
        }), 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, () -> {
            return Ingredient.ofItems(new ItemConvertible[]{Items.CHAIN});
        });
    }

}
