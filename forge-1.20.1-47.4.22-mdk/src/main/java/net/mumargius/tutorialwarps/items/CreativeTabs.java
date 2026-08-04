package net.mumargius.tutorialwarps.items;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.mumargius.tutorialwarps.TutorialWarps;
import net.mumargius.tutorialwarps.blocks.WarpBlocks;

public class CreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS=
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialWarps.MODID);

        public static final RegistryObject<CreativeModeTab> OTHERSTUFF = 
        CREATIVE_MODE_TABS.register("otherstuff", 
            () -> CreativeModeTab.builder().icon(()->new ItemStack(WarpItems.TESTBEAR.get()))
                .title(Component.translatable("creativetab.otherstuff_tab"))
                .displayItems((pParameters,pOutput)->{
                    pOutput.accept(WarpItems.TESTBEAR.get());
                    pOutput.accept(WarpItems.WARP_WHISTLE.get());                    
                    pOutput.accept(WarpItems.FOODFORTHOUGHT.get()); //Food and special items are called from the main items file, same with blocks
                    pOutput.accept(WarpItems.HOTSTUFF.get());
                   
                    pOutput.accept(WarpBlocks.BEARBLOCK.get());
                    pOutput.accept(WarpBlocks.OTHERBEARBLOCK.get());
                    //pOutput.accept(WarpBlocks.BEARORE.get());
                    pOutput.accept(WarpBlocks.SPECIALBLOCK.get());
                    


                }).build());

        public static final RegistryObject<CreativeModeTab> OTHEROTHERSTUFF = 
        CREATIVE_MODE_TABS.register("otherotherstuff", 
            () -> CreativeModeTab.builder().icon(()->new ItemStack(WarpItems.TESTBEAR.get()))
                .title(Component.translatable("creativetab.otherotherstuff_tab"))
                .displayItems((pParameters,pOutput)->{
                    pOutput.accept(WarpItems.TESTBEAR.get());
                    //pOutput.accept(WarpItems.WARP_WHISTLE.get());
                   
                    pOutput.accept(WarpBlocks.BEARBLOCK.get());
                    //pOutput.accept(WarpBlocks.OTHERBEARBLOCK.get());


                }).build());
        public static void register(IEventBus eventBus){
            CREATIVE_MODE_TABS.register(eventBus);
        }
}
