package net.mumargius.tutorialwarps.items;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mumargius.tutorialwarps.TutorialWarps;

public class WarpItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, TutorialWarps.MODID);
    
            //Item datas
        public static final RegistryObject<Item> TESTBEAR = ITEMS.register("testbear", 
            () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> WARP_WHISTLE = ITEMS.register("warpwhistle", 
            () -> new Item(new Item.Properties()));
        /*public static final RegistryObject<Item> SPECIALITEM = ITEMS.register("specialitem", 
            () -> new SpecialItem(new Item.Properties().durability(10))); tutorial episode 6*/
        public static final RegistryObject<Item> FOODFORTHOUGHT = ITEMS.register("foodforthought", 
            () -> new Item(new Item.Properties().food(WarpFoods.FOODFORTHOUGHT)));
        public static final RegistryObject<Item> HOTSTUFF = ITEMS.register("hotstuff", 
            () -> new WarpFuel(new Item.Properties(), 800)); //800 ticks = 60 seconds (20 tiks = 1 second)        

        public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
