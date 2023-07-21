package com.one.Functions;

public class UseCar {
	public static void main(String [] args) {
		Car car1=new Car();
		car1.brand="Maruti";
		car1.price=12342;
		car1.color="Gold";
		car1.discount=50;
		
		Car car2=new Car();
		car2.brand="Audi";
		car2.price=92342;
		car2.color="White";
		car2.discount=500;
		
		Car car3=new Car();
		car3.brand="BMW";
		car3.price=98342;
		car3.color="Black";
		car3.discount=150;
		
		int[] cars= {car1.price,car2.price,car3.price};
		System.out.println(car1.Max(cars));
	}
}
