package com.Collection.java;
import java.util.HashMap;
//count the number of key and value
public class hashmap2 {
    public static void main(String args[]) {
        HashMap<Integer,String> hash_map= new HashMap<Integer,String>();
        hash_map.put(1, "Sumit");
        hash_map.put(2, "Dhruv");
        hash_map.put(3, "Rahul");
        hash_map.put(4, "Abhishek");
        hash_map.put(5, "Arjun");
        System.out.println(hash_map.size());
    }
}
