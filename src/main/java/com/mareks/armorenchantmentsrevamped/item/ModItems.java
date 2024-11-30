package com.mareks.armorenchantmentsrevamped.item;

import com.mareks.armorenchantmentsrevamped.ArmorEnchantmentsRevamped;
import com.mareks.armorenchantmentsrevamped.enchantment.ImpactEnchantment;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModItems {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS =
        DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, ArmorEnchantmentsRevamped.MOD_ID);

    public static final RegistryObject<Enchantment> IMPACT_ENCHANTED_BOOK = ENCHANTMENTS.register("impactenchantedbook", ImpactEnchantment::new);
    public static void register(IEventBus eventBus){
        ENCHANTMENTS.register(eventBus);
    }
}
