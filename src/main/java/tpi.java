import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.state.EntityRenderState;

public class tpi extends FeatureRenderer {
    public tpi(FeatureRendererContext context, Object models, Object loader) { super(context); }
    @Override
    public void render(Object matrices, Object vertexConsumers, int light, EntityRenderState state, float limbAngle, float limbDistance) {}
}
