import net.minecraft.client.render.VertexFormat;
import net.minecraft.util.Identifier;
import java.util.function.Supplier;

public record ShaderProgramKey(Identifier id, VertexFormat vertexFormat, Defines defines) implements Supplier<ShaderProgram> {
    @Override
    public ShaderProgram get() {
        return null;
    }
}
