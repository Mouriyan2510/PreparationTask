package com.one.Functions;

public class Calc {
	public int add() {
		int a=10;
		int b=20;
		return a+b;
	}
	protected int sub(int a,int b) {
		return a-b;
	}
	public void mul() {
		int a=20;
		double b=30.30d;
		System.out.println("Multiplication = "+a*b);
	}
	public void div(int a,int b) {
		System.out.println("Division = "+a/b);
	}
}
