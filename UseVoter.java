package com.one.Functions;

public class UseVoter {
	public static void main(String [] args) {
		Voter v1=new Voter();
		v1.age=45;
		Voter v2=new Voter();
		v2.age=15;
		Voter v3=new Voter();
		v3.age=55;
		System.out.println(v1.Voter()+v2.Voter()+v3.Voter());
	}
}
