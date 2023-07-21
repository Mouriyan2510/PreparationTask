package com.one.Functions;

public class Pen {
	String brand;
	int price;
	String color;
	
	public int max(int a,int b,int c) {
		
		
		if(a>b) {
			return a;
		}
		else if(b>c){
			return b;
		}
		else {
			return c;
		}
	}
}
