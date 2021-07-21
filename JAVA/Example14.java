package com.ust.examples;

 public class Example14 {
	int id;
	String name;
	float salary;
	void insert(int i, String n, float s) {
		id=i;
		name=n;
		salary=s;
		
	}
	void display() {
		System.out.println(id+""+name+""+salary);
	}
		public static void main(String[] args) {
			Example14 e1=new Example14();
			Example14 e2=new Example14();
			Example14 e3=new Example14();
			e1.insert(101, "a", 45000);
			e2.insert(102, "b", 25000);
			e3.insert(103, "c", 55000);
			e1.display();
			e2.display();
			e3.display();
		
	}

}
