package com.ust.examples;
enum Direction{
	  EAST, 
	  WEST, 
	  NORTH, 
	  SOUTH
}
public class Enum3
{
 Direction dir;
 public Enum3(Direction dir) {
    this.dir = dir;
 }
 public void getMyDirection() {
   switch (dir) {
     case EAST:
        System.out.println("In East Direction");
        break;
                  
     case WEST:
        System.out.println("In West Direction");
        break;
                       
     case NORTH: 
        System.out.println("In North Direction");
        break;
                      
     default:
        System.out.println("In South Direction");
        break;
   }
 }
  
  public static void main(String[] args) {
      Enum3 obj1 = new Enum3(Direction.EAST);
      obj1.getMyDirection();
      Enum3 obj2 = new Enum3(Direction.SOUTH);
      obj2.getMyDirection();
  }
}
