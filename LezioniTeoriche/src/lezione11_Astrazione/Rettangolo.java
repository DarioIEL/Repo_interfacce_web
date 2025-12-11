package lezione11_Astrazione;

public class Rettangolo extends FormaGeometrica{
	
	private double larghezza;
	private double altezza;

	public Rettangolo(String colore, double larghezza, double altezza) {
		super("Rettangolo", colore);
		this.larghezza = larghezza;
		this.altezza = altezza;
	}


	@Override
	double calcolaPerimetro() {
		return (this.altezza + this.larghezza) * 2;
	}


	@Override
	double calcolaArea() {
		// TODO Auto-generated method stub
		return this.altezza * this.larghezza;
	}

}
