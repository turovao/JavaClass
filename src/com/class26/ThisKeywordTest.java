package com.class26;

public class ThisKeywordTest {

	public static void main(String[] args) {
		System.out.println("----------");
		Thiskeyword obj = new Thiskeyword(10, 20);
		obj.sum(100, 200);
		
		System.out.println("----------");
		Thiskeyword obj1=new Thiskeyword();
		obj1.sum(12, 13);

	}
}