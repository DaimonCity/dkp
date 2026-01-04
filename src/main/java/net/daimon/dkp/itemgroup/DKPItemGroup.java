package net.daimon.dkp.itemgroup;

import net.daimon.dkp.Dkp;
import net.daimon.dkp.item.DKPItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public final class DKPItemGroup {
    public static final ItemGroup NEW_YEAR_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(DKPItems.INFINITE_SOK))
            .displayName(Text.translatable("itemGroup." + Dkp.MOD_ID + ".dkp_group"))
            .entries((context, entries) -> entries.add(DKPItems.INFINITE_SOK))
            .build();


    public static void initialize() {
        Registry.register(Registries.ITEM_GROUP, Identifier.of(Dkp.MOD_ID, "dkp_group"), NEW_YEAR_GROUP);
    }
}
