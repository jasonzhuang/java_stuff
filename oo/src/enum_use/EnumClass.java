package enum_use;

public class EnumClass {
//    static Set<Map.Entry<String, Integer>> keys;
//    static List<String> names;
    public static void main(String[] args) {
      for (Direction direction : Direction.values()) {
          System.out.print(direction + " ordinal:" + direction.ordinal() + "   ");
          System.out.print(direction.getDeclaringClass() + "   ");
          System.out.print(direction.name() + "   ");
          System.out.print(direction.getDescription());
//          System.out.println(direction.map.put("jason", 001));
//          direction.list.add(direction.getDescription());
          System.out.println("-------------------");
      }
//      Iterator iterator = names.iterator();
//      while (iterator.hasNext()) {
//          System.out.println(iterator.next());
//      }
    }
}
