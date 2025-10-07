package lezione02_statement;

import java.util.Scanner;

public class Scanner_Esempio {
	public static void main(String[] args) {
		//Lo scanner serve ad acquisire degli input utente. Possono essere ti tutti i tipi che vogliamo
		
		
		//Stringhe
		Scanner mioScann = new Scanner(System.in); //ATT: Scanner va importato da java.util, il System.in sono gli input di sistema, cioè quelli che scrive l'utente

		
		
		System.out.println("Ciao, inserisci il tuo nome: ");
		String mioNome = mioScann.nextLine();
		
		if(mioNome.equals("") || mioNome.equals("".trim())) {
			System.out.println("Non hai inserito un nome");
		}else {			
			System.out.println("Benvenuto " + mioNome);
		}

		
		//Posso utilizzare lop stesso scanner per inserire cose diverse
		System.out.println("Inserisci la tua età: ");
		int miaEta = mioScann.nextInt();
		
		System.out.println("Hai " + miaEta + " anni");
		
		System.out.println("Inserisci la tua altezza (in metri):");
		double miaAlt = mioScann.nextDouble();
		
		System.out.println("Sei alto: " + miaAlt + " mt");
		
		Scanner scann2 = new Scanner(System.in);
		System.out.println("Questo è il secondo scanner");
		String qualcosa = scann2.nextLine();
		
		System.out.println("Ciao " + mioNome + " hai appena acquisito questa Stringa: " + qualcosa);
		
		
		
		
		
		
	}

}
