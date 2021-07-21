package com.ust.examples;

public class Example35 {
	 final static String NAME = "CONFIG";
	 final long initTime;
	 Example35() {
		 this.initTime = System.currentTimeMillis();
		 }
	 public static void main(String[] args) {
		 Example35 cfg1 = new Example35();
		 System.out.println(cfg1.initTime);
	 Example35 cfg2 = new Example35();
	 System.out.println(cfg2.initTime); } }

