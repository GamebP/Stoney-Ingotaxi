package lol.skydash.stoneyingotaxi.utils;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import lol.skydash.stoneyingotaxi.init.RegisterItems;

public class ShovelaxiTabIngot extends CreativeTabs {

    public ShovelaxiTabIngot(String label) {
        super(label);
    }

    @Override
    public String getTranslatedTabLabel() {
        return "Stoney Ingotaxi";
    }

    @Override
    // Change to custom item
    public Item getTabIconItem() {
        return RegisterItems.stoneyIron;
    }
}
