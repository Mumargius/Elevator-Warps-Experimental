package net.mumargius.elevatorwarps.items;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.mumargius.elevatorwarps.ElevatorWarps;

public class CreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS=
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ElevatorWarps.MODID);

        public static final RegistryObject<CreativeModeTab> CREATIVE_TAB = 
        CREATIVE_MODE_TABS.register("bullshits", 
            () -> CreativeModeTab.builder().icon(()->new ItemStack(WarpItems.TESTBEAR.get()))
                .title(Component.translatable("creativetab.elevatorwarps_tab"))
                .displayItems((pParameters,pOutput)->{
                    pOutput.accept(WarpItems.TESTBEAR.get());
                    pOutput.accept(WarpItems.KUMMONSTER.get());

                }).build());

        public static void register(IEventBus eventBus){
            CREATIVE_MODE_TABS.register(eventBus);
        }
}
