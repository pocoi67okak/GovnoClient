package module;

import enums.Category;

public class CleanHudModule extends Module {
   public CleanHudModule() {
      super("СлеанХуд", "Отключает рендер элементы с худа", Category.CLIENT);
   }

   @Override
   public void onEnable() {
   }

   @Override
   public void onDisable() {
   }
}

