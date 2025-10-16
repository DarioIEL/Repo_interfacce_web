package esercizi_Lezione4;

public class Gioco {
	
	Dado d1, d2;

	public Gioco(Dado d1, Dado d2) {
		this.d1 = d1;
		this.d2 = d2;
	}
	
	public String gioca() {
		int res1 = d1.lancia();
		int res2 = d2.lancia();

		System.out.println("Risultati: \ndado colore " + d1.colore + ": " + res1);
		System.out.println("dado colore " + d2.colore + ": " + res2);
		if (res1 == res2) {
			return "HAI VINTO !";
		} else {
			return "Hai perso !!";
		}
	}
	
}
