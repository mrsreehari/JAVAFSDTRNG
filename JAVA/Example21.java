package com.ust.examples;

public class Example21 {
	String fName;
	String lName;
	String city;
	String address;
	String dob;
	Float salary;
	
	Example21(String x, String y, String z, String a, String b, float c){
		
		fName=x;
		lName=y;
		city=z;
		address=a;
		dob=b;
		salary=c;
		
	}
	
	void Display(){
		System.out.println(fName+""+lName+""+city+""+address+""+dob+""+salary);
		
	}
	
	public static void main(String[] args) {
		Example21 e1=new Example21("a","b","c","d","1/1/2020",500.5f);
		Example21 e2=new Example21("a","b","c","d","1/1/2020",500.5f);
		Example21 e3=new Example21("a","b","c","d","1/1/2020",500.5f);
		Example21 e4=new Example21("a","b","c","d","1/1/2020",500.5f);
		Example21 e5=new Example21("a","b","c","d","1/1/2020",500.5f);
		
		e1.Display();
		e2.Display();
		e3.Display();
		e4.Display();
		e5.Display();
	}
	}


