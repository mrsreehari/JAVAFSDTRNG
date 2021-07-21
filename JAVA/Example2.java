package com.ust.examples;

public class Example2 {
	float price;
	String item;
	
	public static void main(String[] args) {
		Example2 e1= new Example2();
		Example2 e2= new Example2();
		
		e1.price=1.2f;
		e2.price=25f;
		e1.item="pen";
		e2.item="book";
		
		if(e1.price>e2.price) {
			e2.item="scale";
		}
		if(e1.price<e2.price) {
			e2.item="pencil";
		}
		else {
			e2.item="box";
		}
		System.out.println(e2.item);
		
		
	}

}
