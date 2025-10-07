package lezione02_statement;

import java.util.Scanner;

public class While_Statement {
	
	public static void main(String[] args) {
		//con i while siamo nell'ambito dei cicli indefiniti
		
		//SINTASSI: 
		/**
		 * while(condizione) {
		 * 		...esegui se la condizione è true
		 * }
		 */
		
		//Esempio: replico un ciclo for semplice con un while
		
		int i = 0;
		
		while (i < 10) {
			System.out.println("Ciao " + i);
			i++;
		}
		
		
		//DO-WHILE
		//Il do while prima esegue qualcosa poi lo controlla. Almeo una  volta l'operazione all'interno del do viene eseguita
		
		//Tabellina del 5 con il do-while
		int d = 1;
		
		do {
			int risultato = d * 5;
			System.out.println("5 x " + d + " = " + risultato);
			d++;
		}while(d <= 10);
	
		
		//Esempio con lo scanner. L'utente non entra fin quando la pass non è corretta
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserisci la password");
		
		String password = scan.nextLine();
		int tentativi = 1;
		
		while(!password.equals("mammaMia")) {
			tentativi++;
			System.out.println("Parola d'ordine errata");
			System.out.println("Riprova:");
			password = scan.nextLine();
		}
		
		
		System.out.println("Benvenuto, hai azzeccato la pass al " + tentativi + "° tentativo" );
		
	}

}
