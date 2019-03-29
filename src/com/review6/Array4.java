package com.review6;
// find the value above the value of 7
public class Array4 {
	public static void main(String[] args) {
		
	int[][] rating = { 
			{ 2, 6, 9, 3, 7 },
			{ 1, 7, 9, 4, 8 },
			{ 0, 4, 6, 2, 5 },
	
			{ 0, 1, 2, 3 } 
	          };
	
  
	   
	   int sum = 0;
	    for(int i=0;i<rating.length;i++) {
	        for(int j=0;j<rating[i].length;j++) {
	            if(rating[i][j]>7)sum++;
	        }
	    }
	    System.out.println(sum);
	}
	
	// new method
	
	 //  Write a program to find the average of row 2.
//     2 6 9 3 7
//     1 7 9 4 8
//     0 4 6 2 5
//     0 1 2 3
int[][] rating = { { 2, 6, 9, 3, 7 }, { 1, 7, 9, 4, 8 }, { 0, 4, 6, 2, 5 }, { 0, 1, 2, 3 } };

int sum = 0;
for (int col = 0; col <= 3; col++) {
sum += rating[2][col];
}
System.out.println("The average of row 2 is : " + sum / 4);

//Find the number of values above the value of 7.
int num = 7;
int count = 0;
for (int row = 0; row < rating.length; row++) {
for (int col = 0; col < rating[row].length; col++) {
 if (rating[row][col] > num)
     count++;
}
}
System.out.println("The number of elements above " + num + " is " + count);
	   
  
	   
	   
}	   

}
