package net.mumargius.tutorialwarps.items;

import org.jetbrains.annotations.Nullable;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;

public class WarpFuel extends Item{ //This file is a base for the fuel items. You don't make them here, you make them in the main items file
    private int burnTime=0;
    public WarpFuel(Properties pProperties, int burnTime){
        super(pProperties);
        this.burnTime=burnTime;
    }
    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType){
        return this.burnTime;
    }
}
