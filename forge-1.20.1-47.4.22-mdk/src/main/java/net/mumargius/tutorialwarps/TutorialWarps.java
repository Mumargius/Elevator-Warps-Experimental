package net.mumargius.tutorialwarps;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.mumargius.tutorialwarps.blocks.WarpBlocks;
import net.mumargius.tutorialwarps.items.CreativeTabs;
import net.mumargius.tutorialwarps.items.WarpItems;

@Mod(TutorialWarps.MODID)
public class TutorialWarps
{
    public static final String MODID = "tutorialwarps";


    private static final Logger LOGGER = LogUtils.getLogger();

    public TutorialWarps(FMLJavaModLoadingContext context)
    {
        //Event Busses
        IEventBus modEventBus = context.getModEventBus();
        
        WarpItems.register(modEventBus);
        CreativeTabs.register(modEventBus);
        WarpBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // Add the item data to the standard creative tabs
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
       /*  if(event.getTabKey() == CreativeModeTabs.INGREDIENTS){
            event.accept(WarpItems.TESTBEAR);
            event.accept(WarpItems.WARP_WHISTLE);
        }
        */
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
