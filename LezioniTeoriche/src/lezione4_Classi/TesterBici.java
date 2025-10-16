package lezione4_Classi;

public class TesterBici {

	public static void main(String[] args) {
		Bicicletta bici1 = new Bicicletta();
		
	 	System.out.println( bici1.toString() );
	 	
	 	Bicicletta bici2 = new Bicicletta("Alpha-Bike", "Pista");
	 	bici2.accelera(100);
	 	bici2.calcolaVel(3);
	 	System.out.println(bici2);
	}
}
