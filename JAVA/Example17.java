package com.ust.examples;

public class Example17 {
	public static void main(String args[]){
		  
	    
	    String str="Replace Region";
	    
	    /*
	    Replaces all occurrence of given character with new one and returns new 
	    String object.
	    */
	    System.out.println( str.replace( 'R','A' ) );
	    
	    /*
	    Replaces only first occurrence of given String with new one and 
	    returns new String object.
	    */
	    System.out.println( str.replaceFirst("Re", "Ra") );
	    
	    /*
	    Replaces all occurrence of given String with new one and returns 
	    new String object.
	    */
	    System.out.println( str.replaceAll("Re", "Ra") );
	  
	  }
	 

}
