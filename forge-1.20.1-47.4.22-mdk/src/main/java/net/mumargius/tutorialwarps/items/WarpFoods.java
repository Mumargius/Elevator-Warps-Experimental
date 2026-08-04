package net.mumargius.tutorialwarps.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class WarpFoods {
    public static final FoodProperties FOODFORTHOUGHT = new FoodProperties.Builder().nutrition(2).saturationMod(2f)
        .effect(()->new MobEffectInstance(MobEffects.GLOWING, 200), 0.7f).build();
}
