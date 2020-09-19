package com.Collection.java;
import java.util.HashMap;
//test the map contains specified key or not
public class hashmap7 {
    public static void main(String args[]) {
        HashMap<String,Integer> hash_map = new HashMap<String,Integer>();
        hash_map.put("Sumit",1);
        hash_map.put("Dhruv",2);
        hash_map.put("Rahul",3);
        hash_map.put("Abhishek",4);
        hash_map.put("Arjun",5);
        System.out.println(hash_map);
        if (hash_map.containsKey("Dhruv")){
            System.out.println("yes" +" "+ hash_map.get("Dhruv"));
        }
        else {
            System.out.println("No");
        }
    }
}