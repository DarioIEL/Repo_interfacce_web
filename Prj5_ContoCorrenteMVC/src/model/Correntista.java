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
	
	//metodi Getters & toString
	//aggiungiConto (ContoCorrente)
	//rimuoviConto	(ContoCorrente)
}
