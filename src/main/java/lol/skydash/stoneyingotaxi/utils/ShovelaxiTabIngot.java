package lol.skydash.stoneyingotaxi.utils;

import lol.skydash.stoneyingotaxi.init.RegisterItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

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
