package com.class31;
//4.Create an arrayList of even numbers from 1 to 50. Using Integer remove any number 
//that is divisible by 5 from that arrayList.


	import java.util.ArrayList;
	import java.util.Iterator;

	public class Task4 {

	    public static void main(String[] args) {
	        ArrayList<Integer> numbers = new ArrayList<>();
	        for (int i = 1; i <= 50; i++) {
	            if (i % 2 == 0) {
	                numbers.add(i);
	            }
	            
	        }            
	        System.out.println(numbers);

	            Iterator<Integer> evenNum = numbers.iterator();
	            while (evenNum.hasNext()) {
	                if (evenNum.next()%5==0) {
	                    evenNum.remove();
	                }
	            }
	            System.out.println(numbers);
	                
	            
	        
	    }
	}


