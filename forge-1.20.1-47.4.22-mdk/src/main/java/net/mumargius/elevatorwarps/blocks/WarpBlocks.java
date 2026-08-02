package net.mumargius.elevatorwarps.blocks;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.ForgeRegistries;
import net.mumargius.elevatorwarps.ElevatorWarps;
import net.mumargius.elevatorwarps.items.WarpItems;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.Item;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.SoundType;
import java.util.function.Supplier;


public class WarpBlocks {
    public static final DeferredRegister<Block> BLOCKS =
        DeferredRegister.create(ForgeRegistries.BLOCKS, ElevatorWarps.MODID);

    //The blocks
    public static final RegistryObject<Block> BEARBLOCK= registerBlock("bearblock",
        ()-> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    
    public static final RegistryObject<Block> OTHERBEARBLOCK= registerBlock("otherbearblock",
        ()-> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));

    /*//The ores (possibly) tutorial episode 5
    public static final RegistryObject<Block> BEARORE= registerBlock("bearore",
        ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE), UniformInt.of(3,6)));
        public static final RegistryObject<Block> DEEPSLATE_BEARORE= registerBlock("deepslatebearore",
        ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE), UniformInt.of(3,6)));
        public static final RegistryObject<Block> NETHER_BEARORE= registerBlock("netherbearore",
        ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERACK), UniformInt.of(3,6)));
        public static final RegistryObject<Block> END_BEARORE= registerBlock("endbearore",
        ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE), UniformInt.of(3,6)));
    public static final RegistryObject<Block> SOME_DIM_BEARORE= registerBlock("some_dim_bearore",
        ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE), UniformInt.of(3,6)));    
    */
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn= BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    
        private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return WarpItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
    BLOCKS.register(eventBus);
    }

}
