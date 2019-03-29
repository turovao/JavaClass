package com.review6;




////Write a program to find the average of row 2.
////2 6 9 3 7
////1 7 9 4 8
////0 4 6 2 5
////0 1 2 3
//int[][] rating = { { 2, 6, 9, 3, 7 }, { 1, 7, 9, 4, 8 }, { 0, 4, 6, 2, 5 },
//{ 0, 1, 2, 3 } };

public class Array3 {
	public static void main(String[] args) {
		
		int[][] rating = { 
				{ 2, 6, 9, 3, 7 },
				{ 1, 7, 9, 4, 8 },
				{ 0, 4, 6, 2, 5 },
		
				{ 0, 1, 2, 3 } 
		};
		
		int sum=0;
		int avg=0;
        
        for(int b=0;b<rating[1].length;b++) {
            sum+=rating[1][b];
            
        }
        avg=sum/rating[1].length;
        System.out.println(avg);
        
	}
}
