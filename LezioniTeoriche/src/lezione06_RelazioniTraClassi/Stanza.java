package lezione06_RelazioniTraClassi;

public class Stanza {
	
	static int contatore = 0;
	int id;
	String nome;
	double superficie;

	
	public Stanza( String nome, double superficie) {
		this.id = contatore++;
		this.nome = nome;
		this.superficie = superficie;
	}


	@Override
	public String toString() {
		return "Stanza [id=" + id + ", nome=" + nome + ", superficie=" + superficie + "]";
	}
	
	

	
	
}
