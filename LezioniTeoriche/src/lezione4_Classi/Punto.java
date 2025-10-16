package lezione4_Classi;

public class Punto {

	//STATO DELLA CLASSE
	//Dichiaro le proprietà della classe
	double x;
	double y;

	//Dichiaro il metodo costruttore di default, anche se in questo caso non è obbligatorio (poi capiremo perché)
	
	//costruttore di default
	public Punto() {
	}
	
	public Punto(double ascissa, double ordinata) {
		this.x = ascissa;
		this.y = ordinata;
	}

	
	//OSS: i due metodi costruttori Punto sono in overload
	
	//ALT + Shift + S per generare il toString()
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	
}
