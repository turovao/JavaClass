package com.review2;

import java.util.Scanner;

public class ClassREview4 {
	
	
	
	public static void main(String[] args){

		   Scanner scan;
		   boolean isTrueloan;
		   int score;
		   String eligibility;

		   scan=new Scanner(System.in);
		   System.out.println("Do you need a loan?");
		   isTrueloan=scan.nextBoolean();

		   if(isTrueloan) {
		   System.out.println("What is your credit score?");
		   score=scan.nextInt();
		   eligibility=scan.nextLine();

		   if(score<600){
		   eligibility="Not eligible";

		   }else if(score>=600 && score<=700){
		   eligibility="Maybe eligible";

		   }else if(score>=701 && score<=800){
		    eligibility="Eligible";

		   }else if(score>800){
		   eligibility="Definitely Eligible";

		   }else{
		   eligibility="invalid";
		   

		


		   else{
			   eligibility="Unknown";
			   
			   System.out.println("The eligibility is "+eligibility);
		  }
		}
		   
		   



