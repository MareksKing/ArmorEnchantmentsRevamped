package com.mareks.armorenchantmentsrevamped.item;

import com.mareks.armorenchantmentsrevamped.ArmorEnchantmentsRevamped;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, ArmorEnchantmentsRevamped.MOD_ID);

    public static final RegistryObject<Item> IMPACT_ENCHANTED_BOOK = ITEMS.register("Impact EnchantedBook", () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
