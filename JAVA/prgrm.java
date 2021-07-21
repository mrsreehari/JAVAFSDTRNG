package com.ust.examples;

//import com.ust.examples.Example1;

public class prgrm {
	static String name;
	public float price;
	static int count;
//	public static void counter(String name1) {
//		count++;
//		name=name1;
//	}
	
	public void display(String name,int count) {
		System.out.println(name);
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		int age=10;
		count=1;
		System.out.println(age);
		System.out.println(count);
		prgrm object1= new prgrm();
//		Bengali object2= new Bengali();
		object1.display("rohit",1);
//
//		object1.name="ramu";
//		object2.name="babu";
//		object1.display();
//		object2.display();
//		object1.counter("rohit"); //count = 2
//		object1.display(); //print ramu and 2
////		object1.counter("sreehari"); //count = 3
//		object2.display(); //print babu and 3
	}

}
