package lezione5_Classi;

public class TesterConto {
	public static void main(String[] args) {
	
		ContoCorrenteStatic cc = new ContoCorrenteStatic("Mario Rossi", 1000);
		
		//Posso accedere a tutti i metodi NON static della classe ContoCorrente
		cc.deposita(500);
		cc.deposita(500);
		cc.deposita(500);
		cc.deposita(500);
		cc.getInfoConto();
		
		ContoCorrenteStatic cc2 = new ContoCorrenteStatic("Anna Rossi", 2000);
		cc2.deposita(1000);
		
		cc2.getInfoConto();
		
	}
}
