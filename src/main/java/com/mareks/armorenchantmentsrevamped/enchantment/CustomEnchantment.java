package com.mareks.armorenchantmentsrevamped.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class CustomEnchantment extends Enchantment {
    public CustomEnchantment(Enchantment.Rarity rarity, EnchantmentCategory category, EquipmentSlot ...slots){
        super(rarity, category, slots);
    }
}
