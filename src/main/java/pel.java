class pel {
   private final int axf;
   private final int PS;
   private final float Oi;
   private final boolean Tf;

   pel(int i, int j, float f, boolean flag) {
      this.axf = i;
      this.PS = j;
      this.Oi = f;
      this.Tf = flag;
   }

   public int a() {
      return this.axf;
   }

   public int b() {
      return this.PS;
   }

   public float c() {
      return this.Oi;
   }

   public boolean d() {
      return this.Tf;
   }
}
