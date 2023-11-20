package net.heavy0331.manystaves.renderer;

import net.heavy0331.manystaves.entity.StaffWraith;
import net.heavy0331.manystaves.model.StaffWraithModel;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

import static net.heavy0331.manystaves.ManyStaves.MOD_ID;

public class StaffWraithRenderer extends MobEntityRenderer<StaffWraith, StaffWraithModel<StaffWraith>> {

    private static final Identifier TEXTURE = new Identifier(MOD_ID, "textures/entity/staff_wraith.png");

    public StaffWraithRenderer(EntityRendererFactory.Context context) {
        super(context, new StaffWraithModel<>(context, StaffWraithModel.getTexturedModelData().createModel()), 0.5f);
    }

    @Override
    public Identifier getTexture(StaffWraith staffWraith) {
        return TEXTURE;
    }
    @Override
    public void render(StaffWraith entity, float f, float g, MatrixStack stack, VertexConsumerProvider vertexConsumerProvider, int i) {
        super.render(entity, f, g, stack, vertexConsumerProvider, i);
    }
}