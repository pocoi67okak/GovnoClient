package hud;

public abstract class ListEntry<T> {
   protected final T alQ;
   protected final String RQ;
   protected final ve ox;

   public ListEntry(T object, String s) {
      this.alQ = (T)object;
      this.RQ = s;
      this.ox = new ve();
      this.ox.a();
   }

   public abstract void a();

   public T b() {
      return this.alQ;
   }

   public String c() {
      return this.RQ;
   }

   public ve d() {
      return this.ox;
   }
}
