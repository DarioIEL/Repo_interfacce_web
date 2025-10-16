package lezione4_Classi;

public class Bicicletta {

	final byte numRuote = 2;
	int marcia = 1;
	int frequenza = 0;
	double velocita = 0;

	final String marca = "Cannondale";
	String modello = "C-bike";
	String tipoBici = "Stradale";

	public Bicicletta() {
	}

	public Bicicletta(String modello, String tipoBici) {
		this.modello = modello;
		this.tipoBici = tipoBici;
	}

	// giochiamo con gli altri parametri
	public void accelera(int incFrequenza) {
		this.frequenza += incFrequenza;
		System.out.println("La tua frequenza è di " + this.frequenza + " Hz");
	}

	public void decelera(int incFrequenza) {
		this.frequenza -= incFrequenza;
		System.out.println("La tua frequenza è di " + this.frequenza + " Hz");
	}

	public void calcolaVel(int marcia) {
		this.velocita = marcia * this.frequenza;

	}

	@Override
	public String toString() {
		return "Bicicletta [numRuote=" + numRuote + ", marcia=" + marcia + ", frequenza=" + frequenza + ", velocita="
				+ velocita + ", marca=" + marca + ", modello=" + modello + ", tipoBici=" + tipoBici + "]";
	}

}
