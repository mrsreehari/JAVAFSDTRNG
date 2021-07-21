package com.ust.examples;

class GenericsClass1 <T extends Number> {

	  public void display() {
	    System.out.println("This is a bounded type generics class.");
	  }
	}

	public class Wgc12 {
	  public static void main(String[] args) {

	    // create an object of GenericsClass
	    GenericsClass1<Number> obj = new GenericsClass1<>();
	    System.out.println(obj);
	  }
	}
