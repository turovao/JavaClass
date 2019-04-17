package com.class22;

public class Child2 extends Parent {
	
	
	
	String hairType="streight";
	
	public static void main(String[] args) {
		
	
	
	
	Parent ch2=new Parent();
	System.out.println(ch2.eyeColor);
	System.out.println(ch2.nose);
	System.out.println(ch2.hairColor);
	ch2.dance();
    
	
	Child2 obj=new Child2 ();
	System.out.println(obj.hairType);
	obj.coding();
	
	
	}
	public void coding() {
		System.out.println("I can code");
	}
	}

