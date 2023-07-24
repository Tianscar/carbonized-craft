package com.tianscar.carbonizedcraft.item;

import com.tianscar.carbonizedcraft.block.Blocks;
import com.tianscar.carbonizedcraft.util.NoInstanceError;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HorseArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.tianscar.carbonizedcraft.CarbonizedCraft.NAMESPACE;

public class Items extends net.minecraft.item.Items {

    private Items() {
        throw new NoInstanceError(Items.class);
    }

    public static final Item NETHERITE_HORSE_ARMOR = new NetheriteHorseArmorItem(17, "netherite", new Item.Settings().maxCount(1));
    public static final Item CHAINMAIL_HORSE_ARMOR = new HorseArmorItem(4, "chainmail", new Item.Settings().maxCount(1));

    public static final Item CHARCOAL_BLOCK = new BlockItem(Blocks.CHARCOAL_BLOCK, new Item.Settings());

    public static void register() {
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "netherite_horse_armor"), NETHERITE_HORSE_ARMOR);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "chainmail_horse_armor"), CHAINMAIL_HORSE_ARMOR);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "charcoal_block"), CHARCOAL_BLOCK);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
            content.addAfter(DIAMOND_HORSE_ARMOR, NETHERITE_HORSE_ARMOR);
            content.addAfter(LEATHER_HORSE_ARMOR, CHAINMAIL_HORSE_ARMOR);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            content.addAfter(COAL_BLOCK, CHARCOAL_BLOCK);
        });
    }

}
