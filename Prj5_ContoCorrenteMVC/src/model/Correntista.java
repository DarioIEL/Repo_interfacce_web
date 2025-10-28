package model;

import java.util.ArrayList;
import java.util.List;

public class Correntista {
	private String nome, cognome, codFiscale;
	List<ContoCorrente> conti;

	public Correntista(String nome, String cognome, String codFiscale) {
		this.nome = nome;
		this.cognome = cognome;
		this.codFiscale = codFiscale;
		this.conti = new ArrayList<>();
	}

	// metodi Getters & toString
	// aggiungiConto (ContoCorrente)
	// rimuoviConto (ContoCorrente)
	
	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getCodFiscale() {
		return codFiscale;
	}

	public List<ContoCorrente> getConti() {
		return conti;
	}

	public void aggiungiConto(ContoCorrente conto) {
		this.conti.add(conto);
	}
	
	public void rimuoviConto(ContoCorrente conto) {
		this.conti.remove(conto);
	}

	@Override
	public String toString() {
		return "Correntista [nome=" + nome + ", cognome=" + cognome + ", codFiscale=" + codFiscale + ", conti collegati=" + conti.size() + "]";
	}	
}
