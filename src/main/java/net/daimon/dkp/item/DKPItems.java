package net.daimon.dkp.item;

import net.daimon.dkp.Dkp;
import net.daimon.dkp.item.food.InfiniteSok;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class DKPItems {
    public static final Item INFINITE_SOK = register(
            new InfiniteSok(),
            "infinite_sok"
    );
    public static Item register(Item item, String id) {
        Identifier itemID = Identifier.of(Dkp.MOD_ID, id);
        return Registry.register(Registries.ITEM, itemID, item);
    }

    public static void initialize() {

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK)
                .register((itemGroup) -> itemGroup.add(DKPItems.INFINITE_SOK));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SEARCH)
                .register((itemGroup) -> itemGroup.add(DKPItems.INFINITE_SOK));
    }


}
