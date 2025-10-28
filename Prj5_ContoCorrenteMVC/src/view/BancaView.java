package view;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import model.ContoCorrente;

public class BancaView {

	private Scanner scanner;

	public BancaView() {
		this.scanner = new Scanner(System.in);
	}
	
	public void mostraMenu() {
		System.out.println("=== GESTIONE CONTI DELLA BANCA ===");
		System.out.println("1. Crea un nuovo conto corrente ");
		System.out.println("2. Visualizza tutti i conti");
		System.out.println("3. Elimina conto");
		System.out.println("4. Trova Conto");
		System.out.println("5. Esci");
		System.out.println("Seleziona un'opzione");
	}
	
	public int leggiSceltaInt() {
		return scanner.nextInt();
	}
	
	public String leggiString(String msg) {
		System.out.println(msg);
		scanner.nextLine(); //pulisce
		return scanner.nextLine(); //acquisisce
	}
	
	public double leggiDouble(String msg) {
		System.out.println(msg);
		return scanner.nextDouble();
	}
	
	public void mostraConti(List<ContoCorrente> conti) {
		if(conti.isEmpty()) {
			System.out.println("Non ci sono conti nella banca");
		}else {
			System.out.println("\n CONTI PRESENTI IN BANCA");
			for(ContoCorrente conto: conti) {
				System.out.println(conto);
			}
		}
	}
}
