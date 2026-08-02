package mapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class maps {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        //insertion in map
        map.put("in", "India");
        map.put("en", "English");
        map.put("sn", "Sanskrit");
        System.out.println(map);

        //insert all from one map to other
        Map<String, String> map1 = new HashMap<>();
        map1.put("hn", "Hindi");
        System.out.println("Before: " + map1);
        map1.putAll(map);
        System.out.println("After: " + map1);

        //deletion
        map1.remove("hn");
        System.out.println(map1);

        //knowing the size
        System.out.println(map1.size());

        //clear()
        map1.clear();
        System.out.println(map1.size());

        //puIfAbsent()
        map.putIfAbsent("us", "United States");
        System.out.println(map);

        //get
        System.out.println(map.get("in"));

        //getDefautl
        System.out.println(map.getOrDefault("in", "Bharat"));

        //containsKey
        System.out.println(map.containsKey("in"));

        //containsValue
        System.out.println(map.containsValue("Bharat"));

        //more other methods of maps
        //replace
        System.out.println(map);
        map.replace("sn", "San Diego");
        System.out.println(map);

        //replace with old and new value
        map.replace("sn", "San Diego", "Sanskrit");
        System.out.println(map);

        //remove using k, v
        map.remove("sn", "Sanskrit");
        System.out.println(map);

        //using keyset
        System.out.println(map.keySet());

        //or
        Set<String> keyset = map.keySet();
        System.out.println(keyset);

        //using values
        System.out.println(map.values());

        //using entryset
        System.out.println(map.entrySet());

        //iterating over the map
        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println("The key is: " + entry.getKey() + " , The value is: " + entry.getValue());
        }
    }
}
