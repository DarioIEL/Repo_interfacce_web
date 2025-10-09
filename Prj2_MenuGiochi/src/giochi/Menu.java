package giochi;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		char scelta;

		do {

			System.out.println("---MENU---");
			System.out.println("1. Tombola");
			System.out.println("2. Triangoli");
			System.out.println("3. Multipli");
			System.out.println("Q. ESCI");
			System.out.println("----------");

			scelta = scan.nextLine().charAt(0);
			
			switch(scelta) {
			case '1':
				System.out.println("Hai scelto di giocare alla Tombola");
				break;
			case '2':
				System.out.println("Hai scelto di giocare con i Triangoli");

				break;
			case '3':
				System.out.println("Hai scelto di giocare con i multipli");
				//richiamo il metodo calcolaMultipli35 che si trova in un'altra classe
				//nomeClasse.nomeMetodo();
				Multipli.calcolaMultipli35();
				break;
			case 'q':
			case 'Q':
				System.out.println("Hai deciso di uscire dal programma! ");
				break;
			default:
				System.out.println("Scusa non ho capito il comando");
				
			}
			
		} while (scelta != 'Q' && scelta != 'q');

	}
}
