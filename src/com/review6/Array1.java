package com.review6;

public class Array1 {
	public static void main(String[] args) {
		
		int [] [] ar= {
				{1,2,3},
				{4,5,6,9},
				{7,8}
		};
		
		for( int i=0; i<ar.length; i++) {
			for( int k=0; k<ar[i].length; k++) {
				System.out.print(ar[i][k]+" ,");
			}
			System.out.println();
		}}}

