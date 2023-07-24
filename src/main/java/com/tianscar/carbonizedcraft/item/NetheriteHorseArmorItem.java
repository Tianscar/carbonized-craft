package com.tianscar.carbonizedcraft.item;

import net.minecraft.item.HorseArmorItem;

public class NetheriteHorseArmorItem extends HorseArmorItem {

    public NetheriteHorseArmorItem(int bonus, String name, Settings settings) {
        super(bonus, name, settings);
    }

    @Override
    public boolean isFireproof() {
        return true;
    }

}
