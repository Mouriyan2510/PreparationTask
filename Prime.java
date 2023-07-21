package com.one.Functions;

public class Prime {
	int num=2;
public String isPrime() {
	if(num%1==0||num%num==0) {
		return "Not a Prime";
	}
	else {
		return "Prime";
	}
}
}
