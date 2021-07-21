package com.ust.examples;

public class Wgc11 {
	  public static void main(String[] args) {

	    // initialize the class with Integer data
	    DemoClass1 demo = new DemoClass1();

	    // generics method working with String
	    demo.<String>genericsMethod("Java Programming");

	    // generics method working with integer
	    demo.<Integer>genericsMethod(25);
	  }
	}

	class DemoClass1 {

	  // creae a generics method
	  public <T> void genericsMethod(T data) {
	    System.out.println("Generics Method:");
	    System.out.println("Data Passed: " + data);
	  }
	}
