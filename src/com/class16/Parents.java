package com.class16;

public class Parents {
	
	String gender,hairColor,body;
	int legs, hands ,moles;
	boolean kind, calm;
	
	public static void main(String [] args) {
		
		Parents mom=new Parents();
		mom.gender="femail";
		mom.hairColor="brown";
		mom.body="chubby";
		mom.legs=2;
		mom.hands=2;
		mom.moles=7;
		mom.kind=true;
		mom.calm=false;
		
		System.out.println(" My mom has "+mom.hairColor+" hair");
		
	       mom.help();
	       mom.educate();
	       mom.kiss();
	       mom.miss();
	       
	       
	       Parents dad=new Parents();
	       dad.gender="male";
	       dad.hairColor="silver";
	       dad.body="skinny";
	       dad.legs=2;
	       dad.hands=2;
	       dad.moles=11;
	       dad.kind=true;
	       dad.calm=true;
	       
	       System.out.println("My dad are very kind, helpful and has a very "+dad.calm+"personality");
	       
	  dad.help();
	  dad.educate();
	  dad.kiss();
	  dad.miss();
	  
	}
	void help(){
		System.out.println("Very helpful");
	}
	  
	void educate() {
		System.out.println("Always eduacte ");
	}  
		
		void kiss() {
			System.out.println("love to kiss");
		}
		void miss() {
			System.out.println("Miss forever");
		}
	}


