package com.ust.examples;

class Calculation{
	int z;
	public void addition(int x, int y) {
	z=x+y;
	System.out.println("The sum of two numbers:"+z);
	}
	
	public void subtraction(int x, int y) {
		z=x-y;
		System.out.println("The difference of two numbers are:"+z);
	}
}

public class Example29 extends Calculation{
	//Example29 is subclass
	public void multiplication(int x, int y) {
		z=x*y;
		System.out.println("The product of the given numbers:"+z);
	}
	public static void main(String[] args) {
		int a=20, b=10;
		Example29 demo=new Example29();
		demo.addition(a, b);
		demo.subtraction(a, b);
		demo.multiplication(a, b);
		
	}
}
