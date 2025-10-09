package lezione3_Metodi;

import java.util.Scanner;

public class Intro {
	
	/**
	 * I METODI servono a wrappare codice e renderlo riutilizzabile a comando
	 * Permettono di scomporre un problema in sottoproblemi più piccoli
	 */

	/**
	 * SINTASSI:
	 * 
	 * public -> modificatore d'accesso
	 * 
	 * static -> IL METODO O LA PROPR DICHIARATA STATIC APPARTENGONO SOLO ALLA CLASSE E NON ALL'ISTANZA
	 * 
	 * void -> tipo di ritorno, cosa mi restituisce questo metodo. Ovvviamente possono essere int, double, String, boolean
	 * 	
	 * main -> nome del metodo
	 * 
	 * (string[] args) -> parametri del metodo
	 * 
	 * nome + parametri -> Firma del metodo
	 * 
	 * { ...body del metodo...  }
	 * 
	 * 
	 */

	static String nomeEnte = "Immaginazione e Lavoro";
	
	
	//Creo un metodo per farmi salutare
	public static void salutaUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Scrivi il tuo nome completo: ");
		String nomeCognome = scan.nextLine();		
		System.out.println("Ciao " + nomeCognome);
	}
	
	public static void salutaDocente() {
		//ATT: un metodo static può accedere solo a variabili o propr static. Un metodo static può accedere solo ad altri metodi static
		String nomeMateria = "HTML css";
		System.out.println("Ciao Milo Spandre. Materia insegnata: " + nomeMateria + ". Ente: " + nomeEnte);
	}
	
	public static void salutaStudente() {
		System.out.println("Ciao Anna Rossi");
	}
	
	public static void salutaTutti() {
		//Qui richiamo gli altri metodi
		salutaDocente();
		salutaStudente();
		salutaUser();
	}
	
	
	//Metodi con parametri
	public static void salutaRespo(String nomeCompleto) {
		System.out.println("Un saluto alla responabile del corso " + nomeCompleto);
	}
	
	//Un metodo può anche essere mandato in overload. Inserisco un metodo con lo stesso nome di un altro ma con firma diversa
	public static void salutaRespo(String nomeCompleto, String nomeCorso) {
		System.out.println("Un saluto alla/al responabile "+ nomeCompleto +" del corso " + nomeCorso );
	}
	
	
	//Metodi con return. Questi metodi restituiscono qualcosa
	//ATT: anche con il return NON sono obbligato ad avere un parametro
	public static int cambiaNumero(int tuoNumero) {
		int numeroUscita = tuoNumero * 10;
		return numeroUscita;
	}
	
	
	
	
	public static void main(String[] args) {
		//Richiamo il metodo salutaUser
//		salutaUser();
		salutaTutti();
		
		//Richiamo il metodo salutaRespo passandogli un parametro
		salutaRespo("Egle Risola"); //passandogli un solo parametro sto richiamando il primo metodo salutaRespo
		salutaRespo("Tina Ponte");
		salutaRespo("Valentina Favole");
		
		salutaRespo("Vincenzo Papa", "Elementi di magazzino");
		
		//Quando richiamo un metodo con return (output) devo raccogliere quel valore in uscita
		int numeroCambiato = cambiaNumero(8);
		System.out.println("Il numero cambiato è " + numeroCambiato);
	}
	
	
	
}
