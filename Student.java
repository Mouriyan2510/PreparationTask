package com.one.Functions;

public class Student {
	int tamil,english,maths,total;
	public int findTotal() {
		return tamil+english+maths;
	}
	public void display() {
		System.out.println("Tamil= "+tamil+" English= "+english+" Maths= "+maths+" Total= "+total);
	}

}
