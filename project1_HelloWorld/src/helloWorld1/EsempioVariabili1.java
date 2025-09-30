package helloWorld1;

public class EsempioVariabili1 {
	public static void main(String[] args) {
		
//		Scrivi nome e cognome dell'utente. Calcola l'anno di nascita in base alla sua età
		String nomeUtente = "Pippo";
		String cognomeUtente = "Rossi";
		
//		byte etaUser = 40;
//		short annoCorrente = 2025;
////		ATT: non posso fare della matematica con tipi di dato diversi tra loro, a meno che non utilizzo il cast del dato
//		
//		short annoNascita = annoCorrente - etaUser;
		
		short etaUser = 40;
		short annoCorrente = 2025;
		
		//In questo caso, nel fare una semplice operazione di sottrazione ho bisogno del cast. Il cast serve a forzare una varibile ad essere di un determinato tipo
		short dataNascita = (short) (annoCorrente - etaUser);
		
		//Compongo una string di presentazione
		String presentazione = "L'utente " + nomeUtente + " " + cognomeUtente + " è nato nel " + dataNascita;
		
		System.out.println(presentazione);
		
		
//		Rifare lo stesso esercizio ma partendo dall'anno di nascita ricavare l'età. Crea una nuova classe chiamata "Es1AnnoNascita" nel package helloWorld
	}
}
