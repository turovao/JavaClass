package com.review6;
//Print the average of value in column 3
public class Array5 {
	public static void main(String[] args) {
		
		
		
		int[][] rating = { 
				{ 2, 6, 9, 3, 7 },
				{ 1, 7, 9, 4, 8 },
				{ 0, 4, 6, 2, 5 },
		
				{ 0, 1, 2, 3 } 
		};
		
		
		
		//awet(Instructor) [8:54 PM]
				int sum2 =0;

				for(int i =0; i<rating.length; i++) {
				    
				    sum2+= rating[i][2];
				    
				}

				System.out.println(sum2/rating.length);
	}

		
		
		
		
	}
	


