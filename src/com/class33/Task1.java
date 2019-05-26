package com.class33;
//How can you remove all duplicates from ArrayList?
//
//List<String> aList=new ArrayList<String>();
//        aList.add(“John”);
//        aList.add(“Jane”);
//        aList.add(“James”);
//        aList.add(“Jasmine”);
//        aList.add(“Jane”);
//        aList.add(“James”);

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Task1 {
	
public static void main(String[] args) {
	

			List<String> aList=new ArrayList<String>();
			        aList.add("John");
			        aList.add("Jane");
			        aList.add("James");
			        aList.add("Jasmine");
			        aList.add("Jane");
			        aList.add("James");
			        aList.remove("Jane");
			        
			        System.out.println(aList);
			        HashSet<String> list=new HashSet<>(aList);
			        System.out.println(list);

}
}