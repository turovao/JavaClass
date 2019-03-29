package com.class12;

public class ForEachIn2D {
	
	public static void main(String[] args) {
		
		
//		Asel Umurzakova (Instructor) [10:47 AM]
//				Create a grocery list: fruits{}
//				         *                         veggies{}
//				         *                         dairy{}
//				         * Retrive all values using 2 different loops
		
		
		String [][] list= {
				
				{"Fruits-","apple","orange", "grapes"},
				{"Veggies-","tomato","potato","carrot"},
				{"Dairy-","milk","cheese"},
		};
				
				for(int i=0; i<list.length; i++) {
					for(int j=0; j<list[i].length; j++) {
						System.out.print(list[i][j]+" ");
					}
					System.out.println();
				}
				
				
			for(String []types:list) {
				for(String categories: types) {
					System.out.println(categories);
				}
				System.out.println();
			}	
		
	}

}
