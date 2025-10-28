package view;

import controller.BancaCtrl;
import model.Banca;

public class Main {
	public static void main(String[] args) {
		Banca nuovaSede = new Banca("Intesa San Paolo - Via Accademia");
		BancaCtrl bancaCtrl = new BancaCtrl(nuovaSede);
		bancaCtrl.creaNuovoConto();
		
		System.out.println("Tutti i conti registrati in banca");
		bancaCtrl.visualizzaConti();
	
	}

}
