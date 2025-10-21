package lezione06_RelazioniTraClassi;

public class Autore {
	String nome;
	String cognome;
	
	public Autore(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	@Override
	public String toString() {
		return "Autore [nome=" + nome + ", cognome=" + cognome + "]";
	}

}
