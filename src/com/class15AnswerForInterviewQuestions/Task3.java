package com.class15AnswerForInterviewQuestions;

public class Task3 {
	public static void main(String[] args) {
		
		
		//5. Write a java program to reverse String? 
		//Reverse a string word by word?
		
		
		
String title="Raafat and Olga are java masters";
		
		String Reverse="";
		
		for (int i=title.length()-1; i>=0;i--) {
			
			Reverse+=title.charAt(i);
		}
		System.out.println(Reverse);
		
	}

}
//String[] words=reverse.split(" ");
////for(int i=words.length-1; i>=0;i--) {
////	System.out.print(words[i]+" ");
////