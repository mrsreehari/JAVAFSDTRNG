package com.ust.examples;

class Inner7{  
	 private int data=30;//instance variable  
	 void display(){  
	  int value=50;//local variable must be final till jdk 1.7 only  
	  class Local{  
	   void msg(){
		   System.out.println(value);
		   System.out.println("data= "+data);
		   }  
	  }  
	  Local l=new Local();  
	  l.msg();  
	 }  
	 public static void main(String args[]){  
	  Inner7 obj=new Inner7();  
	  obj.display();
	 }  
	}  
