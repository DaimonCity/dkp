package net.daimon.dkp.item.food;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class InfiniteSok extends Item {

    public InfiniteSok() {
        super(new Item.Settings()
                .maxCount(1)
                .rarity(Rarity.UNCOMMON)
                .food(
                        new FoodComponent.Builder()
                                .alwaysEdible()
                                .nutrition(1)
                                .saturationModifier(0.5F)
                                .build()
        ));
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack result = super.finishUsing(stack.copy(), world, user);

        if (user instanceof PlayerEntity player && !player.isCreative()) {
            // если предмет должен быть бесконечным — возвращаем его обратно
            return stack;
        }

        return result;
    }
}
