package com.class12;
//Write a program that checks if a 2-D integer array is a square array, meaning,
//if its rows and columns are 
//equal.

public class PractiseHome {
	public static void main(String[] args) {
	
		
			int[][] a = {
				{1,1,1},
				{1,1,1},
				{1,1,1}
			};
	 //should be true


			
			
			
			
			int row=0;
	        int col=0;
	            for(int i=0;i<a.length;i++) {
	                row++;
	            if(a.length==a[i].length) {
	                col++;
	            }
	        }
	        if(row==col)System.out.println("true");
   }
		}
	
		
		
		
		
		
		
		
		
		
		
		
	
