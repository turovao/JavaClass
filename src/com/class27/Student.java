package com.class27;
//1. Write program as a student class   that has instance variables name and address.
//Create a constructor that will initialize those variables. Print name & address of given 
//student by the displayInfo method.

 class Student {
String name;
String address;

Student(String name, String address){
	this.name=name;
	this.address=address;
	
}

 void  displayInfo  () {
	System.out.println("The name is"+name+"and the adress is:"+address);
}
 }