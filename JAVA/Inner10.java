package com.ust.examples;
interface Emp1{
int eid = 2101;
void getEid();
}
public class Inner10 {
public static void main( String[] arg )
{
// Implclass is hidden inner class implement an Emp Interface
// Implclass class name is not created but an object is creating below
Emp1 ob = new Emp1() {
//@Override
public void getEid() {
// display the eid
System.out.print("Employee id is "+eid);
}
};
// call geteid() method which implemented by Implclass
ob.getEid();
}
}
