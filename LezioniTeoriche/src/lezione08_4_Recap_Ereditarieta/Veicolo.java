package lezione09_Recap_Ereditarieta;

public class Veicolo {

	protected String marca;
	protected String modello;
	protected int annoProd;
	protected int numRuote;

	public Veicolo(String marca, String modello, int annoProd, int numRuote) {
		this.marca = marca;
		this.modello = modello;
		this.annoProd = annoProd;
		this.numRuote = numRuote;
	}
	
	public void start() {
		System.out.println("Stai avviando il veicolo");
	}
	
	public void stop() {
		System.out.println("Stai fermando il veicolo");
	}

	
	public String getInfo() {
		return "Marca e modello: " + this.marca + " - " + this.modello + "\nAnno produzione " + this.annoProd;
	}
	
	@Override
	public String toString() {
		return "Veicolo [marca=" + marca + ", modello=" + modello + ", annoProd=" + annoProd + ", numRuote=" + numRuote
				+ "]";
	}
	
	
	
}
