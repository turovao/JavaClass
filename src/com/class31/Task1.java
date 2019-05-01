package com.class31;
//1.Create an arraylist of cars and retrieve all the values using 4 different ways.

import java.util.ArrayList;
import java.util.Iterator;



public class Task1 {
	public static void main(String[] args) {
		
	
	
	ArrayList<String> cars=new ArrayList<String>();
	
	cars.add("BMW");
	cars.add("Toyota");
	cars.add("Mersedes");
	cars.add("Mazda");
	
	for(String types:cars) {
		System.out.println(types);
		
		
	}
	for(int i=0; i<cars.size(); i++ ) {
		System.out.println(cars.get(i));
	}
	Iterator types=cars.iterator();
while(types.hasNext()) {
	System.out.println(types.next());
}

System.out.println("--- using while loop ---");
int i = 0;
while (i < cars.size()) {
	System.out.println(cars.get(i));
	i++;
}
}
}
