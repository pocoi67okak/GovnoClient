package config;

import a.Loader;

public class Waypoint {
   private String name;
   private double x;
   private double y;
   private double z;
   private String dimension;
   private boolean visible;
   private long createdAt;

   public Waypoint(String s, double d0, double d1, double d2, String s1, boolean flag, long i) {
      this.name = s;
      this.x = d0;
      this.y = d1;
      this.z = d2;
      this.dimension = s1;
      this.visible = flag;
      this.createdAt = i;
   }

   public native String a();

   public native double b();

   public native double c();

   public native double d();

   public native String e();

   public native boolean f();

   public native long g();

   public native void h(String s);

   public native void i(double d0);

   public native void j(double d0);

   public native void k(double d0);

   public native void l(String s);

   public native void m(boolean flag);

   public native void n(long i);

   static {
      Loader.init(Waypoint.class);
   }

   public static native void guard();
}
