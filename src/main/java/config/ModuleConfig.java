package config;

import a.Loader;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;

public class ModuleConfig {
   private boolean enabled;
   private Map<String, JsonObject> settings = new HashMap<String, JsonObject>();

   public native boolean isEnabled();

   public native Map<String, JsonObject> getSettings();

   public native void setEnabled(boolean flag);

   public native void setSettings(Map<String, JsonObject> map);

   static {
      Loader.init(ModuleConfig.class);
   }

   public static native void guard();
}
