package controller;

import java.util.Iterator;
import java.util.List;

import model.Cambio;
import model.Cassa;

public class CassaCtrl {
	
	private Cassa cassa;
	private RegistroCambiCtrl registro;
	

	public CassaCtrl(String nomeCassa, double importoIniziale) {
		this.cassa = new Cassa(nomeCassa, importoIniziale );
		this.registro = new RegistroCambiCtrl();
	}

	public boolean aggiungiDollari(double importo) {
		return cassa.aggiungiDollari(importo);
	}
	
	public String eseguiCambio(double importoEuro) {
		
		if(importoEuro <= 0) {
			return "Errore: l'importo deve essere positivo";
		}
		
		//verifico se c'è disponibiltà
		if(!cassa.verificaDispo(importoEuro)) {
			return "Mi spiace, fondi insufficienti per il cambio !";
		}
		
		Cambio cambio = cassa.eseguiCambio(importoEuro);
		
		if(cambio != null) {
			registro.registraCambio(cambio);
			return "Cambio eseguito. Importo Dollari " + cambio.getImportoDollari() + "\n Importo Euro versati: " + cambio.getImportoEuro();
		}
		
		return "Non è stato possibile eseguire il cambio";
	}
	
	public String getInfoCassa() {
		return cassa.getInfoCassa();
	}
	
	public String getStoricoCambi() {
		return registro.getStoricoCambi();
	}
	
	public String getStoricoCambi2(){
		List<Cambio> listaCambi = registro.getListaCambi();
		StringBuilder sb = new StringBuilder();
		
		for (Cambio cambio : listaCambi) {
			sb.append(cambio.toString() + "\n");
		}
		
		return sb.toString();
	}
}
