package day01.hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        String[] data = {"A", "K", "A", "K", "D", "A"};

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            map.put(data[i], map.getOrDefault(data[i], 0) + 1);
        }
        entryFor(map);

        HashMap map2 = new HashMap();
        for (int i = 0; i < data.length; i++) {
            if (map2.containsKey(data[i])) {
                int value = (int) map2.get(data[i]);
                map2.put(data[i], value + 1);
            } else {
                map2.put(data[i], 1);
            }
        }
        entryFor(map2);
    }

    public static void entryFor(HashMap map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println(String.format("key : %s, value: %s", entry.getKey(), entry.getValue()));
        }
    }
}
