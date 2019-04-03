package com.class15AnswerForInterviewQuestions;

public class Task8 {
	public static void main(String[] args) {
		
//		.How to find out the part of the string from a string?
//				What is substring? Find number of words in string?
		
		String str1="We are cool programmers!";
        
        String subString=str1.substring(7);
        
        System.out.println("substring 1 :"+subString);
        
        String subString2=str1.substring(7, 11);
        
        System.out.println("substring 1 :"+subString2);
        
        int splited=str1.split(" ").length;
        
        System.out.println("number of words: "+splited);
	}

}
