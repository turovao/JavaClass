package com.class12;

public class Practice {
	
	
	public static void main(String []args) {
		
//		int [][] array= {
//				{1,2,3,4},
//				{10,20,30},
//				{100,200,300},
//					
//		};
//		
//		for( int []num:array) {
//			for(int list:num) {
//				System.out.print(list+" ");
//			}
//			System.out.println();
//		}
		
		String[] [] grocery= {
				
				{"banana", "apples","grapes"},
				{"potato"," tomato","garlic"},
				{"milk","cheese","yougurt"},
						
				
		};
		
		for(String []bag:grocery) {
			for(String list: bag) {
				System.out.print(list+" ");
			}
			System.out.println();
			
		}
		
		
		
		
		
		
	}
	


}
