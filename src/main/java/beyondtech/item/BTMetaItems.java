package beyondtech.item;

        import gregtech.api.GTValues;
        import gregtech.api.items.metaitem.MetaItem;
        import gregtech.api.items.metaitem.MetaOreDictItem;
        import gregtech.api.items.metaitem.StandardMetaItem;
        import gregtech.api.items.metaitem.stats.IItemComponent;
        import gregtech.api.unification.material.info.MaterialIconSet;
        import gregtech.api.unification.ore.OrePrefix;
        import gregtech.common.items.behaviors.TooltipBehavior;
        import net.minecraft.client.resources.I18n;

public class BTMetaItems {
    private static StandardMetaItem metaItem;
    public static MetaOreDictItem oreDictItem;
    public static MetaItem.MetaValueItem BIOWAREMAINFRAME;


    public static void initMetaItems() {
        metaItem = new StandardMetaItem();
        metaItem.setRegistryName("meta_item");
        oreDictItem = new MetaOreDictItem((short)0);
        oreDictItem.setRegistryName("bt_oredict_item");
    }

    public static void initSubItems() {
        initMetaItem();
    }

    public static void initMetaItem() {
        BIOWAREMAINFRAME = metaItem.addItem(2, "bioware.mainframe");
    }

    public static void preInit() {
    }
}
