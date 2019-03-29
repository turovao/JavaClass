package com.class5;

import java.util.Scanner;

public class TryAtClassOrAddCondotions {
	
	
	//Write a program that will read three inputs of scores
	//(quiz, mid term, and final scores) and determine the grade based on the
	//following rules:
	//	if the average score >=90 =>grade=A
	//	if the average score >= 70 and <90 => grade=B
	//	if the average score>=50 and <70 =>grade=C
	//	if the average score<50 =>grade=F
	
	
	// avgScore=(quiz+mid term+final scores)/3
	
	public static void main(String[] args) {
		
		int quiz ;
		int midTerm ;
		int finalGrade;
		int average;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your final score");
		finalGrade=input.nextInt();
		
		average=(quiz+midTerm+finalGrade)/3;
		
		
		System.out.println("Average score is"+average);
		
		
		
		if(average>=90 ) {
			System.out.println("Grade is A");
		}else if(average>=70 &&  average<90) {
			System.out.println("Grade id B");
		}else if(average>=50 && average<70) {
			System.out.println("Grade is C");
		}else if(average<50) {
			System.out.println("Grade is F");
		}
		                            
	}
	
	
}

