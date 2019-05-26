package com.class30;

import java.util.ArrayList;

public class IntegerArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(33);
		numbers.add(100);
		numbers.add(5000);

		numbers.set(0, 3333);
		numbers.set(2, 11);
		numbers.set(0, 36);
		numbers.get(3);
		numbers.iterator();
		
		
		
	
		
		
		for ( Integer num: numbers) {
			System.out.println(num);
		}
		
	}
}