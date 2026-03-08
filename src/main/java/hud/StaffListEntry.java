package hud;

class StaffListEntry extends ListEntry<String> {
   final String name;
   final String displayName;
   boolean online;

   StaffListEntry(String s, String s1, boolean flag, String s2) {
      super(s, s2);
      this.name = s;
      this.displayName = s1;
      this.online = flag;
   }

   public void a(boolean flag) {
      this.online = flag;
   }

   @Override
   public void a() {
   }
}
