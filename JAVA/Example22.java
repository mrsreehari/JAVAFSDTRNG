package com.ust.examples;

public class Example22{
	String web; 

	Example22(String w){ 
	web = w;
	System.out.println(web);
	} 
	/* This is the Copy Constructor, it 
	* copies the values of one object
	* to the another object (the object
	* that invokes this constructor)
	*/
//	Example22(Example22 cc){ 
//	web = cc.web; 
//	} 
	void disp(){
	System.out.println("Constructor: "+web);
	} 
	public static void main(String args[]){ 
		Example22 obj1 = new Example22("hello");
		obj1.web = "hello";
	/* Passing the object as an argument to the constructor
	* This will invoke the copy constructor
	*/
//		Example22 obj2 = new Example22(obj1); 
//	obj1.disp(); 
//	obj2.disp(); 
	} 
	}


