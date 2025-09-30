package lezione01_Intro;

public class EsercizioSpesa {
	public static void main(String[] args) {
	
		//istanzia 3 variabili: speseGenerali, speseAuto, speseViaggi. Calcola il totale, la media e la media sul trimestre. Stampa tutto in uno specchietto (finto) con i Syso
		//istanzio 3 variabili utilizzando la , tra una e l'altra
		double speseGenerali, speseAuto, speseViaggi, speseIstruzione;
		//assegno un valore a ciascuna variabile
		speseGenerali = 2524.36;
		speseAuto = 951.2;
		speseViaggi = 4201;
		speseIstruzione = 150;
		
		double totaleAnno = speseAuto + speseGenerali + speseViaggi;
		double mediaSpese = totaleAnno / 3;
		double mediaTrimestre = totaleAnno / 4;
		
		System.out.println("---- SPESE ANNO IN CORSO ----");
		System.out.println("Spese Generali: " + speseGenerali);
		System.out.println("Spese Auto: " + speseAuto);
		System.out.println("Spese Viaggi: " + speseViaggi);
		System.out.println("Totale: " + totaleAnno);
		System.out.println("Media per tipo: " + mediaSpese);
		System.out.println("Media trimestre: " + mediaTrimestre);
		System.out.println("------------------------------");

		double calcolo = 6777 / 9;
		System.out.println(calcolo);
	}
}
