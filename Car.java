package com.one.Functions;

public class Car {
	String brand;
	int price;
	String color;
	int discount;
	
	public int Max(int []a) {
		int maxi=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]<maxi) {
			maxi=a[i];
		}
	}
	return maxi;
	}
	}
