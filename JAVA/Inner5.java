package com.ust.examples;

public class Inner5 {
		static class Nested_Demo {
			public void my_method() {
			System.out.println("This is my nested class");
		}
		}
		public static void main(String args[]) {
			Inner5.Nested_Demo nested = new Inner5.Nested_Demo(); 
		nested.my_method();
		}
}

