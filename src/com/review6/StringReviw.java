package com.review6;
//* length()
//* toLowerCase()
//* toUpperCase()
//* equals(Object anObject)
//* equalsIgnoreCase(String anotherString)
//* contains(String anotherString)
//* startsWith(String prefix)
//* endsWith(String suffix) isEmpty()
//* concat(String str)
//* trim()
//* charAt(int index)
//* indexOf(int ch)
//* substring(int beginIndex)
//* substring(int beginIndex, int endIndex)
//*
//*/
//
//
///**
//* Write a program that:
//* Converts all the characters in the string to lower case and prints.
//* Converts all the characters in the string to upper case and prints.
//* Checks whether the string/paragraph starts and ends with the string or word 
//"The" and prints.
//* Counts the number of letter 'a' in the string/paragraph and prints.
//* Prints the second half of the string/paragraph.
//* Prints characters between the 10th and 20th indices(inclusive).
//* Prints the string/Paragraph in reverse order.
//* Clears/removes all white spaces or tabs on both ends and prints.
//*/
//
//String para = "The quick brown fox jumps over the lazy dog.";

public interface StringReviw {
	public static void main(String[] args) {
		
		String para = "The quick brown fox jumps over the lazy dog.";

		System.out.println(para.length());
	}

}
