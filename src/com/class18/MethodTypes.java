package com.class18;

import com.class16.Main;

public class MethodTypes {
	//method without return type and without arguments
	public void add() {
		
		int a=40;
		int b=50;
		int c=a+b;
		System.out.println(c);
	}
		
		public static void main(String []args) {
			
		MethodTypes obj=new MethodTypes();
		obj.add();
		}
		//method without return type and with arguments
//------------------------------------------------------------------------------------------------		
		//class MethodTypes{
		public void add(int a, int b) {
			
			int c=a+b;
			System.out.println(c);
			
		}
		//public static void main(String []args) {
		MethodTypes obj1=new MethodTypes();
		obj1.add(13,24);
		}	
		
		}
		
		
	

