package lezione05_JCF;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList_esempi {
	public static void main(String[] args) {
		//JCF (Java Collection Framework)
		
//		ArrayList (Array ridimensionabili)
//		List<String> mioArrayList = new ArrayList<>(); //notazione da utilizzare
//		ArrayList<String> tuoArrayList = new ArrayList<>(); //da evitare
	
		List<String> nomi = new ArrayList<>();
		//aggiungo dei nomi
		nomi.add("Anna");
		nomi.add("Dario");
		nomi.add("Paola");
		nomi.add("Luca");
		nomi.add(4, "Vale");
		
		nomi.set(1, "Paolo");
		
		System.out.println(nomi); //qui funziona poiché nelle list esiste il toString
		
		int lungArrayL = nomi.size();
		System.out.println("La lunghezza dell'array è " + lungArrayL);
		
		System.out.println("Stampo con ciclo for classico");
		for(int i = 0; i < nomi.size(); i++) {
			System.out.println(nomi.get(i));
		}
		
		System.out.println("Stampo con un foreach");
		for (String nome : nomi) {
			System.out.println(nome);
		}
		
		//Rimuovo 1 singolo elemento
		String nomeDaRimuovere = "Luca";
		nomi.remove(nomeDaRimuovere); //rimuovo passando l'oggetto
//		nomi.remove(1);	//rimuovo passando l'indice
		
		System.out.println(nomi);
		
		nomi.clear();
		
		System.out.println(nomi);
		System.out.println(nomi.isEmpty());
		
		//creo un altro ArrayList
		List<String> cognomi = new ArrayList<>();
		cognomi.add("Rossi");
		cognomi.add("Verdi");
		cognomi.add("Gialli");
				
		System.out.println(cognomi.reversed());
		System.out.println(cognomi.isEmpty());
		
		String[] cognomi_Array = new String[cognomi.size()];
		
		//Trasformo in array un ArrayList
		for(int i = 0; i < cognomi.size(); i++) {
			cognomi_Array[i] = cognomi.get(i);
		}
		
		System.out.println(Arrays.toString(cognomi_Array)); //questo è un array classico
		
		//Array di numeri
		//OSS: nelle List non posso utilizzare i tipi primitivi. Quindi dovrò utilizzare le classi Wrapper
		List<Integer> numeriCasuali = new ArrayList<Integer>();
		numeriCasuali.add(1);
		numeriCasuali.add(5);
		numeriCasuali.add(7);
		numeriCasuali.add(2);
		
		Integer miaEta = 36;
		System.out.println(miaEta);
		
		Boolean vF = true;
		
		Double numDoub = 5.4;
	
		//Aggiunta in simultanea di più valori
		//METODO Arrays.asList
		System.out.println("Aggiunta di più valori");
		List<String> frutta = new ArrayList<>();
		frutta.add("Mela");
		frutta.addAll(Arrays.asList("Pera", "Banana", "Pesca"));
		System.out.println(frutta);
		
		//METODO Collections.addAll
		List<String> colori = new ArrayList<>();
		Collections.addAll(colori, "Verde", "Blue", "Rosso", "Giallo");
		System.out.println(colori);
		
		//METODO List.of
		List<String> citta = new ArrayList<>();
		citta.addAll(List.of("Napoli", "Torino", "Roma", "Milano"));
		System.out.println(citta);
	
		//Aggiunta di una collezione in un altra collezione
		List<String> animali1 = new ArrayList<>(Arrays.asList("Cane", "Gatto", "Topo"));
		List<String> animali2 = new ArrayList<>(Arrays.asList("Elefante", "Giraffa", "Leone"));
		
		animali1.addAll(animali2);
		System.out.println(animali1);
		
	
		//ATT: con List.of creo delle liste immutabili
		List<String> lettere = List.of("A", "B", "C");
//		lettere.add("D"); //Questo non posso farlo
//		lettere.set(0, "D");
		System.out.println(lettere);
		
	}

}
