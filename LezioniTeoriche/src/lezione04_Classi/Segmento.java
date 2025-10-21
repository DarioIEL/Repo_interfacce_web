package lezione04_Classi;

public class Segmento {
	
	//Per definire un segmento mi servono 2 punti. Quindi utilizzo 2 tipi complessi per definire il mio segmento
	
	Punto a;
	Punto b;
	double lunghezza;
	
	public Segmento(Punto a, Punto b) {
		this.a = a;
		this.b = b;
	}
	
	public double calcolaLunghezza() {
		this.lunghezza = Math.sqrt(Math.pow((b.x - a.x), 2) + Math.pow((b.y - a.y), 2));
		return this.lunghezza;
	}

	@Override
	public String toString() {
		return "Segmento [a=" + a + ", b=" + b + ", lunghezza=" + lunghezza + "]";
	}
	
	

}
