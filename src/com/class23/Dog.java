package com.class23;

public class Dog {
	//1. Complete the Dog.java class:
	//
	//Include the following class variables:
	//dogName, dogWeight and  
	//dogBreed=Mutt;
	//All class variables should be declared lowercase, also make dogBreed static
	//
	//Write two constructors:
	//* The main constructor(with all parameters)
	//* A secondary constructor that takes in only Name and Weight 
	//
	//2. Test your code with the Main.java class:
	//
	//Create a Dog object using both Constructors and print their fields/states to make sure 
	//it's correct.
	//
	//Output:
	//1.The main constructor(with all parameters)=Tarzan Mutt 50.0
	//
	//2.secondary constructor that takes in only Name and Weight (Breed defaults to "Mutt")
	//=Tarzan Mutt 50.0

	
	String dogName;
	double dogWeight;
	static String dogBreed = "Mutt";
	
	Dog(String name, String breed, double weight){
	  dogName=name;
		dogWeight=weight;
		dogBreed=breed;
		System.out.println(dogName +" " +dogBreed +" "+dogWeight);
	}
	Dog(String name,double weight){
    dogName=name;
		dogWeight=weight;
		System.out.println(dogName+" " +dogBreed+" " +dogWeight);
	}
}