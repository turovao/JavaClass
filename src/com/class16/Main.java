package com.class16;
//Create a Class main that should be a template for the DogClass. 
//In this class you should specify the following attributes: breed, name, color and following 
//behaviors: bark(), run(), play().
//Create 3 different objects of it: Husky, Bulldog, Labrador  with specific  attributes and
//behaviors.
//
//The output of the program should be as following:
// 
//Husky can bark
//Husky can run
//Husky can play
//Bulldog can bark
//Bulldog can run
//Bulldog can play
//Labrador can bark
//Labrador can run
//Labrador can play
//	

public class Main {
	
   String breed, name, color;
   public static void main(String[] args) {
	

   
   Main DogClass1=new Main();
   DogClass1.breed="Husky";
   DogClass1.name="Raafat";
   DogClass1.color="Brown";
   
   DogClass1.bark();
   DogClass1.run();
   DogClass1.play();
   
   Main DogClass2=new Main();
   
   DogClass2.breed="Bulldog";
   DogClass2.name="Partos";
   DogClass2.color="grey";
   
   DogClass2.bark();
   DogClass2.run();
   DogClass2.play();
   
   Main DogClass3=new Main();
   DogClass3.breed="Labrador";
   DogClass3.name="Tony";
   DogClass3.color="White";
   
   DogClass3.bark();
   DogClass3.run();
   DogClass3.play();
  
    
}
   void bark() {
	   System.out.println(breed+" can bark");
   } 
    
   void run() {
	   System.out.println(breed+" can run");
   } 
   void play() { 
	 System.out.println(breed+" can play");  
   }
}