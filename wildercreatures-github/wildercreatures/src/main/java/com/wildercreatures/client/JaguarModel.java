package com.wildercreatures.client;

import com.wildercreatures.WilderCreatures;
import com.wildercreatures.entity.JaguarEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class JaguarModel extends GeoModel<JaguarEntity> {
    @Override
    public ResourceLocation getModelResource(JaguarEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(WilderCreatures.MOD_ID, "geo/jaguar.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(JaguarEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(WilderCreatures.MOD_ID, "textures/entity/jaguar.png");
    }

    @Override
    public ResourceLocation getAnimationResource(JaguarEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(WilderCreatures.MOD_ID, "animations/jaguar.animation.json");
    }
}
