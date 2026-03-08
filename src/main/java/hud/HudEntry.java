package hud;

import java.util.function.Supplier;

public class HudEntry {
   private final Supplier<HudComponent> componentFactory;
   private final Supplier<Boolean> visibilityCondition;
   private HudComponent component;

   public HudEntry(Supplier<HudComponent> supplier, Supplier<Boolean> supplier1) {
      this.componentFactory = supplier;
      this.visibilityCondition = supplier1;
   }

   public boolean isVisible() {
      return this.visibilityCondition.get();
   }

   public HudComponent getComponent() {
      if (this.component == null) {
         this.component = this.componentFactory.get();
      }

      return this.component;
   }
}
