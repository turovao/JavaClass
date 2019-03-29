package com.class11;

public class Task4 {
	public static void main(String[] args) {
		
		
//		Create an array of cars : american, german, korean, italian. 
//		Then retrieve all values from that array
//		
		
		String [][] names= {
				
				{"american-","Dodge,Crysler"},
				{"german-","BMW","Audi","Benz"},
				{"korean-","Hundia","Kia","PMC","Daewoo"},
				{"italian-","Lamborgini","Alfa","Pagani"},
					
		};
		
		
		for(int i=0; i<names.length; i++) {
			for(int j=0; j<names[i].length; j++) {
			System.out.print(names[i][j]+" ");	
			}
		
			System.out.println();
		}
		
	}

}





























