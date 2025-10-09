package lezione3_Metodi;

import java.util.Scanner;

public class CalcolatriceStaticaScema {

	// Utilizzando i metodi ausiliari, crea una calcolatrice alla quale passo 2
	// numeri e ottengo il risultato delle 4 operazioni di base

	public static double addizione(double n1, double n2) {
		// somma è una variabile locale quindi visibile solo ed esclusivamente in questo
		// metodo
		double somma = n1 + n2;
		return somma;
	}

	public static double moltiplicazione(double n1, double n2) {
		double prodotto = n1 * n2;
		return prodotto;
	}

	// Il nome del metodo può essere uguale al nome di una variabile all'interno
	// poiché quando richiamerò il metodo non sarà visibile la variabile dato che è
	// una variabile locale
	public static double sottrazione(double n1, double n2) {
		double sottrazione = n1 - n2;
		return sottrazione;
	}

	public static double divisione(double n1, double n2) {
		double quoziente = Math.round(( n1 / n2) * 100.0)/100.0;
//		double quoziente = n1/n2;
		
		return quoziente;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean uscita = false;

		while (!uscita) {

			System.out.println("Inserisci i due numeri. Premi invio per ogni numero:");

			double n1 = scan.nextDouble();
			double n2 = scan.nextDouble();

			String linea = scan.nextLine();
			System.out.println("Scegli un'operazione: + - * /");

			String operazione = scan.nextLine();

			switch (operazione) {
			case "+":
				System.out.printf("%.2f", addizione(n1, n2));
				break;
			case "-":
				System.out.println(sottrazione(n1, n2));
				break;
			case "*":
				System.out.println(moltiplicazione(n1, n2));
				break;
			case "/":
				System.out.println(divisione(n1, n2));
				break;
			default:
				throw new IllegalArgumentException("Operazione non valida " + operazione);
			}
		}
	}
}
