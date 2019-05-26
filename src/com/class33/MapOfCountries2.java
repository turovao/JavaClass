package com.class33;
import java.util.*;
public class MapOfCountries2 {
	

	

	//Create a map of countries with its capital. Print all keys and values 
	//from a country map using for each loop and iterator.
	//Print all values from a country map using for each loop and iterator.

	

		public static void main(String[] args) {

			Map<String, String> mapCountries=new HashMap<>();
			mapCountries.put("Iraq", "Baghdad" );
			mapCountries.put("USA", "DC");
			mapCountries.put("Eygpt", "Cairo");
			mapCountries.put("Itlay", "Rome");
			
			System.out.println(mapCountries);

			Set <String> keys=mapCountries.keySet();
			
			for (String key: keys) {
				System.out.print(key+ " ");

			}
			Collection<String> value=mapCountries.values();
			System.out.println(" ");
			
			Iterator<String> it=value.iterator();
			while(it.hasNext()) {
				System.out.print(it.next()+", ");
			
			}
		}
	

}