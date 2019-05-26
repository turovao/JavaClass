package com.class31;
//Converting a HashSet to an Array
//
//Just add the values as
//
//first
//second
//third
//fourth 
//fifth 
//
//Output:
//HashSet contains: [third, fifth, fourth, first, second] Array elements: third fifth fourth first second


import java.util.HashSet;

class Main {
  public static void main(String[] args) {
    
    // Create a HashSet
     HashSet<String> hset = new HashSet<String>();
 
     //add elements to HashSet
     hset.add("first");
     hset.add("second");
     hset.add("third");
     hset.add("fourth");
     hset.add("fifth");
    
    // Displaying HashSet elements
     System.out.println("HashSet contains: "+ hset);
 
     // Creating an Array
     String[] array = new String[hset.size()];
     hset.toArray(array);
 
     // Displaying Array elements
     System.out.println("Array elements: ");
     for(String temp : array){
        System.out.println(temp);
     }
    
  }
}