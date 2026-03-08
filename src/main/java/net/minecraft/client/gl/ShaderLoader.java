package net.minecraft.client.gl;

import java.io.IOException;
import net.minecraft.util.Identifier;
import net.minecraft.client.render.DefaultFramebufferSet;
import net.minecraft.resource.ResourceFactory;

public class ShaderLoader {
    public static class LoadException extends Exception {
        public LoadException(String message, Throwable cause) { super(message, cause); }
    }
    public void preload(ResourceFactory factory, ShaderProgramKey[] keys) throws LoadException, IOException {}
    public PostEffectProcessor loadPostEffect(Identifier id, Object set) { return null; }
    public static ShaderLoader get(Object client) { return new ShaderLoader(); }
}
