package beyondtech.item;

import gregtech.api.items.metaitem.StandardMetaItem;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraft.item.Item;
import gregtech.api.items.metaitem.MetaItem;

public static MetaValueItem ITEM_NAME
public static StandardMetaItem METAITEM


public static void whateverFunctionName() {
        METAITEM = new StandardMetaItem();
        METAITEM.setRegistryName("meta_item");
        }

public static void whateverInitItems() {
        ITEM_NAME = METAITEM.addItem(metaValue: int, unlocalizedName: String);
        }

