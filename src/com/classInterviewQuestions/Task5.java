package com.classInterviewQuestions;

//Find out how many alpha characters present in a string?
//alpha characters its only letters
public class Task5 {
	public static void main(String[] args) {
		
		String str = "Welcome To $#^@^@ ^&@ $ !^@^#$ Fairfax 1234";
        
        
        String count=str.replaceAll("[^A-Za-z]", "");
       System.out.println(count.length());
	}

}
