package com.class16;
//Create a Class “Phone”. Create 3 Objects of it: iPhone, Android, Nokia with specific 
//attributes and behaviours.

public class Phone {
	String type,  brand ;
    boolean  camera, touchScreen;
    int memory,ram;
    
    public static void main(String[] args) {
		
    	Phone p1=new Phone();
    	p1.type="Iphone";
    	p1.brand="Apple";
    	p1.camera=true;
    	p1.touchScreen=true;
    	p1.memory=6;
    	p1.ram=8;
    	//Iphone has the best camera.
    	System.out.println(p1.type+"------------------ has the best "+p1.camera);
        
    	p1.watchMovie();
    	p1.call();
    	p1.text();
        
        Phone p2 = new Phone();
        p2.type = "Android";
        p2.brand = "Galexy";
        p2.camera=true;
        p2.touchScreen =true;
        p2.memory =4;
        p2.ram=6;
        
        System.out.println(" Second phone-------------------------");
        
        p2.watchMovie();
        p2.call();
        p2.text();
        
        Phone p3 = new Phone();
        p3.type = "Plus";
        p3.brand="Nokia";
        p3.camera = true;
        p3.touchScreen = false;
        p3.memory = 2;
        p3.ram = 2;
        
        System.out.println(" Third phone ----------------------------");
        
        
        p3.watchMovie();
        p3.call();
        p3.text();
	}
    
    void watchMovie() {
    	System.out.println("We can watch movies "+brand);
    }
	
	void call() {
		System.out.println("We can do call "+brand);
	}
	
	void text() {
		System.out.println("We can text "+brand);
	}
}


	
	
	
	
	
	
	
	
	
	












