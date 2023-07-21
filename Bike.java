package com.one.Functions;

public class Bike {
	String brand;
	int cc;
	String color;
	
	public void Call(Bike[]a) {
		for(int i=0;i<a.length;i++) {
			if(a[i].color.equalsIgnoreCase("blue")) {
				System.out.println(a[i].brand);
			}
		}
	}
		public String Ask(Bike[]b) {
			int max=b[0].brand.length();
			String temp="";
			for(int j=0;j<b.length;j++) {
				if(b[j].brand.length()>max) {
					max=b[j].brand.length();
					temp=b[j].brand;
				}
			}
		return temp;
		}
		
		public Bike Calls(Bike[]c) {
			Bike z=c[0];
			for(int i=0;i<c.length;i++) {
				if(z.cc<c[i].cc) {
					z=c[i];
				}
			}
		return z;
		}
	

}
