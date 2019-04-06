package com.class16;
//Create a Dog Class and create 3 different objects of it: 
//	Husky, Bulldog, Labrador  with specific  attributes and behaviours.

public class Dog {
	
	String breed, countryFrom, eyeColor;
	int legs, tail;
	boolean muscular, faceWrinkle;
	
	public static void main(String []args) {
		
		Dog d1=new Dog();
		d1.breed="Husky";
		d1.countryFrom="Alaska";
		d1.eyeColor="blue";
		d1.legs=4;
		d1.tail=1;
		d1.muscular=true;
		d1.faceWrinkle=false;
		// Husky has a beautiful blue color eyes
		
		System.out.println(d1.breed+" has a beautiful "+d1.eyeColor+" eyes");
		
		//behaviour
		d1.run();
		d1.bark();
		d1.guard();
		
		System.out.println(" Second dog------------------------------------");
		Dog d2=new Dog();
		d2.breed="Bulldog";
		d2.countryFrom="British";
		d2.eyeColor="brown";
		d2.legs=4;
		d2.tail=1;
		d2.muscular=true;
		d2.faceWrinkle=true;
		
		//behaviour
		
		
		d1.run();
		d1.bark();
		d1.guard();
		System.out.println("Third dog------------------------------------------");
		Dog d3=new Dog();
		d3.breed="Labrador";
		d3.countryFrom="Canada";
		d3.eyeColor="brown";
		d3.legs=4;
		d3.tail=1;
		d3.muscular=true;
		d3.faceWrinkle=false;
		
		//behaviour
		d3.run();
		d3.bark();
		d3.guard();
		
	}
	
	void run() {
		System.out.println(" The dog can run "+breed);
		
	}
		
	void bark() {
		System.out.println(" The dog can bark "+breed);
	}	
		
	void guard() {
		System.out.println(" The dog can guard "+breed);
		
	}	
	
	
	
	
	}


