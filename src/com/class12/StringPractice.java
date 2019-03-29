package com.class12;

import java.util.Scanner;

public class StringPractice {
	public static void main(String[] args) {
		
	int message;
		int lang1, lang2,lang3;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter any programming language");
         String language = sc.nextLine();

         if (lang1.equals(language)) {
             message="Java is a programming language";
         }else if (lang2.equals(language)){
             message="C is a procedural programming language";
            
         }else if (lang3.equals(language)) {
             message="C++ is a middle-level programming language";
         }else {
             message="Doesn't match any programming language";
         }System.out.println(message);
        }
      }