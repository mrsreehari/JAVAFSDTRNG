package com.ust.examples;
//Hashset

import java.util.*;
public class Wgc6 {
    public static void main(String args[])
    {
        // Creating HashSet and
        // adding elements
        HashSet<String> hs = new HashSet<String>();
  
        hs.add("Geeks");
        hs.add("For");
        hs.add("Geeks");
        hs.add("Is");
        hs.add("Very helpful");
  
        // Traversing elements
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
