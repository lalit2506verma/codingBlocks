package Lec37;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Raj", 77);
        map.put("Vivek", 57);
        map.put("Ankit", 87);
        map.put("Kaju", 77);
        map.put("Ankita", 67);
        map.put("Pooja", 52);
        map.put("Kunal", 55);

        System.out.println(map);

//        //ContainsKey
//        System.out.println(map.containsKey("Amisha"));
//        System.out.println(map.containsKey("Ankit"));
//
//        //get
//        System.out.println(map.get("Amisha"));
//        System.out.println(map.get("Ankit"));
//
//        //remove
//        System.out.println(map.remove("Ankit"));
//        System.out.println(map.remove("Amisha"));
//        System.out.println(map);

        TreeMap<String, Integer> map1 = new TreeMap<>();

        map1.put("Raj", 77);
        map1.put("Vivek", 57);
        map1.put("Ankit", 87);
        map1.put("Kaju", 77);
        map1.put("Ankita", 67);
        map1.put("Pooja", 52);
        map1.put("Kunal", 55);

        System.out.println(map1);
    }
}
