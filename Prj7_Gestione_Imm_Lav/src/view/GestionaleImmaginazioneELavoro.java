package view;

import java.util.Scanner;

import controller.CorsoController;
import model.Corso;

public class GestionaleImmaginazioneELavoro {
	
	private static CorsoController corsoController;
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		corsoController = new CorsoController();
		
		boolean continua = true;
		
		while(continua) {
			mostraMenu();
			int scelta = scanner.nextInt();
			
			switch (scelta) {
			case 1:
				inserisciNuovoCorso();
			break;
			}
		}
		
		
	}

	private static void inserisciNuovoCorso() {
		scanner.nextLine();
		System.out.println("-- Stai inserendo un nuovo corso --");
		
		int id = corsoController.getNextIDCorso();
		
		System.out.println("Titolo del corso: ");
		String titolo = scanner.nextLine();
		
		System.out.println("Codice corso:");
		String codice = scanner.nextLine();
		
		System.out.println("Numero partecipanti: ");
		int numeroPartecipanti = scanner.nextInt();
		
		Corso nuovoCorso = new Corso(id, titolo, codice, numeroPartecipanti);
		
		if(corsoController.aggiungiCorso(nuovoCorso)) {
			System.out.println("Corso aggiunto con successo");
		}
	}

	private static void mostraMenu() {
		System.out.println("=== IMMAGINAZIONE E LAVORO ===");
		System.out.println("1. Aggiungi un corso");
		System.out.println("2. Aggiungi uno studente");
		System.out.println("3. Mostra corsi");
		System.out.println("4. Mostra studenti");
		System.out.println("5. Mostra studenti per corso");
		System.out.println("0. Esci");
		System.out.println("==============================");
		
	}

}
