package com.class17_2;

//Print the following pattern:
//*
//**
//***
//****
//*****
//****
//***
//**
//*



public class HomeWork4 {
	public static void main(String[] args) {
		
		
		for( int a=1; a<=5; a++) {
			for( int b=1; b<=a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for( int c=1; c<=4; c++) {
			for(int d=4; d>=c; d--) {
				System.out.print("*");
				
	
			}
			System.out.println();
		}
	}

}




//for (int i = 1; i <= 5; i++) {
//    for (int k = 1; k <= i; k++) {
//        System.out.print("*");
//    }
//    System.out.println();
//}
//
//for (int i=1; i<=4; i++) {
//    for (int y=4; y>=i; y--) {
//        System.out.print("*");
//    }
//    System.out.println();
//}
////break till 11: 50
//}
//}
//
