package com.Collection.java;
import java.util.HashMap;
import java.util.*;
//Associate specified value with specified key
public class hashmap1 {
    public static void main(String args[]) {
        HashMap<Integer,String> hash_map= new HashMap<Integer,String>();
        hash_map.put(1, "Sumit");
        hash_map.put(2, "Dhruv");
        hash_map.put(3, "Rahul");
        hash_map.put(4, "Abhishek");
        hash_map.put(5, "Arjun");
        for(Map.Entry x:hash_map.entrySet()){
            System.out.println(x.getKey()+" "+x.getValue());
        }
    }
}
