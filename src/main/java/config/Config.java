package config;



import a.Loader;
import com.google.gson.annotations.SerializedName;
import data.Position;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Config {
   @SerializedName("modules")
   private Map<String, ModuleConfig> modules = new HashMap<String, ModuleConfig>();
   @SerializedName("guiPositions")
   private Map<String, Position> guiPositions = new HashMap<String, Position>();
   @SerializedName("hudPositions")
   private Map<String, Position> hudPositions = new HashMap<String, Position>();
   @SerializedName("expandedModules")
   private Map<String, Boolean> expandedModules = new HashMap<String, Boolean>();
   @SerializedName("lastOpenedCategory")
   private String lastOpenedCategory;
   @SerializedName("categoryScrollPositions")
   private Map<String, Float> categoryScrollPositions;
   @SerializedName("openedGroups")
   private Map<String, GroupScrollState> openedGroups;
   @SerializedName("moduleCardScrollPositions")
   private Map<String, Float> moduleCardScrollPositions;
   @SerializedName("favouriteModules")
   private List<String> favouriteModules;
   @SerializedName("friends")
   private List<String> friends;
   @SerializedName("waypoints")
   private List<Waypoint> waypoints;
   @SerializedName("abConfigs")
   private Map<String, naz> abConfigs;
   @SerializedName("activeABConfig")
   private String activeABConfig;
   private static String[] AOo1oHdOgBXHEPZt = new String[1];

   public Config() {
      this.lastOpenedCategory = AOo1oHdOgBXHEPZt[0];
      this.categoryScrollPositions = new HashMap<String, Float>();
      this.openedGroups = new HashMap<String, GroupScrollState>();
      this.moduleCardScrollPositions = new HashMap<String, Float>();
      this.favouriteModules = new ArrayList<String>();
      this.friends = new ArrayList<String>();
      this.waypoints = new ArrayList<Waypoint>();
      this.abConfigs = new HashMap<String, naz>();
      this.activeABConfig = null;
   }

   public native void a();

   public native Map<String, ModuleConfig> b();

   public native Map<String, Position> c();

   public native Map<String, Position> d();

   public native Map<String, Boolean> e();

   public native String f();

   public native Map<String, Float> g();

   public native Map<String, GroupScrollState> h();

   public native Map<String, Float> i();

   public native List<String> j();

   public native List<String> k();

   public native List<Waypoint> l();

   public native Map<String, naz> m();

   public native String n();

   public native void o(Map<String, ModuleConfig> map);

   public native void p(Map<String, Position> map);

   public native void q(Map<String, Position> map);

   public native void r(Map<String, Boolean> map);

   public native void s(String s);

   public native void t(Map<String, Float> map);

   public native void u(Map<String, GroupScrollState> map);

   public native void v(Map<String, Float> map);

   public native void w(List<String> list);

   public native void x(List<String> list);

   public native void y(List<Waypoint> list);

   public native void z(Map<String, naz> map);

   public native void A(String s);

   static {
      Loader.init(Config.class);
      C();
   }

   private static native String B(char[] achar, long i, int j);

   private static native void C();

   public static native void guard();
}
