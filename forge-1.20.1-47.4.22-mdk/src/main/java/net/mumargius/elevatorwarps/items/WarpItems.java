package net.mumargius.elevatorwarps.items;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mumargius.elevatorwarps.ElevatorWarps;

public class WarpItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, ElevatorWarps.MODID);
    
            //Item datas
        public static final RegistryObject<Item> TESTBEAR = ITEMS.register("testbear", 
            () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> KUMMONSTER = ITEMS.register("kummonster", 
            () -> new Item(new Item.Properties()));

        public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
