package lezione08_eredita;

public class Motocicletta extends Veicolo {
	private String tipo;
	private static int numRuote = 2;

	//ATT: non sto passando il numRuote al costruttore perché ce l'ho già sopra
	public Motocicletta(String marca, String modello, int annoProduzione, String tipo) {
		super(marca, modello, annoProduzione, numRuote);
		this.tipo = tipo;
	}

	@Override
	public void start() {
		System.out.println("Hai avviato la motocicletta");
	}

	@Override
	public void stop() {
		super.stop();
	}

	@Override
	public void mostraInfo() {
		super.mostraInfo();
		System.out.println("Tipo di motocicletta " + this.tipo);
	}
	
	public void impenna() {
		System.out.println("Vroooooom sto impennando. In sicurezza");
	}
	
	

}
