package view;

import java.util.Scanner;

import controller.CassaCtrl;
import controller.RegistroCambiCtrl;
import model.Cassa;

public class Main {
	
	private static CassaCtrl cassaCtrl;
	private static Scanner scann;
	
	public static void main(String[] args) {
		
		scann = new Scanner(System.in);
		
		System.out.println("=== CASSA PER IL CAMBIO EURO / DOLLARI ===");
		
		cassaCtrl = new CassaCtrl("cassa Aeroporto", 2800);
		
		boolean mostra = true;
		while(mostra) {
			mostra = mostraMenu();
		}
	}

	private static boolean mostraMenu() {
		System.out.println("--- Menu principale lato GESTORE ---");
		System.out.println("1. Esegui cambio euro/dollari");
		System.out.println("2. Aggiungi fondi in dollari");
		System.out.println("3. Stampa storico cambi");
		System.out.println("4. Visualizza info cassa");
		System.out.println("5. Preleva fondi euro"); //DA FARE
		System.out.println("6. Esci"); 
		
		int scelta = scann.nextInt();
		scann.nextLine(); //per pulire
		
		switch(scelta) {
		case 1:
			eseguiCambio();
			break;
		case 2:
			aggiungiDollari();
			break;
		case 3:
//			System.out.println( cassaCtrl.getStoricoCambi() );
			getStoricoCambi();
			break;
		case 4:
			visualizzaInfoCassa();
			break;
		case 5:
			System.out.println("Da implementare");
			break;
		case 6:
			System.out.println("Arrivederci");
			return false;
		default:
			System.out.println("Opzione non valida");
		}
		
		return true;
	}
	
	
	public static void eseguiCambio() {
		System.out.println("Isnerisci l'importo in euro per il cambio");
		double importoEuro = scann.nextDouble();
		scann.nextLine();
		
		String risultato = cassaCtrl.eseguiCambio(importoEuro);
		
		System.out.println("\n" + risultato);
		
	}
	
	public static void aggiungiDollari() {
		System.out.println("Inserisci i dollari da versare");
		double importo = scann.nextDouble();
		scann.nextLine();

		if(cassaCtrl.aggiungiDollari(importo)) {
			System.out.println("Fondo dollari aggiunto con successo");
		}else {
			System.out.println("Errore: importo non valido");
		}
	}
	
	public static void getStoricoCambi() {
		System.out.println(cassaCtrl.getStoricoCambi());
	}
	
	public static void visualizzaInfoCassa() {
		System.out.println(cassaCtrl.getInfoCassa());
	}
}
