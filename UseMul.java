package com.one.Functions;

public class UseMul {
	public static void main(String [] args) {
		CalcMul c=new CalcMul();
		System.out.println("Mul="+c.mul1());
		System.out.println("Mul"+c.mul2(200, 143));
		c.mul3();
		c.mul4(123, 120);
	}
}
