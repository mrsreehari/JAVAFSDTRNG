package com.ust.examples;

public class Inner4 {
class Inner { 
public void show() { 
System.out.println("In a nested class method"); 
} 
}
public static void main(String[] args) { 
Inner4.Inner in = new Inner4().new Inner(); 
in.show(); 
} 
}