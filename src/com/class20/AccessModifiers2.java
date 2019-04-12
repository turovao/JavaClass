package com.class20;
//Create a method that will take a string and return array of words from that string. 
//		Method should be available only within same class.

public class AccessModifiers2 {
	
	public static void main(String[] args) {
		AccessModifiers2 obj=new AccessModifiers2();
		String [] array=obj.getWordsFromString("Have a good night student");
		for(String word:array) {
			System.out.println(word);
		}
	}
	
	private String[]getWordsFromString(String str){
		String[]words=str.split(" ");
		return words;
		
	}

}
