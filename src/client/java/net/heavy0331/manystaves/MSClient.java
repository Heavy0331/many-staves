package net.heavy0331.manystaves;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.heavy0331.manystaves.entity.StaffWraith;
import net.heavy0331.manystaves.renderer.StaffWraithRenderer;

@Environment(EnvType.CLIENT)
public class MSClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		EntityRendererRegistry.register(StaffWraith.STAFF_WRAITH, StaffWraithRenderer::new);
	}
}