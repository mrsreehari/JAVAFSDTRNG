package com.ust.examples;

class super_class{
	int num=20;
	//display method of super class
	public void display() {
		System.out.println("This is the display method of super class");
	}
}

public class Example30 extends super_class{
	int num=10;
	//display method of subclass
	public void display() {
		System.out.println("This is the display method of subclass");
	}

public void my_method() {
	//instantiating subclass
	Example30 sub= new Example30();
	//invoking the display method sub class
	sub.display();
	
	//invoking the display() method of super class
	super.display();
	
	//printing the value of variable num of subclass
	System.out.println("value of variable named num in subclass:"+sub.num);
	
	//printing the value of variable name in super class
	System.out.println("value of the variable named num in super class:"+super.num);
}

public static void main(String[] args) {
	Example30 obj=new Example30();
	obj.my_method();
	
}
	
}
