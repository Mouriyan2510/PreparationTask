package com.one.Functions;

public class UseNum {
public static void main(String [] args) {
	Calc cal=new Calc();
	System.out.println("Addition = "+cal.add());
	System.out.println("Subraction = "+cal.sub(200, 30));
	cal.mul();
	cal.div(100,2);
}
}
