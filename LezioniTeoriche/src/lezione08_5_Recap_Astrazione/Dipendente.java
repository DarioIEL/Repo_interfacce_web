package lezione10_Recap_Astrazione;

import java.util.Date;

public abstract class Dipendente {
	
	protected String nome;
	protected String cognome;
	protected String codFisc;
	protected Date dataAssunzione;
	protected static double stipendioBase = 1000;
	
	
	//Regola: il costruttore servirà solo alle classi concrete che eriditano dalla classe astratta. La classe astratta non può essere istanziata
	public Dipendente(String nome, String cognome, String codFisc, Date dataAssunzione) {
		this.nome = nome;
		this.cognome = cognome;
		this.codFisc = codFisc;
		this.dataAssunzione = dataAssunzione;
	}
	
	//Metodo concreto di una classe astratta
	public String stampaInfo() {
		String info = "Nome: " + this.nome + " " + this.cognome + "\nCodice Fiscale: " + this.codFisc + "\nData Assunzione: " + this.dataAssunzione + "\nStipendio " + this.calcolaStipendio();
		return info;
	}
	
	//All'interno delle classi astratte posso avere dei metodi astratti. Sono dei metodi senza implementazione.
	//Avere un metodo astratto OBBLIGA la classe che estenderà Dipendente a implementare il metodo calcolaStipendio(). PROGRAMMING BY CONTRACT
	public abstract double calcolaStipendio();

}
