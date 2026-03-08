package net.minecraft.client.render;

public class FrameGraphBuilder {
    public Object createObjectNode(String name, Object obj) { return null; }
    public Object createResourceHandle(String name, Object factory) { return null; }
    public RenderPass createPass(String name) { return new RenderPass(); }
    public void run(Object allocator, Object executor) {}
}
