package com.beep67.advenderite.core;

import com.autovw.advancednetherite.Reference;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.RegistryObject;

public enum EnderiteArmorTiers implements IArmorMaterial {

    ENDERITE_IRON("enderite_iron", 39, new int[] { 4, 6, 8, 4 }, 15, SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.5F, 0.1F, ItemRegistry.ENDERITE_IRON_INGOT);

    private static final int[] HEALTH_PER_SLOT = new int[] { 15, 17, 18, 13 };
    private final String name;
    private final int durability, enchantmentValue;
    private final int[] slotProtections;
    private final SoundEvent sound;
    private final float toughness, knockbackResistance;
    private final RegistryObject<Item> repairIngredient;

    private EnderiteArmorTiers(String name, int durability, int[] slotProtections, int enchantmentValue, SoundEvent sound, float toughness,
                          float knockbackResistance, RegistryObject<Item> repairIngredient) {
        this.name = name;
        this.durability = durability;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlotType slot) {
        return HEALTH_PER_SLOT[slot.getIndex()] * this.durability;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlotType slot) {
        return this.slotProtections[slot.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.sound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(this.repairIngredient.get());
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return Reference.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}