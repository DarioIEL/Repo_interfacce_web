package Lezione8_Polimorfismo;

public class Cerchio extends FormaGeometrica {

	private double raggio;
	
	public Cerchio(String colore, double raggio) {
		super(colore);
		this.raggio = raggio;
	}

	@Override
	public double calcolaArea() {
		double area = Math.PI * Math.pow(raggio, 2);
		return area;
	}

	@Override
	public double calcolaPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

}
