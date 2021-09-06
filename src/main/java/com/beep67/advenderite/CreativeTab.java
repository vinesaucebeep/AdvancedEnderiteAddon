package com.beep67.advenderite;

import com.beep67.advenderite.core.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class CreativeTab {

    public static ItemGroup creativeTab = new ItemGroup("advenderite") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemRegistry.ENDERITE_IRON_INGOT.get());
        }
    };
}
