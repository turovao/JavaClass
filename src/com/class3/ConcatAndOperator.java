package com.class3;

public class ConcatAndOperator {
public static void main(String [] args) {
		
		int x =10;
		int y =20;
		
		String a ="Hello";
		String b ="Bye";
		
	//	a+b+x+y
		
		System.out.println(x+y+a+b); // 30HelloBye
		System.out.println(x+a+y+b);// 10Hello20Bye
		System.out.println(x+a+b+y);// 10Hellobye20
		System.out.println(a+b+x+y);//HelloBye; HelloBye1020; wont work
		System.out.println(a+b+(x+y));// HelloBye30
		
		
	}
	


}



		 
		 
