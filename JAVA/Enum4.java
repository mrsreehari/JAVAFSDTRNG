package com.ust.examples;

enum Direction2{
	  EAST ("E"), 
	  WEST ("W"), 
	  NORTH ("N"), 
	  SOUTH ("S")
	  ; 
	  /* Important Note: Must have semicolon at
	   * the end when there is a enum field or method
	   */
	  private final String shortCode;
		  
	  Direction2(String code) {
	      this.shortCode = code;
	  }
		  
	  public String getDirection2Code() {
	      return this.shortCode;
	  }
	}
	public class Enum4
	{
	    public static void main(String[] args) {
	    	Direction2 dir = Direction2.SOUTH;
	    	System.out.println(dir.getDirection2Code());
	    	Direction2 dir2 = Direction2.EAST;
	    	System.out.println(dir2.getDirection2Code());
	    }
	}

