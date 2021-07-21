package com.ust.examples;

abstract class Animals {
	  abstract void makeSound();

	}

	class Dogs extends Animals {

	  // implementation of abstract method
	  public void makeSound() {
	    System.out.println("Bark bark.");
	  }
	}

	class Cat extends Animals {

	  // implementation of abstract method
	  public void makeSound() {
	    System.out.println("Meows ");
	  }
	}

	class Example31 {
	  public static void main(String[] args) {
	    Dogs d1 = new Dogs();
	    d1.makeSound();

	    Cat c1 = new Cat();
	    c1.makeSound();
	  }
	}
