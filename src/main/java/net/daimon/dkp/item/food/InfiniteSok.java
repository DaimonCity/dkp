package net.daimon.dkp.item.food;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.UseAction;

public class InfiniteSok extends Item {

    public InfiniteSok() {
        super(new Item.Settings()
                .food(
                        new FoodComponent.Builder()
                                .alwaysEdible()
                                .nutrition(2)
                                .saturationModifier(1.0F)
                                .build()
        ));
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }

}
