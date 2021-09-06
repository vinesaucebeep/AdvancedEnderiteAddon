package com.beep67.advenderite.core;

import com.autovw.advancednetherite.core.ModArmorTiers;
import com.beep67.advenderite.AdvEnderite;
import com.beep67.advenderite.CreativeTab;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.lwjgl.system.CallbackI;

public class ItemRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AdvEnderite.MOD_ID);

    // Enderite/Iron
    public static final RegistryObject<Item> ENDERITE_IRON_INGOT = ITEMS.register("endeite_iron_ingot", () -> new Item(new Item.Properties().tab(CreativeTab.creativeTab).fireResistant()));
    public static final RegistryObject<Item> ENDERITE_IRON_BLOCKITEM = ITEMS.register("enderite_iron_block", () -> new BlockItem(BlockRegistry.ENDERITE_IRON_BLOCK.get(), new Item.Properties().tab(CreativeTab.creativeTab).fireResistant()));
    // Armours
    public static final RegistryObject<Item> ENDERITE_IRON_HELMET = ITEMS.register("enderite_iron_helmet", () -> new ArmorItem(EnderiteArmorTiers.ENDERITE_IRON, EquipmentSlotType.HEAD, (new Item.Properties().tab(CreativeTab.creativeTab).fireResistant())));
    public static final RegistryObject<Item> ENDERITE_IRON_CHESTPLATE = ITEMS.register("enderite_iron_chestplate", () -> new ArmorItem(EnderiteArmorTiers.ENDERITE_IRON, EquipmentSlotType.CHEST, (new Item.Properties().tab(CreativeTab.creativeTab).fireResistant())));
    public static final RegistryObject<Item> ENDERITE_IRON_LEGGINGS = ITEMS.register("enderite_iron_leggings", () -> new ArmorItem(EnderiteArmorTiers.ENDERITE_IRON, EquipmentSlotType.LEGS, (new Item.Properties().tab(CreativeTab.creativeTab).fireResistant())));
    public static final RegistryObject<Item> ENDERITE_IRON_BOOTS = ITEMS.register("enderite_iron_boots", () -> new ArmorItem(EnderiteArmorTiers.ENDERITE_IRON, EquipmentSlotType.FEET, (new Item.Properties().tab(CreativeTab.creativeTab).fireResistant())));

}