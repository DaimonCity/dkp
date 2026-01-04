package net.daimon.dkp;

import net.daimon.dkp.item.DKPItems;
import net.daimon.dkp.itemgroup.DKPItemGroup;
import net.fabricmc.api.ModInitializer;

public class Dkp implements ModInitializer {
    public static final String MOD_ID = "dkp";

    @Override
    public void onInitialize() {
        DKPItems.initialize();
        DKPItemGroup.initialize();
    }
}
