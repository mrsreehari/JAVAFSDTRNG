package com.ust.examples;
//Add elements to linkrd hash map
import java.util.*;

public class Hashmap1{
  
    public static void main(String args[])
    {
  
        // Initialization of a LinkedHashMap
        // using Generics
        LinkedHashMap<Integer, String> hm1
            = new LinkedHashMap<Integer, String>();
  
        // Add mappings using
        // put() method
        hm1.put(3, "Geeks");
        hm1.put(2, "For");
        hm1.put(1, "Geeks");
  
        // print mappings to the console
        System.out.println("Mappings of LinkedHashMap : "
                           + hm1);
    }
}
