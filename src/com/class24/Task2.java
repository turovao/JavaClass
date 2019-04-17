package com.class24;
//Create 1 class with a private method that has 3 overloaded forms. 
//Then call each overloaded method with specific arguments and observe result. (edited) 

public class Task2 {
	private static void getInfo () {
		 System.out.println("private metod with no parameter");
	
	 }
	 private static void getInfo (int a, int b) {
		 System.out.println("private metod with 2 intiger parameter");
	
	 }
	 private static void getInfo (String str) {
		 System.out.println("private metod with 1 string parameter");
	 }
	 
	 public static void main(String[] args) {
		
	Task2 obj= new Task2();
	 obj.getInfo();
	 obj.getInfo(11,2);
	 obj.getInfo("Olga");
	

}}

