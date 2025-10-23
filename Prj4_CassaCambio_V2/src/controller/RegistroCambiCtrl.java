package controller;

import java.util.ArrayList;
import java.util.List;

import model.Cambio;

public class RegistroCambiCtrl {
	// Questa classe ci mostra lo storico dei cambi e ci fa vedere tutte le
	// transazioni avvenute

	private List<Cambio> listaCambi;

	public RegistroCambiCtrl() {
		this.listaCambi = new ArrayList<>();
	}

	public void registraCambio(Cambio cambio) {
		if (cambio != null) {
			this.listaCambi.add(cambio);
		}
	}

	public List<Cambio> getListaCambi() {
		return this.listaCambi;
	}

	public String getStoricoCambi() {

		if (listaCambi.size() != 0) {

			StringBuilder sb = new StringBuilder();

			sb.append("--- STORICO CAMBI ---");

			for (Cambio cambio : listaCambi) {
				sb.append(cambio.toString()).append("\n");
			}

			sb.append("Totale cambi: " + listaCambi.size());

			return sb.toString();
		}else {
			return "Non ci sono cambi sulla seguente cassa";
		}
	}

}
