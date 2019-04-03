package com.classInterviewQuestions;

//5. Write a java program to reverse String? Reverse a string word by word?
	    

public class Task6 {
	public static void main(String[] args) {
		
	
    
    
    
    String str= "Today is warm day";
    String reverse="";

    char[] array=str.toCharArray();
    
    for(int i=array.length-1; i>=0;  i--  ) {
        reverse=reverse+array[i];
    }
        
    System.out.println(reverse);
}
}

