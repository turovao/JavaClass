package com.review6;

//Write a program that  takes a 2-D array and prints the sums of the rows as
//an//integer array.
//

//Then we should get the following array back:
//4
//6
//11
//3

public class Practice1 {

		public static void main(String[] args) {
			
		
		
			int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
			int sumRow0=0;
			 int sumRow1=0;
		        int sumRow2=0;
		        int sumRow3=0;
		        
		            for (int i=0; i<3; i++) {
		                
		                    sumRow0+=a[0][i];
		                    sumRow1+=a[1][i];
		                    sumRow2+=a[2][i];
		                    sumRow3+=a[3][i];
		                    
		                }

		            System.out.println(sumRow0);
		            System.out.println(sumRow1);
		            System.out.println(sumRow2);
		            
		            System.out.println(sumRow3); 
		            
		            
		            
		            
	}
}
	            
		            
		            