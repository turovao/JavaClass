package com.class24;
//2. Create 1 class with a static method that has 3 overloaded forms. 
//Then call each overloaded method with specific arguments and observe result.

public class Task1 {
	
	
		
	
	
	public static void display (int a) {
		 System.out.println("Static metod with 1 intiger parameter");
	
	 }
	 public static void display (int a, int b) {
		 System.out.println("Static metod with 2 intiger parameter");
	
	 }
	 public static void display (String str) {
		 System.out.println("Static metod with 1 string parameter");
	 }
	 
	 public static void main(String[] args) {
		
	 Task1 obj= new Task1();
	 obj.display(10);
	 obj.display(11,2);
	 obj.display("Raafat");
	
}
}