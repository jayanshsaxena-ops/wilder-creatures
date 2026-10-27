package com.wildercreatures.registry;

import com.wildercreatures.WilderCreatures;
import com.wildercreatures.entity.JaguarEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class ModEntities {
    public static final EntityType<JaguarEntity> JAGUAR = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            ResourceLocation.fromNamespaceAndPath(WilderCreatures.MOD_ID, "jaguar"),
            FabricEntityTypeBuilder.create(MobCategory.CREATURE, JaguarEntity::new)
                    .dimensions(EntityDimensions.scalable(1.1F, 0.95F))
                    .trackRangeBlocks(10)
                    .build()
    );

    public static void register() {
        // Registration happens via static init above
        WilderCreatures.LOGGER.info("Registered entities for " + WilderCreatures.MOD_ID);
    }
}
