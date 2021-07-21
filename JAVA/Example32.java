package com.ust.examples;

abstract class Emplo {
	 
    private String name;
    private int paymentPerHour;
    
    void display() {
    	System.out.println("name is "+name+"\n"+"Employee hour is "+paymentPerHour);
    }
    public Emplo() {

    }
 
    public Emplo(String name, int paymentPerHour) {
         this.name = name;
         this.paymentPerHour = paymentPerHour;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getname() {
    	return name;
    }
    public int getPaymentPerHour() {
       return paymentPerHour;
    }
    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }
    public int getpaymentPerHour() {
    	return paymentPerHour;
    }
    abstract void salary(int x, int y);
}

public class Example32 extends Emplo{
	Example32(){
	super();
	}

	Example32(String name, int paymentPerHour){
		super(name, paymentPerHour);
		
	}
	void salary(int days, int total_sal) {
		if((total_sal)>500) {
			System.out.println("The pay is good");
		}
		else {
			System.out.println("The pay is not good");
		}
	}
	public static void main(String[] args) {
		
		Example32 e1= new Example32("a",18);
		e1.display();
		Example32 e2= new Example32();
		e2.setName("b");
		System.out.println(e2.getname());
		e2.salary(10,10000);
	}
	
}
