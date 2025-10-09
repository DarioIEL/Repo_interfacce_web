package lezione02_statement;

import java.util.Scanner;

public class EsamiUniversita {

	// Crea un programma per la gestione degli esami all'università. Gestisci un
	// singolo esame alla volta. L'esame scritto fa da sbarramento all'esame orale.
	// Fornisci la possibilità all'utente di inserire il voto dello scritto e poi
	// successivamente dell'orale.

	public static void main(String[] args) {

		// Dichiaro il voto massimo come una COSTANTE
		final String NOME_APPLICAZIONE = "Controllo esame universitario";
		final int VOTO_MAX = 30;
		final int VOTO_MIN = 1;
		final char carattere = 'B';

		System.out.println("Benvenuto in: " + NOME_APPLICAZIONE);
		System.out.println("Carissimo/a Studente/ssa, inserisci il voto del tuo esame scritto");
		Scanner scan = new Scanner(System.in);

		int votoScritto = scan.nextInt();

		if (votoScritto <= VOTO_MAX && votoScritto >= VOTO_MIN) {

			if (votoScritto >= 18) {
				System.out.println("Voto scritto " + votoScritto + ". Puoi inserire il voto dell'orale.");

				System.out.println("Inserisci voto orale:");
				int votoOrale = scan.nextInt();

				if (votoOrale <= VOTO_MAX && votoOrale >= VOTO_MIN) {

					if (votoOrale >= 18) {
						System.out.println("Voto orale: " + votoOrale + ". Hai superato l'esame");
						double votoFinale = Math.round((double) (votoScritto + votoOrale) / 2);
						System.out.println("Voto Finale: " + votoFinale);
					} else {
						System.out.println("Mi spiace, non hai superato l'esame orale. Quindi non hai passato l'esame");
					}
				} else {
					System.out.println("Hai inserito un votot non valido");
				}

			} else {
				System.out.println("Mi spiace, non hai passato lo scritto quindi non puoi accedere all'orale");
			}

		} else {
			System.out.println("Hai inserito un voto dello scritto non valido");
		}

	}

}
