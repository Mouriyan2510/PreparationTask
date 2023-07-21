package com.one.Functions;

public class UseStudent {
	public static void main(String [] args) {
		Student stu1=new Student();
		stu1.tamil=89;
		stu1.english=99;
		stu1.maths=100;
		stu1.total=stu1.findTotal();
		stu1.display();
		
		Student stu2=new Student();
		stu2.tamil=89;
		stu2.english=69;
		stu2.maths=80;
		stu2.total=stu2.findTotal();
		stu2.display();
		
		Student stu3=new Student();
		stu3.tamil=89;
		stu3.english=97;
		stu3.maths=90;
		stu3.total=stu3.findTotal();
		stu3.display();
	}
}
