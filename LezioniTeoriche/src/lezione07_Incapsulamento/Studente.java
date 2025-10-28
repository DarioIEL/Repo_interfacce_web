package lezione07_Incapsulamento;

import java.util.List;

public class Studente {

	// L'incapsulamento si mette in atto attraverso l'utilizzo dei modificatori
	// d'accesso. In particolare utilizzo il modificatore private

	private String nome;
	private String cognome;
	private int annoIscrizione;
	private int matricola;
	private boolean presenza;
	static int contatore;


	public Studente() {}

	public Studente(String nome, String cognome, int annoIscrizione) {
		this.nome = nome;
		this.cognome = cognome;
		this.annoIscrizione = annoIscrizione;
		this.matricola = ++contatore;
		this.presenza = true;
	}


	// Per poter manipolare queste propr utilizzo i metodi Getters & Setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;			
	}

	public String getCognome() {
		return cognome;
	}

	public int getAnnoIscrizione() {
		return annoIscrizione;
	}

	public void setAnnoIscrizione(int annoIscrizione) {
		this.annoIscrizione = annoIscrizione;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = contatore++;
	}

	public boolean isPresenza() {
		return presenza;
	}

	public void setPresenza(boolean presenza) {
		this.presenza = presenza;
	}

	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", annoIscrizione=" + annoIscrizione + ", matricola="
				+ matricola + ", presenza=" + presenza + "]";
	}

}
