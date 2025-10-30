package lezione08_eredita;

//Questa sarà la mia superclasse
public class Veicolo {

	protected String marca;
	protected String modello;
	protected int annoProduzione;
	protected int numRuote;
	
	protected final String NOME_VEICOLO = "Sono un veicolo";


	public Veicolo(String marca, String modello, int annoProduzione, int numRuote) {
		this.marca = marca;
		this.modello = modello;
		this.annoProduzione = annoProduzione;
		this.numRuote = numRuote;
	}
	
	public void start() {
		System.out.println("Ho avviato il veicolo");
	}
	
	public void stop() {
		System.out.println("Ho fermato il veicolo");
	}
	
	public void mostraInfo() {
		System.out.println("Veicolo " + this.marca + " " + this.modello + " (anno produzione " + this.annoProduzione + ") Numero ruote: " + this.numRuote);
	}
}
