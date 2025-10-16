package esercizi_Lezione4;

import java.util.Scanner;

public class GiocoMain {
//	Trasferisco questo metodo in una nuova classe Gioco
//	public static void gioca(int numFacce, String col1, String col2) {
//		Dado d1 = new Dado(numFacce, col1);
//		Dado d2 = new Dado(numFacce, col2);
//
//		int res1 = d1.lancia();
//		int res2 = d2.lancia();
//
//		System.out.println("Risultati: \ndado colore " + d1.colore + ": " + res1);
//		System.out.println("dado colore " + d2.colore + ": " + res2);
//		if (res1 == res2) {
//			System.out.println("HAI VINTO !");
//		} else {
//			System.out.println("Hai perso !!");
//		}
//	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String scelta = "";
		String col1 = "";
		String col2 = "";
		int facce = 0;
		Gioco gioco;
		
		do {
			System.out.println("Ciao utente, benvenuto al gioco dei dadi. Digita L per giocare Q per chiudere");
			scelta = scan.nextLine();

			switch (scelta) {
			case "l":
			case "L": {
				System.out.println("Stai giocando ai dadi");
				if (facce == 0 && col1.equals("") && col2.equals("")) {
					System.out.println("Inserisci il numero di facce");
					facce = scan.nextInt();
					System.out.println("Inserisci un colore per il primo dado :");
					String line = scan.nextLine();
					col1 = scan.nextLine();
					System.out.println("Inserisci un colore per il secondo dado: ");
					col2 = scan.nextLine();
				}
				
				Dado d1 = new Dado(facce, col1);
				Dado d2 = new Dado(facce, col2);
				
				gioco = new Gioco(d1, d2);
				System.out.println(gioco.gioca());
				break;
			}
			case "q":
			case "Q": {
				System.out.println("Hai deciso di chiudere il gioco");
				break;
			}
			default:
				System.out.println("Non capisco il comando");
				break;
			}

		} while (!scelta.equalsIgnoreCase("Q"));

	}
}
