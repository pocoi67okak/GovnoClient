package module;

import enums.Category;

public class BlinkModule extends PacketModule {
   public BlinkModule() {
      super("Блинк", "Замораживает модельку пока модуль включён", Category.MOVEMENT);
      this.addSettings(this.showServerPosSetting);
   }

   @Override
   protected boolean shouldDelay() {
      return true;
   }

   @Override
   public void onEndTick() {
   }
}

