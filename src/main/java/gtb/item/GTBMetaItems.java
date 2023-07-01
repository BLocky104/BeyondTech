package gtb.item;

import gregtech.api.items.metaitem.ElectricStats;
import gregtech.api.items.metaitem.StandardMetaItem;
import gregtech.api.unification.material.MarkerMaterials.Tier;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.GregTechAPI;
import net.minecraftforge.event.RegistryEvent;
import net.minecraft.item.Item;
import gregtech.api.GTValues;
import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.unification.material.MarkerMaterials;

public class GTBMetaItems {

    public static MetaItem<?> metaitem;

    public static MetaItem<?>.MetaValueItem BASE_EXAMPLE;
    public static MetaItem<?>.MetaValueItem POTATOS;
    public static MetaItem<?>.MetaValueItem CREATIVE_TAB_GOES_BRR;
    public static MetaItem<?>.MetaValueItem HT_ITEM;
    public static MetaItem<?>.MetaValueItem TEST_PROCESSOR;

    public static void preInit() {
        metaitem = new StandardMetaItem();
        metaitem.setRegistryName("gtb_metaitem_0");
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        BASE_EXAMPLE = metaitem.addItem(0, "metaitem.example");

        POTATOS = metaitem.addItem(1, "battery.re.ulv.potatos").addComponents(ElectricStats.createRechargeableBattery(Long.MAX_VALUE, GTValues.ULV)).setUnificationData(OrePrefix.battery, Tier.ULV);

        CREATIVE_TAB_GOES_BRR = metaitem.addItem(2, "metaitem.exampleoncreativetabs").setCreativeTabs(GregTechAPI.TAB_GREGTECH_TOOLS);

        HT_ITEM = metaitem.addItem(3, "metaitem.httest").setInvisibleIf(!GregTechAPI.isHighTier());

        TEST_PROCESSOR = metaitem.addItem(4, "circuit.test").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.ULV);
    }
}
