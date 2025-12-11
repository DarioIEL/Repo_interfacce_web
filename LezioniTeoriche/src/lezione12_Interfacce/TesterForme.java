package lezione12_Interfacce;

public class TesterForme {
	
	public static void main(String[] args) {
		
		Calcolabile.benvenuto();
		
		Cerchio cerchio = new Cerchio(5.2, "Blue");
		
		System.out.println("L'area del cerchio vale: " + cerchio.calcolaArea());
		System.out.println("Il perimetro del cerchio vale: " + cerchio.calcolaPerimetro());
		
		System.out.println(cerchio.toString());
		
		cerchio.stampaInfoForma();
	}

}
