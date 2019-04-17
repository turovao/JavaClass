package com.class23;
//1. Complete the SyntaxTechnologies.java class:
//
//Include the following class variables:
//* schoolName(String)
//* batch(int)
//* year(String)
//* lastDayOfClass(String)
//
//
//Write two constructors:
//
//* default constructor
//* The main constructor( with all parameters)
//
//Create two different objects of the SyntaxTechnologies class using both constructors and print 
//the values of the properties inline
//
//
//Output:
// 
//null 0 null null
//Syntax 4 2019 07/30/2019
public class SyntaxTechnologies {
	String schoolName;
	int batch;
	String year;
	String lastDayOfClass;

	SyntaxTechnologies() {
	}

	SyntaxTechnologies(String schoolName1,  int batch1, String year1, String lastDayOfClass1) {
		schoolName = schoolName1;
		batch = batch1;
		year = year1;
		lastDayOfClass = lastDayOfClass1;
	}

  
}


