package com.class26;
//1. A boy has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B and Bank C 

//respectively. We have to print the money deposited by him in a particular bank. Create a class 
//‘Bank’ with a method ‘getBalance’ which returns 0. Make three subclasses named ‘BankA’, ‘BankB’
//and ‘BankC’ with a method with the same name ‘getBalance’ which returns the amount deposited 
//in 
//that particular bank. Call the method ‘getBalance’ by the object of each of the three banks.

public class Bank {

	 int getBalance() {
		return 0;
	}

}

class  BankA extends Bank {
	 int getBalance() {
		return  1000;
	}

}

class BankB extends Bank {

	public int getBalance() {
		return 1500;
	}
}

class BankC extends Bank {

	public int getBalance() {
		return 2000;

	}
}
//-----------------------------Another method with void----------------//
//public void getBalance() {
//
//    System.out.println("0");
//
//}
//}
//class BankA  extends Bank {
//
//    public void getBalance() {
//
//        System.out.println("1000");
//
//    }
//
//}
//class BankB extends Bank {
//
//    public void getBalance() {
//
//        System.out.println("1500");
//    }
//
//}
//class BankC extends Bank {
//
//    public void getBalance() {
//
//        System.out.println("2000");
//
//    }
//
//}
