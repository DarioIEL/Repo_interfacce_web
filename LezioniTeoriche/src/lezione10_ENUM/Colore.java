package lezione10_ENUM;

public enum Colore {
 //Le enum in Java servono a definire un set di valori, un insieme di valori costanti.
// Ogni Enum è un'istanza della classe enum stessa. Si possono dichiarare costruttori, metodi, campi
	
	RED("Rosso"),
	GREEN("Verde"),
	BLUE("Blu"),
	YELLOW("Giallo"),
	ORANGE("Arancione"),
	PURPLE("Viola"),
	BLACK("Nero"),
	WHITE("Bianco");

	private String nomeIta;
	
	private Colore(String nomeIta) {
		this.nomeIta = nomeIta;
	}
	
	public String getNomeIta() {
		return nomeIta;
	}
	
	
}
