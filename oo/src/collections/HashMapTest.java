package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.size();
        Set<String> keys = map.keySet();
        Iterator<String> iterator = keys.iterator();
        while(iterator.hasNext()) {
            String key = iterator.next();
            System.out.println("the key is " + key
                    + ", value is " + map.get(key));
        }
        System.out.println("===================");
        Set<Map.Entry<String, Integer>> entry = map.entrySet();
        Iterator<?> iterator2 = entry.iterator();
        while(iterator2.hasNext()) {
            String s = String.valueOf(iterator2.next());
                System.out.print(s);
        }
    }
}
