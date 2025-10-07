package lezione02_statement;

import java.util.Scanner;

public class Switch_Statement {
	public static void main(String[] args) {

		// Lo switch mi permette di valutare, in base ai casi, il valore di una varibile
		Scanner scan = new Scanner(System.in);

		System.out.println("Inserisci il numero del giorno della settimana");

		if (scan.hasNextInt()) {

			int giornoDellaSettimana = scan.nextInt();

			switch (giornoDellaSettimana) {
			case 1:
				System.out.println("Lunedì");
				break;
			case 2:
				System.out.println("Martedì");
				break;
			case 3:
				System.out.println("Mercoledì");
				break;
			case 4:
				System.out.println("Giovedì");
				break;
			case 5:
				System.out.println("Venerdì");
				break;
			case 6:
				System.out.println("Sabato");
				break;
			case 7:
				System.out.println("Domenica");
				break;
			default:
				System.out.println("Non riconosco il valore");
				break;
			}
		} else {
			System.out
					.println("Caro utente, hai inserito un valore non corretto, io ti ho chiesto un maledetto numero ");
		}

		String rigaVuota = scan.nextLine(); //§Questa l'ggiungi per poter acquisire altri input
		
		//////// Con le stringhe

//		String giorno = "Mercoledì";
		System.out.println("Inserisci il nome del giorno della settimana");
		String giorno = scan.nextLine();


			switch (giorno) {
				case "Lunedì":
					System.out.println("Siamo proprio all'inizio");
					break;
				case "Martedì":
					System.out.println("Siamo ancora all'inizio ma è il secondo giorno");
					break;
				case "Sabato":
				case "Domenica":
					System.out.println("Sei nel weekend");
					break;
				default:
					System.out.println("Giorno non valido");
			}
		
		// Ore del giorno e saluti viene molto noioso perché devo scrivere 24 case
		int oraDelGiorno = 11;

		switch (oraDelGiorno) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Buongiorno");

		}

	}
}
