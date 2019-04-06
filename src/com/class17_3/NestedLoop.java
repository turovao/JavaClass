package com.class17_3;

public class NestedLoop {
	public static void main(String[] args) {
		
		// i want to print pattern
		//12345
		//12345
		//12345
		//12345
		
		
		NestedLoop test=new NestedLoop();
		test.printNum();
		

		
	}
	void printNum() {
		for (int i=1; i<5; i++){
			
		    for (int y=1; y<=5; y++) {
		    	
		    	System.out.print(y);
		    }
		
	}

}}
