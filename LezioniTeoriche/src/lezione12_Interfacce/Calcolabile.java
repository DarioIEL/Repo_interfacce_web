package lezione12_Interfacce;

public interface Calcolabile {
	double calcolaArea();
	double calcolaPerimetro();
	
	String TIPO = "Forma geometrica calcolabile";
	
	default void stampaInfoForma() {
		System.out.println("Area: " + calcolaArea());
		System.out.println("Perimetro: " + calcolaPerimetro());
	}
	
	static void benvenuto() {
		System.out.println("Benvenuto nella geometria calcolabile");
	}
}
