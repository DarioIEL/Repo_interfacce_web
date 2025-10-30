package view;

import java.util.List;
import java.util.Scanner;

import controller.DatabaseCtrl;
import controller.PlaylistCtrl;
import model.Brano;

public class App {

	private static Scanner scan;
	private static PlaylistCtrl playlist;
	private static DatabaseCtrl dbCtrl = new DatabaseCtrl();

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		boolean flag = true;

		do {
			mostraMenu();

			int scelta = scan.nextInt();
			switch (scelta) {
			case 1:
				scan.nextLine();
				System.out.println("Inserisci il nome della playlist: ");
				String nomePL = scan.nextLine();
				playlist = new PlaylistCtrl(nomePL);
				System.out.println("Playlist creata con successo");
				break;
			case 2:
				if (playlist == null) {
					System.out.println("Non puoi aggiungere un brano senza prima aver creato la playlist");
				}else {
					playlist.addBranoPL();
				}
				break;
			case 3:
				//aggiungi implementazione per rimuovere il brano
				break;
			case 4:
				playlist.infoPlaylist();
				break;
			case 5:
				List<Brano> listaBraniDB = dbCtrl.getListaBrani();
				playlist.addBraniDaDB(listaBraniDB);
				break;
			case 6:
				scan.nextLine();
				System.out.println("Aggiungi un brano alla playlist: ");
				System.out.println("Inserisci la/il cantante: ");
				String cantante = scan.nextLine();
				System.out.println("Inserisci il titolo del brano: ");
				String titolo = scan.nextLine();
				System.out.println("Inserisci la durata: ");
				double durata = scan.nextDouble();
				
				dbCtrl.aggiungiBranoAlDB(titolo, cantante, durata);
				
				break;
			case 7:
				scan.nextLine();
				System.out.println("ATTENZIONE, stai per BRASARE il db !!");
				System.out.println("Sei sicuro ? Scrivi S per continuare");
				
				String carattere = scan.nextLine();
				
				if(dbCtrl.pulisciDB(carattere)) {
					System.out.println("DB BRASATO con successo");
				}else {
					System.out.println("Non hai pulito il db");
				}
				
				break;
			case 8:
				System.out.println("Arrivederci");
				flag = false;
				break;
				
			default:
				throw new IllegalArgumentException("Unexpected value: " + scelta);
			}

		} while (flag);

	}

	public static void mostraMenu() {
		System.out.println("=== PLAYLIST ===");
		System.out.println("1. Crea una playlist");
		System.out.println("2. Aggiungi Brano");
		System.out.println("3. Rimuovi Brano");
		System.out.println("4. Mostra info playlist");
		System.out.println("5. Carica canzoni da DB");
		System.out.println("6. Aggiungi Brano al DB (file.csv)");
		System.out.println("7. Pulisci DB (pulisci file.csv)");
		System.out.println("8. Esci");
	}
}
