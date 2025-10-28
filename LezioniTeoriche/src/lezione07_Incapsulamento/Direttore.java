package lezione07_Incapsulamento;

public class Direttore {

	private String nome;
	private String cognome;
	private int numUfficio;
	
	public Direttore(String nome, String cognome, int numUfficio) {
		this.nome = nome;
		this.cognome = cognome;
		this.numUfficio = numUfficio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getNumUfficio() {
		return numUfficio;
	}

	public void setNumUfficio(int numUfficio) {
		this.numUfficio = numUfficio;
	}

	
	
}
