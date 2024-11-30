package com.mareks.armorenchantmentsrevamped.enchantment;


import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

import java.util.Set;

public class ImpactEnchantment extends CustomEnchantment {
    public ImpactEnchantment() {
        super(Rarity.COMMON, EnchantmentCategory.ARMOR, new EquipmentSlot[]{EquipmentSlot.LEGS, EquipmentSlot.CHEST, EquipmentSlot.FEET, EquipmentSlot.HEAD});
    }


    @Override
    public int getMaxLevel() {
        return 4;
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack) {
        return true;
    }
}

