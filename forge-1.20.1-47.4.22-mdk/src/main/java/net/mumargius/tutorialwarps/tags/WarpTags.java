package net.mumargius.tutorialwarps.tags;

import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.mumargius.tutorialwarps.TutorialWarps;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

//this file contains the data so that item and block tags function
//works in conjunction with custom items/block and json files for tagging
public class WarpTags {

    public static class Blocks {
        // public static final TagKey<Block>... episode 11, along with unfinished episode 6

        public static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(TutorialWarps.MODID, name));
        }
    }

    public static class Items {
        public static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(TutorialWarps.MODID, name));
        }
    }
}
