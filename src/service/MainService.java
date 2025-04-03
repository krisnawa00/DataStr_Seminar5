package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import model.City;

public class MainService {

	public static void main(String[] args) {
		
	
		HashMap<String, City> myHashMap = new HashMap<>();
		
		myHashMap.put("Ventspils", new City("Venspils", 57.97f, 37057, "Vitolins"));
		myHashMap.put("Riga", new City("Riga", 307.2f, 605273, "Kirsis"));
		myHashMap.put("Talsi", new City("Talsi", 307.2f, 9000, "Abolins"));
		
		System.out.println("-----------------Visas atslegas-----------------");
		System.out.println(myHashMap.keySet());
		System.out.println("-----------------Iegut-----------------");
		System.out.println(myHashMap.get("Ventspils"));
		System.out.println(myHashMap.get("Liepaja"));
		System.out.println("-----------------Izdzest-----------------");
		myHashMap.remove("Ventspils");
		System.out.println(myHashMap.get("Ventspils"));
		System.out.println("-----------------Iegut visus datus ar atslegam-----------------");
		System.out.println(myHashMap.entrySet());
		System.out.println("-----------------Iegut dazadi varinati-----------------");
		myHashMap.put("Ventspils", new City("Ventspils", 57.97f, 37057, "Vitolins"));
		myHashMap.put("Ventspils", new City("Liepaja", 68.02f, 67088, "Ansins"));
		System.out.println(myHashMap.get("Ventspils"));
		
		myHashMap.put(null, new City());
		System.out.println(myHashMap.get(null));
		
		System.out.println("-----------------Iegut visus datus ar atslegam-----------------");
		System.out.println(myHashMap.entrySet());
		
		HashMap<String, ArrayList<City>> myHashMap2 = new HashMap<>();
		
		myHashMap2.put("Kurzeme", new ArrayList<>(Arrays.asList(
				myHashMap.get("Ventspils"),
				myHashMap.get("Talsi")
				)));
		myHashMap2.put("Vidzeme", new ArrayList<>(Arrays.asList(
				myHashMap.get("Riga")

				)));
		System.out.println("-----------------Iegut visus kurzems pilsetas-----------------");
		System.out.println(myHashMap2.get("Kurzeme"));
		
		
	}
		
}
