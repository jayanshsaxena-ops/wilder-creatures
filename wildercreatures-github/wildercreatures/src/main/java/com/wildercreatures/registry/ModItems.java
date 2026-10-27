package com.wildercreatures.registry;

import com.wildercreatures.WilderCreatures;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SpawnEggItem;

public class ModItems {
    public static final Item JAGUAR_SPAWN_EGG = Registry.register(
            BuiltInRegistries.ITEM,
            ResourceLocation.fromNamespaceAndPath(WilderCreatures.MOD_ID, "jaguar_spawn_egg"),
            new SpawnEggItem(ModEntities.JAGUAR, 0xC4A35A, 0x2C1810, new Item.Properties())
    );

    public static final CreativeModeTab WILDER_CREATURES_TAB = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            ResourceLocation.fromNamespaceAndPath(WilderCreatures.MOD_ID, "main"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(JAGUAR_SPAWN_EGG))
                    .title(Component.translatable("itemGroup.wildercreatures"))
                    .displayItems((params, output) -> {
                        output.accept(JAGUAR_SPAWN_EGG);
                    })
                    .build()
    );

    public static void register() {
        WilderCreatures.LOGGER.info("Registered items and creative tab for " + WilderCreatures.MOD_ID);
    }
}
