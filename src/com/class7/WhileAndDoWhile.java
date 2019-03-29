package com.class7;

public class WhileAndDoWhile {
	public static void main(String[] args) {
		
		int a=10;
		do {
			System.out.println("Hello");// executes first and then check condition
			a++;
		}while(a>15);
		
		int b=10;
		
		while (b>15) {
			System.out.println("Bye");// check condition and then execute
			b++;
		}
	
	}

}
