package com.wildercreatures;

import com.wildercreatures.entity.JaguarEntity;
import com.wildercreatures.registry.ModEntities;
import com.wildercreatures.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.levelgen.Heightmap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WilderCreatures implements ModInitializer {
    public static final String MOD_ID = "wildercreatures";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Wilder Creatures...");

        ModEntities.register();
        ModItems.register();

        // Attributes
        FabricDefaultAttributeRegistry.register(ModEntities.JAGUAR, JaguarEntity.createAttributes());

        // Natural spawning in Jungles and Forests
        BiomeModifications.addSpawn(
                BiomeSelectors.tag(BiomeTags.IS_JUNGLE)
                        .or(BiomeSelectors.tag(BiomeTags.IS_FOREST)),
                MobCategory.CREATURE,
                ModEntities.JAGUAR,
                8,   // spawn weight
                1,   // min group
                2    // max group
        );

        // Spawn placement
        SpawnPlacements.register(
                ModEntities.JAGUAR,
                SpawnPlacementTypes.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules
        );

        LOGGER.info("Wilder Creatures loaded successfully!");
    }
}
