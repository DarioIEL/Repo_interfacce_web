package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banca {
	private String nomeBanca;
	private List<ContoCorrente> conti;
	// codFis Correntista
	private Map<String, Correntista> correntisti;

	public Banca(String nomeBanca) {
		this.nomeBanca = nomeBanca;
		this.conti = new ArrayList<>();
		this.correntisti = new HashMap<>();
	}

	// getNomeBanca
	// getOrCreateCorrentista //recupera un correntista se esiste, lo crea se non
	// c'è
	// createConto (numConto, correntista, saldo)
	// getConti
	// findConto (numeroConto)
	// eliminaConto (numeroConto) --> questo sfrutta findConto()
	// getCorrentisti

	public String getNomeBanca() {
		return this.nomeBanca;
	}

	// creare o recuperare un correntista
	public Correntista getOrCreateCorrentista(String nome, String cognome, String codFisc) {

		if (correntisti.containsKey(codFisc)) {
			return correntisti.get(codFisc);
		} else {
			Correntista nuovoCorrentista = new Correntista(nome, cognome, codFisc);
			correntisti.put(codFisc, nuovoCorrentista);
			return nuovoCorrentista;
		}
	}

	public ContoCorrente creaConto(String numeroConto, double saldoIniziale, Correntista correntista) {

		ContoCorrente conto = new ContoCorrente(numeroConto, saldoIniziale, correntista);

		conti.add(conto);
		correntista.aggiungiConto(conto);

		return conto;
	}

	public List<ContoCorrente> getConti() {
		ArrayList<ContoCorrente> contiCollegati = new ArrayList<>(this.conti);
		return contiCollegati;
	}
	
	public ContoCorrente findConto(String numeroConto) {
		
		for(ContoCorrente conto: conti) {
			if(conto.getNumeroConto().equals(numeroConto)) {
				return conto;
			}
		}
		
		return null;
	}

	public boolean eliminaConto(String numeroConto) {
		ContoCorrente conto = findConto(numeroConto);
		
		if(conto != null) {
			conto.getCorrentista().rimuoviConto(conto); //rimuovo dal correntista
			conti.remove(conto); //rimuovo dalla lista dei conti totale
			return true;
		}
		return false;
	}
	
	public List<Correntista> getCorrentisti(){
		List<Correntista> correntisti = new ArrayList<>(this.correntisti.values()); 
		return correntisti;
	}
	
}
