package view;

import java.util.Scanner;

import model.Cassa;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Cassa cassaStazione = new Cassa("Stazione New York", 500);
		
		System.out.println("Inserisci importo da cambiare");
		double importo = scan.nextDouble();
		
		if(importo > 0) {
			cassaStazione.eseguiCambio(importo);
		}else {
			System.out.println("Mi spiace, hai inserito un valore negativo");
		}
		
		cassaStazione.eseguiCambio(100); 
		
		System.out.println( cassaStazione.infoMacchina() );
		
	}
}
