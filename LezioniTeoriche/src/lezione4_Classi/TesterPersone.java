package lezione4_Classi;

public class TesterPersone {

	public static void main(String[] args) {
		
		Persona pers1 = new Persona("Anna", "Rossi", 30, "Rssnn95d14f78a98xd", 1.7);
	
		System.out.println(pers1);
		//Attraverso la notazione . richiamo la singola propr
		System.out.println("Il codice fiscale della persona è " + pers1.codFisc);
		
		System.out.println(pers1.saluta("Dario", 1.1));
		System.out.println(pers1.saluta("Luisa"));
	}
}
