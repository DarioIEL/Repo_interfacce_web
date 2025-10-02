package lezione01_Intro;

public class TipiVariabili {

	
	public static void main(String[] args) {
		// TIPI PRIMITIVI NUMERICI e non (char)
		
		//DICHIARO UNA VARIABILE
		byte anniUser = 36; //8 bit = 2^8 posizioni. 256 posizioni (-128; 127)
		
//		Faccio una composizione di variabili. Utilizzo l'operatore + per concatenare le stringhe
		//LEGGO(richiamo, stampo) UNA VARIABILE
		System.out.println("L'utente ha " + anniUser + " anni");
		
		
//		byte giorniAnno = 365; Questo è un errore poiché 365 non "entra" all'interno di un tipo byte
		
		short giorniAnno = 365; //16 bit
		int litriMare = 9900; //32 bit
		long etaTerra = 4000000000L; //64bit
		
		//Tipi Reali, a virgola mobile
		float piGreco = 3.14f; //32 bit, attenzione ci vuola la f alla fine
		double altezza = 5.36; //64 bit
		
		System.out.println("Mediamente l'altezza di una giraffa è " + altezza + " metri");
		
//		Tipi Boolean 1 bit. utilizzati solitamente nei costrutti condizionali
		boolean vero = true;
		boolean falso = false;
		
		System.out.println("Quello che dico è tutto " + vero);
		System.out.println("Quello che non dico è tutto " + falso);
		
		char carattere = 'B'; //16 bit - raprresenta un singolo carattere in Unicode
		System.out.println("Il valore del carattere è: " + carattere);
		
		char car2 = 'p';

		
		
		//TIPI NON PRIMITIVI
		String nomeUser = "Dario";
		String cognomeUser = "Mennillo";
		byte etaUser = 36;
		
		System.out.println("L'utente si chiama " + nomeUser + " " + cognomeUser +  " e ha " + etaUser + " anni");
		
		
		
	}
		
}
	
	
