package Lezione8_Polimorfismo;

public class Triangolo extends FormaGeometrica{

	private double base;
	private double altezza;

	public Triangolo(String colore, double base, double altezza) {
		super(colore);
		this.base = base;
		this.altezza = altezza;
	}

	@Override
	public double calcolaArea() {
		double area = this.altezza * this.base / 2;
		return area;
	}

	@Override
	public double calcolaPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
