package com.beep67.advenderite.core;

import com.beep67.advenderite.AdvEnderite;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AdvEnderite.MOD_ID);

    public static final RegistryObject<Block> ENDERITE_IRON_BLOCK = BLOCKS.register("enderite_iron_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_GREEN).harvestLevel(4).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().strength(55.0f, 1200f).sound(SoundType.NETHERITE_BLOCK)));

}
