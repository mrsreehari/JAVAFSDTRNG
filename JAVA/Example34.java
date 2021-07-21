package com.ust.examples;

	class Base { 
	     void display() 
	      { 
	        System.out.println("Base method called"); 
	       } 
	 } 
	   public class Example34 extends Base {  
	        void display() {
	        //cannot override
	       System.out.println("Base method called"); 
	      } 
	   } 
	    class finalMethod 
	  { 
	         public static void main(String[] args) 
	      { 
	          Example34 d =new Example34(); 
	          d.display(); 
	      }
}