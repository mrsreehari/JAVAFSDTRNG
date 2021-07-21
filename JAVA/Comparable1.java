package com.ust.examples;
import java.util.ArrayList;
import java.util.Collections;
class Abcd implements Comparable<Abcd>{
	int rollno;
	String name;
	int age;
	Abcd(int rollno, String name, int age){
		this.rollno= rollno;
		this.name= name;
		this.age= age;
	}
	public int compareTo(Abcd st) {
		if (age==st.age)
			return 0;
		else if(age>st.age)
			return 1;
		else
		return -1;
			
	}
}

public class Comparable1 {
	public static void main(String[] args) {
	ArrayList<Abcd>a1=new ArrayList<Abcd>();
	a1.add(new Abcd(5,"wbc",24));
	a1.add(new Abcd(2,"pqr",22));
	a1.add(new Abcd(3,"xyz",26));
	Collections.sort(a1);
	for(Abcd st:a1) {
		System.out.println(st.rollno+" "+st.name+" "+st.age);
	}
	}

}
