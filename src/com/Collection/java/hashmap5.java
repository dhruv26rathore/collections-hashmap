package com.Collection.java;
import java.util.HashMap;
//check that hash_map is empty or not
public class hashmap5 {
    public static void main(String args[]) {
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        hash_map.put(1, "Sumit");
        hash_map.put(2, "Dhruv");
        hash_map.put(3, "Rahul");
        hash_map.put(4, "Abhishek");
        hash_map.put(5, "Arjun");
        boolean hashmap = hash_map.isEmpty();
        System.out.println(hashmap);
        hash_map.clear();
        hashmap = hash_map.isEmpty();
        System.out.println(hashmap);
    }
}