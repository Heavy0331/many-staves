package net.heavy0331.manystaves.renderer;

import net.heavy0331.manystaves.entity.StaffWraith;
import net.heavy0331.manystaves.model.StaffWraithModel;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;

public class StaffWraithRenderer extends EntityRenderer<StaffWraith> {
    public StaffWraithRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(StaffWraith entity) {
        return null;
    }
}
