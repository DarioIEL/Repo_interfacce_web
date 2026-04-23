package lezione09_Recap_Ereditarieta;

public class Bicicletta extends Veicolo {
	
	private String colore;

	public Bicicletta(String marca, String modello, int annoProd, int numRuote, String colore) {
		super(marca, modello, annoProd, numRuote);
		this.colore = colore;
	}

	@Override
	public String getInfo() {
		return "Bicicletta:\n" + super.getInfo();
	}

	@Override
	public void start() {
		System.out.println("Stai muovendo le gambe");
	}

	
}
