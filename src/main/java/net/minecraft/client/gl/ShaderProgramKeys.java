package net.minecraft.client.gl;

import net.minecraft.client.render.VertexFormats;
import net.minecraft.util.Identifier;

public class ShaderProgramKeys {
    public static final ShaderProgramKey POSITION_COLOR = new ShaderProgramKey(new Identifier("core/position_color"), VertexFormats.POSITION_COLOR, Defines.EMPTY);
    public static final ShaderProgramKey POSITION_TEX_COLOR = new ShaderProgramKey(new Identifier("core/position_tex_color"), VertexFormats.POSITION_TEXTURE_COLOR, Defines.EMPTY);
    public static final ShaderProgramKey RENDERTYPE_GUI = new ShaderProgramKey(new Identifier("core/rendertype_gui"), VertexFormats.POSITION_COLOR, Defines.EMPTY);
    public static final ShaderProgramKey RENDERTYPE_GUI_OVERLAY = new ShaderProgramKey(new Identifier("core/rendertype_gui_overlay"), VertexFormats.POSITION_COLOR, Defines.EMPTY);
}
