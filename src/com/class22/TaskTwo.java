package com.class22;
//2. Write a java program of Class Students that takes students name and 3 subject grades.
//Inside your class also have a method to Calculate Average Grade. Test Student class for 
//5 different students with different marks. Your program should print an average mark of each 
//students name.
//NOTE: please male different names for instance and local variables. (edited) 

public class TaskTwo {
	String name;
	int grades;
	
	
	public TaskTwo(String name){
		System.out.println("My name is"+name+"and my avarge is");
		
	}
	int findAvarage (int a, int b, int c) {
		return (a+b+c)/3;
		
		
	}
}
