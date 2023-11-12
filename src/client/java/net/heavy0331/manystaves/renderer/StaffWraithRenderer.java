package net.heavy0331.manystaves.renderer;

import net.heavy0331.manystaves.entity.StaffWraith;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.SalmonEntityModel;

public class StaffWraithRenderer extends MobEntityRenderer<StaffWraith, SalmonEntityModel> {
    public StaffWraithRenderer(EntityRendererFactory.Context context) {
        super(context, new SalmonEntityModel(context.getPart(StaffWraithTexture.getTexturedModelData())), 0.5f);
    }
}
