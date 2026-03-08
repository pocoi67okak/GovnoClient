package net.minecraft.client.render;

public record Fog(float start, float end, Shape shape, float red, float green, float blue, float alpha) {
    public static final Fog DUMMY = new Fog(0, 0, Shape.SPHERE, 0, 0, 0, 0);

    public enum Shape {
        SPHERE,
        CYLINDER
    }

    public float red() { return red; }
    public float green() { return green; }
    public float blue() { return blue; }
}
