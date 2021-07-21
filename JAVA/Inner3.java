package com.ust.examples;

public class Inner3 {
	 void outerMethod() { 
	        System.out.println("Inside OuterMethod"); 
	        // Inner class is local to outerMethod() 
	        class Inner { 
	            void innerMethod() { 
	                System.out.println("Inside InnerMethod"); 
	            } 
	        } 
	        Inner y = new Inner(); 
	        y.innerMethod(); 
	    }
	 public static void main(String[] args) { 
	  Inner3 outer = new Inner3(); 
	        outer.outerMethod(); 
	    } 
	}
