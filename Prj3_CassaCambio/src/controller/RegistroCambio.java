package controller;

import java.util.ArrayList;
import java.util.List;

import model.Cambio;

public class RegistroCambio {

	List<Cambio> listaCambi;

	public RegistroCambio() {
		this.listaCambi = new ArrayList<>();
	}
	
	public void registraCambio(Cambio cambio) {
		this.listaCambi.add(cambio);
	}
	
	public List<Cambio> getListaCambi(){
		return new ArrayList<Cambio>(listaCambi);
	}
	
	
	
}
