package model;

import java.util.Date;

public class Cambio {
	
	private static int contatore = 0;
	private int id;
	private double importoEuro, importoDollari, tassoCambio;
	private Date data;
	
	public Cambio(double importoEuro, double importoDollari, double tassoCambio) {
		this.id = ++contatore;
		this.importoEuro = importoEuro;
		this.importoDollari = importoDollari;
		this.tassoCambio = tassoCambio;
		this.data = new Date();
	}

	public int getId() {
		return id;
	}

	public double getImportoEuro() {
		return importoEuro;
	}

	public double getImportoDollari() {
		return importoDollari;
	}

	public double getTassoCambio() {
		return tassoCambio;
	}

	public Date getData() {
		return data;
	}

	@Override
	public String toString() {
		return "Cambio [id=" + id + ", importoEuro=" + importoEuro + ", importoDollari=" + importoDollari
				+ ", tassoCambio=" + tassoCambio + ", data=" + data + "]";
	}
	
	
	
	
	
}
