package com.class16;

public class Women {

	

		 
		
		
		String name,hairColor,body,eyeColor,country;
		boolean hair,nail;
		int weight,height;

		public static void main(String [] args) {
			
			
	//Object Women 1:
			
		Women women1=new Women();
		
		women1.name="Olga";
		women1.hairColor="brown";
		women1.body="slim";
		women1.eyeColor="blue";
		women1.country="Russia";
		women1.hair=true;
		women1.nail=true;
		women1.weight=133;
		women1.height=5;

		System.out.println(women1.name + " The most beautiful woman on earth is ");
		
		//define behvaiors:
		
		women1.mostlyCrazy();
		women1.sometimesAngry();
		women1.alwaysHungry();
		
		//Object Women 2:
		
		Women women2=new Women();
		
		women2.name="Enkma";
		women2.hairColor="black";
		women2.body="chubby";
		women2.eyeColor="hazel";
		women2.country="Mongloia";
		women2.hair=true;
		women2.nail=true;
		women2.weight=159;
		women2.height=5;

		System.out.println(women2.name+ " The woman who feeds me the most ");
		
		//define behvaiors:
		
		women2.mostlyCrazy();
		women2.sometimesAngry();
		women2.alwaysHungry();

		//Object Women 2:
		
			Women women3=new Women();
			
			women3.name="Jennie";
			women3.hairColor="blone";
			women3.body="fat";
			women3.eyeColor="green";
			women3.country="USA";
			women3.hair=true;
			women3.nail=true;
			women3.weight=200;
			women3.height=6;

			System.out.println(women3.name+ " The woman who massages me all the time ");
			//define behvaiors:
			
			women3.mostlyCrazy();
			women3.sometimesAngry();
			women3.alwaysHungry();

	}
	void mostlyCrazy() {
		System.out.println(" she is crazy sometimes " + name );
	}
	void sometimesAngry() {
		
		System.out.println(" she is angry with no reason "+ name);
	}

	void alwaysHungry() {
		System.out.println(" she wants to eat all the time like a child " + name);
		
	}}

