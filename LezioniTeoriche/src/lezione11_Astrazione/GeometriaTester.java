package lezione11_Astrazione;

public class GeometriaTester {
	
	public static void main(String[] args) {
		//1. non posso istanziare una classe astratta
		//FormaGeometrica fg = new FormaGeometrica(); //NOOOOOOO
		
		//Istanzio tutte le sottoclassi che voglio
		Rettangolo rett = new Rettangolo("Giallo", 12.5, 6.3);
		
//		System.out.println("Area del rettangolo: " + rett.calcolaArea());
//		System.out.println("Perimetro del rettangolo: " + rett.calcolaPerimetro());
		rett.mostraInfo();
		
	}

}
