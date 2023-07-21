package com.one.Functions;

public class UsePen {
	public static void main(String [] args) {
		Pen pen1=new Pen();
		pen1.brand="Parker";
		pen1.price=100;
		pen1.color="Gold";
		Pen pen2=new Pen();
		pen2.brand="Parker";
		pen2.price=100;
		pen2.color="Gold";
		Pen pen3=new Pen();
		pen3.brand="Camlin";
		pen3.price=10;
		pen3.color="Blue";
		System.out.println(pen2.max(pen1.price,pen2.price,pen3.price));
	}

}
