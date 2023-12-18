package net.heavy0331.manystaves.renderer;

import net.heavy0331.manystaves.entity.StaffWraith;
import net.heavy0331.manystaves.model.StaffWraithModel;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import static net.heavy0331.manystaves.ManyStaves.MOD_ID;

// TODO: Fix the Invisible Staff Wraith bug
public class StaffWraithRenderer extends MobEntityRenderer<StaffWraith, StaffWraithModel> {
    private static final Identifier TEXTURE = new Identifier(MOD_ID, "textures/entity/staff_wraith.png");

    public StaffWraithRenderer(EntityRendererFactory.Context context) {
        super(context, new StaffWraithModel(StaffWraithModel.getTexturedModelData().createModel()), 0.5f);
    }

    @Override
    public Identifier getTexture(StaffWraith entity) {
        return TEXTURE;
    }
}
