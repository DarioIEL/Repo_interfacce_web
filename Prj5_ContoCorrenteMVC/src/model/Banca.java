package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banca {
	private String nomeBanca;
	private List<ContoCorrente> conti;
	private Map<String, Correntista> correntisti;
	
	public Banca(String nomeBanca) {
		this.nomeBanca = nomeBanca;
		this.conti = new ArrayList<>();
		this.correntisti = new HashMap<>();
	}
	
	//getNomeBanca
	//getOrCreateCorrentista
	//createConto
	//getConti
	//findConto (numeroConto)
	//eliminaConto (numeroConto) --> questo sfrutta findConto()
	//getCorrentisti
	
	
}
