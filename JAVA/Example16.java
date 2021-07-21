package com.ust.examples;

public class Example16 {
	public static void main(String[] args) {
	//declare the original String
    String str= "Hello World";
    
    /*
    check whether String ends with World or not.
    Use endsWith method of the String class to check the same.
    endsWith() method returns true if a string is ending with a given word
    otherwise it returns false
    */
    if(str.endsWith("World")){
      System.out.println("String ends with World");
    }else{
      System.out.println("String does not end with World");
    }
 
  }


}
