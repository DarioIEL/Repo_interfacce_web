package lezione11_Astrazione;

public class Triangolo extends FormaGeometrica {
	
	private double altezza;
	private double base;
	private double lato;
	

	public Triangolo(String nome, String colore, double altezza, double base, double lato) {
		super(nome, colore);
		this.lato = lato;
		this.base = base;
		this.altezza = altezza;
	}

	@Override
	double calcolaArea() {
		return base * altezza / 2;
	}

	@Override
	double calcolaPerimetro() {
		return (lato * 2) + base;
	}

}
