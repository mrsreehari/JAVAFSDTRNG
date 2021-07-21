package com.ust.examples;
/*
 * 
 * example of for loop
 */

public class Example3 {
	public static void main(String[] args){
		//String[] str =new String[6];
		String[] str= {"abc","def","ghi","jkl","mno","pqr"};
		for (int i=0;i<str.length;i++) {
			if(str[i].equals("mno"))
				//break;
				continue;
			System.out.println(str[i]);
		}
		
	}

}
