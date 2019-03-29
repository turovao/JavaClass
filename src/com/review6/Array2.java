package com.review6;

public class Array2 {
public static void main(String[] args) {
   // Write a program to Print all elements of 2d array Using Loop

    for (int i = 0; i < ar.length; ++i) {
        for (int j = 0; j < ar[i].length; ++j) {
            System.out.println(ar[i][j]);
        }
    }

    for (int[] innerArray : ar) {
        for (int data : innerArray) {
            System.out.println(data);
        }
}
}
