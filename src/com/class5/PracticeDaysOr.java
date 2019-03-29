package com.class5;



/*we have 7 days a week
 * if days are from 1-5 --> weekday
 * if days are from 6-7 -->weekend
 * otherwise "Not a valid day"
 */

public class PracticeDaysOr {
	public static void main(String[] args) {
		
		int day=1;
		
		if(day==1 || day==2 || day==3 || day==4 || day==5) {
			System.out.println("Its a weekday");
		}else if (day==6 || day==7) {
			System.out.println("Its a weekend");
		}else {
			System.out.println("Its not a valid day");
		}
			
		
		
	}

}
