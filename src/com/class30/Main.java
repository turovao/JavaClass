
package com.class30;
//create Interface with name as MyInterface 

//Declare the variable int a=100;
//and declare another variable as final int b=200;
//and another variable as static int c=300;
//In main method try to print the all values 
//
//Output would be
//
//
//100
//200
//300

class Main implements MyInterface {
	public static void main(String[] args) {

		Main obj = new Main();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		

	}
}
