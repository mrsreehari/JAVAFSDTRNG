package com.ust.examples;

public class Inner6{  
	private int data=30;//instance variable  
	void display(){  
		class Local{
			void msg(){System.out.println(data);}  
			} 
		Local l=new Local();
		l.msg();
		}
	public static void main(String args[]){
		Inner6 obj=new Inner6();
		obj.display();
		}
	}  
