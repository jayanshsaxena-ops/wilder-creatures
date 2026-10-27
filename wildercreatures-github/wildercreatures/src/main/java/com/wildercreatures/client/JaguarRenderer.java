package com.wildercreatures.client;

import com.wildercreatures.entity.JaguarEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class JaguarRenderer extends GeoEntityRenderer<JaguarEntity> {
    public JaguarRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new JaguarModel());
        this.shadowRadius = 0.6F;
    }
}
