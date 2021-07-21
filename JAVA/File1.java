package com.ust.examples;

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
import java.io.FileOutputStream;

	public class File1 {

	  public static void main(String args[]) {

	     try {
	       /* FileInputStream input = new FileInputStream("C:\\Users\\ustjava11\\input.txt");

	        System.out.println("Data in the file: ");

	        // Reads the first byte
	        int i = input.read();

	       while(i != -1) {
	           System.out.print((char)i);

	           // Reads next byte from the file
	           i = input.read();
	        }
	        input.close();
	        */
	    	 String s="Output file";
	    	 FileOutputStream Output= new FileOutputStream("C:\\Users\\ustjava11\\input.txt");
	    	 Output.write(s.getBytes());
	    	 Output.close();
	     }

	     catch(Exception e) {
	        e.getStackTrace();
	     }
	  }
	}