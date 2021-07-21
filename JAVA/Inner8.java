package com.ust.examples;

abstract class Person{  
	  abstract void Eat();  
	}  
	public class Inner8{  
	 public static void main(String args[]){  
	  Person p =new Person(){
		  void Eat(){
		  System.out.println("nice fruits");
		  }
	  };  
	  p.Eat();  
	 }  
	} 