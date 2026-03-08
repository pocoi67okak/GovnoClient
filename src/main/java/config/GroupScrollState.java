package config;

import a.Loader;

public class GroupScrollState {
   private String moduleName;
   private String groupName;
   private float scrollPosition;

   public GroupScrollState(String s, String s1, float f) {
      this.moduleName = s;
      this.groupName = s1;
      this.scrollPosition = f;
   }

   public native String a();

   public native String b();

   public native float c();

   public native void d(String s);

   public native void e(String s);

   public native void f(float f);

   static {
      Loader.init(GroupScrollState.class);
   }

   public static native void guard();
}
