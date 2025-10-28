package lezione05_JCF;

import java.util.*;

public class Map_Esempi {
	public static void main(String[] args) {

		// Anche le mappe fanno parte della Jcf
		// Anche le map non possono essere istanziate e quindi ci serviamo delle
		// implementazioni: - HashMap, -LinkedHashMap , -TreeMap

		// HashMap è la più comune. Non c'è nessun ordine garantito

		// OSS: le mappe servono a trattenere i dati secondo il principio della "Coppia
		// Chiave-Valore". Non possono esserci chiavi duplicate, quindi se inserisco un
		// valore in una chiave esistente verrà sovrscritto

		// HASHMAP: non mantiene l'ordine, può avre chiavi null

		// chiave valore
		Map<String, Integer> mappaEta = new HashMap<>();

		// aggiungo elementi alla mappa
		mappaEta.put("Dario", 36);
		mappaEta.put("Anna", 30);
		mappaEta.put("Marco", 42);
		mappaEta.put("Laura", 28);

		// cerco elementi per ottenere un valore

		int etaAnna = mappaEta.get("Anna");
		System.out.println(etaAnna);
 
		// Posso fare un controllo sull'esistenza di una chiave
		if (mappaEta.containsKey("Anna")) {
			System.out.println("Anna ha " + mappaEta.get("Anna") + " anni");
		}

		// Posso iterare una mappa con entrySet
		System.out.println("---ENTRYSET---");
		for (Map.Entry<String, Integer> entry : mappaEta.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		// Iterare solo con chiavi
		System.out.println("---SOLO CHIAVI---");
		for (String chiave : mappaEta.keySet()) {
			System.out.println(chiave);
		}

		// Iterare solo valori
		System.out.println("---SOLO VALORI---");
		for (Integer eta : mappaEta.values()) {
			System.out.println(eta);
		}

		// Iterare con foreach classico e arrow function
		System.out.println("CON Foreache e arrowfunction");
		mappaEta.forEach((nome, eta) -> System.out.println(nome + " : " + eta));
		
		//ALTRI METODI 
		mappaEta.putIfAbsent("Luca", 38); //Se esiste una chiave non La sovrascrive
		
		//rimozione
		mappaEta.remove("Anna");
		
		//Dimensione
		int dimensione = mappaEta.size();
		
		//Controllare se vuota
		boolean vuota = mappaEta.isEmpty();
		
		//Ottenere qualcosa con un valore di default se non esiste
		//Cerco Maria, non esiste, imposta 0 come valore di default
		int etaMaria = mappaEta.getOrDefault("Maria", 0);
		System.out.println(etaMaria);
		
		//aggiornare un valore
		mappaEta.replace("Dario", 35);
		mappaEta.forEach((nome, eta) -> 
			System.out.println(nome + ": " + eta)
				);
		
		mappaEta.clear();
	
		
	}
}
