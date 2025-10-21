package model;

public class Cassa {
	public String nome;
	public double fondoIniziale = 0.0;
	public double saldoInEuro;

	public Cassa(String nome, double fondoIniziale) {
		this.nome = nome;
		this.fondoIniziale = fondoIniziale;
	}

	public void addFondi(double fondiDollari) {
		if (fondiDollari > 0) {
			this.fondoIniziale += fondiDollari;
		} else {
			System.out.println("Non puoi inserire un fondo negativo");
		}
	}

	public void eseguiCambio(double importoEuro) {

		double tassoDiCambio = 0.85;
		double cambio_E_D = importoEuro / tassoDiCambio;

		if (cambio_E_D < fondoIniziale) {
			this.fondoIniziale -= cambio_E_D;
			this.saldoInEuro += importoEuro;

			System.out.println("Euro: " + importoEuro);
			System.out.println("Dollari: " + cambio_E_D);
			System.out.println("Tasso di cambio: " + tassoDiCambio);
		} else {
			System.out.println("Fondi non sufficienti per il cambio");
		}
	}
	
	public double[] calcolaFondi() {
		double[] fondi = new double[2];
		fondi[0] = this.fondoIniziale;
		fondi[1] = this.saldoInEuro;
		return fondi;
	}
	
	public String infoMacchina() {
		double[] restanti = calcolaFondi();
		return "Euro in macchina: " + restanti[1] + "\nDollari in macchina: " + restanti[0];
	}
}
