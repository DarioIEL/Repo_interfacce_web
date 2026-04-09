package Lezione8_Polimorfismo;

public class Main {
public static void main(String[] args) {
	
	//UPCASTING: assegno un oggetto di una sottoclasse (Rettangolo) a una variabile di tipo superclasse(FormGeometrica). Posso usare un rettangolo come forma geometrica ma quando sono a runtime uso il comportamento del rettangolo. 
	//Con l'upcasting posso mettere oggetti diversi nella stessa variabile (vedi array di formegeometriche)
	FormaGeometrica rett = new Rettangolo("blue", 5.2, 1.4);
	rett.descrivi(); //Questo metodo appartiene alla forma geometrica
	System.out.println("L'area del rettangolo vale: " + rett.calcolaArea());
	
	Rettangolo rett2 = new Rettangolo("green", 5, 7);
	rett2.descrivi();
	
	//Fintanto che la classe FormaGeometrica è una classe concreta posso ancora istanziare oggeetti di tipo FormaGeometrica
//	FormaGeometrica fg = new FormaGeometrica("Red");
//	REGOLA 1: non posso istanziare oggetti concreti di classi astratte. L'upcasting è ancora possibile
	
	
	FormaGeometrica tri = new Triangolo("orange", 5, 8);
	tri.descrivi();
	System.out.println("L'area del triangolo vale: " + tri.calcolaArea());
	
	//Grazie all'upcasting posso creare delle liste di FormeGeometriche
	FormaGeometrica forme[] = {
		new Rettangolo("yellow", 8, 9),
		new Triangolo("black", 4, 5),
		new Cerchio("purple", 6)
	};

	FormaGeometrica cerchio = new Cerchio("white", 2);
	System.out.println("L'area del cerchio vale: " + cerchio.calcolaArea());
	//colore è protected nella classe genitore per far si che io ci possa accedere dalle classi figlie
	System.out.println("Il colore del cerchio è " + cerchio.colore);
}
}
