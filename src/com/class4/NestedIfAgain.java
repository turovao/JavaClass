package com.class4;

public class NestedIfAgain {
	public static void main(String[] args) {
		
		//declare variable for GPA and having a diploma
		// if user has a diploma-->congratulations -->if GPA is higher 3.5->hire person
		// else do not hire
		
		double gpa=3.0;
		double expectedGpa=3.5;
		boolean hasDiploma=true;
		
		if(hasDiploma) {
			System.out.println("Congratulation");
		if(gpa>expectedGpa) {
			System.out.println("You are hired");
		}else {
			System.out.println("Unfortunately we cannot hire you");
		}
			
		}else {
			System.out.println("Please get your degree");
		}
		
		
		
		
		
	}

}
