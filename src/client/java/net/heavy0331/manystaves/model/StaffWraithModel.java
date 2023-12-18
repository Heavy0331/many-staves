package net.heavy0331.manystaves.model;

import net.heavy0331.manystaves.entity.StaffWraith;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class StaffWraithModel extends EntityModel<StaffWraith> {
    private final ModelPart staff_wraith;
    public StaffWraithModel(ModelPart root) {
        this.staff_wraith = root.getChild("staff_wraith");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData staff_wraith = modelPartData.addChild("staff_wraith", ModelPartBuilder.create().uv(0, 40).cuboid(-3.0F, 0.0F, -1.0F, 2.0F, 16.0F, 2.0F, new Dilation(0.0F))
                .uv(32, 32).cuboid(1.0F, 0.0F, -1.0F, 2.0F, 16.0F, 2.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-4.0F, -16.0F, -4.0F, 8.0F, 16.0F, 8.0F, new Dilation(0.0F))
                .uv(0, 24).cuboid(-4.0F, -24.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 8.0F, 0.0F));

        ModelPartData cube_r1 = staff_wraith.addChild("cube_r1", ModelPartBuilder.create().uv(28, 20).cuboid(-14.0F, 4.0F, -2.0F, 4.0F, 8.0F, 4.0F, new Dilation(0.0F))
                .uv(32, 0).cuboid(-14.0F, -12.0F, -3.0F, 4.0F, 8.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));
        return TexturedModelData.of(modelData, 64, 64);
    }
    @Override
    public void setAngles(StaffWraith entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        staff_wraith.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }
}