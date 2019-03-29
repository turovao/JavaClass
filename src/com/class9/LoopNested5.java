package com.class9;

public class LoopNested5 {
//	
//	rows=4; col=6
//	
//	******    rows 4; colo6
//	*    *
//	*    *
//	******
	
	/// print * on;y if 1 row= 1 or6
	
	// col=1 or6
	
	public static void main(String[] args) {
		
for (int a=1; a<=4; a++) {
        	
            for(int b=1; b<=6; b++) {
            	
            	if (a==1 || a==4 || b==1 || b==6) {
                	
                    System.out.print("*");
                    
                }else {
                	
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }

}