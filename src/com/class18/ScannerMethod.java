package com.class18;

//public class Task1 {
	import java.util.Scanner;

	public class ScannerMethod {

		

		public static void main(String[] args) {
			ScannerMethod obj = new ScannerMethod();
			Scanner sc = new Scanner(System.in);
			
			int a = sc.nextInt();
			
			int b = sc.nextInt();
			System.out.println(obj.sum(a, b));
//			obj.sum(12, 13);
//			obj.sum(100, 100);

		}

		int sum(int x, int y) {
			System.out.println(x + y); // with return type 
			
			return x+y;
		}

		void sub() {
			int a = 10, b = 12;
			System.out.println(a + b);
		}
	}

