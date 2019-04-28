package com.class29;
//Create a Class Car that would have the following fields: carPrice and color and method 
//calculateSalePrice() which should be returning a price of the car.
//Create 2 sub classes: Sedan and Truck. The Truck class has field as weight and has its 
//own implementation of  calculateSalePrice() method in which returned price calculated as 
//following: if weight>2000 then returned ar price should include 10%discount, otherwise 
//20%discount.
//The Sedan class has field as length and also does it is own implementation of 
//calculateSalePrice(): if length of sedan is >20 feet then returned car price should 
//include 5%discount, otherwise 10%discount (edited) 

public class Car {

	String color;
	double carPrice;
	
	public Car(String color, double carPrice) {
		this.color=color;
		this.carPrice=carPrice;
	}
	public double calculateSalePrice() {
		return carPrice;
	}
}
class Truck extends Car{
	
	int weight;
	
	public Truck(String color, double carPrice,int weight) {
		super(color, carPrice);
		this.weight=weight;
	}
	public double calculateSalePrice() {
		
		if (weight>2000) {
			carPrice-=carPrice*0.1;
		}else {
			carPrice-=carPrice*0.2;
		}
		return carPrice;
	}
}
class Sedan extends Car{
	
	int length;
	
	public Sedan(String color, double carPrice, int length) {
		super(color, carPrice);
		this.length=length;
	}
	public double calculateSalePrice() {
		
		if (length>20) {
			carPrice-=carPrice*0.05;
		}else {
			carPrice-=carPrice*0.1;
		}
		return carPrice;
	}
}
