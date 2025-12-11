package lezione12_Interfacce;

public class Cerchio implements Calcolabile {

	private double raggio;
	private String colore;
		
	public Cerchio(double raggio, String colore) {
		this.raggio = raggio;
		this.colore = colore;
	}

	
	
	@Override
	public double calcolaArea() {		
		return Math.PI * Math.pow(raggio, 2);
	}

	@Override
	public double calcolaPerimetro() {
		return Math.PI * 2 * raggio;
	}

	@Override
	public String toString() {
		return "Cerchio [raggio=" + raggio + ", colore=" + colore + " - Area: "+ calcolaArea() + " Perimetro: " + calcolaPerimetro() +" - tipo:" + TIPO + "]";
	}


}
