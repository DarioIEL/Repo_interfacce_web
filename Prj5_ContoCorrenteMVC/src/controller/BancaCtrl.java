package controller;

import model.Banca;
import model.ContoCorrente;
import model.Correntista;
import view.BancaView;

public class BancaCtrl {
	private Banca banca;
	

	public BancaCtrl(Banca banca) {
		this.banca = banca;
	}

	//- avvia (chiama gli altri metodi del menu) XXXX
	//- creaNuovoConto (questo deve fare attenzione all'esistenza di un correntista)
	//- visualizzaConti
	//- eliminaConto
	
	public void creaNuovoConto() {
		System.out.println("Inserisci dati del correntista");
		//uno scanner acquisisce i dati

		Correntista nuovoCorrentista = banca.getOrCreateCorrentista("Anna", "Rossi", "AnnRss98d13f845r");
		Correntista nuovoCorrentista2 = banca.getOrCreateCorrentista("Paolo", "Verdi", "PLropssfdsfasdsdfwe232");
		
		ContoCorrente nuovoConto = banca.creaConto("C001", 1000, nuovoCorrentista);
		ContoCorrente nuovoConto2 = banca.creaConto("C002", 1000, nuovoCorrentista2);
		
		System.out.println("Dettaglio conto: \n" + nuovoConto);
		System.out.println("Dettaglio conto: \n" + nuovoConto2);
			
	}
	
	public void visualizzaConti() {
		for(ContoCorrente conto: banca.getConti()) {
			System.out.println(conto);
		}
	}
	
	public void visualizzaCorrentistiEContiCollegati() {
		
	}
}
