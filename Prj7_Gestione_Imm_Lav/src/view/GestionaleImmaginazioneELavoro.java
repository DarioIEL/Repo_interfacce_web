package view;

import java.util.Scanner;

import controller.CorsoController;
import controller.StudenteController;
import model.Corso;
import model.Studente;

public class GestionaleImmaginazioneELavoro {
	
	private static CorsoController corsoController;
	private static StudenteController studenteController;
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		corsoController = new CorsoController();
		studenteController = new StudenteController();
		
		boolean continua = true;
		
		while(continua) {
			mostraMenu();
			int scelta = scanner.nextInt();
			
			switch (scelta) {
			case 1:
				inserisciNuovoCorso();
			break;
			case 2:
				inserisciNuovoStudente();
			break;
			case 3:
				corsoController.mostraCorsi();
			break;
			case 4:
				studenteController.mostraStudenti();
			break;
			case 5:
				mostraStudentiPerCorso();
			break;
			case 0:
				continua = false;
				System.out.println("Hai chiuso l'applicazione");
			break;
			default:
				System.out.println("Scelta non valida");
			
			}
		}
		
		
	}

	private static void mostraStudentiPerCorso() {
		scanner.nextLine();
		System.out.println("Inserisci il codice del corso");
		String codiceCorso = scanner.nextLine();
		
		studenteController.mostraStudentiPerCorso(codiceCorso);
		
	}

	private static void inserisciNuovoStudente() {
		scanner.nextLine();
		System.out.println("--- Stai inserendo un nuovo studente ---");
		
		int id = studenteController.getNextIDStudente();
		
		System.out.println("Nome:");
		String nome = scanner.nextLine();
		
		System.out.println("Cognome");
		String cognome = scanner.nextLine();
		
		System.out.println("Codice Fiscale");
		String codFisc = scanner.nextLine().toUpperCase();
		
		System.out.println("Codice Corso Iscrizione: ");
		String codCorso = scanner.nextLine();
		
		Studente nuovoStudente = new Studente(id, nome, cognome, codFisc, codCorso);
		
		if(studenteController.aggiungiStudente(nuovoStudente)) {
			System.out.println("Studente aggiunto con successo");
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
