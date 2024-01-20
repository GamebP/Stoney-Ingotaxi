package lol.skydash.stoneyingotaxi.init;

import net.minecraft.item.Item;

import cpw.mods.fml.common.registry.GameRegistry;
import lol.skydash.stoneyingotaxi.StoneyIngotaxi;
import lol.skydash.stoneyingotaxi.items.StoneyDiamondItem;
import lol.skydash.stoneyingotaxi.items.StoneyIronItem;
import lol.skydash.stoneyingotaxi.items.StoneyRubbishItem;
import lol.skydash.stoneyingotaxi.utils.Reference;

public class RegisterItems {

    // items
    public static Item stoneyDiamond;
    public static Item stoneyIron;
    public static Item stoneyRubbish;

    public static void init() {}

    public static void register() {
        stoneyDiamond = new StoneyDiamondItem().setUnlocalizedName("stoneyDiamond")
            .setCreativeTab(StoneyIngotaxi.IngotaxiTabIngot)
            .setTextureName(Reference.MOD_ID + ":stoney_diamond");
        stoneyIron = new StoneyIronItem().setUnlocalizedName("stoneyIron")
            .setCreativeTab(StoneyIngotaxi.IngotaxiTabIngot)
            .setTextureName(Reference.MOD_ID + ":stoney_iron");
        stoneyRubbish = new StoneyRubbishItem().setUnlocalizedName("stoneyRubbish")
            .setCreativeTab(StoneyIngotaxi.IngotaxiTabIngot)
            .setTextureName(Reference.MOD_ID + ":stoney_rubbish");
        // register names
        GameRegistry.registerItem(stoneyDiamond, "stoneyDiamond");
        GameRegistry.registerItem(stoneyIron, "stoneyIron");
        GameRegistry.registerItem(stoneyRubbish, "stoneyRubbish");
    }
}
