package com.class31;
//2.Create an arrayList of words. Remove every word that ends with “e”.



import java.util.ArrayList;

import java.util.Iterator;


public class Task2 {

	public static void main(String[] args) {

		ArrayList<String> words = new ArrayList<String>();

		words.add("love");

		words.add("life");

		words.add("tree");

		words.add("learning");

		Iterator<String> iterator = words.iterator();
		while (iterator.hasNext()) {
			String word = iterator.next();

			if (word.endsWith("e")) {
				iterator.remove();
			}
		}
		System.out.println(words);
	}

}