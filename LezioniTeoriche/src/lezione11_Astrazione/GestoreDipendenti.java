package lezione11_Astrazione;

public class GestoreDipendenti {
	
	private Dipendente[] dipendenti;

	public GestoreDipendenti(Dipendente[] dipendenti) {
		this.dipendenti = dipendenti;
	}

	
	public double calcolcaStipendiTotali() {
		double totale = 0;
		
		for (Dipendente dipendente : dipendenti) {
			totale += dipendente.calcolaStipendio();
		}
		
		return totale;
	}
	
	
	public void stampaReport() {
		System.out.println("--- Dipendenti ---");
		
		for(int i = 0; i < dipendenti.length; i++) {
			System.out.println("Dipendente n°: " + (i+1));
			dipendenti[i].stampaInfo();
			System.out.println("----------------");
		}
		
		System.out.println("==========");
		System.out.println("Costo Stipendi Totale: " + String.format("%.2f", calcolcaStipendiTotali()));
	}

}
