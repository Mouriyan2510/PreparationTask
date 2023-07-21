package com.one.Functions;

public class UseBike {
	public static void main(String [] args) {
		Bike b1=new Bike();
		b1.brand="Yamaha";
		b1.cc=149;
		b1.color="blue";
		Bike b2=new Bike();
		b2.brand="RE";
		b2.cc=199;
		b2.color="blue";
		Bike b3=new Bike();
		b3.brand="Jaguar";
		b3.cc=999;
		b3.color="light green";
		Bike[] bikes= {b1,b2,b3};
		//b2.Call(bikes);
		//System.out.println(b2.Ask(bikes));
		Bike max=b2.Calls(bikes);
		System.out.println(max.brand+""+max.cc+""+max.color);
	}

}
