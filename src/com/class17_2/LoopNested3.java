package com.class17_2;

public class LoopNested3 {
	public static void main(String[] args) {
		
		
//		*
//		**
//		***
//		****
//	
		LoopNested3 loop=new LoopNested3 ();
		loop.printValue();
				
		
	}	
	void printValue() {
	for(int a=0; a<4; a++) {

	       for(int b=0; b<=a; b++) {

	           System.out.print("*");
	       }
	       System.out.println();
	   }}
	}














