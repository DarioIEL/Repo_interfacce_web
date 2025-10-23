package model;

public class Cassa {

	private String nome;
	private double fondoDollari, saldoEuro;
	private static final double TASSO_CAMBIO = 0.85;

	public Cassa(String nome, double fondoDollari) {
		this.nome = nome;
		this.fondoDollari = fondoDollari;
	}

	public String getNome() {
		return nome;
	}

	public double getFondoDollari() {
		return fondoDollari;
	}

	public double getSaldoEuro() {
		return saldoEuro;
	}

	public static double getTassoCambio() {
		return TASSO_CAMBIO;
	}

	public boolean aggiungiDollari(double importo) {
		if (importo > 0) {
			this.fondoDollari += importo;
			return true;
		}
		return false;
	}

	public Cambio eseguiCambio(double importoEuro) {
		double dollariDaScambiare = importoEuro / TASSO_CAMBIO;

		if (dollariDaScambiare <= fondoDollari) {
			this.fondoDollari -= dollariDaScambiare;
			this.saldoEuro += importoEuro;
			return new Cambio(importoEuro, dollariDaScambiare, TASSO_CAMBIO);
		} else {
			return null;
		}
	}

	public boolean verificaDispo(double importoEuro) {
		double dollariNecessari = importoEuro / TASSO_CAMBIO;
		if(fondoDollari >= dollariNecessari) {
			return true;
		}else {
			return false;
		}
	}
	
	public String getInfoCassa() {
		return "Cassa: " + nome + ", fondo Dollari: " + fondoDollari + ", fondo Euro: " + saldoEuro;
	}
}
