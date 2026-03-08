package enums;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public enum HeartType {
   CONTAINER(
      new Identifier("hud/heart/container"),
      new Identifier("hud/heart/container_blinking"),
      new Identifier("hud/heart/container"),
      new Identifier("hud/heart/container_blinking"),
      new Identifier("hud/heart/container_hardcore"),
      new Identifier("hud/heart/container_hardcore_blinking"),
      new Identifier("hud/heart/container_hardcore"),
      new Identifier("hud/heart/container_hardcore_blinking")
   ),
   NORMAL(
      new Identifier("hud/heart/full"),
      new Identifier("hud/heart/full_blinking"),
      new Identifier("hud/heart/half"),
      new Identifier("hud/heart/half_blinking"),
      new Identifier("hud/heart/hardcore_full"),
      new Identifier("hud/heart/hardcore_full_blinking"),
      new Identifier("hud/heart/hardcore_half"),
      new Identifier("hud/heart/hardcore_half_blinking")
   ),
   POISONED(
      new Identifier("hud/heart/poisoned_full"),
      new Identifier("hud/heart/poisoned_full_blinking"),
      new Identifier("hud/heart/poisoned_half"),
      new Identifier("hud/heart/poisoned_half_blinking"),
      new Identifier("hud/heart/poisoned_hardcore_full"),
      new Identifier("hud/heart/poisoned_hardcore_full_blinking"),
      new Identifier("hud/heart/poisoned_hardcore_half"),
      new Identifier("hud/heart/poisoned_hardcore_half_blinking")
   ),
   WITHERED(
      new Identifier("hud/heart/withered_full"),
      new Identifier("hud/heart/withered_full_blinking"),
      new Identifier("hud/heart/withered_half"),
      new Identifier("hud/heart/withered_half_blinking"),
      new Identifier("hud/heart/withered_hardcore_full"),
      new Identifier("hud/heart/withered_hardcore_full_blinking"),
      new Identifier("hud/heart/withered_hardcore_half"),
      new Identifier("hud/heart/withered_hardcore_half_blinking")
   ),
   ABSORBING(
      new Identifier("hud/heart/absorbing_full"),
      new Identifier("hud/heart/absorbing_full_blinking"),
      new Identifier("hud/heart/absorbing_half"),
      new Identifier("hud/heart/absorbing_half_blinking"),
      new Identifier("hud/heart/absorbing_hardcore_full"),
      new Identifier("hud/heart/absorbing_hardcore_full_blinking"),
      new Identifier("hud/heart/absorbing_hardcore_half"),
      new Identifier("hud/heart/absorbing_hardcore_half_blinking")
   ),
   FROZEN(
      new Identifier("hud/heart/frozen_full"),
      new Identifier("hud/heart/frozen_full_blinking"),
      new Identifier("hud/heart/frozen_half"),
      new Identifier("hud/heart/frozen_half_blinking"),
      new Identifier("hud/heart/frozen_hardcore_full"),
      new Identifier("hud/heart/frozen_hardcore_full_blinking"),
      new Identifier("hud/heart/frozen_hardcore_half"),
      new Identifier("hud/heart/frozen_hardcore_half_blinking")
   );

   private final Identifier fullTexture;
   private final Identifier fullBlinkingTexture;
   private final Identifier halfTexture;
   private final Identifier halfBlinkingTexture;
   private final Identifier hardcoreFullTexture;
   private final Identifier hardcoreFullBlinkingTexture;
   private final Identifier hardcoreHalfTexture;
   private final Identifier hardcoreHalfBlinkingTexture;

   private HeartType(
      Identifier identifier,
      Identifier identifier1,
      Identifier identifier2,
      Identifier identifier3,
      Identifier identifier4,
      Identifier identifier5,
      Identifier identifier6,
      Identifier identifier7
   ) {
      this.fullTexture = identifier;
      this.fullBlinkingTexture = identifier1;
      this.halfTexture = identifier2;
      this.halfBlinkingTexture = identifier3;
      this.hardcoreFullTexture = identifier4;
      this.hardcoreFullBlinkingTexture = identifier5;
      this.hardcoreHalfTexture = identifier6;
      this.hardcoreHalfBlinkingTexture = identifier7;
   }

   public Identifier getTexture(boolean flag, boolean flag1, boolean flag2) {
      if (!flag) {
         if (flag1) {
            return flag2 ? this.halfBlinkingTexture : this.halfTexture;
         } else {
            return flag2 ? this.fullBlinkingTexture : this.fullTexture;
         }
      } else if (flag1) {
         return flag2 ? this.hardcoreHalfBlinkingTexture : this.hardcoreHalfTexture;
      } else {
         return flag2 ? this.hardcoreFullBlinkingTexture : this.hardcoreFullTexture;
      }
   }

   static HeartType fromPlayerState(PlayerEntity playerentity) {
      HeartType hearttype;
      if (playerentity.hasStatusEffect(StatusEffects.POISON)) {
         hearttype = POISONED;
      } else if (playerentity.hasStatusEffect(StatusEffects.WITHER)) {
         hearttype = WITHERED;
      } else if (playerentity.isFrozen()) {
         hearttype = FROZEN;
      } else {
         hearttype = NORMAL;
      }

      return hearttype;
   }

   // $VF: synthetic method
   private static HeartType[] $values() {
      return new HeartType[]{CONTAINER, NORMAL, POISONED, WITHERED, ABSORBING, FROZEN};
   }
}

