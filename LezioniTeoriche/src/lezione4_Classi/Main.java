package lezione4_Classi;

public class Main {
	
	public static void main(String[] args) {
		//Istanzio degli oggetti di tipo Punto
		Punto p1 = new Punto();
		
		//Valorizzo la x e la y attraverso la notazione punto .
		p1.x = 5;
		p1.y = 6;
		
		System.out.println("La x del punto vale: " + p1.x + "\nLa y del punto vale: " + p1.y);
		
		//Istanzio un oggetto di tipo punto utilizzando il costruttore a firma piena
		Punto p2 = new Punto(8,2);
		System.out.println("La x del punto2 vale: " + p2.x + "\nLa y del punto2 vale: " + p2.y);
		System.out.println(p2.toString());
		System.out.println(p2); //ATT: in presenza del metodo toString() dichiarato nella classe dell'oggetto, stampando direttamente l'oggetto viene richiamato il metodo toString(); quindi non esce più il numero 
	
		Segmento segm1 = new Segmento(p1, p2);
		segm1.calcolaLunghezza();
		System.out.println(segm1);
		
		
	}

}
