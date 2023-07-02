package beyondtech.item;

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


public class BTMetaItems {


    public static StandardMetaItem metaitem_2;
    public static MetaItem<?>.MetaValueItem BIOWARE_PROCESSOR;
    public static MetaItem<?>.MetaValueItem BIOWARE_MAINFRAME;
    public static MetaItem<?>.MetaValueItem BIOWARE_COMPUTER;
    public static MetaItem<?>.MetaValueItem BIOWARE_ASSEMBLY;

    public static void preInit() {
        metaitem_2 = new StandardMetaItem();
        metaitem_2 .setRegistryName("metaitem_2");
    }
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        BIOWARE_PROCESSOR = metaitem_2.addItem(1, "biowareprocessor");
        BIOWARE_MAINFRAME = metaitem_2.addItem(4, "biowaremainframe");
        BIOWARE_COMPUTER = metaitem_2.addItem(3, "biowarecomputer");
        BIOWARE_ASSEMBLY = metaitem_2.addItem(2, "biowareassembly");

    }
};