package com.class15AnswerForInterviewQuestions;

public class Practice {
	public static void main(String[] args) {

//		// 1.Create a String that will hold a sentence .Write a programm to get a new
//		// String
//		// without any spaves
//
//		String main = " Olga is the happiest person in the world";
//		System.out.println(main.replaceAll(" ", ""));
//
//////		//2. Create a String that should be combination of letters, numbers and special characters
//////		// Find out hoe many alpha characters are there in the String?
//
//		String comb = "Hi how are 123*(&^%you?)";
//		System.out.println(comb.replaceAll("[^A-Za-z]", ""));
//////		System.out.println(comb.length());
//////		
//////		
//		// 3. You have a String a="It is Saturday! Is it raining! We have a Java Class!
//		// //How would you find out how many sentences are in that String?
//		
		String a = "It is Saturday! Is it raining! We have a Java Class!";

	String[] array = a.split(" ");
		//System.out.println(array.length);
		//if you want to split sentense with words
		for(String chop : array) {
			System.out.println(chop);
//			It is Saturday
//			 Is it raining
//			 We have a Java Class
		}

	}

}
