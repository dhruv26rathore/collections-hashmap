package com.Collection.java;
import java.util.HashMap;
// put all the key value pair to the another hashmap
public class hashmap3 {
    public static void main(String[]args) {
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        hash_map.put(1, "Sumit");
        hash_map.put(2, "Dhruv");
        hash_map.put(3, "Rahul");
        hash_map.put(4, "Abhishek");
        hash_map.put(5, "Arjun");
        System.out.println(hash_map);
        HashMap<Integer, String> hash_map2 = new HashMap<Integer, String>();
        hash_map2.put(1, "Sumhbgjhit");
        hash_map2.put(2, "Dhjnkjruv");
        hash_map2.put(3, "Rahgjjul");
        hash_map2.put(4, "Abgjhnek");
        hash_map2.put(5, "Arjkhjkun");
        System.out.println(hash_map2);
        hash_map2.putAll(hash_map);
        System.out.println(hash_map2);
    }
}