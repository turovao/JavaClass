package com.class26;

public class BankTest {
	public static void main(String[] args) {
		
		Bank obj=new BankA();
		 System.out.println("Bank A="+obj.getBalance());
		
		Bank obj1=new BankB();
		System.out.println("Bank B="+obj1.getBalance());
		
		Bank obj2=new BankC();
		System.out.println("Bank C="+obj2.getBalance());
		
		 
	}

}
//public class Main {
//public static void main(String[] args) {
//    Bank obj=new BankA();
//    Bank obj1=new BankB();
//    Bank obj2=new BankC();
//obj.getBalance();
//obj1.getBalance();
//obj2.getBalance();
//}
//}